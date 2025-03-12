package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.LokacijskeSaglasnosti;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_020_Lokacijske_Saglasnosti_CRUD_Test extends BaseTest{

	public PX_DIST_020_Lokacijske_Saglasnosti_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String brojProtokola = "protokolBr." + Helper.getRandomString(5);

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_020_1_dodavanje_lokacijske_saglasnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		LokacijskeSaglasnosti lokacijskeSaglasnosti = new LokacijskeSaglasnosti(driver);
		lokacijskeSaglasnosti.navigirajVerifikujLokacijskeSaglasnosti();
		lokacijskeSaglasnosti.dodajLokacijskuSaglasnost(brojProtokola);
		lokacijskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		lokacijskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		lokacijskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Lokacijske Saglasnosti", "Lokacijske saglasnosti", 1, lokacijskeSaglasnosti.columns, lokacijskeSaglasnosti.buttons);
		lokacijskeSaglasnosti.verifikujStavku(brojProtokola, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_020_1_dodavanje_lokacijske_saglasnosti_test" })
	public void px_dist_020_1_brisanje_lokacijske_saglasnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		LokacijskeSaglasnosti lokacijskeSaglasnosti = new LokacijskeSaglasnosti(driver);
		lokacijskeSaglasnosti.navigirajVerifikujLokacijskeSaglasnosti();
		lokacijskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		lokacijskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Lokacijske Saglasnosti", "Lokacijske saglasnosti", 1, lokacijskeSaglasnosti.columns, lokacijskeSaglasnosti.buttons);
		lokacijskeSaglasnosti.verifikujStavku(brojProtokola, homePage.podatak2Tabela2WE);
		lokacijskeSaglasnosti.obrisiStavku();
		lokacijskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		lokacijskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		lokacijskeSaglasnosti.verifikujPraznuTabelu();
	}


}