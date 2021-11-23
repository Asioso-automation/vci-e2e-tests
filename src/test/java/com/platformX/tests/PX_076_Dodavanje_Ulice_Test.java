package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Ulice;
import com.platformX.page.LogIn;

public class PX_076_Dodavanje_Ulice_Test extends BaseTest {

	public PX_076_Dodavanje_Ulice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_076_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ulice ulice = homePage.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlicu();
		ulice.verifikujUlicu(ulica);
	}

}