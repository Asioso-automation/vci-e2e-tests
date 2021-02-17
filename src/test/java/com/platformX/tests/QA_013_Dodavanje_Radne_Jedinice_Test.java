package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.RadneJedinicePage;

public class QA_011_Dodaj_Radnu_Jedinicu_Test extends BaseTest {

	public QA_011_Dodaj_Radnu_Jedinicu_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_011_dodaj_radnu_jedinicu_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		RadneJedinicePage radneJedinicePage = homePage.navigateToRadneJedinice();
		radneJedinicePage.verifikujRadneJedinice();
		String radneJedinice= radneJedinicePage.dodajRadnuJedinicu();
		radneJedinicePage.verifikujRadnuJedinicu(radneJedinice);
	}

}