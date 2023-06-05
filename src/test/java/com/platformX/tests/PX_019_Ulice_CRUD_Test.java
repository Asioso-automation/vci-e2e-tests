package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Ulice;
import com.platformX.page.LogIn;

public class PX_019_Ulice_CRUD_Test extends BaseTest {

	public PX_019_Ulice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_019_1_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
	}
	
	@Test
	public void px_019_2_uredjivanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
		String novaUlica = ulice.urediUlicu();
		ulice.verifikujUlicu(novaUlica);
	}
	
	@Test
	public void px_019_3_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
		homePage.obrisiStavku(true);
		ulice.verifikujBrisanjeUlice(ulica);
	}
	
	@Test
	public void px_019_4_neuspjesno_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.verifikujUlicu("Hajduk Veljkova");
		homePage.obrisiStavku(false);
		ulice.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}