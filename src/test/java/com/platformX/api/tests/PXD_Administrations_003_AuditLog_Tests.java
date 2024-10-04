package com.platformX.api.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;

public class PXD_Administrations_003_AuditLog_Tests extends RestApiBase {

	public PXD_Administrations_003_AuditLog_Tests() throws IOException {
		super();
	}
	
	@Test(description = "positive test case: list")
	public void pxd_administrations_003_01_post_audit_log_list_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodPOST(api_properties.getValue("AUDIT.LOG.LIST"), Payloads.pxdBasicList(0, 10, "id", "DESC"), 200);		
		String[] parameters = {"totalCount", "filteredCount", "dataCount", "data"};
		verifyNotNull(jp, parameters);
	}
	
}