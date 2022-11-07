package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;


public class PX_DIST_Uredjivanje_Zbirnog_Kontrolnog_Mjernog_Mjesta_Test  extends BaseTest {

	public PX_DIST_Uredjivanje_Zbirnog_Kontrolnog_Mjernog_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	
	public void px_dist_uredjivanje_zbirnog_kontrolnog_mjernog_mjesta_test() throws Exception {
		
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = pocetna.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ZbirnaKontrolnaMjernaMjesta zbirnaKontrolnaMjernaMjestaPage = pocetna.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnaKontrolnaMjernaMjesta();
		String zbirnaKontrolnaMjernaMjesta = zbirnaKontrolnaMjernaMjestaPage.dodajZbirnoKontrolnoMjernoMjesto(brBrojila);
		zbirnaKontrolnaMjernaMjestaPage.verifikujZbirnoKontrolnoMjernoMjesto(zbirnaKontrolnaMjernaMjesta);
		String novoZbirnoKontrolnoMjernoMjesto = zbirnaKontrolnaMjernaMjestaPage.urediZbirnoKontrolnoMjernoMjesto();
		zbirnaKontrolnaMjernaMjestaPage.verifikujUredjenoZbirnoKontrolnoMjernoMjesto(novoZbirnoKontrolnoMjernoMjesto);

	}
}
