package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_047_Provjera_Validacija_Na_Ugovoru_Test1 extends BaseTest {

	public PX_047_Provjera_Validacija_Na_Ugovoru_Test1() throws IOException, FileNotFoundException {
		super();
	}

	// Provjera klijentskih validacija obaveznih polja na formi za dodavanje ugovora
	
	@Test
	public void px_047_provjera_validacija_na_ugovoru_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujObaveznaPolja();
	}

}