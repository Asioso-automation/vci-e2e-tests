package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.ObracunskiUgovori;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.util.Helper;

public class PX_DIST_024_Obracunski_Ugovori_CRUD_Test  extends BaseTest {

	public PX_DIST_024_Obracunski_Ugovori_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String fizickoLice = "FizickoLice " + Helper.getRandomString(5);
	String sifraMjernogMjesta = Helper.getRandomNumber(6);
	String eic;
	String konstanta = Helper.getRandomNumberInRange(1, 20);
	String konstantaTabela = "A: " + konstanta + ",00";
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_024_1_dodavanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = homePage.navigateOnPage(FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		fizickaLica.dodajFizickoLice(fizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		String kupac = fizickaLica.kreirajFizickoLice();
		MjernaMjesta mjernaMjesta = homePage.navigateOnPage(MjernaMjesta.class, "Mjerna mjesta", "Mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.dodajMjernoMjesto(sifraMjernogMjesta);
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, sifraMjernogMjesta);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(sifraMjernogMjesta, homePage.podatak2Tabela3WE);
		eic = mjernaMjesta.kreirajMjernoMjesto();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String brojilo = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(brojilo);
		String brBrojila = registarBrojilaPage.kreirajBrojilo();
		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.dodajObracunskiUgovor(kupac, eic, brBrojila);
		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
	}
	
	@Test (enabled = false, retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_024_1_dodavanje_obracunskog_ugovora_test" })
	public void px_dist_024_2_uredjivanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
		obracunskiUgovori.urediObracunskiUgovor(konstanta);
		obracunskiUgovori.verifikujPoruku("Uspješno završeno.");
		obracunskiUgovori.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.verifikujStavku(konstantaTabela, homePage.podatak2Tabela10WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_024_1_dodavanje_obracunskog_ugovora_test" })
	public void px_dist_024_3_brisanje_obracunskog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskiUgovori obracunskiUgovori = homePage.navigirajNaObracunskiUgovori();
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovori.verifikujObracunskiUgovori();
		obracunskiUgovori.verifikujStavku(eic, homePage.podatak2Tabela3WE);
		obracunskiUgovori.obrisiStavku();
		obracunskiUgovori.verifikujPoruku("Brisanje je uspješno završeno");
		obracunskiUgovori.pretraziStavku(homePage.filterKolona3WE, eic);
		obracunskiUgovori.verifikujPraznuTabelu();
	}

}