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

public class PXD_006_BasicCatalogs_FieldOffices_Test extends RestApiBase {

	public PXD_006_BasicCatalogs_FieldOffices_Test() throws IOException {
		super();
	}
	
	String getWrongId = Helper.getRandomNumber(1);
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_01_get_field_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("FIELD.OFFICES.GET") + GlobalVariables.id, 200);
		
		String[] parameters = {"code", "fieldUnitId", "fieldUnitText", "fieldUnitText", "id", "name", "placeText", "protocolNumberCode"};
		verifyNotNull(jp, parameters);
		
//		assertNotNull(jp.getString("code"), "Code not forwarded");
//		assertNotNull(jp.getString("fieldUnitId"), "FieldUnitId not forwarded");
//		assertNotNull(jp.getString("fieldUnitText"), "FieldUnitText not forwarded");
//		assertNotNull(jp.getString("id"), "Id not forwarded");
//		assertNotNull(jp.getString("name"), "Name not forwarded");
//		assertNotNull(jp.getString("placeText"), "PlaceText not forwarded");
//		assertNotNull(jp.getString("protocolNumberCode"), "ProtocolNumberCode not forwarded");
	}

	@Test(description = "negative test case: bearer token missing")
	public void pxd_006_01_get_field_office_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("FIELD.OFFICES.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_006_01_get_field_office_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("FIELD.OFFICES.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_01_get_field_office_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("FIELD.OFFICES.GET") + getWrongId);
		assertEquals(response.getStatusCode(), 404);
		assertEquals(response.print(), "\"Entity \\\"FieldOffice\\\" (" + getWrongId + ") was not found.\"");
		//TODO Map responses in properties file
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_02_post_field_offices_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("FIELD.OFFICES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_03_get_field_office_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("FIELD.OFFICES.LOOKUP") + "?Keyword=" + GlobalVariables.id + "&Id=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_03_get_field_office_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("FIELD.OFFICES.LOOKUP") + "?Keyword=" + Helper.getRandomNumber(1) + "&Id=" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_006_04_create_field_office_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("FIELD.OFFICES.CREATE"), Payloads.pxdFieldOfficeCreate(5, "FizickaLokacija", 11, 123));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_05_update_field_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPATCH(api_properties.getValue("FIELD.OFFICES.UPDATE") + GlobalVariables.id, Payloads.pxdFieldOfficeUpdate(Integer.parseInt(GlobalVariables.id), 5, "FizickaLokacija 1", "11", "123", "5 - Pale", " - "), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_06_delete_field_office_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("FIELD.OFFICES.DELETE") + GlobalVariables.id, 204);
	}

}