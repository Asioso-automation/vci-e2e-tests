package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.UgovoriPage;

public class QA_033_Neuspjesna_Deaktivacija_Ugovora_Test extends BaseTest {

	public QA_033_Neuspjesna_Deaktivacija_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	/* Test provjerava da je nemoguce deaktivirati ugovor kada se izabere
	 prosli datum za datum deaktivacije (01.01.2020.) i verifikuje validacionu poruku */
	
	@Test
	public void qa_033_neuspjesna_deaktivacija_ugovora_test() throws Exception {
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
		String mjernoMjesto = ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "66100006 - 3PD53B2W", true);
		ugovoriPage.verifikujUgovor(mjernoMjesto);
		ugovoriPage.verifikujBrojNecekiranihKolona(2);
		ugovoriPage.deaktivirajUgovor("01.01.2020.");
	}

}