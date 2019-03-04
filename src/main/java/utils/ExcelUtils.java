package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.PropertiesUtils;

public class ExcelUtils {
	PropertiesUtils prop = new PropertiesUtils();
	XSSFWorkbook workBook;
	XSSFSheet sheet;

	public void loadXlsFile() throws Throwable {
		FileInputStream xfs = new FileInputStream(new File(prop.getPropValue("xlsFile")));
		workBook = new XSSFWorkbook(xfs);
		sheet = workBook.getSheetAt(0);
	}

	//needs to be improved as per the requirements
	public String getCellValue() throws Throwable {
		loadXlsFile();
		String cellValue = null;
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				cellValue=  cell.getStringCellValue();
			}
		}
		return cellValue;
	}
}
