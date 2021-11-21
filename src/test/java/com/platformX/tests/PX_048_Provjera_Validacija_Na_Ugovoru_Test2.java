package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_048_Provjera_Validacija_Na_Ugovoru_Test2 extends BaseTest {

	public PX_048_Provjera_Validacija_Na_Ugovoru_Test2() throws IOException, FileNotFoundException {
		super();
	}

	// Provjera klijentskih validacija polja na formi za dodavanje ugovora
	
	@Test
	public void px_048_provjera_validacija_na_ugovoru_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujValidacijePolja();
	}

}