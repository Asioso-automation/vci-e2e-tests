package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.ZiroRacuni;

public class PX_028_Brisanje_Ziro_Racuna_Test extends BaseTest {

	public PX_028_Brisanje_Ziro_Racuna_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_028_brisanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		homePage.navigirajNaBanke();
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		homePage.navigirajNaZiroRacuni();
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		ziroRacuni.verifikujZiroRacun(ziroRacun);
		ziroRacuni.obrisiZiroRacun();
		ziroRacuni.verifikujBrisanjeZiroRacuna(ziroRacun);
	}

}