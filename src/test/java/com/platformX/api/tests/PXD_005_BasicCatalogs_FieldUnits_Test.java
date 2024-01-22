package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_005_BasicCatalogs_FieldUnits_Test extends RestApiBase {
	
	public PXD_005_BasicCatalogs_FieldUnits_Test() throws IOException {
		super();
	}

	@Test(description = "positive test case: create field unit")
	public void pxd_005_04_create_field_unit_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("FIELD.UNITS.CREATE"), Payloads.pxdFieldUnitCreate("TerenskaJedinica " + Helper.getRandomString(5)));
		assertEquals(response.getStatusCode(), 200);
		// TODO Prosiriti body da prima i druge parametre "email" npr. i razviti negativne testove
		assertNotNull(response, "Id not forwarded in response");
		GlobalVariables.id = response.asString();
	}

	@Test(description = "positive test case: get created field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_01_get_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("FIELD.UNITS.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("name"), "Name not forwarded");
		assertNotNull(jp.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp.getString("companyText"), "CompanyText not forwarded");
	}
	
	@Test(description = "positive test case: update field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_05_update_field_unit_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("FIELD.UNITS.UPDATE") + GlobalVariables.id, Payloads.pxdFieldUnitUpdate(Integer.parseInt(GlobalVariables.id), "TerenskaJedinica 1", " - "," - "), 204);
	}
	
	@Test(description = "positive test case: delete field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_06_delete_field_unit_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("FIELD.UNITS.DELETE") + GlobalVariables.id, 204);
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_005_01_get_field_unit_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("FIELD.UNITS.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_005_01_get_field_unit_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("FIELD.UNITS.GET") + Helper.getRandomNumber(1), 401);
	}
		
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_01_get_field_unit_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("FIELD.UNITS.GET") + Helper.getRandomNumber(6), 404);
	}
	
	@Test(description = "positive test case: list", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_02_post_field_units_list_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("FIELD.UNITS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case: lookup", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_03_get_field_unit_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("FIELD.UNITS.LOOKUP") + "?Keyword=" + GlobalVariables.id + "&Id=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_03_get_field_unit_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("FIELD.UNITS.LOOKUP") + "?Keyword=" + Helper.getRandomNumber(6) + "&Id=" + Helper.getRandomNumber(6));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
}