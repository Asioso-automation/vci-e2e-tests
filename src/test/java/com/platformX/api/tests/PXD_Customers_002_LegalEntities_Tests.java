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

public class PXD_Customers_002_LegalEntities_Tests extends RestApiBase {

	public PXD_Customers_002_LegalEntities_Tests() throws IOException, FileNotFoundException {
		super();
	}
	
	String tax = Helper.getRandomNumber(13);
	
	@Test(description = "positive test case: get created legal entity", dependsOnMethods = { "pxd_customers_002_03_create_legal_entity_test1" })
	public void pxd_customers_002_01_get_legal_entity_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("LEGAL.ENTITIES.GET") + GlobalVariables.id, 200);		
		String[] parameters = {"id", "streetId","placeId", "isLegalEntity", "taxId", "postOfficeId", "name", "printAddressText", "vatPayer", "associatedLegalEntities", 
				"testBills", "printName", "placeText", "postOfficeText", "streetText"};
		verifyNotNull(jp, parameters);
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_customers_002_01_get_legal_entity_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("LEGAL.ENTITIES.GET") + GlobalVariables.id, 401);
	}
	
	@Test(description = "negative test case: wrong bearer token")
	public void pxd_customers_002_01_get_legal_entity_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("LEGAL.ENTITIES.GET") + GlobalVariables.id, 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_customers_002_03_create_legal_entity_test1" })
	public void pxd_customers_002_01_get_legal_entity_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("LEGAL.ENTITIES.GET") + Helper.getRandomNumber(6), 404);
	}
	
	@Test(description = "positive test case: list", dependsOnMethods = { "pxd_customers_002_03_create_legal_entity_test1" })
	public void pxd_customers_002_02_post_legal_entity_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("LEGAL.ENTITIES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}

	
	@Test(description = "positive test case: create legal entity")
	public void pxd_customers_002_03_create_legal_entity_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("LEGAL.ENTITIES.CREATE"), Payloads.pxdLegalEntityCreate(true, "PravnoLice", 25, 76300, "PravnoLiceStampano", 1001, tax, false));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response, "Id not forwarded in response");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case: update legal entity", dependsOnMethods = { "pxd_customers_002_03_create_legal_entity_test1" })
	public void pxd_customers_002_04_update_legal_entity_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPATCH(api_properties.getValue("LEGAL.ENTITIES.UPDATE") + GlobalVariables.id, Payloads.pxdLegalEntityUpdate(Integer.parseInt(GlobalVariables.id), 1001, 25, true, tax, 76300, "PravnoLiceUpdate", "ЈАСЕНИЦА III , 76300 Бијељина", false, false, false, false, "PravnoLiceStampano", "25 - Bijeljina", "76300 - Bijeljina", "1001 - JASENICA III"), 204);
	}
	
	@Test(description = "positive test case: delete legal entity", dependsOnMethods = { "pxd_customers_002_03_create_legal_entity_test1" })
	public void pxd_customers_002_05_delete_legal_entity_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("LEGAL.ENTITIES.DELETE") + GlobalVariables.id, 204);
	}


}
