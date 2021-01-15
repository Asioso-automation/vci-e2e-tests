package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_024_Izmjena_Polja_Potpisan_Na_Ugovoru_Test extends BaseTest {

	public QA_024_Izmjena_Polja_Potpisan_Na_Ugovoru_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "uredi"
	 uklanja opciju "potpisan" i provjerava kolonu na gridu*/

	@Test
	public void qa_024_izmjena_polja_potpisan_na_ugovoru_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		String mjernoMjesto = ugovoriPage.dodajPotpisanUgovor();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.verifikujBrojNecekranihKolona(1);
		ugovoriPage.izmjeniPotpisanUgovor();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.verifikujBrojNecekranihKolona(2);
	}

}