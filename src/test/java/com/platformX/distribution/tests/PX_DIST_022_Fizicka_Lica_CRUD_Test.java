package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_022_Fizicka_Lica_CRUD_Test  extends BaseTest {

	public PX_DIST_022_Fizicka_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_022_1_dodavanje_fizickog_lica_test() throws Exception {
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
	}
	
	@Test
	public void px_dist_022_2_uredjivanje_fizickog_lica_test() throws Exception {
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
		String novoFizickoLice = fizickaLicaPage.urediFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLicaPage.verifikujFizickaLica();
		fizickaLicaPage.verifikujStavku(novoFizickoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_022_3_brisanje_fizickog_lica_test() throws Exception {
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
		fizickaLicaPage.obrisiStavku(true);
		fizickaLicaPage.verifikujBrisanjeStavke(true, fizickoLice);
	}

}