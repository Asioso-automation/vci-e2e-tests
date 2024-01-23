package com.platformX.base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.platformX.util.PropertiesUtil;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.ConnectionConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.JsonPath;

public class RestApiBase {

	private RequestSpecBuilder builder;
	protected PropertiesUtil properties;
	protected PropertiesUtil api_properties = null;
	protected static final String API_PROPERTIES = "api.properties";
	private RestAssuredConfig restAssuredConfig;

	public RestApiBase() throws IOException {
		api_properties = new PropertiesUtil(API_PROPERTIES);
		RestAssured.urlEncodingEnabled = false;
		ConnectionConfig connectionConfig = new ConnectionConfig().closeIdleConnectionsAfterEachResponseAfter(120,
				TimeUnit.SECONDS);
		restAssuredConfig = new RestAssuredConfig().connectionConfig(connectionConfig);
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
		builder = requestSpecBuilder;
	}

	// method used for GET endpoints
	public Response methodGETresponse(String endpoint) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).when()
				.get(api_properties.getValue("URL.BASE") + endpoint);
	}

	public JsonPath methodGET(String endpoint, int status) {
		RequestSpecification requestSpec = builder.build();
		Response response = given().log().all().config(restAssuredConfig).spec(requestSpec).when()
				.get(api_properties.getValue("URL.BASE") + endpoint);
		assertEquals(response.getStatusCode(), status);
		JsonPath jp = new JsonPath(response.asString());
		return jp;
	}

	// method used for POST endpoints
	public Response methodPOSTresponse(String endpoint, String payload) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).contentType("application/json")
				.body(payload).when().post(api_properties.getValue("URL.BASE") + endpoint);
	}

	public JsonPath methodPOST(String endpoint, String payload, int status) {
		RequestSpecification requestSpec = builder.build();
		Response response = given().log().all().config(restAssuredConfig).spec(requestSpec)
				.contentType("application/json").body(payload).when()
				.post(api_properties.getValue("URL.BASE") + endpoint);
		assertEquals(response.getStatusCode(), status);
		JsonPath jp = new JsonPath(response.asString());
		return jp;
	}

	// method used for PUT endpoints
	public Response methodPUTresponse(String endpoint, String payload) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).contentType("application/json")
				.body(payload).when().put(api_properties.getValue("URL.BASE") + endpoint);
	}

	public JsonPath methodPUT(String endpoint, String payload, int status) {
		RequestSpecification requestSpec = builder.build();
		Response response = given().log().all().config(restAssuredConfig).spec(requestSpec)
				.contentType("application/json").body(payload).when()
				.put(api_properties.getValue("URL.BASE") + endpoint);
		assertEquals(response.getStatusCode(), status);
		JsonPath jp = new JsonPath(response.asString());
		return jp;
	}

	// method used for PATCH endpoints
	public JsonPath methodPATCH(String endpoint, String payload, int status) {
		RequestSpecification requestSpec = builder.build();
		Response response = given().log().all().config(restAssuredConfig).spec(requestSpec)
				.contentType("application/json").body(payload).when()
				.patch(api_properties.getValue("URL.BASE") + endpoint);
		assertEquals(response.getStatusCode(), status);
		JsonPath jp = new JsonPath(response.asString());
		return jp;
	}

	// method used for DELETE endpoints
	public Response methodDELETEresponse(String endpoint) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).when()
				.delete(api_properties.getValue("URL.BASE") + endpoint);
	}

	public JsonPath methodDELETE(String endpoint, int status) {
		RequestSpecification requestSpec = builder.build();
		Response response = given().log().all().config(restAssuredConfig).spec(requestSpec).when()
				.delete(api_properties.getValue("URL.BASE") + endpoint);
		assertEquals(response.getStatusCode(), status);
		assertEquals(response.print(), "");
		JsonPath jp = new JsonPath(response.asString());
		return jp;
	}

	public void addHeader(String key, String value) {
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
		requestSpecBuilder.addHeader(key, value);
		builder = requestSpecBuilder;
	}

	protected String authorize() { // authAdmin
		JsonPath jp = methodPOST(api_properties.getValue("AUTHENTICATE"),
				Payloads.pxdAuth(api_properties.getValue("USERNAME"), api_properties.getValue("PASSWORD")), 200);
		assertNotNull(jp.getString("token"), "Token not forwarded");
		String token = jp.getString("token");
		return token;
	}

	public void verifyNotNull(JsonPath jp, String[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			assertNotNull(jp.getString(parameters[i]), parameters[i] + " not forwarded");

		}

	}
	
	public String returnId(String id) {
		return id;
	}
	
}