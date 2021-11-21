package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.UplatePage;
import com.platformX.page.ZiroRacuni;

public class PX_032_Dodavanje_Uplate_Poziv_Na_Broj_Test1 extends BaseTest {

	public PX_032_Dodavanje_Uplate_Poziv_Na_Broj_Test1() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_032_dodavanje_uplate_poziv_na_broj_test1() throws Exception {
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
		homePage.navigirajNaDnevniciUplata();
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(banka, ziroRacun);
		// TODO doraditi verifikaciju DnevnikUplata
		dnevniciUplataPage.navigateToUplateSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatuPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
	}

}