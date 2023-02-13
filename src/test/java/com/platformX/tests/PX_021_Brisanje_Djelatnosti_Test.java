package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Djelatnosti;
import com.platformX.page.LogIn;

public class PX_021_Brisanje_Djelatnosti_Test extends BaseTest {

	public PX_021_Brisanje_Djelatnosti_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_021_brisanje_djelatnosti_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Djelatnosti  djelatnosti = homePage.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		String djelatnost = djelatnosti.dodajDjelatnost();
		djelatnosti.verifikujPoruku("Uspješno završeno.");
		djelatnosti.verifikujDjelatnost(djelatnost);
		homePage.obrisiStavku(true);
		djelatnosti.verifikujBrisanjeDjelatnosti(djelatnost);
	}

}