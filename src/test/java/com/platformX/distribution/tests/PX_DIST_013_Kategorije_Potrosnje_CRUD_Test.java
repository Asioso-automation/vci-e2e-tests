package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.KategorijePotrosnje;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_013_Kategorije_Potrosnje_CRUD_Test extends BaseTest {

	public PX_DIST_013_Kategorije_Potrosnje_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String kategorijaPotrosnje =  "KategorijaPotrosnje " + Helper.getRandomString(5);
	String novaKategorijaPotrosnje = "NovaKategorijaPotrosnje " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_013_1_dodavanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.dodajKategorijuPotrosnje(kategorijaPotrosnje);
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, kategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(kategorijaPotrosnje, homePage.podatak2Tabela2WE); 
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_013_1_dodavanje_kategorije_potrosnje_test" })
	public void px_dist_013_2_uredjivanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, kategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(kategorijaPotrosnje, homePage.podatak2Tabela2WE); 
		kategorijePotrosnje.urediKategorijuPotrosnje(novaKategorijaPotrosnje);
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, novaKategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(novaKategorijaPotrosnje, homePage.podatak2Tabela2WE); 
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_013_2_uredjivanje_kategorije_potrosnje_test" })
	public void px_dist_013_3_brisanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, novaKategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(novaKategorijaPotrosnje, homePage.podatak2Tabela2WE); 
		kategorijePotrosnje.obrisiStavku();
		kategorijePotrosnje.verifikujPoruku("Brisanje je uspješno završeno");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, novaKategorijaPotrosnje);
		kategorijePotrosnje.verifikujPraznuTabelu();
	}
	
}