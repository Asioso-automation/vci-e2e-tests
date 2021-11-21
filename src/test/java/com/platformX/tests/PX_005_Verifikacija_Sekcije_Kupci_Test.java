package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.FizickaLica;
import com.platformX.page.GrupeObrazacaBrojaUgovora;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
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

public class PX_005_Verifikacija_Sekcije_Kupci_Test extends BaseTest {

	public PX_005_Verifikacija_Sekcije_Kupci_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_005_verifikacija_sekcije_kupci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = pocetna.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		PovezanaPravnaLica povezanaPravnaLica = pocetna.navigirajNaPovezanaPravnaLica();
		povezanaPravnaLica.verifikujPovezanaPravnaLica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavuPodataka = pocetna.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavuPodataka.verifikujZahtjeveZaDostavuPodataka();
//		ZahtjeviZaUgovorePage zahtjeviZaUgovorePage = homePage.navigateToZahtjeviZaUgovore();
//		zahtjeviZaUgovorePage.verifikujZahtjeviZaUgovore();
		Ugovori ugovori = pocetna.navigirajNaUgovori();
		ugovori.verifikujUgovori();
		ObavjestenjaOPromjeniSnabdjevaca obavjestenjaOPromjeniSnabdjevaca = pocetna.navigirajNaObavjestenjaOPromjeniSnabdjevaca();
		obavjestenjaOPromjeniSnabdjevaca.verifikujObavjestenjaOPromjeniSnabdjevaca();
		UgovoreniPopusti ugovoreniPopusti = pocetna.navigirajNaUgovoreniPopusti();
		ugovoreniPopusti.verifikujUgovoreniPopusti();
		OdbaceniUgovori odbaceniUgovori = pocetna.navigirajNaOdbaceniUgovori();
		odbaceniUgovori.verifikujOdbaceniUgovori();
		Reklamacije reklamacije = pocetna.navigirajNaReklamacije();
		reklamacije.verifikujReklamacije();
		VrsteZahtjeva vrsteZahtjeva = pocetna.navigirajNaVrsteZahtjeva();
		vrsteZahtjeva.verifikujVrsteZahtjeva();
		GrupeObrazacaBrojaUgovora grupeObrazacaBrojaUgovora = pocetna.navigirajNaGrupeObrazacaBrojaUgovora();
		grupeObrazacaBrojaUgovora.verifikujGrupeObrazaca();
		Mjenice mjenice = pocetna.navigirajNaMjenice();
		mjenice.verifikujMjenice();
	}
}