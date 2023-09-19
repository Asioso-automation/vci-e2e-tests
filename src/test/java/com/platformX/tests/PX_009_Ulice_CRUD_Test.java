package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Ulice;
import com.platformX.page.LogIn;

public class PX_009_Ulice_CRUD_Test extends BaseTest {

	public PX_009_Ulice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_009_1_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_009_2_uredjivanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
		String novaUlica = ulice.urediUlicu();
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(novaUlica, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_009_3_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje je uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujPraznuTabelu();
	}
	
	@Test
	public void px_009_4_neuspjesno_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.verifikujUlicu("Hajduk Veljkova");
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}