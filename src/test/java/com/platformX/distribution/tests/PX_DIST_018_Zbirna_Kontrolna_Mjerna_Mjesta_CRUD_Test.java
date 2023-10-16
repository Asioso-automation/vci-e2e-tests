package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;

public class PX_DIST_018_Zbirna_Kontrolna_Mjerna_Mjesta_CRUD_Test extends BaseTest {
	
	public PX_DIST_018_Zbirna_Kontrolna_Mjerna_Mjesta_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_018_1_dodavanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjesta = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjesta.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjesta.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjesta.pretraziStavku(homePage.filterKolona2WE, zbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujStavku(zbirnoKontrolnoMjernoMjesto, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_018_2_uredjivanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjesta = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjesta.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjesta.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjesta.pretraziStavku(homePage.filterKolona2WE, zbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujStavku(zbirnoKontrolnoMjernoMjesto, homePage.podatak2Tabela2WE); 
		String novoZbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjesta.urediZbirnoKontrolnoMjernoMjesto();
		zbirnaKontrolnaMjernaMjesta.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjesta.pretraziStavku(homePage.filterKolona2WE, novoZbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujStavku(novoZbirnoKontrolnoMjernoMjesto, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_018_3_brisanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjesta = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjesta.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjesta.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjesta.pretraziStavku(homePage.filterKolona2WE, zbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjesta.verifikujStavku(zbirnoKontrolnoMjernoMjesto, homePage.podatak2Tabela2WE); 
		zbirnaKontrolnaMjernaMjesta.obrisiStavku();
		zbirnaKontrolnaMjernaMjesta.verifikujPoruku("Brisanje je uspješno završeno");
		zbirnaKontrolnaMjernaMjesta.pretraziStavku(homePage.filterKolona2WE, zbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjesta.verifikujPraznuTabelu();
	}
	
}