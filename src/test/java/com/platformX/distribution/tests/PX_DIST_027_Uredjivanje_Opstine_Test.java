package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Opstine;
import com.platformX.distribution.page.PocetnaStranica;

public class PX_DIST_027_Uredjivanje_Opstine_Test extends BaseTest {
	
	public PX_DIST_027_Uredjivanje_Opstine_Test() throws IOException, FileNotFoundException {
		super();
}

	@Test
	public void px_dist_027_uredjivanje_opstine_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Opstine opstine = homePage.navigirajNaOpstine();
		opstine.verifikujOpstine();
		String opstina = opstine.dodajOpstinu();
		opstine.verifikujOpstinu(opstina);
		String novaOpstina = opstine.urediOpstinu();
		opstine.verifikujOpstinu(novaOpstina);
	}

}