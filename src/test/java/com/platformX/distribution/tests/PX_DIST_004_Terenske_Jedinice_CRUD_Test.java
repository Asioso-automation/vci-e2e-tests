package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.util.Helper;

public class PX_DIST_004_Terenske_Jedinice_CRUD_Test extends BaseTest {
	
	public PX_DIST_004_Terenske_Jedinice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String terenskaJedinica = "TerenskaJedinica " + Helper.getRandomString(5);
	String novaTerenskaJedinica = "NovaTerenskaJedinica " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_004_1_dodavanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = new TerenskeJedinice(driver);
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		terenskeJedinice.dodajTerenskuJedinicu(terenskaJedinica);
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.verifikacijaStranice("Šifarnici", "Terenske Jedinice", "Terenske jedinice", 1, terenskeJedinice.columns, terenskeJedinice.buttons);
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
	}
		
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_004_1_dodavanje_terenske_jedinice_test" })
	public void px_dist_004_2_uredjivanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = new TerenskeJedinice(driver);
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.verifikacijaStranice("Šifarnici", "Terenske Jedinice", "Terenske jedinice", 1, terenskeJedinice.columns, terenskeJedinice.buttons);
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
		terenskeJedinice.urediTerenskuJedinicu(novaTerenskaJedinica);
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, novaTerenskaJedinica);
		terenskeJedinice.verifikacijaStranice("Šifarnici", "Terenske Jedinice", "Terenske jedinice", 1, terenskeJedinice.columns, terenskeJedinice.buttons);
		terenskeJedinice.verifikujStavku(novaTerenskaJedinica, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_004_2_uredjivanje_terenske_jedinice_test" })
	public void px_dist_004_3_brisanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = new TerenskeJedinice(driver);
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, novaTerenskaJedinica);
		terenskeJedinice.verifikacijaStranice("Šifarnici", "Terenske Jedinice", "Terenske jedinice", 1, terenskeJedinice.columns, terenskeJedinice.buttons);
		terenskeJedinice.verifikujStavku(novaTerenskaJedinica, homePage.podatak2Tabela2WE);
		terenskeJedinice.obrisiStavku();
		terenskeJedinice.verifikujPoruku("Brisanje je uspješno završeno");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, novaTerenskaJedinica);
		terenskeJedinice.verifikujPraznuTabelu();
	}
	
}
