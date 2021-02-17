package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_027_Provjera_Validacija_Na_Ugovoru_Test2 extends BaseTest {

	public QA_027_Provjera_Validacija_Na_Ugovoru_Test2() throws IOException, FileNotFoundException {
		super();
	}

	// Provjera klijentskih validacija polja na formi za dodavanje ugovora
	
	@Test
	public void qa_027_provjera_validacija_na_ugovoru_test2() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujValidacijePolja();
	}

}