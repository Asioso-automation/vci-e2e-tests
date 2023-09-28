package com.platformX.base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.platformX.util.PropertiesUtil;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.ConnectionConfig;
import io.restassured.config.RestAssuredConfig;

public class RestApiBase {
	
	private RequestSpecBuilder builder;
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);
    private RestAssuredConfig restAssuredConfig;
	
	public RestApiBase() throws IOException {
        RestAssured.urlEncodingEnabled = false;
        ConnectionConfig connectionConfig = new ConnectionConfig().closeIdleConnectionsAfterEachResponseAfter(120,
                TimeUnit.SECONDS);
        restAssuredConfig = new RestAssuredConfig().connectionConfig(connectionConfig);
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        builder = requestSpecBuilder;
   }

	// method used for GET endpoints
	public Response methodGET(String endpoint) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).when().get(endpoint);
	}

	// method used for POST endpoints
	public Response methodPOST(String endpoint, String payload) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).contentType("application/json").body(payload).when().post(endpoint);
	}
	
	// method used for PUT endpoints
	public Response methodPUT(String endpoint, String payload) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).contentType("application/json").body(payload).when().put(endpoint);
	}
	
	// method used for DELETE endpoints
	public Response methodDELETE(String endpoint) {
		RequestSpecification requestSpec = builder.build();
		return given().log().all().config(restAssuredConfig).spec(requestSpec).when().delete(endpoint);
	}
	
	public void addHeader(String key, String value) {
    	RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    	requestSpecBuilder.addHeader(key, value);
    	builder = requestSpecBuilder;
    }

} 