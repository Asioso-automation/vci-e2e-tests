package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;
import com.platformX.page.PravnaLicaPage;

public class QA_038_Neuspjesno_Iskljucivanje_Ugovora_Test extends BaseTest {

	public QA_038_Neuspjesno_Iskljucivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_038_neuspjesno_iskljucivanje_ugovora_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		PravnaLicaPage pravnaLicaPage = homePage.navigateToPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLicaPage.kreirajKupca();		
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		String mjernoMjesto = ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "64102666 - 36Z0S501070Z", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.iskljuciUgovor("15.07.2019.");
		ugovoriPage.provjeraIskljucenostiUgovora("Isključi");
	}

}