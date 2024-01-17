//package com.platformX.api.tests;
//
//import org.testng.annotations.Test;
//import com.platformX.base.PageBase;
//import com.platformX.base.Payloads;
//import com.platformX.base.RestApiBase;
//import com.platformX.util.Helper;
//import data.GlobalVariables;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertNotNull;
//import java.io.IOException;
//
//		OVI TESTOVI MORAJU PODIZATI UI - vratiti staru verziju

//public class PXD_003_Administration_Message_Test extends RestApiBase {
//	
//	public PXD_003_Administration_Message_Test() throws IOException {
//		super();
//	}
//	
////	String token;
////	String id;
//	
//	@Test(description = "positive test case", dependsOnGroups = { "Pronadji Poruku" })
//	public void pxd_003_01_get_administration_message_test1() throws Exception {
//		GlobalVariables.token = authorize();
//		// Get Administration Message
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		JsonPath jp1 = methodGETupdated(api_properties.getValue("MESSAGES.GET") + PageBase.id, 200);
//		assertNotNull(jp1.getString("id"), "Id not forwarded");
//		assertNotNull(jp1.getString("title"), "Title not forwarded");
//		assertNotNull(jp1.getString("body"), "Body not forwarded");
//		assertNotNull(jp1.getString("priority"), "Priority not forwarded");
//		assertNotNull(jp1.getString("dateFrom"), "DateFrom not forwarded");
//		assertNotNull(jp1.getString("userText"), "UserText not forwarded");
//	}
//	
//	@Test(description = "negative test case: bearer token missing", dependsOnMethods = { "pxd_003_01_get_administration_message_test1" })
//	public void pxd_003_01_get_administration_message_test2() {
//		addHeader("Authorization", "");
//		// without this test takes bearer token from positive, test case 1
//		methodGETupdated(api_properties.getValue("MESSAGES.GET") + PageBase.id, 401);
//	}
//
//	@Test(description = "negative test case: wrong bearer token", dependsOnMethods = { "pxd_003_01_get_administration_message_test1" })
//	public void pxd_003_01_get_administration_message_test3() {
//		addHeader("Authorization", "Bearer " + Helper.getRandomNumber(10));
//		methodGETupdated(api_properties.getValue("MESSAGES.GET") + PageBase.id, 401);
//	}
//
//	@Test(description = "negative test case: wrong id")
//	public void pxd_003_01_get_administration_message_test4() {
//		GlobalVariables.token = authorize();
//		// Get Administration Message
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		methodGETupdated(api_properties.getValue("MESSAGES.GET") + "1", 404);
//	}
//	
//	@Test(description = "positive test case")
//	public void pxd_003_02_post_administration_messages_list_test1() throws Exception {
//		GlobalVariables.token = authorize();
//		// Post Administration Messages List
//		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//		JsonPath jp1 = methodPOSTupdated(api_properties.getValue("MESSAGES.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);
//		assertNotNull(jp1.getString("totalCount"), "TotalCount not forwarded");
//		assertNotNull(jp1.getString("filteredCount"), "FilteredCount not forwarded");
//		assertNotNull(jp1.getString("dataCount"), "DataCount not forwarded");
//		assertNotNull(jp1.getString("data"), "Data not forwarded");
//	}
//	
////	@Test(description = "positive test case")
////	public void pxd_003_03_create_administration_message_test1() throws Exception {
////		GlobalVariables.token = authorize();
////		// Post Administration Message Create
////		addHeader("Authorization", "Bearer " + GlobalVariables.token);
////		Response response = methodPOST(api_properties.getValue("MESSAGES.CREATE"), Payloads.pxdAdministrationMessageCreate("Test Naslov", "<p>test</p>", "2024-01-31T00:00", 1));
////		assertEquals(response.getStatusCode(), 200);
////		assertNotNull(response, "Id not forwarded in response");
////		GlobalVariables.id = response.asString();
//	//	RESPONSE ne vraca id - id se mora uzeti preko UI
////	}
////	
////	@Test(description = "positive test case", dependsOnMethods = { "pxd_003_03_create_administration_message_test1" })
////	public void pxd_003_04_update_administration_message_test1() throws Exception {
//////		GlobalVariables.token = authorize();
////		// Put Administration Message Update
////		addHeader("Authorization", "Bearer " + GlobalVariables.token);
//////		methodPUTupdated(api_properties.getValue("MESSAGES.UPDATE") + GlobalVariables.id, Payloads.pxdAdministrationMessageUpdate(700, "Test Naslov", "<p>test update</p>", "2024-01-31T00:00", 1, " -   ()"), 204);
////		Response response = methodPUT(api_properties.getValue("MESSAGES.UPDATE") + GlobalVariables.id, Payloads.pxdAdministrationMessageUpdate(700, "Test Naslov", "<p>test update</p>", "2024-01-31T00:00", 1, " -   ()"));
////		assertEquals(response.getStatusCode(), 204);
////	}
////	
////	@Test(description = "positive test case", dependsOnMethods = { "pxd_003_03_create_administration_message_test1" })
////	public void pxd_003_05_delete_administration_message_test1() throws Exception {
////		GlobalVariables.token = authorize();
////		// Delete Administration Message
////		addHeader("Authorization", "Bearer " + GlobalVariables.token);
////		methodDELETEupdated(api_properties.getValue("MESSAGES.DELETE") + GlobalVariables.id, 204);
////	}
//	
//}