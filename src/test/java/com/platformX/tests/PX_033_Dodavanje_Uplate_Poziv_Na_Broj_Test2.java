package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UplatePage;
import com.platformX.page.ZiroRacuni;

public class QA_012_Dodavanje_Uplate_Poziv_Na_Broj_Test2 extends BaseTest {

	public QA_012_Dodavanje_Uplate_Poziv_Na_Broj_Test2() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_012_dodavanje_uplate_poziv_na_broj_test2() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
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
		homePage.navigirajNaDnevniciUplata();
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.navigateToUplateSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.obrisiPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
	}

}