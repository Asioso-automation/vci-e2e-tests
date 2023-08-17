package com.platformX.base;

import java.io.IOException;
import com.platformX.util.PropertiesUtil;

public class Payloads {
	
	protected PropertiesUtil properties;

	public Payloads() throws IOException {
		properties = new PropertiesUtil(PropertiesUtil.API_PROPERTIES);
	}

	public static String pxdAuth(String email, String password) {
		return "{\r\n"
				+ " \"username\": \"" + email + "\", \r\n"
				+ " \"password\": \"" + password + "\" \r\n"
				+ "}";
	}
	
	public static String pxdFieldUnitList(int skip, int take, String sortColumn, String sortColumnDirection) {
		return "{\r\n"
				+ " \"skip\": " + skip + ", \r\n"
				+ "	\"take\": " + take + ", \r\n"
				+ "	\"sortColumnName\": \"" + sortColumn + "\", \r\n"
				+ "	\"sortColumnDirection\": \"" + sortColumnDirection + "\", \r\n"
				+ "	\"filters\": {} }";
	}
	
}
