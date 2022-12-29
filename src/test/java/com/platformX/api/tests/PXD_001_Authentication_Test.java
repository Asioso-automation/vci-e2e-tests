package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_001_Authentication_Test extends RestApiBase{

	public PXD_001_Authentication_Test() throws IOException {
		super();
	}

	@Test
	public void pxd_authentication_test() {
		Response response = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate", Payloads.pxdAuth("admin", "staging"));
		// Assert.assertEquals(response.getStatusCode(), 200, "Correct status code is not returned");
		assertEquals(response.getStatusCode(), 200);
		JsonPath jp = new JsonPath(response.asString());
		assertNotNull(jp.getString("token"), "Token not forwarded");
	}
	
}