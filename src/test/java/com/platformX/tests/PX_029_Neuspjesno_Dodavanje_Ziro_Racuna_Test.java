package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.ZiroRacuni;

public class PX_029_Neuspjesno_Dodavanje_Ziro_Racuna_Test extends BaseTest {

	public PX_029_Neuspjesno_Dodavanje_Ziro_Racuna_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description = "pokusaj dodavanja ziro racuna sa postojecim brojem")
	public void px_029_neuspjesno_dodavanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
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
		ziroRacuni.dodajZiroRacunSaBrojem(banka, ziroRacun);
		ziroRacuni.verifikujPoruku("Ovaj žiro račun je već u upotrebi.");
	}

}