package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.Ugovori;

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
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujValidacijePolja();
	}

}