package com.platformX.api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PXD_Customers_001_AgreedEnergyApprovals_Tests extends RestApiBase {

	public PXD_Customers_001_AgreedEnergyApprovals_Tests() throws IOException {
		super();
	}

	@Test(description = "positive test case: get created agreed energy approval", dependsOnMethods = { "pxd_customers_001_03_create_agreed_energy_approval_test1" })
	public void pxd_customers_001_01_get_agreed_energy_approval_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("AGREED.ENERGY.APPROVALS.GET") + GlobalVariables.id, 200);		
		String[] parameters = {"id", "periodId", "customerId", "meteringPointId", "calculationContractId", "calculationContractDataId", "aht", "alt", "rht", "rlt", "power", 
				"isLegalEntity", "periodText", "customerText", "eic", "calculationContractDataText"};
		verifyNotNull(jp, parameters);
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_customers_001_01_get_agreed_energy_approval_test2() {
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("AGREED.ENERGY.APPROVALS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong bearer token")
	public void pxd_customers_001_01_get_agreed_energy_approval_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("AGREED.ENERGY.APPROVALS.GET") + Helper.getRandomNumber(1), 401);
	}
	
	@Test(description = "negative test case: wrong id", dependsOnMethods = { "pxd_customers_001_03_create_agreed_energy_approval_test1" })
	public void pxd_customers_001_01_get_agreed_energy_approval_test4() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("AGREED.ENERGY.APPROVALS.GET") + Helper.getRandomNumber(6), 404);
	}
	
	@Test(description = "positive test case: list", dependsOnMethods = { "pxd_customers_001_03_create_agreed_energy_approval_test1" })
	public void pxd_customers_001_02_post_agreed_energy_approval_list_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("AGREED.ENERGY.APPROVALS.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case: create agreed energy approval")
	public void pxd_customers_001_03_create_agreed_energy_approval_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		Response response = methodPOSTresponse(api_properties.getValue("AGREED.ENERGY.APPROVALS.CREATE"), Payloads.pxdAgreedEnergyApprovalCreate(64930, Integer.parseInt(Helper.getRandomNumber(3)), Integer.parseInt(Helper.getRandomNumber(3)), Integer.parseInt(Helper.getRandomNumber(2)), Integer.parseInt(Helper.getRandomNumber(2)), Integer.parseInt(Helper.getRandomNumber(1))));
		assertEquals(response.getStatusCode(), 200);
		assertNotNull(response, "Id not forwarded in response");
		GlobalVariables.id = response.asString();
	}
	
	@Test(description = "positive test case: update agreed energy approval", dependsOnMethods = { "pxd_customers_001_03_create_agreed_energy_approval_test1" })
	public void pxd_customers_001_04_update_agreed_energy_approval_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPATCH(api_properties.getValue("AGREED.ENERGY.APPROVALS.UPDATE") + GlobalVariables.id, Payloads.pxdAgreedEnergyApprovalUpdate(Integer.parseInt(GlobalVariables.id), Integer.parseInt(Helper.getRandomNumber(3)), Integer.parseInt(Helper.getRandomNumber(3)), Integer.parseInt(Helper.getRandomNumber(2)), Integer.parseInt(Helper.getRandomNumber(2)), Integer.parseInt(Helper.getRandomNumber(1))), 204);
	}
	
	@Test(description = "positive test case: delete agreed energy approval", dependsOnMethods = { "pxd_customers_001_03_create_agreed_energy_approval_test1" })
	public void pxd_customers_001_05_delete_field_unit_test1() throws Exception {
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("AGREED.ENERGY.APPROVALS.DELETE") + GlobalVariables.id, 204);
	}
	
}