package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.util.Helper;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogIn;

public class PX_011_Kategorije_Cijena_CRUD_Test extends BaseTest {

	public PX_011_Kategorije_Cijena_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String kategorija = "Kategorija " + Helper.getRandomString(5);
	String novaKategorija = "NovaKategorija " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_011_1_dodavanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigateOnPagePX(KategorijeCijena.class, "Tarifni sistem", "Kategorije cijena");
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.dodajKategoriju(kategorija);
		kategorijeCijena.verifikujPoruku("Uspješno završeno.");
		kategorijeCijena.pretraziStavku(homePage.filterKolona2WE, kategorija);
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.verifikujStavku(kategorija, homePage.podatak2Tabela2WE);
	}

	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_011_1_dodavanje_kategorije_cijena_test" })
	public void px_011_2_uredjivanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigateOnPagePX(KategorijeCijena.class, "Tarifni sistem", "Kategorije cijena");
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.pretraziStavku(homePage.filterKolona2WE, kategorija);
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.verifikujStavku(kategorija, homePage.podatak2Tabela2WE);
		kategorijeCijena.urediKategorijuCijena(novaKategorija);
		kategorijeCijena.verifikujPoruku("Uspješno završeno.");
		kategorijeCijena.pretraziStavku(homePage.filterKolona2WE, novaKategorija);
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.verifikujStavku(novaKategorija, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_011_2_uredjivanje_kategorije_cijena_test" })
	public void px_011_3_brisanje_kategorije_cijena_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigateOnPagePX(KategorijeCijena.class, "Tarifni sistem", "Kategorije cijena");
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.pretraziStavku(homePage.filterKolona2WE, novaKategorija);
		kategorijeCijena.verifikujKategorijeCijena();
		kategorijeCijena.verifikujStavku(novaKategorija, homePage.podatak2Tabela2WE);		
		kategorijeCijena.obrisiStavku();
		kategorijeCijena.verifikujPoruku("Brisanje je uspješno završeno.");
		kategorijeCijena.pretraziStavku(homePage.filterKolona2WE, novaKategorija);
		kategorijeCijena.verifikujPraznuTabelu();
	}
	
}