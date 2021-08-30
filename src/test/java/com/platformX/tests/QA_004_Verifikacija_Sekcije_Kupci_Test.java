package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.FizickaLica;
import com.platformX.page.GrupeObrazacaBrojaUgovora;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.Mjenice;
import com.platformX.page.ObavjestenjaOPromjeniSnabdjevaca;
import com.platformX.page.OdbaceniUgovori;
import com.platformX.page.PovezanaPravnaLica;
import com.platformX.page.PravnaLica;
import com.platformX.page.Reklamacije;
import com.platformX.page.UgovoreniPopusti;
import com.platformX.page.Ugovori;
import com.platformX.page.VrsteZahtjeva;
import com.platformX.page.ZahtjeviZaDostavuPodataka;

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
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLica = homePage.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		PovezanaPravnaLica povezanaPravnaLica = homePage.navigirajNaPovezanaPravnaLica();
		povezanaPravnaLica.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavuPodataka = homePage.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavuPodataka.verifikujZahtjeveZaDostavuPodataka();
//		ZahtjeviZaUgovorePage zahtjeviZaUgovorePage = homePage.navigateToZahtjeviZaUgovore();
//		zahtjeviZaUgovorePage.verifikujZahtjeviZaUgovore();
		Ugovori ugovori = homePage.navigirajNaUgovori();
		ugovori.verifikujUgovori();
		ObavjestenjaOPromjeniSnabdjevaca obavjestenjaOPromjeniSnabdjevaca = homePage.navigirajNaObavjestenjaOPromjeniSnabdjevaca();
		obavjestenjaOPromjeniSnabdjevaca.verifikujObavjestenjaOPromjeniSnabdjevaca();
		UgovoreniPopusti ugovoreniPopusti = homePage.navigirajNaUgovoreniPopusti();
		ugovoreniPopusti.verifikujUgovoreniPopusti();
		OdbaceniUgovori odbaceniUgovori = homePage.navigirajNaOdbaceniUgovori();
		odbaceniUgovori.verifikujOdbaceniUgovori();
		Reklamacije reklamacije = homePage.navigirajNaReklamacije();
		reklamacije.verifikujReklamacije();
		VrsteZahtjeva vrsteZahtjeva = homePage.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		GrupeObrazacaBrojaUgovora grupeObrazacaBrojaUgovora = homePage.navigirajNaGrupeObrazacaBrojaUgovora();
		grupeObrazacaBrojaUgovora.verifikujGrupeObrazaca();
		Mjenice mjenice = homePage.navigirajNaMjenice();
		mjenice.verifikujMjenice();
	}
}