package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_002_Administration_Users_Test extends RestApiBase{

	public PXD_002_Administration_Users_Test() throws IOException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_get_administration_users_test1() {
		// Authorization
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Administration User
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/10");
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertEquals(jp2.get("name"), "Miroslav");
		assertEquals(jp2.get("username"), "KMIROSLAV");
		// TODO Assert more
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_get_administration_users_test2() {
		addHeader("Authorization", Helper.getRandomString(15));
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/10");
		assertEquals(401, response.getStatusCode());
	}

	@Test(description = "negative test case: missing bearer token")
	public void pxd_get_user_data_test1() {
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/10");
		assertEquals(401, response.getStatusCode());
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_get_user_data_test2() {
		// Authorization
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Administration User
		addHeader("Authorization", "Bearer " + token);
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/1");
		assertEquals(404, response.getStatusCode());
	}
	
}