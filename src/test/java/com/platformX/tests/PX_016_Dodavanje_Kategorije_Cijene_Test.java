package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogInPage;

public class QA_050_Dodavanje_Kategorije_Cijene_Test extends BaseTest {

	public QA_050_Dodavanje_Kategorije_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_050_dodavanje_kategorije_cijene_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
	}

}