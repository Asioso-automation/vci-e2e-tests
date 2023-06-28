package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_004_Terenske_Jedinice_CRUD_Test extends BaseTest {
	
	public PX_DIST_004_Terenske_Jedinice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_004_1_dodavanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String naziv = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, naziv);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(naziv, homePage.podatak2Tabela2WE);
	}
		
	@Test
	public void px_dist_004_2_uredjivanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String naziv = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, naziv);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(naziv, homePage.podatak2Tabela2WE);
		String novaTerenskaJedinica = terenskeJedinice.urediTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, novaTerenskaJedinica);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(novaTerenskaJedinica, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_004_3_brisanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String naziv = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, naziv);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(naziv, homePage.podatak2Tabela2WE);
		terenskeJedinice.obrisiStavku();
		terenskeJedinice.verifikujPoruku("Brisanje je uspješno završeno");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, naziv);
		terenskeJedinice.verifikujPraznuTabelu();
	}
	
}
