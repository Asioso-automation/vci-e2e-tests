package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;

public class PX_066_Izmjena_Pravnog_Lica_Test extends BaseTest {

	public PX_066_Izmjena_Pravnog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_066_izmjena_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String novoPravnoLice = pravnaLica.izmjeniPravnoLice();
		pravnaLica.verifikujPravnoLice(novoPravnoLice);
	}

}