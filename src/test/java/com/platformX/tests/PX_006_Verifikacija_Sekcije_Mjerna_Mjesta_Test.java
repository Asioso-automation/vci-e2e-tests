package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.EnergetskiObracun;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.MjernaMjesta;
import com.platformX.page.OcitanjaBrojila;
import com.platformX.page.ZahtjeviZaDostavuPodatakaOMjernimMjestima;

public class PX_006_Verifikacija_Sekcije_Mjerna_Mjesta_Test extends BaseTest {

	public PX_006_Verifikacija_Sekcije_Mjerna_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih

	@Test
	public void qa_006_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = homePage.navigirajNaZahtjeviZaDostavuPodataka1();
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojila ocitanjaBrojila = homePage.navigirajNaOcitanjaBrojila();
		ocitanjaBrojila.verifikujOcitanjaBrojila();
		EnergetskiObracun energetskiObracun = homePage.navigirajNaEnergetskiObracun();
		energetskiObracun.verifikujEnergetskiObracun();
//		MonitoringEnergetskogObracunaPage monitoringEnergetskogObracunaPage = homePage.navigateToMonitoringEnergetskogObracuna();
//		monitoringEnergetskogObracunaPage.verifikujMonitoringEnergetskogObracuna();
	}
}