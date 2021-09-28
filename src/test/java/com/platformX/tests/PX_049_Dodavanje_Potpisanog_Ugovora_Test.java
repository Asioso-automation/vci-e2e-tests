package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PravnaLica;
import com.platformX.page.LogInPage;
import com.platformX.page.Ugovori;

public class QA_025_Dodavanje_Potpisanog_Ugovora_Test extends BaseTest {

	public QA_025_Dodavanje_Potpisanog_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_025_dodavanje_potpisanog_ugovora_test() throws Exception {
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
		ugovoriPage.dodajPotpisanUgovor("36Z0100154X", kupac);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
	}

}