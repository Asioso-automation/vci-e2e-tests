package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.FizickaLicaPage;
import com.platformX.page.GrupeObrazacaBrojaUgovoraPage;
import com.platformX.page.HomePage;
import com.platformX.page.LogInPage;
import com.platformX.page.OdbaceniUgovoriPage;
import com.platformX.page.PovezanaPravnaLicaPage;
import com.platformX.page.PravnaLicaPage;
import com.platformX.page.ReklamacijePage;
import com.platformX.page.UgovoriPage;
import com.platformX.page.VrsteZahtjevaPage;
import com.platformX.page.ZahtjeviZaDostavuPodatakaPage;

public class QA_004_Verifikacija_Sekcije_Kupci_Test extends BaseTest {

	public QA_004_Verifikacija_Sekcije_Kupci_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih

	@Test
	public void qa_004_verifikacija_sekcije_kupci_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		HomePage homePage = new HomePage(driver);
		homePage.verifyHomePage();
		PravnaLicaPage pravnaLicaPage = homePage.navigateToPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		FizickaLicaPage fizickaLicaPage = homePage.navigateToFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		PovezanaPravnaLicaPage povezanaPravnaLicaPage = homePage.navigateToPovezanaPravnaLica();
		povezanaPravnaLicaPage.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodatakaPage zahtjeviZaDostavuPodatakaPage = homePage.navigateToZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavuPodatakaPage.verifikujZahtjeveZaDostavuPodataka();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		// TODO Ugovoreni popusti
		OdbaceniUgovoriPage odbaceniUgovoriPage = homePage.navigateToOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		ReklamacijePage reklamacijePage = homePage.navigateToReklamacije();
		reklamacijePage.verifikujReklamacije();
		VrsteZahtjevaPage vrsteZahtjevaPage = homePage.navigateToVrsteZahtjeva();
		vrsteZahtjevaPage.verifikujVrsteZahtjeva();
		GrupeObrazacaBrojaUgovoraPage grupeObrazacaBrojaUgovoraPage = homePage.navigateToGrupeObrazacaBrojaUgovora();
		grupeObrazacaBrojaUgovoraPage.verifikujGrupeObrazaca();
		// TODO Mjenice
	}
}