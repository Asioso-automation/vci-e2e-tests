package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.ObracunskiUgovori;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RegistarBrojila;

public class PX_DIST_025_Brisanje_Obracunskog_Ugovora_Test  extends BaseTest {

	public PX_DIST_025_Brisanje_Obracunskog_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_025_brisanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = homePage.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickaLica = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.verifikujFizickoLice(fizickaLica);
		String kupac = fizickaLicaPage.kreirajFizickoLice();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernaMjesta = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.verifikujMjernoMjesto(mjernaMjesta);
		String mjernoMjesto = mjernaMjestaPage.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovoriPage = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovoriPage.dodajObracunskiUgovor(kupac, mjernoMjesto, brBrojila);
		obracunskiUgovoriPage.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovoriPage.verifikujObracunskiUgovor(mjernoMjesto);
		obracunskiUgovoriPage.obrisiStavku(true);
		obracunskiUgovoriPage.verifikujBrisanjeStavke(false, mjernoMjesto);
	}

}