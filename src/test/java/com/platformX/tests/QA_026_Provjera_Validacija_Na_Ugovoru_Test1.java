package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_021_Provjera_Validacija_Na_Ugovoru_Test1 extends BaseTest {

	public QA_021_Provjera_Validacija_Na_Ugovoru_Test1() throws IOException, FileNotFoundException {
		super();
	}

	// Provjera klijentskih validacija obaveznih polja na formi za dodavanje ugovora
	
	@Test
	public void qa_021_provjera_validacija_na_ugovoru_test1() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujObaveznaPolja();
	}

}