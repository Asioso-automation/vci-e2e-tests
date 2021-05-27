package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.UgovoriPage;

public class QA_032_Deaktivacija_Ugovora_Test extends BaseTest {

	public QA_032_Deaktivacija_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_032_deaktivacija_ugovora_test() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36Z0SK009", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.verifikujBrojNecekiranihKolona(2);
		ugovoriPage.deaktivirajUgovor(null);
		//ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		// ugovoriPage.verifikujBrojNecekranihKolona(3);
	}

}