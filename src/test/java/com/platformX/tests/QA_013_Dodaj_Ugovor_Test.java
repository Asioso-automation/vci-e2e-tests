package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_013_Dodaj_Ugovor_Test extends BaseTest {

	public QA_013_Dodaj_Ugovor_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_013_dodaj_ugovor_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		String mjernoMjesto = ugovoriPage.dodajUgovor("7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1 - AMOSA542A", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
	}

}