package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.RadneJedinice;
import com.platformX.util.Helper;

public class PX_005_Radne_Jedinice_CRUD_Test extends BaseTest {

	public PX_005_Radne_Jedinice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String radnaJedinica = "RJ " + Helper.getRandomString(5);
	String novaRadnaJedinica = "RJ " + Helper.getRandomString(5);

	@Test
	public void px_005_1_dodavanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.dodajRadnuJedinicu(radnaJedinica);
		radneJedinice.verifikujRadnuJedinicu(radnaJedinica);
	}
	
	@Test(dependsOnMethods = { "px_005_1_dodavanje_radne_jedinice_test" })
	public void px_005_2_uredjivanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujRadnuJedinicu(radnaJedinica);
		radneJedinice.urediRadnuJedinicu(novaRadnaJedinica);
		radneJedinice.verifikujRadnuJedinicu(novaRadnaJedinica);
	}
	
	@Test(dependsOnMethods = { "px_005_2_uredjivanje_radne_jedinice_test" })
	public void px_005_3_brisanje_radne_jedinice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		RadneJedinice radneJedinice = homePage.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		radneJedinice.verifikujRadnuJedinicu(novaRadnaJedinica);
		homePage.obrisiStavku(true);
		radneJedinice.verifikujBrisanjeRadneJedinice(novaRadnaJedinica);
	}

}