package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UmanjenjaCijenePage;

public class QA_058_Dodavanje_Umanjenja_Cijene_Test extends BaseTest {

	public QA_058_Dodavanje_Umanjenja_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_058_dodavanje_umanjenja_cijene_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		UmanjenjaCijenePage umanjenjaCijenePage = homePage.navigateToUmanjenjaCijene();
		umanjenjaCijenePage.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijenePage.dodajUmanjenjeCijene();
		umanjenjaCijenePage.verifikujUmanjenjeCijene(brojMjeseci);
	}
}