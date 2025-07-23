package com.application.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.app.base.BaseTest;
import com.app.base.RetryAnalyzer;
import com.application.page.Homepage;

public class VCI_001_Verify_Homepage_Test extends BaseTest {

	public VCI_001_Verify_Homepage_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="Verifikacija početne stranice", retryAnalyzer = RetryAnalyzer.class)
	public void vci_001_verify_homepage_test() throws Exception {
		Homepage homepage = new Homepage(driver, VCI_PROPERTIES); // kreira se objekat klase Homepage koji kupi vrijednosti iz properties file-a
		homepage.verifikujPocetnuStranicu(false); // pozivanje metode iz klase Homepage (homepage)
	}

}