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

// test koristi Id montera koji se kreira u testu 014 >> test 015_00
// ako se koristi dependsOnGroups - test 014_04, pokrecu se svi testovi 014

public class PXD_015_BasicCatalogs_InstallmentPersonLocations_Test extends RestApiBase {

	public PXD_015_BasicCatalogs_InstallmentPersonLocations_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "Test data - Installment person creation")
	public void pxd_015_00_create_installment_person_test() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("INSTALLMENT.PERSONS.CREATE"), Payloads.pxdInstallmentPersonCreate("Monter"));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id1 = Integer.parseInt(response.asString());
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_01_get_installment_person_location_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("installmentPersonId"), "InstallmentPersonId not forwarded");
		assertNotNull(jp.getString("fieldUnitId"), "FieldUnitId not forwarded");
		assertNotNull(jp.getString("fieldOfficeId"), "FieldOfficeId not forwarded");
		assertNotNull(jp.getString("dateFrom"), "DateFrom not forwarded");
		assertNotNull(jp.getString("installmentPersonText"), "InstallmentPersonText not forwarded");
		assertNotNull(jp.getString("fieldUnitText"), "FieldUnitText not forwarded");
		assertNotNull(jp.getString("fieldOfficeText"), "FieldOfficeText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_015_01_get_installment_person_location_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong bearer token")
	public void pxd_015_01_get_installment_person_location_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_01_get_installment_person_location_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.GET") + Helper.getRandomNumber(6), 404);
//		assertEquals(response2.print(), "\"Entity \\\"InstallmentPersonLocation\\\" (" + PageBase.wrongIdLong + ") was not found.\"");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_02_post_installment_persons_location_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_03_get_active_installment_person_lookup_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.LOOKUP") + "?Id=" + GlobalVariables.id + "&Keyword=" + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("text"), "Text not forwarded");
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_03_get_active_installment_person_location_lookup_test2() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodGETresponse(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.LOOKUP") + "?Id=" + Helper.getRandomNumber(5) + "&Keyword=" + Helper.getRandomNumber(4));
		assertEquals(response.getStatusCode(), 200);
		assertEquals(response.print(), "[]");
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_00_create_installment_person_test" })
	public void pxd_015_04_create_installment_persons_location_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.CREATE"), Payloads.pxdInstallmentPersonLocationCreate("2023-12-01", 4101, 41, GlobalVariables.id1));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response.print(), "Response body is empty");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_05_update_installment_person_location_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUTresponse(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.UPDATE") + GlobalVariables.id, Payloads.pxdInstallmentPersonLocationUpdate("2023-12-05", 4101, "4101 - BIJELJINA", 41, "41 - TJ Bijeljina", Integer.parseInt(GlobalVariables.id), GlobalVariables.id1, "Monter NovaLokacija"));
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_015_04_create_installment_persons_location_test1" })
	public void pxd_015_06_delete_installment_person_location_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("INSTALLMENT.PERSON.LOCATIONS.DELETE") + GlobalVariables.id, 204);
	}

}