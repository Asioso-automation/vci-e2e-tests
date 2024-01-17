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
import com.platformX.distribution.page.LokacijeMontera;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;
import com.platformX.util.PropertiesUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_015_BasicCatalogs_InstallmentPersonLocations_Test extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
    protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);
	
	public PXD_015_BasicCatalogs_InstallmentPersonLocations_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_015_01_get_installment_person_location_test1() throws Exception {
		//PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		LokacijeMontera lokacijeMontera = pocetna.navigirajNaLokacijeMontera();
		lokacijeMontera.verifikujLokacijeMontera();
		int idLokacijeMontera = lokacijeMontera.pokupiIdStavke();
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Location
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Get/" + idLokacijeMontera);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("installmentPersonId"), "InstallmentPersonId not forwarded");
//		assertNotNull(jp2.getString("fieldUnitId"), "FieldUnitId not forwarded");
//		assertNotNull(jp2.getString("fieldOfficeId"), "FieldOfficeId not forwarded");
		assertNotNull(jp2.getString("dateFrom"), "DateFrom not forwarded");
		assertNotNull(jp2.getString("installmentPersonText"), "InstallmentPersonText not forwarded");
//		assertNotNull(jp2.getString("fieldUnitText"), "FieldUnitText not forwarded");
//		assertNotNull(jp2.getString("fieldOfficeText"), "FieldOfficeText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_015_01_get_installment_person_location_test2() {
		restApiBase.addHeader("Authorization", "");
		Response response = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}
	
	@Test(description = "negative test case: wrong bearer token")
	public void pxd_015_01_get_installment_person_location_test3() {
		restApiBase.addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Get/0");
		assertEquals(response.getStatusCode(), 401);
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_015_01_get_installment_person_location_test4() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Location
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Get/" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"InstallmentPersonLocation\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case")
	public void pxd_015_02_post_installment_persons_location_list_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Installment Persons Location List
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/List", Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_03_get_active_installment_person_lookup_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Location Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/GetActiveInstallmentPersonLocationsLookup?FieldOfficeId=null" + "&Id=" + PageBase.id + "&Keyword=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id")
	public void pxd_015_03_get_active_installment_person_location_lookup_test2() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Installment Person Location Lookup
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodGETresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/GetActiveInstallmentPersonLocationsLookup?FieldOfficeId=null" + "&Id=" + PageBase.wrongIdLong + "&Keyword=" + PageBase.wrongIdLong);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_015_04_create_installment_persons_location_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Installment Person Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersons/Create", Payloads.pxdInstallmentPersonCreate("Monter NovaLokacija"));
		assertEquals(response2.getStatusCode(), 200);
		assertNotNull(response2.print(), "Response body is empty");
		PageBase.id = Integer.parseInt(response2.print());
		// Post Installment Person Location Create
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response3 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Create", Payloads.pxdInstallmentPersonLocationCreate("2023-12-01", 301, 1, PageBase.id));
		assertEquals(response3.getStatusCode(), 200);
		assertNotNull(response3.print(), "Response body is empty");
		PageBase.id1 = Integer.parseInt(response3.print());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_05_update_installment_person_location_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Put Installment Person Location Update
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodPUTresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Update/" + PageBase.id1, Payloads.pxdInstallmentPersonLocationUpdate("2023-12-05", 301, "301 - Istočno Novo Sarajevo", 1, "1 - Istočno Novo Sarajevo", PageBase.id1, PageBase.id, "Monter NovaLokacija"));
		assertEquals(response2.getStatusCode(), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_05_update_installment_person_location_test1" })
	public void pxd_015_06_delete_installment_person_location_test1() throws Exception {
		// API
		Response response1 = restApiBase.methodPOSTresponse("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Delete Installment Person Location
		restApiBase.addHeader("Authorization", "Bearer " + token);
		Response response2 = restApiBase.methodDELETEresponse("http://10.10.10.21:8086/api/BasicCatalogs/InstallmentPersonLocations/Delete/" + PageBase.id1);
		assertEquals(response2.getStatusCode(), 204);
		assertEquals(response2.print(), "");
	}

}