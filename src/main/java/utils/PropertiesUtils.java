package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	Properties prop = new Properties();

	public String getPropValue(String key) throws IOException {
		prop.load(new FileInputStream("src/test/resources/conf.properties"));
		return prop.getProperty(key);

	}
	
	public String getAPIPropValue(String key) throws IOException {
		prop.load(new FileInputStream("src/test/resources/api.properties"));
		return prop.getProperty(key);

	}
	

}
