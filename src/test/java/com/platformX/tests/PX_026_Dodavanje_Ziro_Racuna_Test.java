package com.platformX.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.ZiroRacuni;

public class PX_026_Dodavanje_Ziro_Racuna_Test extends BaseTest {

	public PX_026_Dodavanje_Ziro_Racuna_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_026_dodavanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigirajNaBanke();
		Banke banke = new Banke(driver);
//		WebElement[] elementiBanke = 
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		
		//banke.verifikujBanku(banka);
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatakTabela2WE);
		
		
//		homePage.navigirajNaZiroRacuni();
//		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
//		WebElement[] elementiZiroRacuna = ziroRacuni.verifikujZiroRacuni();
//		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
//		ziroRacuni.verifikujPoruku("Uspješno završeno.");
//		
//		//ziroRacuni.verifikujZiroRacun(ziroRacun);
//		ziroRacuni.pretraziElement(elementiZiroRacuna[0], ziroRacun);
//		ziroRacuni.verifikujZiroRacuni();
//		ziroRacuni.verifikujElement(ziroRacun, elementiZiroRacuna[1]);
	}

}