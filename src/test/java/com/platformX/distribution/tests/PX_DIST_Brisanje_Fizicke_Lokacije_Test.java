package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickeLokacije;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TerenskeJedinice;

public class PX_DIST_Brisanje_Fizicke_Lokacije_Test extends BaseTest {

	public PX_DIST_Brisanje_Fizicke_Lokacije_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_brisanje_fizicke_lokacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = homePage.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		String terenskaJedinica = terenskeJedinice.dodajTerenskuJedinicu();
		terenskeJedinice.verifikujTerenskuJedinicu(terenskaJedinica);
		FizickeLokacije fizickeLokacije = homePage.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		String nazivFizickeLokacije = fizickeLokacije.dodajFizickuLokaciju(terenskaJedinica);
		fizickeLokacije.verifikujFizickuLokaciju(nazivFizickeLokacije);
		fizickeLokacije.obrisiFizickuLokaciju();
		fizickeLokacije.verifikujBrisanjeFizickeLokacije(nazivFizickeLokacije);
	}
	
}