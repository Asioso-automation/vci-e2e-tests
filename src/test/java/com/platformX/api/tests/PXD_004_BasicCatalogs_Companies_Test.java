//package com.platformX.api.tests;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertNotNull;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import org.testng.annotations.Test;
//import com.platformX.base.PageBase;
//import com.platformX.base.Payloads;
//import com.platformX.base.RestApiBase;
//import com.platformX.util.Helper;
//
//import data.GlobalVariables;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//
//		>> Pokrecu se svi testovi iz Prepare_And_Read_Data - rijesiti

//public class PXD_004_BasicCatalogs_Companies_Test extends RestApiBase {
//
//	public PXD_004_BasicCatalogs_Companies_Test() throws IOException, FileNotFoundException {
//		super();
//	}
//
//	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Organizaciju" })
//	public void pxd_004_01_get_company_test1() throws Exception {
//		GlobalVariables.token = authorize();
//		// Get Company
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		JsonPath jp = methodGETupdated(api_properties.getValue("COMPANIES.GET") + PageBase.id, 200);
//		assertNotNull(jp.getString("id"), "Id not forwarded");
//		assertNotNull(jp.getString("placeId"), "PlaceId not forwarded");
//		assertNotNull(jp.getString("postOfficeId"), "postOfficeId not forwarded");
//		assertNotNull(jp.getString("name"), "Name not forwarded");
//		assertNotNull(jp.getString("shortName"), "ShortName not forwarded");
//		assertNotNull(jp.getString("address"), "Address not forwarded");
//		assertNotNull(jp.getString("vatNumber"), "VatNumber not forwarded");
//		assertNotNull(jp.getString("taxId"), "TaxId not forwarded");
//		assertNotNull(jp.getString("phone"), "Phone not forwarded");
//		assertNotNull(jp.getString("fax"), "Fax not forwarded");
//		assertNotNull(jp.getString("email"), "Email not forwarded");
//		assertNotNull(jp.getString("www"), "Www not forwarded");
//		assertNotNull(jp.getString("callCenter"), "CallCenter not forwarded");
//		assertNotNull(jp.getString("bankAccount"), "BankAccount not forwarded");
//		assertNotNull(jp.getString("placeText"), "PlaceText not forwarded");
//		assertNotNull(jp.getString("postOfficeText"), "PostOfficeText not forwarded");
//	}
//
//	@Test(description = "negative test case: bearer token missing", dependsOnGroups = { "Pronadji Organizaciju" })
//	public void pxd_004_01_get_company_test2() {
//		addHeader("Authorization", "");
//		methodGETupdated(api_properties.getValue("COMPANIES.GET") + PageBase.id, 401);
//	}
//
//	@Test(description = "negative test case: wrong bearer token", dependsOnGroups = { "Pronadji Organizaciju" })
//	public void pxd_004_01_get_company_test3() {
//		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
//		methodGETupdated(api_properties.getValue("COMPANIES.GET") + PageBase.id, 401);
//	}
//
//	@Test(description = "negative test case: wrong id")
//	public void pxd_004_01_get_company_test4() throws Exception {
//		GlobalVariables.token = authorize();
//		// Get Company
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		Response response2 = methodGET(api_properties.getValue("COMPANIES.GET") + PageBase.wrongIdShort);
//		assertEquals(response2.getStatusCode(), 404);
//		assertEquals(response2.print(), "\"Entity \\\"Customer\\\" (" + PageBase.wrongIdShort + ") was not found.\""); // "Customer"
//																														// >
//																														// "Company"
//																														// ?
//	}
//
//	@Test(description = "positive test case")
//	public void pxd_004_02_post_companies_list_test1() throws Exception {
//		GlobalVariables.token = authorize();
//		// Post Companies List
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		JsonPath jp = methodPOSTupdated(api_properties.getValue("COMPANIES.LIST"),
//				Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
//		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
//		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
//		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
//		assertNotNull(jp.getString("data"), "Data not forwarded");
//	}
//
//	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Organizaciju" })
//	public void pxd_004_03_get_company_lookup_test1() throws Exception {
//		GlobalVariables.token = authorize();
//		// Get Company Lookup
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		JsonPath jp = methodGETupdated(api_properties.getValue("COMPANIES.LOOKUP") + "?Keyword="
//				+ PageBase.id + "&Id=" + PageBase.id, 200);
//		assertNotNull(jp.getString("id"), "Id not forwarded");
//		assertNotNull(jp.getString("text"), "Text not forwarded");
//	}
//
//	@Test(description = "negative test case: wrong id")
//	public void pxd_004_03_get_company_lookup_test2() throws Exception {
//		GlobalVariables.token = authorize();
//		// Get Company Lookup
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		Response response2 = methodGET(api_properties.getValue("COMPANIES.LOOKUP") + "?Keyword="
//				+ PageBase.wrongIdShort + "&Id=" + PageBase.wrongIdShort);
//		assertEquals(response2.getStatusCode(), 200);
//		assertEquals(response2.print(), "[]");
//	}
//
//// TODO		/api/BasicCatalogs/Companies/Update/{id} - on hold
//
//}