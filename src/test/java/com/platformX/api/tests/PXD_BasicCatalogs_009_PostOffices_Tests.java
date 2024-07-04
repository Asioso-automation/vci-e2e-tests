package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_BasicCatalogs_009_PostOffices_Tests extends RestApiBase {

	public PXD_BasicCatalogs_009_PostOffices_Tests() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_01_get_post_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("POST.OFFICES.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("name"), "Name not forwarded");
		assertNotNull(jp.getString("printName"), "PrintName not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_basicCatalogs_009_01_get_post_office_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("POST.OFFICES.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_basicCatalogs_009_01_get_post_office_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("POST.OFFICES.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_01_get_post_office_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("POST.OFFICES.GET") + Helper.getRandomNumber(6), 404);
//		assertEquals(response2.print(), "\"Entity \\\"PostOffice\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_02_post_post_offices_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("POST.OFFICES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_03_get_post_office_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("POST.OFFICES.LOOKUP") + "?Id=" + GlobalVariables.id + "&Keyword=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_03_get_post_office_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("POST.OFFICES.LOOKUP") + "?Id=" + Helper.getRandomNumber(2) + "&Keyword=" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_basicCatalogs_009_04_create_post_office_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("POST.OFFICES.CREATE"), Payloads.pxdPostOfficeCreateUpdate(Integer.parseInt(Helper.getRandomNumber(6)), "Posta", "Posta"));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}

	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_05_update_post_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("POST.OFFICES.UPDATE") + GlobalVariables.id, Payloads.pxdPostOfficeUpdate(Integer.parseInt(GlobalVariables.id), "Posta 1", "Posta 1"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_009_04_create_post_office_test1" })
	public void pxd_basicCatalogs_009_06_delete_post_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("POST.OFFICES.DELETE") + GlobalVariables.id, 204);
	}

}