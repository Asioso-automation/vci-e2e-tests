package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;

public class PX_DIST_059_Brisanje_Zbirnog_Kontrolnog_Mjernog_Mjesta_Test  extends BaseTest {

	public PX_DIST_059_Brisanje_Zbirnog_Kontrolnog_Mjernog_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_059_brisanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjestaPage = homePage.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnaKontrolnaMjernaMjesta = zbirnaKontrolnaMjernaMjestaPage.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnoKontrolnoMjernoMjesto(zbirnaKontrolnaMjernaMjesta);
		homePage.deleteItem();
		homePage.verifyDeletedItem(true, zbirnaKontrolnaMjernaMjesta);
	}

}