package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.PageBase;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Monteri;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_014_BasicCatalogs_InstallmentPersons_Test extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);

	public PXD_014_BasicCatalogs_InstallmentPersons_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_014_01_get_installment_person_test1() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Monteri monteri = pocetna.navigirajNaMonteri();
		monteri.verifikujMonteri();
		PageBase.id = monteri.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Get/" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_014_01_get_installment_person_test2() {
		restApiBase.addHeader("Authorization", "");
		Response response = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_014_01_get_installment_person_test3() {
		restApiBase.addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_014_01_get_installment_person_test4() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Get/" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"InstallmentPerson\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case")
	public void pxd_014_02_post_installment_persons_list_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Installment Persons List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}

	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_01_get_installment_person_test1" })
	public void pxd_014_03_get_installment_person_lookup_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Lookup?Keyword=" + PageBase.id + "&Id=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_014_03_get_installment_person_lookup_test2() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGET("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Lookup?Keyword=" + PageBase.wrongIdLong + "&Id=" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_014_04_create_installment_person_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Installment Person Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Create", Payloads.pxdInstallmentPersonCreate("Monter"));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2.print(), "Response body is empty");
		PageBase.id1 = Integer.parseInt(response2.print());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_05_update_installment_person_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Put Installment Person Update
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPUT("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Update/" + PageBase.id1, Payloads.pxdInstallmentPersonUpdate(PageBase.id1, "Monter 1"));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_05_update_installment_person_test1" })
	public void pxd_014_06_delete_installment_person_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Delete Installment Person
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodDELETE("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Delete/" + PageBase.id1);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
	}


}