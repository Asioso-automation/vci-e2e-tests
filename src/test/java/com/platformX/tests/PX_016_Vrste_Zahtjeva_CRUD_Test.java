package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.VrsteZahtjeva;

public class PX_016_Vrste_Zahtjeva_CRUD_Test extends BaseTest {

	public PX_016_Vrste_Zahtjeva_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_016_1_dodavanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String opis = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(opis);
	}
	
	@Test
	public void px_016_2_uredjivanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String opis = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(opis);
		String noviOpis = vrsteZahtjeva.urediVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(noviOpis);
	}
	
	@Test
	public void px_016_3_brisanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String opis = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujVrstuZahtjeva(opis);
		vrsteZahtjeva.obrisiStavku();
		vrsteZahtjeva.verifikujPoruku("Brisanje je uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona2WE, opis);
		vrsteZahtjeva.verifikujPraznuTabelu();
	}
	
}