package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.PageBase;
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
	
// TODO Sve POST/GET/PUT/DELETE metode iz ove klase ce biti nove metode, koje odmah vracaju JSONPATH,
// TODO nakon toga refaktorisati testove (linija koja provjerava status ce biti suvisna)
// TODO Jedino ce u 1. testu "pxd_005_04_create_field_unit_test" biti koristena nova/stara methodPOSTResponse metoda,
// TODO jer moramo procitati id iz response-a (ne mozemo iz JSONPATH-a)

	@Test(description = "positive test case: create field unit")
	public void pxd_005_04_create_field_unit_test() throws Exception {
		GlobalVariables.token = authorize();
		// Post Field Unit Create
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Create", Payloads.pxdFieldUnitCreate("TerenskaJedinica " + Helper.getRandomString(5)));
		assertEquals(response.getStatusCode(), 200);
		// TODO Prosiriti body da prima i druge parametre "email" npr. i razviti negativne testove
		assertNotNull(response, "Id not forwarded in response");
		GlobalVariables.id = response.asString();
	}

	@Test(description = "positive test case: get created field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_01_get_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + GlobalVariables.id);
		assertEquals(response.getStatusCode(), 200);
		JsonPath jp = new JsonPath(response.asString());
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("name"), "Name not forwarded");
		assertNotNull(jp.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp.getString("companyText"), "CompanyText not forwarded");
	}
	
	@Test(description = "positive test case: update field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_05_update_field_unit_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPUT("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Update/" + GlobalVariables.id, Payloads.pxdFieldUnitUpdate(PageBase.id1, "TerenskaJedinica 1", " - "," - "));
		assertEquals(response.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case: delete field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_06_delete_field_unit_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Delete/" + GlobalVariables.id);
		assertEquals(response.getStatusCode(), 204);
		assertEquals(response.print(), "");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_005_01_get_field_unit_test2() {
		addHeader("Authorization", "");
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_005_01_get_field_unit_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + Helper.getRandomNumber(1));
		assertEquals(response.getStatusCode(), 401);
	}
		
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_01_get_field_unit_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + Helper.getRandomNumber(6));
		assertEquals(response.getStatusCode(), 404);
	}
	
	@Test(description = "positive test case: list", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_02_post_field_units_list_test() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response.getStatusCode(), 200);
		JsonPath jp = new JsonPath(response.asString());
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case: lookup", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_03_get_field_unit_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + GlobalVariables.id + "&Id=" + GlobalVariables.id);
		assertEquals(response.getStatusCode(), 200);
		JsonPath jp = new JsonPath(response.asString());
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test" })
	public void pxd_005_03_get_field_unit_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + Helper.getRandomNumber(6) + "&Id=" + Helper.getRandomNumber(6));
		assertEquals(response.getStatusCode(), 200);
	}
	
}