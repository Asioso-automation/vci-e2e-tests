package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_014_Terenske_Jedinice_CRUD_Test extends BaseTest {
	
	public PX_DIST_014_Terenske_Jedinice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_014_1_dodavanje_terenske_jedinice_test() throws Exception {
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
	public void px_dist_014_2_uredjivanje_terenske_jedinice_test() throws Exception {
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
	public void px_dist_014_3_brisanje_terenske_jedinice_test() throws Exception {
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
		terenskeJedinice.obrisiStavku(true);
		terenskeJedinice.verifikujBrisanjeStavke(true, naziv);
	}
	
}
