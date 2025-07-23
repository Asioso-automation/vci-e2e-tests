package com.app.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {


	public Properties properties = null;
	public static final String API_PROPERTIES = "api.properties";

	public PropertiesUtil(String file) throws IOException, FileNotFoundException {
		properties = new Properties();
		properties.load(getClass().getResourceAsStream("/app.properties/" + file));
	}

	public String getValue(String propertyKey) {
		String value = properties.getProperty(propertyKey);
		return value;
	}

	public String setValue(String propertyKey, String propertyValue) {
		String value = (String) properties.setProperty(propertyKey, propertyValue);
		return value;
	}

}