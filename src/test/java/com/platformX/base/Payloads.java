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
	
	// TODO Provjeriti da li zakomentarisani parametri ne postoje u body-u ili nisu obavezni, ako nisu potrebni obrisati ih
	
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
	
	public static String pxdFieldUnitCreate(String name, int code) {
		return "{\r\n"
//				+ " \"companyId\": " + null + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + name + "\", \r\n"
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
				+ " \"code\": " + code + " \r\n"
				+ "}";
	}
	
	public static String pxdFieldUnitUpdate(int id, String name, String placeText, String companyText, int code) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
//				+ " \"companyId\": " + null + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + name + "\", \r\n"
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
				+ "	\"companyText\": \"" + companyText + "\", \r\n"
				+ " \"code\": " + code + " \r\n"
				+ "}";
	}
	
	public static String pxdFieldOfficeCreate(int fieldUnitId, String name, int code, int protocolNumberCode) {
		return "{\r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
//				+ " \"placeId\": " + null + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + name + "\", \r\n"
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
				+ "	\"printName\": \"" + name + "\", \r\n"
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
	
	public static String pxdEntityCreate(String name) {
		return "{\r\n"
				+ "	\"name\": \"" + name + "\" \r\n"
				+ "}";
	}
	
	public static String pxdEntityUpdate(int id, String name) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\" \r\n"
				+ "}";
	}
	
	public static String pxdMunicipalityCreate(String name, int entityId, String countryId) {
		return "{\r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ " \"entityId\": " + entityId + ", \r\n"
				+ "	\"countryId\": \"" + countryId + "\" \r\n"
				+ "}";
	}
	
	public static String pxdMunicipalityUpdate(int id, String name, int entityId, String countryId) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ " \"entityId\": " + entityId + ", \r\n"
				+ "	\"countryId\": \"" + countryId + "\" \r\n"
				+ "}";
	}

	public static String pxdPlaceCreate(String name, String printName, int municipalityId) {
		return "{\r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + printName + "\", \r\n"
				+ " \"municipalityId\": " + municipalityId + " \r\n"
				+ "}";
	}
	
	public static String pxdPlaceUpdate(int id, String name, String printName, int municipalityId) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + printName + "\", \r\n"
				+ " \"municipalityId\": " + municipalityId + " \r\n"
				+ "}";
	}
	
	public static String pxdPostOfficeCreate(int id, String name, String printName) {
		return "{\r\n"
				+ "	\"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ " \"printName\": \"" + printName + "\" \r\n"
				+ "}";
	}
	
	public static String pxdPostOfficeUpdate(int id, String name, String printName) {
		return "{\r\n"
				+ "	\"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ " \"printName\": \"" + printName + "\" \r\n"
				+ "}";
	}

	public static String pxdPostOfficeCreateUpdate(int id, String name, String printName) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + printName + "\", \r\n"
				+ "}";
	}
	
	public static String pxdStreetCreate(String name, String printName) {
		return "{\r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + printName + "\", \r\n"
//				+ " \"valid\": " + null + " \r\n"
				+ "}";
	}
	
	public static String pxdStreetUpdate(int id, String name, String printName) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
				+ "	\"printName\": \"" + printName + "\", \r\n"
				+ " \"valid\": " + true + " \r\n"
				+ "}";
	}
	
	public static String pxdInstallmentPersonCreate(String name) {
		return "{\r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"phoneNumber\": " + null + " \r\n"
				+ "}";
	}
	
	public static String pxdInstallmentPersonUpdate(int id, String name) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ "	\"name\": \"" + name + "\", \r\n"
//				+ " \"phoneNumber\": " + null + " \r\n"
				+ "}";
	}
	
	public static String pxdInstallmentPersonLocationCreate(String dateFrom, int fieldOfficeId, int fieldUnitId, int installmentPersonId) {
		return "{\r\n"
				+ "	\"dateFrom\": \"" + dateFrom + "\", \r\n"
				+ " \"fieldOfficeId\": " + fieldOfficeId + ", \r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
				+ " \"installmentPersonId\": " + installmentPersonId + " \r\n"
				+ "}";
	}
	
	public static String pxdInstallmentPersonLocationUpdate(String dateFrom, int fieldOfficeId, String fieldOfficeText, int fieldUnitId, String fieldUnitText, int id, int installmentPersonId, String installmentPersonText) {
		return "{\r\n"
				+ "	\"dateFrom\": \"" + dateFrom + "\", \r\n"
				+ " \"fieldOfficeId\": " + fieldOfficeId + ", \r\n"
				+ "	\"fieldOfficeText\": \"" + fieldOfficeText + "\", \r\n"
				+ " \"fieldUnitId\": " + fieldUnitId + ", \r\n"
				+ "	\"fieldUnitText\": \"" + fieldUnitText + "\", \r\n"
				+ " \"id\": " + id + ", \r\n"
				+ " \"installmentPersonId\": " + installmentPersonId + ", \r\n"
				+ "	\"installmentPersonText\": \"" + installmentPersonText + "\", \r\n"
				+ "}";
	}
	
	public static String pxdAgreedEnergyApprovalCreate(int calculationContractDataId, int aht, int alt, int rht, int rlt, int power) {
		return "{\r\n"
				+ " \"calculationContractDataId\": " + calculationContractDataId + ", \r\n"
				+ " \"aht\": " + aht + ", \r\n"
				+ " \"alt\": " + alt + ", \r\n"
				+ " \"rht\": " + rht + ", \r\n"
				+ " \"rlt\": " + rlt + ", \r\n"
				+ " \"power\": " + power + " \r\n"
				+ "}";
	}

	public static String pxdAgreedEnergyApprovalUpdate(int id, int aht, int alt, int rht, int rlt, int power) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ " \"aht\": " + aht + ", \r\n"
				+ " \"alt\": " + alt + ", \r\n"
				+ " \"rht\": " + rht + ", \r\n"
				+ " \"rlt\": " + rlt + ", \r\n"
				+ " \"power\": " + power + " \r\n"
				+ "}";
	}
	
	public static String pxdLegalEntityCreate(boolean isLegalEntity, String name, int placeId, int postOfficeId, String printName, int streetId, String taxId, boolean vatPayer) {
		return "{\r\n"
				+ " \"isLegalEntity\": " + isLegalEntity + ", \r\n"
				+ " \"name\": \"" + name + "\", \r\n"
				+ " \"placeId\": " + placeId + ", \r\n"
				+ " \"postOfficeId\": " + postOfficeId + ", \r\n"
				+ " \"printName\": \"" + printName + "\", \r\n"
				+ " \"streetId\": " + streetId + ", \r\n"
				+ " \"taxId\": \"" + taxId + "\", \r\n"
				+ " \"vatPayer\": " + vatPayer + " \r\n"
				+ "}";
	}
	
	public static String pxdLegalEntityUpdate(int id, int streetId, int placeId, boolean isLegalEntity, String taxId, int postOfficeId, String name, String printAddressText, boolean vatPayer, boolean active, boolean associatedLegalEntities, boolean testBills, String printName, String placeText, String postOfficeText, String streetText) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ " \"streetId\": " + streetId + ", \r\n"
				+ " \"placeId\": " + placeId + ", \r\n"
				+ " \"isLegalEntity\": " + isLegalEntity + ", \r\n"
				+ " \"taxId\": \"" + taxId + "\", \r\n"
				+ " \"postOfficeId\": " + postOfficeId + ", \r\n"
				+ " \"name\": \"" + name + "\", \r\n"
				+ " \"printAddressText\": \"" + printAddressText + "\", \r\n"
				+ " \"vatPayer\": " + vatPayer + ", \r\n"
				+ " \"active\": " + active + ", \r\n"
				+ " \"associatedLegalEntities\": " + associatedLegalEntities + ", \r\n"
				+ " \"testBills\": " + testBills + ", \r\n"
				+ " \"printName\": \"" + printName + "\", \r\n"
				+ " \"placeText\": \"" + placeText + "\", \r\n"
				+ " \"postOfficeText\": \"" + postOfficeText + "\", \r\n"
				+ " \"streetText\": \"" + streetText + "\" \r\n"
				+ "}";
		
	}
	
	public static String pxdTransformerStationTypeCreate(String type, String name) {
		return "{\r\n"
				+ " \"type\": \"" + type + "\", \r\n"
				+ " \"name\": \"" + name + "\"\r\n"
				+ "}";
	
	}
	
	public static String pxdTransformerStationTypeUpdate(int id, String type, String name) {
		return "{\r\n"
				+ " \"id\": " + id + ", \r\n"
				+ " \"type\": \"" + type + "\", \r\n"
				+ " \"name\": \"" + name + "\" \r\n"
				+ "}";
	}
	
}