package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.ApiProvider;
import io.restassured.path.json.JsonPath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_001_Authentication_Test extends RestApiBase {

	public PXD_001_Authentication_Test() throws IOException {
		super();
	}

// Authenticate

	@Test(description = "positive test case")
	public void pxd_001_01_authentication_test1() {
		authorize();
	}

	@Test(description = "negative test case: wrong username")
	public void pxd_001_01_authentication_test2() {
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"),
				Payloads.pxdAuth(Helper.getRandomString(5), api_properties.getValue("PASSWORD")), 400);
		assertEquals(jp.get("message.name"), "Invalid username or password.");
		assertEquals(jp.get("message.value"), "Invalid username or password.");
		assertEquals(jp.get("message.searchedLocation"), "Px.D.Resources.Resource");
	}

	@Test(description = "negative test case: wrong password")
	public void pxd_001_01_authentication_test3() {
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"),
				Payloads.pxdAuth(api_properties.getValue("USERNAME"), Helper.getRandomString(5)), 400);
		assertEquals(jp.get("message.name"), "Invalid username or password.");
		assertEquals(jp.get("message.value"), "Invalid username or password.");
		assertEquals(jp.get("message.searchedLocation"), "Px.D.Resources.Resource");
	}

	@Test(description = "negative test case: username missing")
	public void pxd_001_01_authentication_test4() {
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"),				
				Payloads.pxdAuth("", api_properties.getValue("PASSWORD")), 400);
		assertEquals(jp.get("Username[0]"), "NotEmptyValidator");
	}

	@Test(description = "negative test case: password missing")
	public void pxd_001_01_authentication_test5() {
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"),				
				Payloads.pxdAuth(api_properties.getValue("USERNAME"), ""), 400);
		assertEquals(jp.get("Password[0]"), "NotEmptyValidator");
	}

	@Test(description = "negative test case: username and password missing")
	public void pxd_001_01_authentication_test6() {
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"), Payloads.pxdAuth("", ""), 400);
		assertEquals(jp.get("Username[0]"), "NotEmptyValidator");
		assertEquals(jp.get("Password[0]"), "NotEmptyValidator");
	}

// UserData

	@Test(description = "positive test case")
	public void pxd_001_02_get_user_data_test1() {
		// Authorization
		String token = authorize();
		// Get User Data
		addHeader("Authorization", "Bearer " + token);
		JsonPath jp = methodGET(api_properties.getValue("USER.DATA"), 200);
		assertEquals(jp.get("username"), ApiProvider.userData_userName);
		assertEquals(jp.get("name"), ApiProvider.userData_name);
		assertEquals(jp.get("surname"), ApiProvider.userData_surnamename);
		assertNotNull(jp.getString("permissions"), "Permissions not forwarded");
		// TODO Assert more parameters
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_001_02_get_user_data_test2() {
		addHeader("Authorization", Helper.getRandomString(15));
		methodGET(api_properties.getValue("USER.DATA"), 401);
	}

	@Test(description = "negative test case: missing bearer token")
	public void pxd_001_02_get_user_data_test3() {
		methodGET(api_properties.getValue("USER.DATA"), 401);
	}

}