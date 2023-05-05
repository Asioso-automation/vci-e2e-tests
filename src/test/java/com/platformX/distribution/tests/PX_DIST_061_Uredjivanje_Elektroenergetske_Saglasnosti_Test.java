package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_061_Uredjivanje_Elektroenergetske_Saglasnosti_Test extends BaseTest {

	public PX_DIST_061_Uredjivanje_Elektroenergetske_Saglasnosti_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_061_uredjivanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {		
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		String eeSaglasnost = elSaglasnosti.dodajElektronergetskuSaglasnost("Domaćinstva");
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elSaglasnosti.verifikujElektroenergetskuSaglasnost(eeSaglasnost);
		elSaglasnosti.urediElektroenergetskuSaglasnost();
		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
	}
	
}