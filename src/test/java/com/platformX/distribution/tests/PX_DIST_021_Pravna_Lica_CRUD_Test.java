package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.PravnaLica;
import com.platformX.util.Helper;


public class PX_DIST_021_Pravna_Lica_CRUD_Test  extends BaseTest {

	public PX_DIST_021_Pravna_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String pravnoLice = "PravnoLice " + Helper.getRandomString(5);
	String novoPravnoLice = "NovoPravnoLice " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_021_1_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.dodajPravnoLice(pravnoLice);
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(pravnoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_021_1_dodavanje_pravnog_lica_test" })
	public void px_dist_021_2_uredjivanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
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
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_021_2_uredjivanje_pravnog_lica_test" })
	public void px_dist_021_3_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(novoPravnoLice, homePage.podatak2Tabela2WE);
		pravnaLica.obrisiStavku();
		pravnaLica.verifikujPoruku("Brisanje je uspješno završeno");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPraznuTabelu();
	}

}