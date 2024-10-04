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

public class PXD_BasicCatalogs_004_Suppliers_Tests extends RestApiBase {
	
	public PXD_BasicCatalogs_004_Suppliers_Tests() throws IOException {
		super();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_01_get_supplier_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("SUPPLIERS.GET") + GlobalVariables.id, 200);
		String[] parameters = {"id", "placeId", "postOfficeId", "name", "eic", "placeText", "postOfficeText"};
		verifyNotNull(jp, parameters);
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_basicCatalogs_004_01_get_supplier_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("SUPPLIERS.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_basicCatalogs_004_01_get_supplier_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("SUPPLIERS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_01_get_supplier_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("SUPPLIERS.GET") + Helper.getRandomNumber(2), 404);
//		assertEquals(response2.print(), "\"Entity \\\"Supplier\\\" (" + PageBase.wrongIdShort + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_02_post_suppliers_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("SUPPLIERS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_03_get_supplier_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("SUPPLIERS.LOOKUP") + "?Keyword=" + GlobalVariables.id + "&Id=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_03_get_supplier_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("SUPPLIERS.LOOKUP") + "?Keyword=" + Helper.getRandomNumber(2) + "&Id=" + Helper.getRandomNumber(2));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_basicCatalogs_004_04_create_supplier_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("SUPPLIERS.CREATE"), Payloads.pxdSupplierCreate("1111111111111111", "Snabdjevac", 6, 78000));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_05_update_supplier_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("SUPPLIERS.UPDATE") + GlobalVariables.id, Payloads.pxdSupplierUpdate("1111111111111111", Integer.parseInt(GlobalVariables.id), "Snabdjevac 1", 6, "6 - Banja Luka", 78000, "78000 - Banja Luka"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_004_04_create_supplier_test1" })
	public void pxd_basicCatalogs_004_06_delete_supplier_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("SUPPLIERS.DELETE") + GlobalVariables.id, 204);
	}

}