package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_BasicCatalogs_005_Readers_Tests extends RestApiBase {
	
	public PXD_BasicCatalogs_005_Readers_Tests() throws IOException {
		super();
	}
		
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_01_get_reader_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("READERS.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("fieldOfficeId"), "FieldOfficeId not forwarded");
		assertNotNull(jp.getString("name"), "Name not forwarded");
		assertNotNull(jp.getString("dateFrom"), "DateFrom not forwarded");
		assertNotNull(jp.getString("fieldUnitText"), "FieldUnitText not forwarded");
		assertNotNull(jp.getString("fieldOfficeText"), "FieldOfficeText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_basicCatalogs_005_01_get_reader_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("READERS.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_basicCatalogs_005_01_get_reader_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("READERS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_01_get_reader_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("READERS.GET") + Helper.getRandomNumber(5), 404);
//		assertEquals(response2.print(), "\"Entity \\\"Reader\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_02_post_readers_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("READERS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_03_get_reader_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("READERS.LOOKUP") + "?Id=" + GlobalVariables.id + "&Keyword=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_03_get_reader_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("READERS.LOOKUP") + "?Id=" + Helper.getRandomNumber(5) + "&Keyword=" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_basicCatalogs_005_04_create_reader_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("READERS.CREATE"), Payloads.pxdReaderCreate("2023-09-01", 4101, "Citac"));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_05_update_reader_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("READERS.UPDATE") + GlobalVariables.id, Payloads.pxdReaderUpdate("2023-09-01", "2023-09-02", 4101, "4101 - BIJELJINA", 41, "41 - TJ Bijeljina", Integer.parseInt(GlobalVariables.id), "Citac 1"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_005_04_create_reader_test1" })
	public void pxd_basicCatalogs_005_06_delete_reader_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("READERS.DELETE") + GlobalVariables.id, 204);
	}

}