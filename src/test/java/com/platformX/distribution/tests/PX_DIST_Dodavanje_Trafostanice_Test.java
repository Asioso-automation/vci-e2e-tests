package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TrafoStanice;

public class PX_DIST_Dodavanje_Trafostanice_Test extends BaseTest {

	public PX_DIST_Dodavanje_Trafostanice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_dodavanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TrafoStanice trafostanice = homePage.navigirajNaTrafostanice();
		trafostanice.verifikujTrafoStanice();
		String trafostanica = trafostanice.dodajTrafoStanicu();
		trafostanice.verifikujTrafoStanicu(trafostanica);
	}

}