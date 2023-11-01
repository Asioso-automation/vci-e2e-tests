package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Ulice;
import com.platformX.util.Helper;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_010_Ulice_CRUD_Test extends BaseTest {

	public PX_DIST_010_Ulice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String ulica = "Ulica " + Helper.getRandomString(5);
	String novaUlica = "NovaUlica " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_010_1_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.dodajUlicu(ulica);
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_010_1_dodavanje_ulice_test" })
	public void px_dist_010_2_uredjivanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
		ulice.urediUlicu(novaUlica);
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(novaUlica, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_010_2_uredjivanje_ulice_test" })
	public void px_dist_010_3_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(novaUlica, homePage.podatak2Tabela2WE);
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje je uspješno završeno");
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujPraznuTabelu();
	}
	
	@Test
	public void px_dist_010_4_neuspjesno_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		ulice.pretraziStavku(homePage.filterKolona2WE, "Hajduk Veljkova");
		ulice.verifikujUlice();
		ulice.verifikujStavku("Hajduk Veljkova", homePage.podatak2Tabela2WE);
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}