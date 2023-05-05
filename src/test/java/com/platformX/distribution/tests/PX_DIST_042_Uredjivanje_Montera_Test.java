package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Monteri;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_042_Uredjivanje_Montera_Test extends BaseTest{

	public PX_DIST_042_Uredjivanje_Montera_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_042_uredjivanje_montera_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Monteri monteri = homePage.navigirajNaMonteri();
		monteri.verifikujMonteri();
		String monter = monteri.dodajMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.verifikujMontera(monter);
		String noviMonter = monteri.urediMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.verifikujMontera(noviMonter);
	}

}