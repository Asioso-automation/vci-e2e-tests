package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PravnaLica;
import com.platformX.distribution.page.ZahtjeviZaDostavuPodatakaKUPCI;

public class PX_DIST_006_Verifikacija_Sekcije_Kupci_Test extends BaseTest {

	public PX_DIST_006_Verifikacija_Sekcije_Kupci_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_005_verifikacije_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = pocetna.navigirajNaZahtjeviZaDostavuPodatakaKUPCI();
		zahtjeviZaDostavuPodatakaKupci.verifikujZahtjeviZaDostavuPodatakaKUPCI();
	}
}