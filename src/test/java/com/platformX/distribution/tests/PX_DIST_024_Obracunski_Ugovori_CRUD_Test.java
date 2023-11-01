//package com.platformX.distribution.tests;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import org.testng.annotations.Test;
//import com.platformX.base.BaseTest;
//import com.platformX.distribution.page.FizickaLica;
//import com.platformX.distribution.page.LogIn;
//import com.platformX.distribution.page.MjernaMjesta;
//import com.platformX.distribution.page.ObracunskiUgovori;
//import com.platformX.distribution.page.PocetnaStranicaPXD;
//import com.platformX.distribution.page.RegistarBrojila;
//
//public class PX_DIST_024_Obracunski_Ugovori_CRUD_Test  extends BaseTest {
//
//	public PX_DIST_024_Obracunski_Ugovori_CRUD_Test() throws IOException, FileNotFoundException {
//		super();
//	}
//	
//	@Test (enabled = false)
//	public void px_dist_024_1_dodavanje_obracunskog_ugovora_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
//		fizickaLica.verifikujFizickaLica();
//		String fizickoLice = fizickaLica.dodajFizickoLice();
//		fizickaLica.verifikujPoruku("Uspješno završeno.");
//		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
//		fizickaLica.verifikujFizickaLica();
//		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
//		String kupac = fizickaLica.kreirajFizickoLice();
//		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
//		mjernaMjesta.verifikujMjernaMjesta();
//		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
//		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
//		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
//		mjernaMjesta.verifikujMjernaMjesta();
//		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
//		String eic = mjernaMjesta.kreirajMjernoMjesto();
//		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
//		registarBrojilaPage.verifikujRegistarBrojila();
//		String registarBrojila = registarBrojilaPage.dodajBrojilo();
//		registarBrojilaPage.verifikujBrojilo(registarBrojila);
//		String brBrojila = registarBrojilaPage.kreirajBrojilo();
//		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.dodajObracunskiUgovor(kupac, eic, brBrojila);
//		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
//		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
//	}
//	
//	@Test (enabled = false)
//	public void px_dist_024_2_uredjivanje_obracunskog_ugovora_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
//		fizickaLica.verifikujFizickaLica();
//		String fizickoLice = fizickaLica.dodajFizickoLice();
//		fizickaLica.verifikujPoruku("Uspješno završeno.");
//		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
//		fizickaLica.verifikujFizickaLica();
//		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
//		String kupac = fizickaLica.kreirajFizickoLice();
//		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
//		mjernaMjesta.verifikujMjernaMjesta();
//		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
//		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
//		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
//		mjernaMjesta.verifikujMjernaMjesta();
//		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
//		String eic = mjernaMjesta.kreirajMjernoMjesto();
//		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
//		registarBrojilaPage.verifikujRegistarBrojila();
//		String registarBrojila = registarBrojilaPage.dodajBrojilo();
//		registarBrojilaPage.verifikujBrojilo(registarBrojila);
//		String brBrojila = registarBrojilaPage.kreirajBrojilo();
//		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.dodajObracunskiUgovor(kupac, eic, brBrojila);
//		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
//		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
//		String nazivMjm = obracunskiUgovori.urediObracunskiUgovor();
//		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
//		obracunskiUgovori.pretraziStavku(homePage.filterKolona4WE, nazivMjm);
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.verifikujStavku(nazivMjm, homePage.podatak2Tabela4WE);
//	}
//	
//	@Test (enabled = false)
//	public void px_dist_024_3_brisanje_obracunskog_ugovora_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
//		fizickaLica.verifikujFizickaLica();
//		String fizickoLice = fizickaLica.dodajFizickoLice();
//		fizickaLica.verifikujPoruku("Uspješno završeno.");
//		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
//		fizickaLica.verifikujFizickaLica();
//		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
//		String kupac = fizickaLica.kreirajFizickoLice();
//		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
//		mjernaMjesta.verifikujMjernaMjesta();
//		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
//		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
//		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
//		mjernaMjesta.verifikujMjernaMjesta();
//		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
//		String eic = mjernaMjesta.kreirajMjernoMjesto();
//		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
//		registarBrojilaPage.verifikujRegistarBrojila();
//		String registarBrojila = registarBrojilaPage.dodajBrojilo();
//		registarBrojilaPage.verifikujBrojilo(registarBrojila);
//		String brBrojila = registarBrojilaPage.kreirajBrojilo();
//		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.dodajObracunskiUgovor(kupac, eic, brBrojila);
//		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
//		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
//		obracunskiUgovori.verifikujObracunskiUgovori();
//		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
//		obracunskiUgovori.obrisiStavku();
//		obracunskiUgovori.verifikujPoruku("Brisanje je uspješno završeno");
//		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
//		obracunskiUgovori.verifikujPraznuTabelu();
//	}
//
//}