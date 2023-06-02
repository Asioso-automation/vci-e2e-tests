package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;

public class PX_DIST_028_Zbirna_Kontrolna_Mjerna_Mjesta_CRUD_Test extends BaseTest {
	
	public PX_DIST_028_Zbirna_Kontrolna_Mjerna_Mjesta_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_028_1_dodavanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
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
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjestaPage = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnaKontrolnaMjernaMjesta = zbirnaKontrolnaMjernaMjestaPage.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjestaPage.pretraziStavku(homePage.filterKolona2WE, zbirnaKontrolnaMjernaMjesta);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujStavku(zbirnaKontrolnaMjernaMjesta, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_028_2_uredjivanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
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
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjestaPage = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnaKontrolnaMjernaMjesta = zbirnaKontrolnaMjernaMjestaPage.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjestaPage.pretraziStavku(homePage.filterKolona2WE, zbirnaKontrolnaMjernaMjesta);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujStavku(zbirnaKontrolnaMjernaMjesta, homePage.podatak2Tabela2WE); 
		String novoZbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjestaPage.urediZbirnoKontrolnoMjernoMjesto();
		zbirnaKontrolnaMjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjestaPage.pretraziStavku(homePage.filterKolona2WE, novoZbirnoKontrolnoMjernoMjesto);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujStavku(novoZbirnoKontrolnoMjernoMjesto, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_028_3_brisanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
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
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjestaPage = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnaKontrolnaMjernaMjesta = zbirnaKontrolnaMjernaMjestaPage.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		zbirnaKontrolnaMjernaMjestaPage.pretraziStavku(homePage.filterKolona2WE, zbirnaKontrolnaMjernaMjesta);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujStavku(zbirnaKontrolnaMjernaMjesta, homePage.podatak2Tabela2WE); 
		zbirnaKontrolnaMjernaMjestaPage.obrisiStavku(true);
		zbirnaKontrolnaMjernaMjestaPage.verifikujBrisanjeStavke(true, zbirnaKontrolnaMjernaMjesta);
	}
	
}