package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.RazlogNeizvrsavanjaZahtjeva;
import com.platformX.distribution.page.ZahtjeviZaDostavuPodataka;
import com.platformX.distribution.page.ZahtjeviZaIskljucenja;
import com.platformX.distribution.page.ZahtjeviZaUkljucenja;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;
import com.platformX.distribution.page.AktivnaIskljucenjaMjernihMjesta;
import com.platformX.distribution.page.EnergetskaKartica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;

public class PX_DIST_005_Verifikacija_Sekcije_Mjerna_Mjesta_Test extends BaseTest {

	public PX_DIST_005_Verifikacija_Sekcije_Mjerna_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_005_verifikacije_sekcije_mjerna_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = pocetna.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaMjernaMjesta.verifikujZbirnaMjernaMjesta();
		EnergetskaKartica kartica = pocetna.navigirajNaEnergetskaKartica();
		kartica.verifikujEnergetskaKartica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = pocetna.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = pocetna.navigirajNaZahtjeviZaIskljucenja();
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = pocetna.navigirajNaZahtjeviZaUkljucenja();
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
		RazlogNeizvrsavanjaZahtjeva razlogNeizvrsavanjaZahtjeva = pocetna.navigirajNaRazlogNeizvrsavanjaZahtjeva();
		razlogNeizvrsavanjaZahtjeva.verifikujRazlogNeizvrsavanjaZahtjeva();
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = pocetna.navigirajNaAktivnaIskljucenjaMjernihMjesta();
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
	}
	
}