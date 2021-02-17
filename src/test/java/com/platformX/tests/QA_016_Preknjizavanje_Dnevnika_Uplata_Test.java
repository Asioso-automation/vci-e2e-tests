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

public class QA_016_Preknjizavanje_Dnevnika_Uplata_Test extends BaseTest {

	public QA_016_Preknjizavanje_Dnevnika_Uplata_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_016_preknjizavanje_dnevnika_uplata_test() throws Exception {
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
		String uplatilac = uplatePage.dodajUplatuKupac();
		uplatePage.verifikujUplatu(uplatilac);
	}

}