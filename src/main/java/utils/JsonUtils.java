package utils;

import java.io.FileReader;

import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;

public class JsonUtils {
	PropertiesUtils prop = new PropertiesUtils();
	JsonParser jp = new JsonParser();
	JsonObject jObject = new JsonObject();

	public void loadJsonFile() throws Throwable {
		FileReader jsonFile = new FileReader(prop.getPropValue("jsonFile"));
		jObject = (JsonObject) jp.parse(jsonFile);

	}

	public String getJsonElement(String key) throws Throwable {
		loadJsonFile();
		return jObject.get(key).getAsString();
	}
}
