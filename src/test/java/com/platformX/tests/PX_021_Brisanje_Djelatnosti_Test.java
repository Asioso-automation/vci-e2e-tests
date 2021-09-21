package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Djelatnosti;
import com.platformX.page.LogInPage;

public class QA_044_Brisanje_Djelatnosti_Test extends BaseTest {

	public QA_044_Brisanje_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_044_brisanje_djelatnosti_test() throws Exception {
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
		djelatnosti.obrisiDjelatnost();
		// djelatnosti.verifikujPoruku("Brisanje je uspje�no zavr�eno");
		djelatnosti.verifikujBrisanjeDjelatnosti(djelatnost);
	}

}