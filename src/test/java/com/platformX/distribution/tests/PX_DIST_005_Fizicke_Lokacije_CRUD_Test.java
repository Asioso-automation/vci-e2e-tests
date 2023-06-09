package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickeLokacije;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_005_Fizicke_Lokacije_CRUD_Test extends BaseTest {
	
	public PX_DIST_005_Fizicke_Lokacije_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_005_1_dodavanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String terenskaJedinica = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
		FizickeLokacije fizickeLokacije = homePage.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		String nazivFizickeLokacije = fizickeLokacije.dodajFizickuLokaciju(terenskaJedinica);
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, nazivFizickeLokacije);
		fizickeLokacije.verifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(nazivFizickeLokacije, homePage.podatak2Tabela2WE);
	}

	@Test
	public void px_dist_005_2_uredjivanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String terenskaJedinica = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
		FizickeLokacije fizickeLokacije = homePage.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		String nazivFizickeLokacije = fizickeLokacije.dodajFizickuLokaciju(terenskaJedinica);
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, nazivFizickeLokacije);
		fizickeLokacije.verifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(nazivFizickeLokacije, homePage.podatak2Tabela2WE);
		String novaFizickaLokacija = fizickeLokacije.urediFizickuLokaciju();
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, novaFizickaLokacija);
		fizickeLokacije.verifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(novaFizickaLokacija, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_005_3_brisanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String terenskaJedinica = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.verifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
		FizickeLokacije fizickeLokacije = homePage.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		String nazivFizickeLokacije = fizickeLokacije.dodajFizickuLokaciju(terenskaJedinica);
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, nazivFizickeLokacije);
		fizickeLokacije.verifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(nazivFizickeLokacije, homePage.podatak2Tabela2WE);
		fizickeLokacije.obrisiStavku(true);
		fizickeLokacije.verifikujBrisanjeStavke(true, nazivFizickeLokacije);
	}
	
}