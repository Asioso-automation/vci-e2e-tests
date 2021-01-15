package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_014_Neuspjesno_Dodavanje_Ugovora_Test1 extends BaseTest {

	public QA_014_Neuspjesno_Dodavanje_Ugovora_Test1() throws IOException, FileNotFoundException {
		super();
	}

	// Vec postoji ugovor za izabrano mjerno mjesto
	
	@Test
	public void qa_014_neuspjesno_dodavanje_ugovora_test1() throws Exception {
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
		ugovoriPage.dodajUgovor("7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "61100001 - 36Z03800001H", true);
		ugovoriPage.verifikujPoruku("Ugovor za traženo mjerno mjesto već postoji u navedenom periodu.");
	}

}