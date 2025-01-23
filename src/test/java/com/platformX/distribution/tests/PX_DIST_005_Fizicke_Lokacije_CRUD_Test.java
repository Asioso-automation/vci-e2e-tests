package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.FizickeLokacije;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.util.Helper;

public class PX_DIST_005_Fizicke_Lokacije_CRUD_Test extends BaseTest {
	
	public PX_DIST_005_Fizicke_Lokacije_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String terenskaJedinica = "TerenskaJedinica " + Helper.getRandomString(5);
	String fizickaLokacija = "FizickaLokacija " + Helper.getRandomString(5);
	String novaFizickaLokacija = "NovaFizickaLokacija " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_005_1_dodavanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigateOnPage(TerenskeJedinice.class, "Šifarnici", "Terenske jedinice");
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		terenskeJedinice.dodajTerenskuJedinicu(terenskaJedinica);
		terenskeJedinice.verifikujPoruku("Uspješno završeno.");
		terenskeJedinice.pretraziStavku(homePage.filterKolona2WE, terenskaJedinica);
		terenskeJedinice.navigirajVerifikujTerenskeJedinice();
		terenskeJedinice.verifikujStavku(terenskaJedinica, homePage.podatak2Tabela2WE);
		FizickeLokacije fizickeLokacije = homePage.navigateOnPage(FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.dodajFizickuLokaciju(fizickaLokacija, terenskaJedinica);
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, fizickaLokacija);
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(fizickaLokacija, homePage.podatak2Tabela2WE);
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_005_1_dodavanje_fizicke_lokacije_test" })
	public void px_dist_005_2_uredjivanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickeLokacije fizickeLokacije = homePage.navigateOnPage(FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, fizickaLokacija);
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(fizickaLokacija, homePage.podatak2Tabela2WE);
		fizickeLokacije.urediFizickuLokaciju(novaFizickaLokacija);
		fizickeLokacije.verifikujPoruku("Uspješno završeno.");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, novaFizickaLokacija);
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(novaFizickaLokacija, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_005_2_uredjivanje_fizicke_lokacije_test" })
	public void px_dist_005_3_brisanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickeLokacije fizickeLokacije = homePage.navigateOnPage(FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, novaFizickaLokacija);
		fizickeLokacije.navigirajVerifikujFizickeLokacije();
		fizickeLokacije.verifikujStavku(novaFizickaLokacija, homePage.podatak2Tabela2WE);
		fizickeLokacije.obrisiStavku();
		fizickeLokacije.verifikujPoruku("Brisanje je uspješno završeno");
		fizickeLokacije.pretraziStavku(homePage.filterKolona2WE, novaFizickaLokacija);
		fizickeLokacije.verifikujPraznuTabelu();
	}
	
}