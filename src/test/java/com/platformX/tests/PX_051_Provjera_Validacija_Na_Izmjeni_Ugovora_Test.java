package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_051_Provjera_Validacija_Na_Izmjeni_Ugovora_Test extends BaseTest {

	public PX_051_Provjera_Validacija_Na_Izmjeni_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_051_provjera_validacija_na_izmjeni_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36ZBLNG");
		ugovoriPage.verifikujObaveznaPoljaIzmjenaUgovora();
	}
}