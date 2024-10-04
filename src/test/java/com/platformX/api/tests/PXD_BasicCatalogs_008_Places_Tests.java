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

public class PXD_BasicCatalogs_008_Places_Tests extends RestApiBase {

	public PXD_BasicCatalogs_008_Places_Tests() throws IOException, FileNotFoundException {
		super();
	}

	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_01_get_place_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("PLACES.GET") + GlobalVariables.id, 200);		
		String[] parameters = {"id", "name", "printName", "municipalityId", "municipalityText"};
		verifyNotNull(jp, parameters);
	}
	@Test(description = "negative test case: bearer token missing")
	public void pxd_basicCatalogs_008_01_get_place_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("PLACES.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_basicCatalogs_008_01_get_place_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("PLACES.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_01_get_place_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("PLACES.GET") + Helper.getRandomNumber(6), 404);
//		assertEquals(response2.print(), "\"Entity \\\"Place\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_02_post_places_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("PLACES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_03_get_place_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("PLACES.LOOKUP") + "?Keyword=" + GlobalVariables.id + "&Id=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_03_get_place_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("PLACES.LOOKUP") + "?Id=" + Helper.getRandomNumber(6) + "&Keyword=" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_basicCatalogs_008_04_create_place_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("PLACES.CREATE"), Payloads.pxdPlaceCreate("NaseljenoMjesto", "NaseljenoMjesto", 2));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_05_update_place_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("PLACES.UPDATE") + GlobalVariables.id, Payloads.pxdPlaceUpdate(Integer.parseInt(GlobalVariables.id), "NaseljenoMjesto 1", "NaseljenoMjesto 1", 2), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_basicCatalogs_008_04_create_place_test1" })
	public void pxd_basicCatalogs_008_06_delete_place_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("PLACES.DELETE") + GlobalVariables.id, 204);
	}

}