package com.platformX.api.tests;

import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;

//		OVI TESTOVI MORAJU PODIZATI UI - vratiti staru verziju

public class PXD_003_Administration_Message_Test extends RestApiBase {
	
	public PXD_003_Administration_Message_Test() throws IOException {
		super();
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_003_04_update_administration_message_test1" })
	public void pxd_003_01_get_administration_message_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("MESSAGES.GET") + GlobalVariables.id, 200);
		assertNotNull(jp.getString("id"), "Id not forwarded");
		assertNotNull(jp.getString("title"), "Title not forwarded");
		assertNotNull(jp.getString("body"), "Body not forwarded");
		assertNotNull(jp.getString("priority"), "Priority not forwarded");
		assertNotNull(jp.getString("dateFrom"), "DateFrom not forwarded");
		assertNotNull(jp.getString("userText"), "UserText not forwarded");
	}
	
	@Test(description = "negative test case: bearer token missing", dependsOnMethods = { "pxd_003_04_update_administration_message_test1" })
	public void pxd_003_01_get_administration_message_test2() {
		addHeader("Authorization", "");
		// without this test takes bearer token from positive, test case 1
		methodGET(api_properties.getValue("MESSAGES.GET") + GlobalVariables.id, 401);
	}

	@Test(description = "negative test case: wrong bearer token", dependsOnMethods = { "pxd_003_04_update_administration_message_test1" })
	public void pxd_003_01_get_administration_message_test3() {
		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
		methodGET(api_properties.getValue("MESSAGES.GET") + GlobalVariables.id, 401);
	}

	@Test(description = "negative test case: wrong id")
	public void pxd_003_01_get_administration_message_test4() {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodGET(api_properties.getValue("MESSAGES.GET") + Helper.getRandomNumber(1), 404);
	}
	
	@Test(description = "positive test case")
	public void pxd_003_02_post_administration_messages_list_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("MESSAGES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
		assertNotNull(jp.getString("totalCount"), "TotalCount not forwarded");
		assertNotNull(jp.getString("filteredCount"), "FilteredCount not forwarded");
		assertNotNull(jp.getString("dataCount"), "DataCount not forwarded");
		assertNotNull(jp.getString("data"), "Data not forwarded");
	}
	
	@Test(description = "positive test case")
	public void pxd_003_03_create_administration_message_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPOST(api_properties.getValue("MESSAGES.CREATE"), Payloads.pxdAdministrationMessageCreate("Test Naslov", "<p>test</p>", "2024-01-31T00:00", 1), 200);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_003_03_create_administration_message_test1" }, dependsOnGroups = { "Pronadji Poruku" })
	public void pxd_003_04_update_administration_message_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodPUT(api_properties.getValue("MESSAGES.UPDATE") + GlobalVariables.id, Payloads.pxdAdministrationMessageUpdate(Integer.parseInt(GlobalVariables.id), "Test Naslov", "<p>test update</p>", "2024-01-31T00:00", 1, " -   ()"), 204);
	}
	
	@Test(description = "positive test case", dependsOnMethods = { "pxd_003_04_update_administration_message_test1" })
	public void pxd_003_05_delete_administration_message_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		methodDELETE(api_properties.getValue("MESSAGES.DELETE") + GlobalVariables.id, 204);
	}
	
}