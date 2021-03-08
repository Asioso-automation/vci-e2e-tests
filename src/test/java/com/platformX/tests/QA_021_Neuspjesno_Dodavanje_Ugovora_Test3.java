package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.UgovoriPage;

public class QA_021_Neuspjesno_Dodavanje_Ugovora_Test3 extends BaseTest {

	public QA_021_Neuspjesno_Dodavanje_Ugovora_Test3() throws IOException, FileNotFoundException {
		super();
	}

	// Datum pocetka je prije pocetka obracunskog perioda
	
	@Test
	public void qa_021_nesupjesno_dodavanje_ugovora_test3() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.06.2020.", "15.06.2020.", "2 - 1514BASD99", true);
		ugovoriPage.verifikujPoruku("Početni datum ne smije biti prije početka aktivnog perioda.");
	}

}