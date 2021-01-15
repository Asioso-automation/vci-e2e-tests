package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_018_Neuspjesno_Dodavanje_Ugovora_Test5 extends BaseTest {

	public QA_018_Neuspjesno_Dodavanje_Ugovora_Test5() throws IOException, FileNotFoundException {
		super();
	}

	// Obrazac za broj protokola ne postoji
	
	@Test
	public void qa_018_nesupjesno_dodavanje_ugovora_test5() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajUgovor("7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "64103711 - 36K085053", true);
		ugovoriPage.verifikujPoruku("Obrazac za traženi ods i tarifnu grupu u traženom periodu ne postoji.");
	}

}