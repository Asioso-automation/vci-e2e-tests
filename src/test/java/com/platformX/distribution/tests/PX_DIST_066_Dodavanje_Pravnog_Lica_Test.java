package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.PravnaLica;


public class PX_DIST_066_Dodavanje_Pravnog_Lica_Test  extends BaseTest {

	public PX_DIST_066_Dodavanje_Pravnog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_066_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnaLica = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPoruku("Uspješno završeno.");
		pravnaLicaPage.verifikujPravnoLice(pravnaLica);
	}

}