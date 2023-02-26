package com.platformX.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_002_Get_User_Data_Test extends RestApiBase{

	public PXD_002_Get_User_Data_Test() throws IOException {
		super();
	}

	@Test (description = "positive test case")
	public void pxd_get_user_data_test1() {
		// Authorization
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate", Payloads.pxdAuth("admin", "staging"));
		Assert.assertEquals(response1.getStatusCode(), 200, "Correct status code is not returned");
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get User Data
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/Auth/UserData");
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertEquals(jp2.get("username"), "admin");
		assertEquals(jp2.get("name"), "Adminko");
		// TODO Assert more
	}
	
	@Test (description = "negative test case: wrong bearer token")
	public void pxd_get_user_data_test2() {
		addHeader("Authorization", 	Helper.getRandomString(15));
		Response response = methodGET("http://10.10.10.21:8086/api/Auth/UserData");
		assertEquals(401, response.getStatusCode());
	}
	
	@Test (description = "negative test case: missing bearer token")
	public void pxd_get_user_data_test3() {
		Response response = methodGET("http://10.10.10.21:8086/api/Auth/UserData");
		assertEquals(401, response.getStatusCode());
	}
	
}