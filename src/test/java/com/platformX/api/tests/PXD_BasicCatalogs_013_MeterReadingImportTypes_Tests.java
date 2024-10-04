package com.platformX.api.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.RestApiBase;
import com.platformX.util.Helper;
import data.GlobalVariables;
import io.restassured.path.json.JsonPath;

public class PXD_BasicCatalogs_013_MeterReadingImportTypes_Tests extends RestApiBase {

	public PXD_BasicCatalogs_013_MeterReadingImportTypes_Tests() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(description = "positive test case")
	public void pxd_basicCatalogs_013_01_get_meter_reading_import_types_test1() throws Exception {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "Bearer " + GlobalVariables.token);
		JsonPath jp = methodGET(api_properties.getValue("METER.READING.IMPORT.TYPES"), 200);	
		String[] parameters = {"id", "text"};
		verifyNotNull(jp, parameters);
	}
	
	@Test(description = "negative test case: bearer token missing")
	public void pxd_basicCatalogs_013_01_get_meter_reading_import_types_test2() {
		GlobalVariables.token = authorize();
		addHeader("Authorization", "");
		methodGET(api_properties.getValue("METER.READING.IMPORT.TYPES"), 401);
	}
	
	@Test(description = "negative test case: wrong bearer token")
	public void pxd_basicCatalogs_013_01_get_meter_reading_import_types_test3() {
		GlobalVariables.token = authorize();
		addHeader("Authorization", Helper.getRandomString(15));
		methodGET(api_properties.getValue("METER.READING.IMPORT.TYPES"), 401);
	}
	
}