package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_056_Preregistracija_Ugovora_Test extends BaseTest {

	public PX_056_Preregistracija_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_056_preregistracija_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36Z0SB00");
		ugovoriPage.otvoriPreregistraciju();
		ugovoriPage.preregistrujUgovor();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujPreregistrovanUgovor("36Z0SB00", "4100010 - Firma 2, Hajduk Veljkova 1, 78000 Banja Luka");
	}
	
}