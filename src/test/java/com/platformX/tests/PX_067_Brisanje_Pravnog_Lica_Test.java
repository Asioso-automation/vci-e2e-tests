package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLica;

public class PX_067_Brisanje_Pravnog_Lica_Test extends BaseTest {

	public PX_067_Brisanje_Pravnog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_067_brisanje_pravnog_lica_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		pravnaLica.obrisiPravnoLice();
		pravnaLica.verifikujBrisanjePravnogLica(pravnoLice);
	}

}