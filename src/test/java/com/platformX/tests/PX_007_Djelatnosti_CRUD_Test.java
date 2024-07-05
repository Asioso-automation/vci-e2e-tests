package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.util.Helper;
import com.platformX.page.Djelatnosti;
import com.platformX.page.LogIn;

public class PX_007_Djelatnosti_CRUD_Test extends BaseTest {

	public PX_007_Djelatnosti_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String djelatnost = "Djelatnost " + Helper.getRandomString(5);
	String novaDjelatnost = "NovaDjelatnost " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_007_1_dodavanje_djelatnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Djelatnosti  djelatnosti = homePage.navigateOnPage("PX", Djelatnosti.class, "Šifarnici", "Djelatnosti");
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.dodajDjelatnost(djelatnost);
		djelatnosti.verifikujPoruku("Uspješno završeno.");
		djelatnosti.pretraziStavku(homePage.filterKolona3WE, djelatnost);
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.verifikujStavku(djelatnost, homePage.podatak2Tabela3WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_007_1_dodavanje_djelatnosti_test" })
	public void px_007_2_uredjivanje_djelatnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Djelatnosti  djelatnosti = homePage.navigateOnPage("PX", Djelatnosti.class, "Šifarnici", "Djelatnosti");
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.pretraziStavku(homePage.filterKolona3WE, djelatnost);
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.verifikujStavku(djelatnost, homePage.podatak2Tabela3WE);
		djelatnosti.urediDjelatnost(novaDjelatnost);
		djelatnosti.verifikujPoruku("Uspješno završeno.");
		djelatnosti.pretraziStavku(homePage.filterKolona3WE, novaDjelatnost);
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.verifikujStavku(novaDjelatnost, homePage.podatak2Tabela3WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_007_2_uredjivanje_djelatnosti_test" })
	public void px_007_3_brisanje_djelatnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Djelatnosti  djelatnosti = homePage.navigateOnPage("PX", Djelatnosti.class, "Šifarnici", "Djelatnosti");
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.pretraziStavku(homePage.filterKolona3WE, novaDjelatnost);
		djelatnosti.verifikujDjelatnosti();
		djelatnosti.verifikujStavku(novaDjelatnost, homePage.podatak2Tabela3WE);
		djelatnosti.obrisiStavku();
		djelatnosti.verifikujPoruku("Brisanje je uspješno završeno.");
		djelatnosti.pretraziStavku(homePage.filterKolona3WE, novaDjelatnost);
		djelatnosti.verifikujPraznuTabelu();
	}

}