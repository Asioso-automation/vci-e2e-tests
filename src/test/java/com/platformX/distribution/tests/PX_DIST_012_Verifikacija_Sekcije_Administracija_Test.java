package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.DnevnikIzmjena;
import com.platformX.distribution.page.Korisnici;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_012_Verifikacija_Sekcije_Administracija_Test  extends BaseTest {

	public PX_DIST_012_Verifikacija_Sekcije_Administracija_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "test prolazi kroz sve stranice iz sekcije ADMINISTRACIJA i verifikuje ih")
	public void px_dist_012_verifikacija_sekcije_administracija_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Korisnici korisnici = homePage.navigirajNaKorisnici();
		korisnici.verifikujKorisnici();
		Poruke poruke = homePage.navigirajNaPoruke();
		poruke.verifikujPoruke();
		DnevnikIzmjena dnevnikIzmjena = homePage.navigirajNaDnevnikIzmjena();
		dnevnikIzmjena.verifikujDnevnikIzmjena();
//		PozadinskiProcesi pozadinskiProcesi = homePage.navigirajNaPozadinskiProecsi();
//		pozadinskiProcesi.verifikujPozadinskiProcesi();
	}

}