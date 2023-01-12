package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Ulice;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_Brisanje_Ulice_Test extends BaseTest {

	public PX_DIST_Brisanje_Ulice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_brisanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
		homePage.deleteItem();
		homePage.verifyDeletedItem(true, ulica);
	}

}