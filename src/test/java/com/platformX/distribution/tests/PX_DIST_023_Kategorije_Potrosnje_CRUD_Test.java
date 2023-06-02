package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.KategorijePotrosnje;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_023_Kategorije_Potrosnje_CRUD_Test extends BaseTest {

	public PX_DIST_023_Kategorije_Potrosnje_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_023_1_dodavanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		String kategorijaPotrosnje = kategorijePotrosnje.dodajKategorijuPotrosnje();
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, kategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(kategorijaPotrosnje, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_023_2_uredjivanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		String kategorijaPotrosnje = kategorijePotrosnje.dodajKategorijuPotrosnje();
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, kategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(kategorijaPotrosnje, homePage.podatak2Tabela2WE); 
		String novaKategorijaPotrosnje = kategorijePotrosnje.urediKategorijuPotrosnje();
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, novaKategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(novaKategorijaPotrosnje, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_023_3_brisanje_kategorije_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		String kategorijaPotrosnje = kategorijePotrosnje.dodajKategorijuPotrosnje();
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.pretraziStavku(homePage.filterKolona2WE, kategorijaPotrosnje);
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		kategorijePotrosnje.verifikujStavku(kategorijaPotrosnje, homePage.podatak2Tabela2WE); 
		kategorijePotrosnje.obrisiStavku(true);
		kategorijePotrosnje.verifikujBrisanjeStavke(true, kategorijaPotrosnje);
	}
	
}