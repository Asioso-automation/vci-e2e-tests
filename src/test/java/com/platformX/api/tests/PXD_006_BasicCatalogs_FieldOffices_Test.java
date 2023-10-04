package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.PageBase;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.FizickeLokacije;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_006_BasicCatalogs_FieldOffices_Test extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);

	public PXD_006_BasicCatalogs_FieldOffices_Test() throws IOException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_006_01_get_field_office_test1() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		FizickeLokacije fizickeLokacije = pocetna.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		PageBase.id = fizickeLokacije.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Office
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Get/" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("code"), "Code not forwarded");
		assertNotNull(jp2.getString("fieldUnitId"), "FieldUnitId not forwarded");
		assertNotNull(jp2.getString("fieldUnitText"), "FieldUnitText not forwarded");
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp2.getString("protocolNumberCode"), "ProtocolNumberCode not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_006_01_get_field_office_test2() {
		restApiBase.addHeader("Authorization", "");
		Response response = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Get/300");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_006_01_get_field_office_test3() {
		restApiBase.addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Get/300");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_006_01_get_field_office_test4() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Office
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Get/" + PageBase.wrongIdShort);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"FieldOffice\\\" (" + PageBase.wrongIdShort + ") was not found.\"");
		//TODO Map responses in properties file
	}
	
	@Test(description = "positive test case")
	public void pxd_006_02_post_field_offices_list_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Offices List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_01_get_field_office_test1" })
	public void pxd_006_03_get_field_office_lookup_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Office Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Lookup?Keyword=" + PageBase.id + "&Id=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_006_03_get_field_office_lookup_test2() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Field Office Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Lookup?Keyword=" + PageBase.wrongIdShort + "&Id=" + PageBase.wrongIdShort);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_006_04_create_field_office_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Field Office Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Create", Payloads.pxdFieldOfficeCreate(5, "FizickaLokacija", 11, 123));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2.print(), "Response body is empty");
		PageBase.id1 = Integer.parseInt(response2.print());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_04_create_field_office_test1" })
	public void pxd_006_05_update_field_office_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Patch Field Office Update
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPATCH("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Update/" + PageBase.id1, Payloads.pxdFieldOfficeUpdate(PageBase.id1, 5, "FizickaLokacija 1", "11", "123", "5 - Pale", " - "));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_006_05_update_field_office_test1" })
	public void pxd_006_06_delete_field_office_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Delete Field Office
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/FieldOffices/Delete/" + PageBase.id1);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
	}

}