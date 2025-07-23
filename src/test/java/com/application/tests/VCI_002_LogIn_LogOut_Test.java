package com.application.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.base.RetryAnalyzer;
import com.application.page.Homepage;
import com.application.page.LogIn;

public class VCI_002_LogIn_LogOut_Test extends BaseTest {

	public VCI_002_LogIn_LogOut_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description="Verifikacija login stranice", retryAnalyzer = RetryAnalyzer.class)
	public void vci_001_verify_homepage_test() throws Exception {
		Homepage homepage = new Homepage(driver, VCI_PROPERTIES); // kreira se objekat klase Homepage koji kupi webdriver i vrijednosti iz properties file-a
		homepage.verifikujPocetnuStranicu(false);
		homepage.navigateToHomepage();
		LogIn loginpage = homepage.navigateToLoginPage(); // kreiramo objekat klase LogIn kojem pridruzujemo vrijednost koju vraca metoda navigateToLoginPage (sa homepage-a)
		loginpage.verifikujLogIn();
		loginpage.logIn();
		homepage.verifikujPocetnuStranicu(true);
	}
}

// napraviti logout metodu
// pozvati verify homepage false