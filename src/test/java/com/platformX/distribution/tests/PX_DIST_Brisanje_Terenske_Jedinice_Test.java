package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_Brisanje_Terenske_Jedinice_Test extends BaseTest {

	public PX_DIST_Brisanje_Terenske_Jedinice_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_brisanje_terenske_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String naziv = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujTerenskuJedinicu(naziv);
		terenskeJedinice.obrisiTerenskuJedinicu();
		terenskeJedinice.verifikujBrisanjeTerenskeJedinice(naziv);
	}
	
}
