package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_017_Neuspjesno_Dodavanje_Ugovora_Test4 extends BaseTest {

	public QA_017_Neuspjesno_Dodavanje_Ugovora_Test4() throws IOException, FileNotFoundException {
		super();
	}

	// Cjenovnik nema definisan datum vazenja
	
	@Test
	public void qa_017_nesupjesno_dodavanje_ugovora_test4() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajUgovor("1 - Kategorija cijene 1", "15.07.2020.", "15.07.2020.", "2 - 1514BASD99", true);
		ugovoriPage.verifikujPoruku("Kreiranje ugovora nije moguće. Datum važenja nije definisan na izabranoj cjenovnoj kategoriji.");
	}

}