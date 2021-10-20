package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;

public class PX_055_Neuspjesno_Odbacivanje_Ugovora_Test extends BaseTest {

	public PX_055_Neuspjesno_Odbacivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_055_neuspjesno_odbacivanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();	
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36ZBLNG");
		ugovoriPage.odbaciUgovor();
		ugovoriPage.verifikujPoruku("Odbacivanje ovog ugovora nije moguće.");
	}

}