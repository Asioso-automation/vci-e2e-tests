package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.PageBase;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_004_BasicCatalogs_Companies_Test extends RestApiBase {

	public PXD_004_BasicCatalogs_Companies_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Organizaciju" })
	public void pxd_004_01_get_company_test1() throws Exception {
//		// PXD UI
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
//		pocetna.verifikujPocetnuStranicu();
//		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
//		organizacije.verifikujOrganizacije();
//		PageBase.id = organizacije.pokupiIdStavke();
//		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Company
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Get/" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("placeId"), "PlaceId not forwarded");
		assertNotNull(jp2.getString("postOfficeId"), "postOfficeId not forwarded");
		assertNotNull(jp2.getString("name"), "Name not forwarded");
		assertNotNull(jp2.getString("shortName"), "ShortName not forwarded");
		assertNotNull(jp2.getString("address"), "Address not forwarded");
		assertNotNull(jp2.getString("vatNumber"), "VatNumber not forwarded");
		assertNotNull(jp2.getString("taxId"), "TaxId not forwarded");
		assertNotNull(jp2.getString("phone"), "Phone not forwarded");
		assertNotNull(jp2.getString("fax"), "Fax not forwarded");
		assertNotNull(jp2.getString("email"), "Email not forwarded");
		assertNotNull(jp2.getString("www"), "Www not forwarded");
		assertNotNull(jp2.getString("callCenter"), "CallCenter not forwarded");
		assertNotNull(jp2.getString("bankAccount"), "BankAccount not forwarded");
		assertNotNull(jp2.getString("placeText"), "PlaceText not forwarded");
		assertNotNull(jp2.getString("postOfficeText"), "PostOfficeText not forwarded");
	}

	@Test(description = "negative test case: bearer token missing")
	public void pxd_004_01_get_company_test2() {
		addHeader("Authorization", "");
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Get/1");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_004_01_get_company_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		Response response = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Get/1");
		assertEquals(response.getStatusCode(), 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_004_01_get_company_test4() throws Exception {
		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Company
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Get/" + PageBase.wrongIdShort);
		assertEquals(response2.getStatusCode(), 404);
		assertEquals(response2.print(), "\"Entity \\\"Customer\\\" (" + PageBase.wrongIdShort + ") was not found.\""); // "Customer"
																														// >
																														// "Company"
																														// ?
	}

	@Test(description = "positive test case")
	public void pxd_004_02_post_companies_list_test1() throws Exception {
		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Post Companies List
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodPOST("http://10.10.10.21:8086/api/BasicCatalogs/Companies/List",
				Payloads.pxdBasicList(0, 10, "id", "DESC"));
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp2.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp2.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp2.getString("data"), "Data not forwarded");
	}

	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Organizaciju" })
	public void pxd_004_03_get_company_lookup_test1() throws Exception {

//		// PXD UI
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
//		pocetna.verifikujPocetnuStranicu();
//		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
//		organizacije.verifikujOrganizacije();
//		PageBase.id = organizacije.pokupiIdStavke();
//
//		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Company Lookup
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Lookup?Keyword="
				+ PageBase.id + "&Id=" + PageBase.id);
		assertEquals(response2.getStatusCode(), 200);
		JsonPath jp2 = new JsonPath(response2.asString());
		assertNotNull(jp2.getString("id"), "Id not forwarded");
		assertNotNull(jp2.getString("text"), "Text not forwarded");
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_004_03_get_company_lookup_test2() throws Exception {
		// API
		Response response1 = methodPOST("http://10.10.10.21:8086/api/Auth/Authenticate",
				Payloads.pxdAuth("admin", "staging"));
		assertEquals(response1.getStatusCode(), 200);
		JsonPath jp1 = new JsonPath(response1.asString());
		assertNotNull(jp1.getString("token"), "Token not forwarded");
		String token = jp1.getString("token");
		// Get Company Lookup
		addHeader("Authorization", "Bearer " + token);
		Response response2 = methodGET("http://10.10.10.21:8086/api/BasicCatalogs/Companies/Lookup?Keyword="
				+ PageBase.wrongIdShort + "&Id=" + PageBase.wrongIdShort);
		assertEquals(response2.getStatusCode(), 200);
		assertEquals(response2.print(), "[]");
	}

// TODO		/api/BasicCatalogs/Companies/Update/{id} - on hold

}