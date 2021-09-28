package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.Ugovori;

public class PX_056_Preregistracija_Ugovora_Test extends BaseTest {

	public PX_056_Preregistracija_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_056_preregistracija_ugovora_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36Z0SB00");
		ugovoriPage.otvoriPreregistraciju();
		ugovoriPage.preregistrujUgovor();
		ugovoriPage.verifikujUgovori();
		// TODO Refaktorisati verifikaciju 
		// ugovoriPage.verifikujPreregistrovanUgovor("36Z0SB00", "Firma 2");
	}
	
}