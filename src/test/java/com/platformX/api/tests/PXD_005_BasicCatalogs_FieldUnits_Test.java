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

	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Terensku Jedinicu" })
	public void pxd_005_01_get_field_unit_test1() throws Exception {
		//PXD UI
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
//		pocetna.verifikujPocetnuStranicu();
//		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
//		terenskeJedinice.verifikujTerenskeJedinice();
//		PageBase.id = terenskeJedinice.pokupiIdStavke();
		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp2.getString("companyText"), "CompanyText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_005_01_get_field_unit_test2() {
		addHeader("Authorization", "");
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_005_01_get_field_unit_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}
		
	@Test(description = "negative test case: wrong id")
	public void pxd_005_01_get_field_unit_test4() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"FieldUnit\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case")
	public void pxd_005_02_post_field_units_list_test1() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Units List
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Terensku Jedinicu" })
	public void pxd_005_03_get_field_unit_lookup_test1() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit Lookup
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + PageBase.id + "&Id=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_005_03_get_field_unit_lookup_test2() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit Lookup
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + PageBase.wrongIdLong + "&Id=" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_005_04_create_field_unit_test1() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Unit Create
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Create", Payloads.pxdFieldUnitCreate("TerenskaJedinica"));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2.print(), "Response body is empty");
		PageBase.id1 = Integer.parseInt(response2.print());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_05_update_field_unit_test1() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Put Field Unit Update
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPUT("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Update/" + PageBase.id1, Payloads.pxdFieldUnitUpdate(PageBase.id1, "TerenskaJedinica 1", " - "," - "));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_005_04_create_field_unit_test1" })
	public void pxd_005_06_delete_field_unit_test1() throws Exception {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Delete Field Unit
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Delete/" + PageBase.id1);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
	}
	
}