package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.OperativnaPodrucja;

public class PX_062_Dodavanje_Operativnog_Podrucja_Test extends BaseTest {

	public PX_062_Dodavanje_Operativnog_Podrucja_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_062_dodavanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigirajNaOperativnaPodrucja();
		operativnaPodrucja.verifikujOperativnaPodrucja();
		String podrucje = operativnaPodrucja.dodajOperativnoPodrucje();
		operativnaPodrucja.verifikujOperativnoPodrucje(podrucje);
	}

}