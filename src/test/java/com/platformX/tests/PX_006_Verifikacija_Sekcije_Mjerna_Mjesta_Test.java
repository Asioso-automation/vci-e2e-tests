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

	@Test (description="test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_006_verifikacija_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZahtjeviZaDostavuPodatakaOMjernimMjestima zahtjeviZaDostavuPodataka = pocetna.navigirajNaZahtjeviZaDostavuPodataka1();
		zahtjeviZaDostavuPodataka.verifikujZahtjeviZaDostavuPodataka();
		OcitanjaBrojila ocitanjaBrojila = pocetna.navigirajNaOcitanjaBrojila();
		ocitanjaBrojila.verifikujOcitanjaBrojila();
		EnergetskiObracun energetskiObracun = pocetna.navigirajNaEnergetskiObracun();
		energetskiObracun.verifikujEnergetskiObracun();
//		MonitoringEnergetskogObracunaPage monitoringEnergetskogObracunaPage = homePage.navigateToMonitoringEnergetskogObracuna();
//		monitoringEnergetskogObracunaPage.verifikujMonitoringEnergetskogObracuna();
	}
}