package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.VrsteZahtjeva;

public class PX_038_Brisanje_Vrste_Zahtjeva_Test extends BaseTest {

	public PX_038_Brisanje_Vrste_Zahtjeva_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_038_brisanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String opis = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(opis);
		vrsteZahtjeva.obrisiVrstuZahtjeva();
		vrsteZahtjeva.verifikujBrisanjeVrsteZahtjeva(opis);
	}
}