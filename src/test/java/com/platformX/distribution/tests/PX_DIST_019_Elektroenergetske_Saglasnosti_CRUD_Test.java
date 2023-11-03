package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_019_Elektroenergetske_Saglasnosti_CRUD_Test extends BaseTest{

	public PX_DIST_019_Elektroenergetske_Saglasnosti_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

//	trenutno se mijenja ova forma - prilagoditi testove nakon release-a
	
	@Test
	public void px_dist_019_1_dodavanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		String eeSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost("Domaćinstva");
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, eeSaglasnost);
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujStavku(eeSaglasnost, homePage.podatak2Tabela2WE);
	}
	
	@Test (enabled = false)
	public void px_dist_019_2_dodavanje_elektroenergetske_saglasnosti_niski_napon_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		String eeSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost("Niski napon");
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, eeSaglasnost);
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujStavku(eeSaglasnost, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_019_3_uredjivanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {		
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		String eeSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost("Domaćinstva");
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, eeSaglasnost);
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujStavku(eeSaglasnost, homePage.podatak2Tabela2WE);
		elSaglasnosti.urediElektroenergetskuSaglasnost();
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
	}
	
	@Test
	public void px_dist_019_4_brisanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		String eeSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost("Domaćinstva");
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, eeSaglasnost);
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujStavku(eeSaglasnost, homePage.podatak2Tabela2WE);
		elSaglasnosti.obrisiStavku();
		elSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, eeSaglasnost);
		elSaglasnosti.verifikujPraznuTabelu();
	}

}