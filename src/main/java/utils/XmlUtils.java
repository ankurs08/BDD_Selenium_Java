package utils;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlUtils {
	PropertiesUtils prop = new PropertiesUtils();
	Document doc;

	public void loadFile() throws IOException, ParserConfigurationException, SAXException {
		File xmlFile = new File(prop.getPropValue("xmlFile"));
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();

	}

	public String getXmlKeyValue(String key) throws IOException, ParserConfigurationException, SAXException {
		loadFile();
		return doc.getElementsByTagName(key).item(0).getTextContent();
	}

}
