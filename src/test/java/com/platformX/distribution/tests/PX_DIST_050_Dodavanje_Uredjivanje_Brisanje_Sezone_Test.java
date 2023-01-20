package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Sezone;

public class PX_DIST_050_Dodavanje_Uredjivanje_Brisanje_Sezone_Test extends BaseTest {

	public PX_DIST_050_Dodavanje_Uredjivanje_Brisanje_Sezone_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_050_dodavanje_uredjivanje_brisanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		String sezona = sezone.dodajSezonu();
		sezone.verifikujSezonu(sezona);
		String novaSezona = sezone.urediSezonu();
		sezone.verifikujSezonu(novaSezona);
		homePage.obrisiStavku(true);
		homePage.verifikujBrisanjeStavke(true, novaSezona);
	}

}