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

public class PX_DIST_034_Obracunski_Ugovori_CRUD_Test  extends BaseTest {

	public PX_DIST_034_Obracunski_Ugovori_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_034_1_dodavanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = homePage.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickoLice = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLicaPage.verifikujFizickaLica();
		fizickaLicaPage.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		String kupac = fizickaLicaPage.kreirajFizickoLice();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		String eic = mjernaMjestaPage.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovoriPage = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.dodajObracunskiUgovor(kupac, eic, brBrojila);
		obracunskiUgovoriPage.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovoriPage.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.verifikujStavku(eic, homePage.podatak2Tabela3WE);
	}
	
	@Test
	public void px_dist_034_2_uredjivanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = homePage.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickoLice = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLicaPage.verifikujFizickaLica();
		fizickaLicaPage.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		String kupac = fizickaLicaPage.kreirajFizickoLice();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		String eic = mjernaMjestaPage.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovoriPage = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.dodajObracunskiUgovor(kupac, eic, brBrojila);
		obracunskiUgovoriPage.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovoriPage.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.verifikujStavku(eic, homePage.podatak2Tabela3WE);
		String nazivMjm = obracunskiUgovoriPage.urediObracunskiUgovor();
		obracunskiUgovoriPage.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovoriPage.pretraziStavku(homePage.filterKolona4WE, nazivMjm);
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.verifikujStavku(nazivMjm, homePage.podatak2Tabela4WE);
	}
	
	@Test
	public void px_dist_034_3_brisanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = homePage.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickoLice = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLicaPage.verifikujFizickaLica();
		fizickaLicaPage.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		String kupac = fizickaLicaPage.kreirajFizickoLice();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		String eic = mjernaMjestaPage.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String registarBrojila = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(registarBrojila);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovoriPage = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.dodajObracunskiUgovor(kupac, eic, brBrojila);
		obracunskiUgovoriPage.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovoriPage.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovoriPage.verifikujObracunskiUgovori();
		obracunskiUgovoriPage.verifikujStavku(eic, homePage.podatak2Tabela3WE);
		obracunskiUgovoriPage.obrisiStavku(true);
		obracunskiUgovoriPage.verifikujBrisanjeStavke(false, eic);
	}

}