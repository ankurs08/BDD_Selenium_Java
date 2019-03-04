package pages;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import utils.ExcelUtils;
import utils.JsonUtils;
import utils.WebUtils;
import utils.XmlUtils;

public class ForgotPwd {
	private WebDriver driver;
	XmlUtils xUtils = new XmlUtils();
	JsonUtils jUtils = new JsonUtils();
	ExcelUtils xlsUtils = new ExcelUtils();
	WebUtils webUtils = new WebUtils();
			
	public ForgotPwd() {
		this.driver = WebUtils.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='email']")
	WebElement emailBox;

	public void fillEmailXml() throws IOException, ParserConfigurationException, SAXException, InterruptedException {
		webUtils.setText(emailBox, xUtils.getXmlKeyValue("email"));
		//emailBox.sendKeys(xUtils.getXmlKeyValue("email"));
	}
	
	public void fillEmailJson() throws Throwable {
		webUtils.setText(emailBox, jUtils.getJsonElement("email"));
		//emailBox.sendKeys(jUtils.getJsonElement("email"));
	}
	
	public void fillEmailXls() throws Throwable {
		webUtils.setText(emailBox, xlsUtils.getCellValue());
		//emailBox.sendKeys(xlsUtils.getCellValue());
		Thread.sleep(5000);
	}
}
