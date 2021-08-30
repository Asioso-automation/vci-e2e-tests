package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class QA_023_Neuspjesno_Dodavanje_Ugovora_Test5 extends BaseTest {

	public QA_023_Neuspjesno_Dodavanje_Ugovora_Test5() throws IOException, FileNotFoundException {
		super();
	}

	// Obrazac za broj protokola ne postoji
	
	@Test
	public void qa_023_nesupjesno_dodavanje_ugovora_test5() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36K085053", true);
		ugovoriPage.verifikujPorukuForme("Obrazac za traženi ods i tarifnu grupu u traženom periodu ne postoji.");
	}

}