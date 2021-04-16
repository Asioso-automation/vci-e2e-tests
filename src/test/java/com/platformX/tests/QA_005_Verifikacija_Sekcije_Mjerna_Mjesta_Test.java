package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.EnergetskiObracunPage;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.MjernaMjestaPage;
import com.platformX.page.MonitoringEnergetskogObracunaPage;
import com.platformX.page.OcitanjaBrojilaPage;
import com.platformX.page.ZahtjeviZaDostavuPodatakaOMjernimMjestima;

public class QA_005_Verifikacija_Sekcije_Mjerna_Mjesta_Test extends BaseTest {

	public QA_005_Verifikacija_Sekcije_Mjerna_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih

	@Test
	public void qa_005_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		MjernaMjestaPage mjernaMjestaPage = homePage.navigateToMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = homePage.navigateToZahtjeviZaDostavuPodataka1();
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojilaPage ocitanjaBrojilaPage = homePage.navigateToOcitanjaBrojila();
		ocitanjaBrojilaPage.verifikujOcitanjaBrojila();
		EnergetskiObracunPage energetskiObracunPage = homePage.navigateToEnergetskiObracun();
		energetskiObracunPage.verifikujEnergetskiObracun();
//		MonitoringEnergetskogObracunaPage monitoringEnergetskogObracunaPage = homePage.navigateToMonitoringEnergetskogObracuna();
//		monitoringEnergetskogObracunaPage.verifikujMonitoringEnergetskogObracuna();
	}
}