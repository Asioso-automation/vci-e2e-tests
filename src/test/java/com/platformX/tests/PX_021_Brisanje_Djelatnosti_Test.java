package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Djelatnosti;
import com.platformX.page.LogInPage;

public class PX_021_Brisanje_Djelatnosti_Test extends BaseTest {

	public PX_021_Brisanje_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_021_brisanje_djelatnosti_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Djelatnosti  djelatnosti = homePage.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		String djelatnost = djelatnosti.dodajDjelatnost();
		// djelatnosti.verifikujPoruku("Uspješno završeno.");
		djelatnosti.verifikujDjelatnost(djelatnost);
		djelatnosti.obrisiDjelatnost();
		// djelatnosti.verifikujPoruku("Brisanje je uspješno završeno");
		djelatnosti.verifikujBrisanjeDjelatnosti(djelatnost);
	}

}