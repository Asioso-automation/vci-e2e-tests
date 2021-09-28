package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class QA_024_Neuspjesno_Dodavanje_Ugovora_Test6 extends BaseTest {

	public QA_024_Neuspjesno_Dodavanje_Ugovora_Test6() throws IOException, FileNotFoundException {
		super();
	}

	// Obavezno polje broj reaktivnog brojila
	
	@Test
	public void qa_024_nesupjesno_dodavanje_ugovora_test6() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLicaPage.kreirajKupca();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36066699C", false);
		ugovoriPage.verifikujPorukuForme("Reaktivno brojilo ne smije biti prazno za odabranu tarifnu grupu.");
	}

}