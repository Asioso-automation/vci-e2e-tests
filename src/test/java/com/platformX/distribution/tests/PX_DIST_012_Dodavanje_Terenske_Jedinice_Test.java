package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_012_Dodavanje_Terenske_Jedinice_Test extends BaseTest {
	
	public PX_DIST_012_Dodavanje_Terenske_Jedinice_Test() throws IOException, FileNotFoundException {
		super();
	}
	
		@Test
		public void px_dist_012_dodavanje_terenske_jedinice_test() throws Exception {
			LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
			logIn.verifikujLogIn();
			logIn.logIn();
			PocetnaStranica homePage = new PocetnaStranica(driver);
			homePage.verifikujPocetnuStranicu();
			TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
			terenskeJedinice.verifikujTerenskeJedinice();
			String naziv = terenskeJedinice.dodajTerenskuJedinicu();
			terenskeJedinice.verifikujTerenskuJedinicu(naziv);
		}
		
}
