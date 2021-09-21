package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.VrsteZahtjeva;

public class QA_053_Izmjena_Vrste_Zahtjeva_Test extends BaseTest {

	public QA_053_Izmjena_Vrste_Zahtjeva_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_053_izmjena_vrste_zahtjeva_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String opis = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(opis);
		String noviOpis = vrsteZahtjeva.urediVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(noviOpis);
	}
}