package com.platformX.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.platformX.base.RestApiBase;
import io.restassured.response.Response;
import java.io.IOException;

public class GetAdministrationMessageScenario extends RestApiBase{

	public GetAdministrationMessageScenario() throws IOException {
		super();
	}

	@Test
	public void get_administration_message_test() {
		Response response = methodGET("http://10.10.10.21:86/api/Administrations/Messages/Get/1");
		Assert.assertEquals(response.getStatusCode(), 401, "Correct status code is not returned");
	}
	
}