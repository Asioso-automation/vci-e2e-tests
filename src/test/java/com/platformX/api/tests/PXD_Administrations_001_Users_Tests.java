package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.ApiProvider;
import io.restassured.path.json.JsonPath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

public class PXD_Administrations_001_Users_Tests extends RestApiBase {

	public PXD_Administrations_001_Users_Tests() throws IOException {
		super();
	}

	@Test(description = "positive test case")
	public void pxd_administrations_001_01_get_user_test1() {
		String token = authorize();
		addHeader("Authorization", "Bearer " + token);
		JsonPath jp = methodGET(api_properties.getValue("USERS.GET") + "346", 200);
		assertEquals(jp.get("name"), ApiProvider.administration_name);
		assertEquals(jp.get("surname"), ApiProvider.administration_surname);
		assertEquals(jp.get("username"), ApiProvider.administration_username);
		assertEquals(jp.get("fieldOfficeIdDataOnlyText"), " - ");
		assertNotNull(jp.getString("userModules"), "UserModules not forwarded");
		// TODO Assert more parameters
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_administrations_001_01_get_user_test2() {
		addHeader("Authorization", Helper.getRandomString(15));
		methodGET(api_properties.getValue("USERS.GET") + "346", 401);
	}

	@Test(description = "negative test case: missing bearer token")
	public void pxd_administrations_001_01_get_user_test3() {
		methodGET(api_properties.getValue("USERS.GET") + "346", 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_administrations_001_01_get_user_test4() {
		String token = authorize();
		addHeader("Authorization", "Bearer " + token);
		// Get Administration User
		methodGET(api_properties.getValue("USERS.GET") + "1", 404);
	}

}