package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogIn;

public class PX_021_Kategorije_Cijena_CRUD_Test extends BaseTest {

	public PX_021_Kategorije_Cijena_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_021_1_dodavanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
	}

	@Test
	public void px_021_2_uredjivanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
		String novaKategorija = kategorijeCijena.urediKategorijuCijena();
		kategorijeCijena.verifikujKategoriju(novaKategorija);
	}
	
	@Test
	public void px_021_3_brisanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
		homePage.obrisiStavku(true);
		kategorijeCijena.verifikujBrisanjeKategorije(kategorija);
	}
	
}