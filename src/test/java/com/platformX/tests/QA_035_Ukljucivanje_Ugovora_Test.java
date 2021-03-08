package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.UgovoriPage;

public class QA_035_Ukljucivanje_Ugovora_Test extends BaseTest {

	public QA_035_Ukljucivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_035_ukljucivanje_ugovora_test() throws Exception {
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
		String mjernoMjesto = ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "64103710 - 36SK08501E", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.iskljuciUgovor("01.02.2021.");
		ugovoriPage.ukljuciUgovor("02.02.2021.");
		ugovoriPage.provjeraIskljucenostiUgovora("Isključi");
	}

}