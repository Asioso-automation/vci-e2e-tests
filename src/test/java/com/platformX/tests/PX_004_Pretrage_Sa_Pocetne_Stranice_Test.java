package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.MjernaMjesta;
import com.platformX.page.PravnaLica;
import com.platformX.util.Helper;

public class PX_004_Pretrage_Sa_Pocetne_Stranice_Test extends BaseTest {

	public PX_004_Pretrage_Sa_Pocetne_Stranice_Test() throws IOException, FileNotFoundException {
		super();
	}

	String pravnoLice = "Pravno lice " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_004_1_pretraga_pravnih_lica_sa_pocetne_stranice_test() throws Exception {
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
		homePage.navigateToPocetnaStranica();
		homePage.verifikujPocetnuStranicu();
		homePage.pretraziKupce(pravnoLice);
		pravnaLica.verifikujDetaljePravnogLica();
	}
	
	@Test(enabled=false, retryAnalyzer = RetryAnalyzer.class)
	public void px_004_2_pretraga_mjernih_mjesta_sa_pocetne_stranice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.pretraziMjernaMjesta("36Z03800001H");
		MjernaMjesta mjernaMjesta = new MjernaMjesta(driver);
		mjernaMjesta.verifikujDetaljeMjernogMjesta();
	}

}