package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.Citaci;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_006_Citaci_CRUD_Test extends BaseTest {
	
	public PX_DIST_006_Citaci_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String imeCitaca = "Citac " + Helper.getRandomString(5);
	String novoImeCitaca = "Citac 1 " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_006_1_dodavanje_citaca_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Citaci citaci = homePage.navigirajNaCitaci();
		citaci.verifikujCitaci();
		citaci.dodajCitaca(imeCitaca);
		citaci.verifikujPoruku("Uspješno završeno.");
		citaci.pretraziStavku(homePage.filterKolona2WE, imeCitaca);
		citaci.verifikujCitaci();
		citaci.verifikujStavku(imeCitaca, homePage.podatak2Tabela2WE);
	}
	
	@Test (dependsOnMethods = { "px_dist_006_1_dodavanje_citaca_test" }, retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_006_2_uredjivanje_citaca_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Citaci citaci = homePage.navigirajNaCitaci();
		citaci.verifikujCitaci();
		citaci.pretraziStavku(homePage.filterKolona2WE, imeCitaca);
		citaci.verifikujCitaci();
		citaci.verifikujStavku(imeCitaca, homePage.podatak2Tabela2WE);
		citaci.urediCitaca(novoImeCitaca);
		citaci.verifikujPoruku("Uspješno završeno");
		citaci.pretraziStavku(homePage.filterKolona2WE, novoImeCitaca);
		citaci.verifikujCitaci();
		citaci.verifikujStavku(novoImeCitaca, homePage.podatak2Tabela2WE);
	}
	
	@Test (dependsOnMethods = { "px_dist_006_2_uredjivanje_citaca_test" }, retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_006_3_brisanje_citaca_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Citaci citaci = homePage.navigirajNaCitaci();
		citaci.verifikujCitaci();
		citaci.pretraziStavku(homePage.filterKolona2WE, novoImeCitaca);
		citaci.verifikujCitaci();
		citaci.verifikujStavku(novoImeCitaca, homePage.podatak2Tabela2WE);
		citaci.obrisiStavku();
		citaci.verifikujPoruku("Brisanje je uspješno završeno");
		citaci.pretraziStavku(homePage.filterKolona2WE, novoImeCitaca);
		citaci.verifikujPraznuTabelu();
	}
	
}