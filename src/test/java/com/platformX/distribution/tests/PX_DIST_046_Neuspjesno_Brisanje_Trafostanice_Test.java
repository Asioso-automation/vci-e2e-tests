package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Trafostanice;

public class PX_DIST_046_Neuspjesno_Brisanje_Trafostanice_Test extends BaseTest {

	public PX_DIST_046_Neuspjesno_Brisanje_Trafostanice_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_046_neuspjesno_brisanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigirajNaTrafostanice();
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujTrafostanicu("001-Gradac");;
		homePage.deleteItem(false);
	}
		
}