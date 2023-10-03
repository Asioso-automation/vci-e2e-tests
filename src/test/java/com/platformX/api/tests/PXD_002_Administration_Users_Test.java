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
	public void pxd_002_01_get_user_test1() {
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
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertEquals(jp2.get("name"), "Miroslav");
		assertEquals(jp2.get("surname"), "Kremenović");
		assertEquals(jp2.get("username"), "KMIROSLAV");
		assertEquals(jp2.get("fieldOfficeIdDataOnlyText"), " - ");
		assertNotNull(jp2.getString("userModules"), "UserModules not forwarded");
		// TODO Assert more
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_002_01_get_user_test2() {
		addHeader("Authorization", Helper.getRandomString(15));
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/10");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: missing bearer token")
	public void pxd_002_01_get_user_test3() {
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Users/Get/10");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_002_01_get_user_test4() {
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
		assertEquals(response.getStatusCode(), 404);
	}
	
}