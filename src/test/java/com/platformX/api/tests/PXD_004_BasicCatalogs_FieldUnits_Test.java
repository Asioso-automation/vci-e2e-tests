package com.platformX.api.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.platformX.base.BaseTest;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.io.IOException;

public class PXD_004_BasicCatalogs_FieldUnits_Test extends BaseTest {
	
	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);
	
	public PXD_004_BasicCatalogs_FieldUnits_Test() throws IOException {
		super();
	}

	@Test(description = "positive test case")
	public void get_field_unit_positive_test() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		int id = terenskeJedinice.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		AssertJUnit.assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		AssertJUnit.assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Unit
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Get/" + id);
		AssertJUnit.assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		AssertJUnit.assertNotNull(jp2.getString("id"), "Id not forwarded");
		// TODO Assert more parameters
	}
	
	
	@Test(description = "positive test case")
	public void get_field_unit_lookup_positive_test() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		int id = terenskeJedinice.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		AssertJUnit.assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		AssertJUnit.assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Units Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/Lookup?Keyword=" + id + "&Id=" + id);
		AssertJUnit.assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		AssertJUnit.assertNotNull(jp2.getString("id"), "Id not forwarded");
		// TODO Assert more parameters
	}
	
	@Test(description = "positive test case")
	public void post_field_unit_list_positive_test() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		AssertJUnit.assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		AssertJUnit.assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Units List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldUnits/List", Payloads.pxdFieldUnitList(0, 10, "id", "DESC"));
		AssertJUnit.assertEquals(200, response2.getStatusCode());
		// TODO Assert more parameters
	}	
	
}