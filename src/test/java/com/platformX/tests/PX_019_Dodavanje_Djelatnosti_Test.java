package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Djelatnosti;
import com.platformX.page.LogInPage;

public class PX_019_Dodavanje_Djelatnosti_Test extends BaseTest {

	public PX_019_Dodavanje_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_019_dodavanje_djelatnosti_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Djelatnosti  djelatnosti = homePage.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		String djelatnost = djelatnosti.dodajDjelatnost();
		// djelatnosti.verifikujPoruku("Uspje�no zavr�eno.");
		djelatnosti.verifikujDjelatnost(djelatnost);
	}

}