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


public class PXD_Metering_MeteringCatalogs_001_TransformerStationType_Tests extends RestApiBase {

	public PXD_Metering_MeteringCatalogs_001_TransformerStationType_Tests() throws IOException, FileNotFoundException {
		super();
}
	
	@Test (description = "positive test case", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_01_get_transformerStationType_test1() {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("TRANSFORMER.STATION.TYPE.GET") + GlobalVariables.id, 200);
		String[] parameters = {"type", "name"};
		verifyNotNull(jp, parameters);
	}
	
	@Test (description = "negative test case: bearer token missing", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_01_get_tranformerStationType_test2() {
		addHeader("Authorization","");
		methodGET(api_properties.getValue("TRANSFORMER.STATION.TYPE.GET") + Helper.getRandomNumber(1),401);
	}
	
	@Test (description = "negative test case: wrong bearer token", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	 public void pxd_metering_meteringCatalogs_001_01_get_transformerStationType_test3() {
		addHeader("Authorization", "Bearer" + Helper.getRandomNumber(5));
		methodGET(api_properties.getValue("TRANSFORMER.STATION.TYPE.GET") + Helper.getRandomNumber(1),(401));
		 
	 }
	
	@Test (description = "negative test case: wrong id", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_01_get_transformerStationType_test4() {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("TRANSFORMER.STATION.TYPE.GET") + Helper.getRandomNumber(4),(404));
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_02_post_transformerStationType_list_test1() {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("TRANSFORMER.STATION.TYPE.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_03_get_transformerStationType_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("TRANSFORMER.STATION.TYPE.LOOKUP") + "?Id=" + GlobalVariables.id + "&Keyword=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_03_get_transformerStationType_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("TRANSFORMER.STATION.TYPE.LOOKUP") + "?Id=" + Helper.getRandomNumber(2) + "&Keyword=" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("TRANSFORMER.STATION.TYPE.CREATE"), Payloads.pxdTransformerStationTypeCreate("Z", "Trafostanica"));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	@Test(description = "positive test case", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_05_update_transformerStationType_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("TRANSFORMER.STATION.TYPE.UPDATE") + GlobalVariables.id, Payloads.pxdTransformerStationTypeUpdate(Integer.parseInt(GlobalVariables.id), "Z", "Trafostanica 1"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_metering_meteringCatalogs_001_04_create_transformerStationType_test1" })
	public void pxd_metering_meteringCatalogs_001_06_delete_transformerStationType_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("TRANSFORMER.STATION.TYPE.DELETE") + GlobalVariables.id, 204);
	}
	
	
	
}

