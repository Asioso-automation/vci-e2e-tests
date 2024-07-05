package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Ulice;
import com.platformX.util.Helper;
import com.platformX.page.LogIn;

public class PX_009_Ulice_CRUD_Test extends BaseTest {

	public PX_009_Ulice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String ulica = "Ulica " + Helper.getRandomString(5);
	String novaUlica = "NovaUlica " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_009_1_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigateOnPagePX(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
		ulice.dodajUlicu(ulica);
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_009_1_dodavanje_ulice_test" })
	public void px_009_2_uredjivanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigateOnPagePX(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
		ulice.pretraziStavku(homePage.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, homePage.podatak2Tabela2WE);
		ulice.urediUlicu(novaUlica);
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(novaUlica, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_009_2_uredjivanje_ulice_test" })
	public void px_009_3_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigateOnPagePX(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(novaUlica, homePage.podatak2Tabela2WE);
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje je uspješno završeno.");
		ulice.pretraziStavku(homePage.filterKolona2WE, novaUlica);
		ulice.verifikujPraznuTabelu();
	}
	
	@Test
	public void px_009_4_neuspjesno_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigateOnPagePX(Ulice.class, "Šifarnici", "Ulice");
		ulice.verifikujUlice();	
		ulice.pretraziStavku(homePage.filterKolona2WE, "Hajduk Veljkova");
		ulice.verifikujUlice();
		ulice.verifikujStavku("Hajduk Veljkova", homePage.podatak2Tabela2WE);
		ulice.obrisiStavku();
		ulice.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}