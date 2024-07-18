package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;
import com.platformX.util.Helper;

public class PX_012_Pravna_Lica_CRUD_Test extends BaseTest {

	public PX_012_Pravna_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String pravnoLice = "Pravno lice " + Helper.getRandomString(5);
	String novoPravnoLice = "Novo Pravno lice " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_012_1_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.dodajPravnoLice(pravnoLice);
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(pravnoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_012_1_dodavanje_pravnog_lica_test" })
	public void px_012_2_uredjivanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(pravnoLice, homePage.podatak2Tabela2WE);
		pravnaLica.urediPravnoLice(novoPravnoLice);
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(novoPravnoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_012_2_uredjivanje_pravnog_lica_test" })
	public void px_012_3_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(novoPravnoLice, homePage.podatak2Tabela2WE);
		pravnaLica.obrisiStavku();
		pravnaLica.verifikujPoruku("Brisanje je uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPraznuTabelu();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_012_4_neuspjesno_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, "Firma 2");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku("Firma 2", homePage.podatak2Tabela2WE);
		pravnaLica.obrisiStavku();
		pravnaLica.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}