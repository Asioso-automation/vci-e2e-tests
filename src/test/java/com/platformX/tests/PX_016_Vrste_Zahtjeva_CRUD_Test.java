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
		VrsteZahtjeva vrsteZahtjeva = homePage.navigateOnPage("PX", VrsteZahtjeva.class, "Kupci", "Vrste zahtjeva");
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String kod = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujPoruku("Uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona3WE, kod);
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		vrsteZahtjeva.verifikujStavku(kod, homePage.podatak2Tabela3WE);
	}
	
	@Test
	public void px_016_2_uredjivanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigateOnPage("PX", VrsteZahtjeva.class, "Kupci", "Vrste zahtjeva");
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String kod = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujPoruku("Uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona3WE, kod);
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		vrsteZahtjeva.verifikujStavku(kod, homePage.podatak2Tabela3WE);
		String noviKod = vrsteZahtjeva.urediVrstuZahtjeva();
		vrsteZahtjeva.verifikujPoruku("Uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona3WE, noviKod);
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		vrsteZahtjeva.verifikujStavku(noviKod, homePage.podatak2Tabela3WE);
	}
	
	@Test
	public void px_016_3_brisanje_vrste_zahtjeva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigateOnPage("PX", VrsteZahtjeva.class, "Kupci", "Vrste zahtjeva");
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		String kod = vrsteZahtjeva.dodajVrstuZahtjeva();
		vrsteZahtjeva.verifikujPoruku("Uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona3WE, kod);
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		vrsteZahtjeva.verifikujStavku(kod, homePage.podatak2Tabela3WE);
		vrsteZahtjeva.obrisiStavku();
		vrsteZahtjeva.verifikujPoruku("Brisanje je uspješno završeno.");
		vrsteZahtjeva.pretraziStavku(homePage.filterKolona2WE, kod);
		vrsteZahtjeva.verifikujPraznuTabelu();
	}
	
}