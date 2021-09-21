package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLica;

public class PX_010_Pretraga_Pravnih_Lica_Sa_Pocetne_Stranice_Test extends BaseTest {

	public PX_010_Pretraga_Pravnih_Lica_Sa_Pocetne_Stranice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_010_pretraga_pravnih_lica_sa_pocetne_stranice_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		homePage.navigateToPocetnaStranica();
		homePage.verifyHomePage();
		homePage.pretraziKupce(pravnoLice);
		pravnaLicaPage.verifikujDetaljePravnogLica();
	}

}