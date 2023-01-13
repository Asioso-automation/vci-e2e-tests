package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;

public class PX_DIST_060_Dodavanje_Elektroenergetske_Saglasnosti_Test extends BaseTest{

	public PX_DIST_060_Dodavanje_Elektroenergetske_Saglasnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

//	@Test
//	public void px_dist_060_dodavanje_elektroenergetske_saglasnosti_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranica homePage = new PocetnaStranica(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		String ElSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost();
//		elSaglasnosti.verifikujElektroenergetskuSaglasnost(ElSaglasnost);
//	}

}