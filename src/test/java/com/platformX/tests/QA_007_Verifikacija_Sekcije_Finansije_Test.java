package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.AvansiPage;
import com.platformX.page.BankePage;
import com.platformX.page.DnevniciUplataPage;
import com.platformX.page.FinansijskeKarticePage;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PreknjizavanjaUplata;
import com.platformX.page.LogInPage;
import com.platformX.page.NerasporedjeneUplatePage;
import com.platformX.page.Reprogrami;
import com.platformX.page.SveUplatePage;
import com.platformX.page.VrsteKnjizenjaPage;
import com.platformX.page.VrsteStavkiFinansijskeKarticePage;
import com.platformX.page.ZiroRacuniPage;

public class QA_007_Verifikacija_Sekcije_Finansije_Test extends BaseTest {

	public QA_007_Verifikacija_Sekcije_Finansije_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih

	@Test
	public void qa_007_verifikacija_sekcije_finansije_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		FinansijskeKarticePage finansijskeKarticePage = homePage.navigateToFinansijskeKartice();
		finansijskeKarticePage.verifikujFinansijskeKartice();
		DnevniciUplataPage dnevniciUplataPage = homePage.navigateToDnevniciUplata();
		dnevniciUplataPage.verifikujDnevniciUplataPage();
		PreknjizavanjaUplata preknjizavanja = homePage.navigateToPreknjizavanjaUplata();
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplatePage sveUplatePage = homePage.navigateToSveUplate();
		sveUplatePage.verifikujSveUplate();
		NerasporedjeneUplatePage nerasporedjeneUplatePage = homePage.navigateToNerasporedjeneUplate();
		nerasporedjeneUplatePage.verifikujNerasporedjeneUplate();
		AvansiPage avansiPage = homePage.navigateToAvansi();
		avansiPage.verifikujAvansi();
		Reprogrami reprogrami = homePage.navigateToReprogrami();
		reprogrami.verifikujReprogrami();
		BankePage bankePage = homePage.navigateToBanke();
		bankePage.verifikujBankeStranicu();
		ZiroRacuniPage ziroRacuniPage = homePage.navigateToZiroRacuni();
		ziroRacuniPage.verifikujZiroRacuni();
		VrsteKnjizenjaPage vrsteKnjizenjaPage = homePage.navigateToVrsteKnjizenja();
		vrsteKnjizenjaPage.verifikujVrsteKnjizenja();
		VrsteStavkiFinansijskeKarticePage vrsteStavkiFinansijskeKartice = homePage.navigateToVrsteStavkiFinansijskeKartice();
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
	}
}