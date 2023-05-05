package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.KategorijePotrosnje;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_047_Dodavanje_KategorijePotrosnje_Test extends BaseTest {

	public PX_DIST_047_Dodavanje_KategorijePotrosnje_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_047_dodavanje_kategorijepotrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		String kategorijaPotrosnje = kategorijePotrosnje.dodajKategorijuPotrosnje();
		kategorijePotrosnje.verifikujPoruku("Uspješno završeno.");
		kategorijePotrosnje.verifikujKategorijuPotrosnje(kategorijaPotrosnje); 
	}
	
}