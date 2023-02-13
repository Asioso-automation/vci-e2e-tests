package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.RadneJedinice;

public class PX_071_Brisanje_Radne_Jedinice_Test extends BaseTest {

	public PX_071_Brisanje_Radne_Jedinice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_071_brisanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		String jedinica = radneJedinice.dodajRadnuJedinicu();
		radneJedinice.verifikujRadnuJedinicu(jedinica);
		homePage.obrisiStavku(true);
		radneJedinice.verifikujBrisanjeRadneJedinice(jedinica);
	}

}