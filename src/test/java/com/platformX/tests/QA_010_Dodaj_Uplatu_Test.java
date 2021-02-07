package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.DnevniciUplataPage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UplatePage;

public class QA_010_Dodaj_Uplatu_Test extends BaseTest {

	public QA_010_Dodaj_Uplatu_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_010_dodaj_uplatu_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		homePage.navigateToDnevniciUplata();
		DnevniciUplataPage dnevniciUplataPage = new DnevniciUplataPage(driver);
		dnevniciUplataPage.verifikujDnevniciUplataPage();
		dnevniciUplataPage.navigateToUplateSaStranice();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatuPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
		// TODO Promjenjena logika, test treba prilagoditi novim koracima 
	}

}