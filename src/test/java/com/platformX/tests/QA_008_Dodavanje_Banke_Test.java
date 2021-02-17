package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.BankePage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;

public class QA_008_Dodavanje_Banke_Test extends BaseTest {

	public QA_008_Dodavanje_Banke_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_008_dodavanje_banke_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		homePage.navigateToBanke();
		BankePage bankePage = new BankePage(driver);
		String banka = bankePage.dodajBanku();
		bankePage.verifikujBanku(banka);
	}

}