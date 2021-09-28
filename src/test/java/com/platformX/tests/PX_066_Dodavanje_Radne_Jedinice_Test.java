package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.RadneJedinice;

public class QA_013_Dodavanje_Radne_Jedinice_Test extends BaseTest {

	public QA_013_Dodavanje_Radne_Jedinice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_013_dodavanje_radne_jedinice_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		RadneJedinice radneJedinice = homePage.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		String jedinice= radneJedinice.dodajRadnuJedinicu();
		radneJedinice.verifikujRadnuJedinicu(jedinice);
	}

}