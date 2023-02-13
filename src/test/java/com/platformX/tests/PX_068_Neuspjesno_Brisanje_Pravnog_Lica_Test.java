package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;

public class PX_068_Neuspjesno_Brisanje_Pravnog_Lica_Test extends BaseTest {

	public PX_068_Neuspjesno_Brisanje_Pravnog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_068_neuspjesno_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice("Firma 2");
		homePage.obrisiStavku(false);
		pravnaLicaPage.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}