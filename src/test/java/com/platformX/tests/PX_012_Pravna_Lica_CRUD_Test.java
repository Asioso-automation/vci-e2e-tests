package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;

public class PX_012_Pravna_Lica_CRUD_Test extends BaseTest {

	public PX_012_Pravna_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_012_1_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(pravnoLice, homePage.podatak2Tabela2WE);
		pravnaLica.verifikujPravnoLice(pravnoLice);
	}
	
	@Test
	public void px_012_2_uredjivanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(pravnoLice, homePage.podatak2Tabela2WE);
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String novoPravnoLice = pravnaLica.urediPravnoLice();
		pravnaLica.verifikujPoruku("Uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, novoPravnoLice);
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujStavku(novoPravnoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_012_3_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		pravnaLica.obrisiStavku();
		pravnaLica.verifikujPoruku("Brisanje je uspješno završeno.");
		pravnaLica.pretraziStavku(homePage.filterKolona2WE, pravnoLice);
		pravnaLica.verifikujPraznuTabelu();
	}
	
	@Test
	public void px_012_4_neuspjesno_brisanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice("Firma 2");
		pravnaLica.obrisiStavku();
		pravnaLica.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}