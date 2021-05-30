package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.LogInPage;
import com.platformX.page.OdbaceniUgovoriPage;
import com.platformX.page.UgovoriPage;

public class QA_034_Odbacivanje_Ugovora_Test extends BaseTest {

	public QA_034_Odbacivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "odbaci" odbacuje ugovor
	 i provjerava da se ugovor vise ne pojavljuje na stranici Ugovori vec na stranici Odbaceni ugovori*/

	@Test
	public void qa_034_odbacivanje_ugovora_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLicaPage pravnaLicaPage = homePage.navigateToPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLicaPage.kreirajKupca();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajPotpisanUgovor("36Z0100154X", kupac);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
//		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
//		ugovoriPage.verifikujUgovori();
//		String mjernoMjesto = ugovoriPage.dodajPotpisanUgovor("36066699C");
//		ugovoriPage.verifikujUgovori();
//		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.verifikujBrojNecekiranihKolona(1);
		ugovoriPage.odbaciUgovor();
		ugovoriPage.verifikujOdbaceniUgovor(kupac);
		homePage.navigateToOdbaceniUgovori();
		OdbaceniUgovoriPage odbaceniUgovoriPage = new OdbaceniUgovoriPage(driver);
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovor("36Z0100154X");
	}

}