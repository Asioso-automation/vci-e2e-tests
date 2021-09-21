package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;

public class QA_001_LogIn_LogOut_Test extends BaseTest {

	public QA_001_LogIn_LogOut_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// LogIn i logOut sa verifikacijama stranica

	@Test
	public void qa_001_logIn_logOut_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		homePage.logOut();
		logInPage.verifyLogInPage();
	}

}