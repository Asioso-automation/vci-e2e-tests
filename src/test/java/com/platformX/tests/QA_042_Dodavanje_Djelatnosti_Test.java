package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.DjelatnostiPage;
import com.platformX.page.LogInPage;

public class QA_042_Dodavanje_Djelatnosti_Test extends BaseTest {

	public QA_042_Dodavanje_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_042_dodavanje_djelatnosti_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		DjelatnostiPage  djelatnosti = homePage.navigateToDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		String djelatnost = djelatnosti.dodajDjelatnost();
		djelatnosti.verifikujPoruku("Uspješno završeno.");
		djelatnosti.verifikujDjelatnost(djelatnost);
	}

}