package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_014_BasicCatalogs_InstallmentPersons_Test extends RestApiBase {

	public PXD_014_BasicCatalogs_InstallmentPersons_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_01_get_installment_person_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("INSTALLMENT.PERSONS.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("name"), "Name not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_014_01_get_installment_person_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("INSTALLMENT.PERSONS.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong bearer token")
	public void pxd_014_01_get_installment_person_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("INSTALLMENT.PERSONS.GET") + Helper.getRandomNumber(1), 401);
	}

	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_01_get_installment_person_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("INSTALLMENT.PERSONS.GET") + Helper.getRandomNumber(6), 404);
//		assertEquals(response2.print(), "\"Entity \\\"InstallmentPerson\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_02_post_installment_persons_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("INSTALLMENT.PERSONS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}

	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_03_get_installment_person_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("INSTALLMENT.PERSONS.LOOKUP") + "?Id=" + GlobalVariables.id + "&Keyword=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_03_get_installment_person_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("INSTALLMENT.PERSONS.LOOKUP") + "?Id=" + Helper.getRandomNumber(5) + "&Keyword=" + Helper.getRandomNumber(4));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case")
	public void pxd_014_04_create_installment_person_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("INSTALLMENT.PERSONS.CREATE"), Payloads.pxdInstallmentPersonCreate("Monter"));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_05_update_installment_person_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("INSTALLMENT.PERSONS.UPDATE") + GlobalVariables.id, Payloads.pxdInstallmentPersonUpdate(Integer.parseInt(GlobalVariables.id), "Monter 1"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_014_04_create_installment_person_test1" })
	public void pxd_014_06_delete_installment_person_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("INSTALLMENT.PERSONS.DELETE") + GlobalVariables.id, 204);
	}
	
}