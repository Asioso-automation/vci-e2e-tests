package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_003_Get_Administration_Message_Positive_Test extends BaseTest {
	
	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);
	
	public PXD_003_Get_Administration_Message_Positive_Test() throws IOException {
		super();
	}

	@Test(description = "positive test case")
	public void get_administration_message_positive_test() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		int id = poruke.pokupiIdPoruke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Administration Message
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/Administrations/Messages/Get/" + id);
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		
		// TODO Assert more parameters
	}
	
}