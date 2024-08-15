package com.platformX.api.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.Payloads;
import com.platformX.base.RestApiBase;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;

public class PXD_Smoke_Testing_Lists extends RestApiBase {

	public PXD_Smoke_Testing_Lists() throws IOException {
		super();
	}
	
	@Test(description = "smoke test case: all lists sorted desc")
	public void pxd_smoke_001_01_post_basic_lists_desc_test() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);	
		for (int i = 0; i < GlobalVariables.sveKolone.length; i++) {
			for (int j = 0; j < GlobalVariables.sveKolone[i].length; j++) {
				JsonPath jp = methodPOST(api_properties.getValue(GlobalVariables.sveListe[i]), Payloads.pxdBasicList(0, 10, GlobalVariables.sveKolone[i][j], "DESC"), 200);
				verifyNotNull(jp, GlobalVariables.parametersList);
			}
		}
	}
	
	@Test(description = "smoke test case: all lists sorted asc")
	public void pxd_smoke_001_02_post_basic_lists_asc_test() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);	
		for (int i = 0; i < GlobalVariables.sveKolone.length; i++) {
			for (int j = 0; j < GlobalVariables.sveKolone[i].length; j++) {
				JsonPath jp = methodPOST(api_properties.getValue(GlobalVariables.sveListe[i]), Payloads.pxdBasicList(0, 10, GlobalVariables.sveKolone[i][j], "ASC"), 200);
				verifyNotNull(jp, GlobalVariables.parametersList);
			}
		}
	}


}