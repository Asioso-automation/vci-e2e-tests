package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.ObracunskiUgovori;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.RegistarBrojila;

public class PX_DIST_Uredjivanje_Obracunskog_Ugovora_PxD_Test  extends BaseTest {

	public PX_DIST_Uredjivanje_Obracunskog_Ugovora_PxD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_uredjivanje_obracunskog_ugovora_pxd_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = pocetna.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickaLica = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujFizickoLice(fizickaLica);
		String kupac = fizickaLicaPage.kreirajFizickoLice();
		MjernaMjesta mjernaMjestaPage = pocetna.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernaMjesta = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujMjernoMjesto(mjernaMjesta);
		String mjernoMjesto = mjernaMjestaPage.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = pocetna.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovoriPage = pocetna.navigirajNaObracunskiUgovori();
		obracunskiUgovoriPage.dodajObracunskiUgovor(kupac, mjernoMjesto, brBrojila);
		obracunskiUgovoriPage.verifikujObracunskiUgovor(mjernoMjesto);
		obracunskiUgovoriPage.urediObracunskiUgovor();
		obracunskiUgovoriPage.verifikujObracunskiUgovor(mjernoMjesto);
	}

}