package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.BankePage;
import com.platformX.page.DnevniciUplataPage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UplatePage;
import com.platformX.page.ZiroRacuniPage;

public class QA_006_Dodaj_Uplatu_Poziv_Na_Broj_Test1 extends BaseTest {

	public QA_006_Dodaj_Uplatu_Poziv_Na_Broj_Test1() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_006_dodaj_uplatu_poziv_na_broj_test1() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		homePage.navigateToBanke();
		BankePage bankePage = new BankePage(driver);
		String banka = bankePage.dodajBanku();
		bankePage.verifikujBanku(banka);
		homePage.navigateToZiroRacuni();
		ZiroRacuniPage ziroRacuniPage = new ZiroRacuniPage(driver);
		String ziroRacun = ziroRacuniPage.dodajZiroRacun(banka);
		ziroRacuniPage.verifikujZiroRacun(ziroRacun);
		homePage.navigateToDnevniciUplata();
		DnevniciUplataPage dnevniciUplataPage = new DnevniciUplataPage(driver);
		dnevniciUplataPage.verifikujDnevniciUplataPage();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.navigateToUplateSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatuPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
	}

}