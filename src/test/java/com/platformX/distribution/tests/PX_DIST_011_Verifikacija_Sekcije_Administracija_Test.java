package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;
import com.platformX.distribution.page.DnevnikIzmjena;
import com.platformX.distribution.page.Korisnici;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_011_Verifikacija_Sekcije_Administracija_Test  extends BaseTest {

	public PX_DIST_011_Verifikacija_Sekcije_Administracija_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	
	public void px_dist_011_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Korisnici korisnici = pocetna.navigirajNaKorisnici();
		korisnici.verifikujKorisnici();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = pocetna.navigirajNaDnevnikIzmjena();
		dnevnikIzmjena.verifikujDnevnikIzmjena();
		// TODO PozadinskiProcesi
	}
}
