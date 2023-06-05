package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;

public class PX_022_Pravna_Lica_CRUD_Test extends BaseTest {

	public PX_022_Pravna_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_022_1_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
	}
	
	@Test
	public void px_022_2_uredjivanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String novoPravnoLice = pravnaLica.urediPravnoLice();
		pravnaLica.verifikujPravnoLice(novoPravnoLice);
	}
	
	@Test
	public void px_022_3_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		homePage.obrisiStavku(true);
		pravnaLica.verifikujBrisanjePravnogLica(pravnoLice);
	}
	
	@Test
	public void px_022_4_neuspjesno_brisanje_pravnog_lica_test() throws Exception {
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