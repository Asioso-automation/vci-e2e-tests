package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;

public class PXD_004_BasicCatalogs_FieldUnits_Test extends BaseTest {
	
	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);
	
	public PXD_004_BasicCatalogs_FieldUnits_Test() throws IOException {
		super();
	}
	
	private int id;
	private int id1;

	@Test(description = "positive test case")
	public void pxd_004_01_get_field_unit_test1() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		id = terenskeJedinice.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + id);
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp2.getString("companyText"), "CompanyText not forwarded");
	}
		
	@Test(description = "negative test case: wrong id")
	public void  pxd_004_02_get_field_unit_test2() throws Exception {	
	// API
	Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
			Payloads.pxdAuth("admin", "staging"));
	assertEquals(response1.getStatusCode(), 200);
	JsonPath jp1 = new JsonPath(response1.asString());
	assertNotNull(jp1.getString("token"), "Token not forwarded");
	String token = jp1.getString("token");
	// Get Field Unit
	restApiBase.addHeader("Authorization", "Bearer " + token);
	Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/50");
	assertEquals(404, response2.getStatusCode());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_004_01_get_field_unit_test1" })
	public void  pxd_004_03_get_field_unit_lookup_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Units Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + id + "&Id=" + id);
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void  pxd_004_04_get_field_unit_lookup_test2() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Units Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=50&Id=50");
		assertEquals(200, response2.getStatusCode());
		assertEquals("[]", response2.print());
	}
	
	@Test(description = "positive test case")
	public void  pxd_004_05_post_field_unit_list_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Units List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/List", Payloads.pxdFieldUnitList(0, 10, "id", "DESC"));
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
		// TODO Assert more parameters
	}	
	
	@Test(description = "positive test case")
	public void  pxd_004_06_post_field_unit_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Units Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Create", Payloads.pxdFieldUnitCreate("TJ test"));
		assertEquals(200, response2.getStatusCode());
		assertNotNull(response2.print(), "Response body is empty");
		id1 = Integer.parseInt(response2.print());
		}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_004_06_post_field_unit_test1" })
	public void  pxd_004_07_delete_field_unit_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Units Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Delete/" + id1);
		assertEquals(204, response2.getStatusCode());
		assertEquals("", response2.print());
	}
	
}