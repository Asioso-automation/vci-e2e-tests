package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_019_Neuspjesno_Dodavanje_Ugovora_Test6 extends BaseTest {

	public QA_019_Neuspjesno_Dodavanje_Ugovora_Test6() throws IOException, FileNotFoundException {
		super();
	}

	// Broj protokola je vec u upotrebi
	
	@Test
	public void qa_019_nesupjesno_dodavanje_ugovora_test6() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		String mjernoMjesto = ugovoriPage.dodajUgovor("7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1 - AMOSA542A", true);
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.dodajUgovor("7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "2 - 1514BASD99", true);
		ugovoriPage.verifikujPoruku("Broj protokola je već u upotrebi.");
	}

}