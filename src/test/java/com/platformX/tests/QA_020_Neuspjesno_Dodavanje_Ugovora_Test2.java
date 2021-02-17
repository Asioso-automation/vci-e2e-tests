package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.UgovoriPage;

public class QA_015_Neuspjesno_Dodavanje_Ugovora_Test2 extends BaseTest {

	public QA_015_Neuspjesno_Dodavanje_Ugovora_Test2() throws IOException, FileNotFoundException {
		super();
	}

	// Cjenovnik nema definisan datum vazenja
	// Test je suvisan, datum vazenja je sad obavezan osim ako je cjenovna kategorija za mrezarinu
	
	//@Test
	// public void qa_015_nesupjesno_dodavanje_ugovora_test2() throws Exception {
	// 	LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
	// 	logInPage.verifyLogInPage();
	// 	logInPage.logIn();
	// 	HomePage homePage = new HomePage(driver);
	// 	homePage.verifyHomePage();
	// 	PravnaLicaPage pravnaLicaPage = homePage.navigateToPravnaLica();
	// 	pravnaLicaPage.verifikujPravnaLica();
	// 	String pravnoLice = pravnaLicaPage.dodajPravnoLice();
	// 	pravnaLicaPage.verifikujPravnaLica();
	// 	pravnaLicaPage.verifikujPravnoLice(pravnoLice);
	// 	String kupac = pravnaLicaPage.kreirajKupca();
	// 	UgovoriPage ugovoriPage = homePage.navigateToUgovori();
	// 	ugovoriPage.verifikujUgovori();
	// 	ugovoriPage.dodajUgovor(kupac, "1 - Kategorija cijene 1", "15.07.2100.", "15.07.2100.", "2 - 1514BASD99", true);
	// 	ugovoriPage.verifikujPoruku("Kreiranje ugovora nije moguće. Datum važenja nije definisan na izabranoj cjenovnoj kategoriji.");
	// }

}