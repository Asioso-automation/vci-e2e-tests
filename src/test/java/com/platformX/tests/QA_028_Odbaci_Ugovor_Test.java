package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.OdbaceniUgovoriPage;
import com.platformX.page.UgovoriPage;

public class QA_028_Odbaci_Ugovor_Test extends BaseTest {

	public QA_028_Odbaci_Ugovor_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "odbaci" odbacuje ugovor
	 i provjerava da se ugovor vise ne pojavljuje na stranici Ugovori vec na stranici Odbaceni ugovori*/

	@Test
	public void qa_028_odbaci_ugovor_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		String mjernoMjesto = ugovoriPage.dodajPotpisanUgovor("1 - AMOSA542A");
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.verifikujBrojNecekiranihKolona(1);
		ugovoriPage.odbaciUgovor();
		ugovoriPage.verifikujOdbaceniUgovor(mjernoMjesto);
		homePage.navigateToOdbaceniUgovori();
		OdbaceniUgovoriPage odbaceniUgovoriPage = new OdbaceniUgovoriPage(driver);
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovor(mjernoMjesto);
	}

}