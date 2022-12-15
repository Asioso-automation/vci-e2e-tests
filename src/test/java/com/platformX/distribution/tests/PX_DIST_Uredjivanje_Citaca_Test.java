package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.Citaci;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;

public class PX_DIST_Uredjivanje_Citaca_Test extends BaseTest {
	
	public PX_DIST_Uredjivanje_Citaca_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_uredjivanje_citaca_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Citaci citaci = homePage.navigirajNaCitaci();
		citaci.verifikujCitaci();
		String imeCitaca = citaci.dodajCitaca();
		citaci.verifikujCitaca(imeCitaca);
		String novoImeCitaca = citaci.urediCitaca();
		citaci.verifikujCitaca(novoImeCitaca);
	}
	
}