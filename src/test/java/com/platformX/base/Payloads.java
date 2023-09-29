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
	
	public static String pxdBasicList(int skip, int take, String sortColumn, String sortColumnDirection) {
		return "{\r\n"
				+ " \"skip\": " + skip + ", \r\n"
				+ "	\"take\": " + take + ", \r\n"
				+ "	\"sortColumnName\": \"" + sortColumn + "\", \r\n"
				+ "	\"sortColumnDirection\": \"" + sortColumnDirection + "\", \r\n"
				+ "	\"filters\": {} }";
	}
	
	public static String pxdAdministrationMessageCreate(String title, String body, String dateFrom, int priority) {
		return "{\r\n"
				+ " \"title\": \"" + title + "\", \r\n"
				+ " \"body\": \"" + body + "\", \r\n"
				+ " \"dateFrom\": \"" + dateFrom + "\", \r\n"
//				+ " \"dateTo\": " + null + ", \r\n"
				+ " \"priority\": " + priority + ", \r\n"
				+ "	\"users\": [] }";
	}
	
	public static String pxdAdministrationMessageUpdate(int id, String title, String body, String dateFrom, int priority, String userText) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
//				+ " \"userId\": " + null + ", \r\n"
				+ " \"title\": \"" + title + "\", \r\n"
				+ " \"body\": \"" + body + "\", \r\n"
				+ " \"dateFrom\": \"" + dateFrom + "\", \r\n"
//				+ " \"dateTo\": " + null + ", \r\n"
				+ " \"priority\": " + priority + ", \r\n"
				+ " \"userText\": \"" + userText + "\" \r\n"
				+ "}";
	}
	
	public static String pxdFieldUnitCreate(String name) {
		return "{\r\n"
//				+ " \"companyId\": " + null + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"address\": " + null + ", \r\n"
//				+ " \"taxId\": " + null + ", \r\n"
//				+ " \"vatNumber\": " + null + ", \r\n"
//				+ " \"phone\": " + null + ", \r\n"
//				+ " \"fax\": " + null + ", \r\n"
//				+ " \"email\": " + null + ", \r\n"
//				+ " \"www\": " + null + ", \r\n"
//				+ " \"callCenter\": " + null + ", \r\n"
//				+ " \"bankAccount\": " + null + ", \r\n"
//				+ " \"failureReportingPhone\": " + null + " \r\n"				
				+ "}";
	}
	
	public static String pxdFieldUnitUpdate(int id, String name, String placeText, String companyText) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
//				+ " \"companyId\": " + null + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"address\": " + null + ", \r\n"
//				+ " \"taxId\": " + null + ", \r\n"
//				+ " \"vatNumber\": " + null + ", \r\n"
//				+ " \"phone\": " + null + ", \r\n"
//				+ " \"fax\": " + null + ", \r\n"
//				+ " \"email\": " + null + ", \r\n"
//				+ " \"www\": " + null + ", \r\n"
//				+ " \"callCenter\": " + null + ", \r\n"
//				+ " \"bankAccount\": " + null + ", \r\n"
//				+ " \"failureReportingPhone\": " + null + ", \r\n"		
				+ "	\"placeText\": \"" + placeText + "\", \r\n"
				+ "	\"companyText\": \"" + companyText + "\" \r\n"
				+ "}";
	}
	
	public static String pxdFieldOfficeCreate(int fieldUnitId, String name, int code, int protocolNumberCode) {
		return "{\r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"address\": " + null + ", \r\n"
//				+ " \"phone\": " + null + ", \r\n"
//				+ " \"fax\": " + null + ", \r\n"
//				+ " \"email\": " + null + ", \r\n"
				+ " \"code\": " + code + ", \r\n"
				+ " \"protocolNumberCode\": " + protocolNumberCode + " \r\n"			
				+ "}";
	}
	
	public static String pxdFieldOfficeUpdate(int id, int fieldUnitId, String name, String code, String protocolNumberCode, String fieldUnitText, String placeText) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"address\": " + null + ", \r\n"
//				+ " \"phone\": " + null + ", \r\n"
//				+ " \"fax\": " + null + ", \r\n"
//				+ " \"email\": " + null + ", \r\n"
				+ "	\"code\": \"" + code + "\", \r\n"
				+ "	\"protocolNumberCode\": \"" + protocolNumberCode + "\", \r\n"
				+ "	\"fieldUnitText\": \"" + fieldUnitText + "\", \r\n"
				+ "	\"placeText\": \"" + placeText + "\" \r\n"
				+ "}";
	}
	
	public static String pxdSupplierCreate(String eic, String name, int placeId, int postOfficeId) {
		return "{\r\n"
//				+ " \"address\": " + null + ", \r\n"
//				+ " \"bankAccount\": " + null + ", \r\n"
//				+ " \"callCenter\": " + null + ", \r\n"
				+ " \"eic\": " + eic + ", \r\n"
//				+ " \"email\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"phone\": " + null + ", \r\n"
				+ " \"placeId\": " + placeId + ", \r\n"
				+ " \"postOfficeId\": " + postOfficeId + ", \r\n"
//				+ " \"shortName\": " + null + ", \r\n"
//				+ " \"taxId\": " + null + ", \r\n"
//				+ " \"vatNumber\": " + null + ", \r\n"
//				+ " \"www\": " + null + " \r\n"
				+ "}";
	}
	
	public static String pxdSupplierUpdate(String eic, int id, String name, int placeId, String placeText, int postOfficeId, String postOfficeText) {
		return "{\r\n"
				+ " \"eic\": " + eic + ", \r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ " \"placeId\": " + placeId + ", \r\n"
				+ "	\"placeText\": \"" + placeText + "\", \r\n"
				+ " \"postOfficeId\": " + postOfficeId + ", \r\n"
				+ "	\"postOfficeText\": \"" + postOfficeText + "\", \r\n"
				+ "}";
	}
	
	public static String pxdReaderCreate(String dateFrom, int fieldOfficeId, String name) {
		return "{\r\n"
				+ " \"dateFrom\": \"" + dateFrom + "\", \r\n"
				+ " \"fieldOfficeId\": " + fieldOfficeId + ", \r\n"
				+ "	\"name\": \"" + name + "\" \r\n"
				+ "}";
	}
	
	public static String pxdReaderUpdate(String dateFrom, String dateTo, int fieldOfficeId, String fieldOfficeText, int fieldUnitId, String fieldUnitText, int id, String name) {
		return "{\r\n"
				+ " \"dateFrom\": \"" + dateFrom + "\", \r\n"
				+ " \"dateTo\": \"" + dateTo + "\", \r\n"			
				+ " \"fieldOfficeId\": " + fieldOfficeId + ", \r\n"
				+ "	\"fieldOfficeText\": \"" + fieldOfficeText + "\", \r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
				+ "	\"fieldOfficeText\": \"" + fieldUnitText + "\", \r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\" \r\n"
				+ "}";
	}
	
}
