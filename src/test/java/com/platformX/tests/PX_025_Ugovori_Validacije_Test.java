package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_025_Ugovori_Validacije_Test extends BaseTest {

	public PX_025_Ugovori_Validacije_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test				// Provjera klijentskih validacija obaveznih polja na formi za dodavanje ugovora
	public void px_025_1_provjera_validacija_na_ugovoru_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujObaveznaPolja();
	}
	
	@Test				// Provjera klijentskih validacija polja na formi za dodavanje ugovora
	public void px_025_2_provjera_validacija_na_ugovoru_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujValidacijePolja();
	}

	@Test
	public void px_025_3_provjera_validacija_na_uredjivanju_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36ZBLNG");
		ugovoriPage.verifikujObaveznaPoljaUredjivanjeUgovora();
	}
	
	@Test
	public void px_025_4_provjera_validacija_na_preregistraciji_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		// ugovoriPage.pronadjiUgovor("Mjerno mjesto 2");
		ugovoriPage.pronadjiUgovorPoEic("36ZBLNG");
		ugovoriPage.otvoriPreregistraciju();
		ugovoriPage.verifikujObaveznaPoljaPreregistracijeUgovora();
	}
	
}