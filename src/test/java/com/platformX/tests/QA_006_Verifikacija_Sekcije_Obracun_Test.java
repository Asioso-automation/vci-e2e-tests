package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.AvansneFakture;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KamatePage;
import com.platformX.page.KorekcijeRacuna;
import com.platformX.page.KupciZaTestneRacune;
import com.platformX.page.LogInPage;
import com.platformX.page.NaloziZaObracun;
import com.platformX.page.Racuni;
import com.platformX.page.UmanjenjaCijene;

public class QA_006_Verifikacija_Sekcije_Obracun_Test extends BaseTest {

	public QA_006_Verifikacija_Sekcije_Obracun_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih

	@Test
	public void qa_006_verifikacija_sekcije_obracun_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		NaloziZaObracun naloziZaObracun = homePage.navigirajNaNaloziZaObracun();
		naloziZaObracun.verifikujNaloziZaObracun();
//		MonitoringObracunaPage monitoringObracunaPage = homePage.navigateToMonitoringObracuna();
//		monitoringObracunaPage.verifikujMonitoringObracuna();
		Racuni racuni = homePage.navigirajNaRacuni();
		racuni.verifikujRacuni();
		KorekcijeRacuna korekcijeRacuna = homePage.navigirajNaKorekcijeRacuna();
		korekcijeRacuna.verifikujKorekcijeRacuna();
		KamatePage kamatePage = homePage.navigirajNaKamate();
		kamatePage.verifikujKamate();
//		KorekcijeKamatePage korekcijeKamatePage = homePage.navigateToKorekcijeKamate();
//		korekcijeKamatePage.verifikujKorekcijeKamate();
		AvansneFakture avansneFakture = homePage.navigirajNaAvansneFakture();
		avansneFakture.verifikujAvansneFakture();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		KupciZaTestneRacune kupciZaTestneRacune = homePage.navigirajNaKupciZaTestneRacune();
		kupciZaTestneRacune.verifikujKupciZaTestneRacune();
	}
}