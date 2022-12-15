package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.SektorDjelatnosti;

public class PX_DIST_Brisanje_Sektora_Djelatnosti_Test extends BaseTest {

	public PX_DIST_Brisanje_Sektora_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}
		
	@Test
	public void px_dist_brisanje_sektora_djelatnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		SektorDjelatnosti sektorDjelatnosti = homePage.navigirajNaSektorDjelatnosti();
		sektorDjelatnosti.verifikujSektorDjelatnosti();
		String nazivSektoraDjelatnosti = sektorDjelatnosti.dodajSektorDjelatnosti();
		sektorDjelatnosti.verifikujDodavanjeSektoraDjelatnosti(nazivSektoraDjelatnosti);
		sektorDjelatnosti.obrisiSektorDjelatnosti();
		sektorDjelatnosti.verifikujBrisanjeSektoraDjelatnosti(nazivSektoraDjelatnosti);
	}

}