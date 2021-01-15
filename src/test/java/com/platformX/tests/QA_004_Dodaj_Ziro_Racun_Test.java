package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.BankePage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.ZiroRacuniPage;

public class QA_004_Dodaj_Ziro_Racun_Test extends BaseTest {

	public QA_004_Dodaj_Ziro_Racun_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_004_dodaj_ziro_racun_test() throws Exception {
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
	}

}