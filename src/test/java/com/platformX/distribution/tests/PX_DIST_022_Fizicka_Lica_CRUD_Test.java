package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_022_Fizicka_Lica_CRUD_Test  extends BaseTest {

	public PX_DIST_022_Fizicka_Lica_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String fizickoLice = "FizickoLice " + Helper.getRandomString(5);
	String novoFizickoLice = "NovoFizickoLice " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_022_1_dodavanje_fizickog_lica_test() throws Exception {
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
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_022_1_dodavanje_fizickog_lica_test" })
	public void px_dist_022_2_uredjivanje_fizickog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = homePage.navigateOnPage(FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		fizickaLica.urediFizickoLice(novoFizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(novoFizickoLice, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_022_2_uredjivanje_fizickog_lica_test" })
	public void px_dist_022_3_brisanje_fizickog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = homePage.navigateOnPage(FizickaLica.class, "Kupci", "Fizička lica");
		fizickaLica.verifikujFizickaLica();
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(novoFizickoLice, homePage.podatak2Tabela2WE);
		fizickaLica.obrisiStavku();
		fizickaLica.verifikujPoruku("Brisanje je uspješno završeno");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLica.verifikujPraznuTabelu();
	}

}