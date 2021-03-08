package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.AvansneFakturePage;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KamatePage;
import com.platformX.page.KorekcijeKamatePage;
import com.platformX.page.KorekcijeRacunaPage;
import com.platformX.page.KupciZaTestneRacunePage;
import com.platformX.page.LogInPage;
import com.platformX.page.MonitoringObracunaPage;
import com.platformX.page.NaloziZaObracunPage;
import com.platformX.page.RacuniPage;
import com.platformX.page.UmanjenjaCijenePage;

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
		NaloziZaObracunPage naloziZaObracunPage = homePage.navigateToNaloziZaObracun();
		naloziZaObracunPage.verifikujNaloziZaObracun();
		MonitoringObracunaPage monitoringObracunaPage = homePage.navigateToMonitoringObracuna();
		monitoringObracunaPage.verifikujMonitoringObracuna();
		RacuniPage racuniPage = homePage.navigateToRacuni();
		racuniPage.verifikujRacuni();
		KorekcijeRacunaPage korekcijeRacunaPage = homePage.navigateToKorekcijeRacuna();
		korekcijeRacunaPage.verifikujKorekcijeRacuna();
		KamatePage kamatePage = homePage.navigateToKamate();
		kamatePage.verifikujKamate();
		KorekcijeKamatePage korekcijeKamatePage = homePage.navigateToKorekcijeKamate();
		korekcijeKamatePage.verifikujKorekcijeKamate();
		AvansneFakturePage avansneFakturePage = homePage.navigateToAvansneFakture();
		avansneFakturePage.verifikujAvansneFakture();
		UmanjenjaCijenePage umanjenjaCijenePage = homePage.navigateToUmanjenjaCijene();
		umanjenjaCijenePage.verifikujUmanjenjaCijene();
		KupciZaTestneRacunePage kupciZaTestneRacunePage = homePage.navigateToKupciZaTestneRacune();
		kupciZaTestneRacunePage.verifikujKupciZaTestneRacune();
	}
}