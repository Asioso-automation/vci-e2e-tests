package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;
import com.platformX.page.PravnaLicaPage;

public class QA_037_Iskljucivanje_Ugovora_Test extends BaseTest {

	public QA_037_Iskljucivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_037_iskljucivanje_ugovora_test() throws Exception {
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
		String mjernoMjesto = ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36Z0SK085O", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.iskljuciUgovor("01.02.2021.");
		ugovoriPage.provjeraIskljucenostiUgovora("Uključi");
	}

}