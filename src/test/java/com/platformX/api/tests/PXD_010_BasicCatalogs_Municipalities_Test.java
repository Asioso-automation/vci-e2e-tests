package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.PageBase;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Opstine;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_010_BasicCatalogs_Municipalities_Test extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);

	public PXD_010_BasicCatalogs_Municipalities_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_010_01_get_municipality_test1() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Opstine opstine = pocetna.navigirajNaOpstine();
		opstine.verifikujOpstine();
		PageBase.id = opstine.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Municipality
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Get/" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("countryId"), "CountryId not forwarded");
		assertNotNull(jp2.getString("countryText"), "CountryText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_010_01_get_municipality_test2() {
		restApiBase.addHeader("Authorization", "");
		Response response = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_010_01_get_municipality_test3() {
		restApiBase.addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_010_01_get_municipality_test4() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Municipality
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Get/" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"Municipality\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case")
	public void pxd_010_02_post_municipalities_list_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Municipalities List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_010_01_get_municipality_test1" })
	public void pxd_010_03_get_municipality_lookup_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Municipality Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Lookup?Keyword=" + PageBase.id + "&Id=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_010_03_get_municipality_lookup_test2() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Municipality Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Lookup?Keyword=" + PageBase.wrongIdLong + "&Id=" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_010_04_create_municipality_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Municipality Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Create", Payloads.pxdMunicipalityCreate("Opstina", 1, "BIH"));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2.print(), "Response body is empty");
		PageBase.id1 = Integer.parseInt(response2.print());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_010_04_create_municipality_test1" })
	public void pxd_010_05_update_municipality_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Put Municipality Update
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPUTresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Update/" + PageBase.id1, Payloads.pxdMunicipalityUpdate(PageBase.id1, "Opstina 1", 1, "BIH"));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_010_05_update_municipality_test1" })
	public void pxd_0010_06_delete_municipality_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Delete Municipality
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodDELETEresponse("http://10.10.10.21:8086/api/BasicCatalogs/Municipalities/Delete/" + PageBase.id1);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
	}

}