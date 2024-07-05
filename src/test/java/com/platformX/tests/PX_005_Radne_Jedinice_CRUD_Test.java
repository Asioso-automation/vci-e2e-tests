package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.RadneJedinice;
import com.platformX.util.Helper;

public class PX_005_Radne_Jedinice_CRUD_Test extends BaseTest {

	public PX_005_Radne_Jedinice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String radnaJedinica = "RJ " + Helper.getRandomString(5);
	String novaRadnaJedinica = "RJ " + Helper.getRandomString(5);

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_005_1_dodavanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigateOnPagePX(RadneJedinice.class, "Šifarnici", "Radne jedinice");
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.dodajRadnuJedinicu(radnaJedinica);
		radneJedinice.verifikujPoruku("Uspješno završeno.");
		radneJedinice.pretraziStavku(homePage.filterKolona2WE, radnaJedinica);
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujStavku(radnaJedinica, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_005_1_dodavanje_radne_jedinice_test" })
	public void px_005_2_uredjivanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigateOnPagePX(RadneJedinice.class, "Šifarnici", "Radne jedinice");
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.pretraziStavku(homePage.filterKolona2WE, radnaJedinica);
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujStavku(radnaJedinica, homePage.podatak2Tabela2WE);
		radneJedinice.urediRadnuJedinicu(novaRadnaJedinica);
		radneJedinice.verifikujPoruku("Uspješno završeno.");
		radneJedinice.pretraziStavku(homePage.filterKolona2WE, novaRadnaJedinica);
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujStavku(novaRadnaJedinica, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_005_2_uredjivanje_radne_jedinice_test" })
	public void px_005_3_brisanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigateOnPagePX(RadneJedinice.class, "Šifarnici", "Radne jedinice");
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.pretraziStavku(homePage.filterKolona2WE, novaRadnaJedinica);
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujStavku(novaRadnaJedinica, homePage.podatak2Tabela2WE);
		radneJedinice.obrisiStavku();
		radneJedinice.verifikujPoruku("Brisanje je uspješno završeno.");
		radneJedinice.pretraziStavku(homePage.filterKolona2WE, novaRadnaJedinica);
		radneJedinice.verifikujPraznuTabelu();
	}

}