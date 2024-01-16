package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.PageBase;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_005_BasicCatalogs_FieldUnits_Test extends RestApiBase {
	
	public PXD_005_BasicCatalogs_FieldUnits_Test() throws IOException {
		super();
	}
	
	String token;
	String id;
	
	@Test(description = "positive test case: create field unit")
	public void pxd_005_04_create_field_unit_test1() throws Exception {
		token = authorize();
		// Post Field Unit Create
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Create", Payloads.pxdFieldUnitCreate("TerenskaJedinica " + Helper.getRandomString(5)));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2, "Id not forwarded in response");
		id = response2.asString();
	}

	@Test(description = "positive test case: get created field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_01_get_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp2.getString("companyText"), "CompanyText not forwarded");
	}
	
	@Test(description = "positive test case: update field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_05_update_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPUT("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Update/" + id, Payloads.pxdFieldUnitUpdate(PageBase.id1, "TerenskaJedinica 1", " - "," - "));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case: delete field unit", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_06_delete_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Delete/" + id);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
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
		
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_01_get_field_unit_test4() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + Helper.getRandomNumber(6));
		assertEquals(response2.getStatusCode(), 404);
	}
	
	@Test(description = "positive test case: list", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_02_post_field_units_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_03_get_field_unit_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + id + "&Id=" + id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_03_get_field_unit_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + Helper.getRandomNumber(6) + "&Id=" + Helper.getRandomNumber(6));
		assertEquals(response2.getStatusCode(), 200);
	}
	
}