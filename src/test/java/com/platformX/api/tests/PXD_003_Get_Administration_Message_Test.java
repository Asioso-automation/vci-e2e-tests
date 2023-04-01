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

public class PXD_003_Get_Administration_Message_Test extends RestApiBase {

	public PXD_003_Get_Administration_Message_Test() throws IOException {
		super();
	}

	@Test(description = "positive test case")
	public void get_administration_message_test1() {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Administration Message
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/Administrations/Messages/Get/158");
		assertEquals(200, response2.getStatusCode());
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		// TODO Assert more parameters
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void get_administration_message_test2() {
		addHeader("Authorization", "");
		// without this test takes bearer token from positive, test case 1
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Messages/Get/119");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void get_administration_message_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = methodGET("http://10.10.10.21:8086/api/Administrations/Messages/Get/119");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong id")
	public void get_administration_message_test4() {
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Administration Message
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/Administrations/Messages/Get/1");
		assertEquals(404, response2.getStatusCode());
	}
	
	// dodati poruku kroz UI pa je asertovati
	
}