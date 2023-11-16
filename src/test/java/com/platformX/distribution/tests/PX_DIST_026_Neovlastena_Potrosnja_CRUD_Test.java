package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.NeovlastenaPotrosnja;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Trafostanice;
import com.platformX.util.Helper;

public class PX_DIST_026_Neovlastena_Potrosnja_CRUD_Test extends BaseTest{

	public PX_DIST_026_Neovlastena_Potrosnja_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String fizickoLice = "FizickoLice " + Helper.getRandomString(5);
	String trafostanica = "Trafostanica " + Helper.getRandomString(4);
	String novoFizickoLice = "NovoFizickoLice " + Helper.getRandomString(5);
	String kupac = new String();
	String noviKupac = new String();
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_026_1_dodavanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		fizickaLica.dodajFizickoLice(fizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		kupac = fizickaLica.kreirajFizickoLice();
		Trafostanice trafostanice = homePage.navigirajNaTrafostanice();
		trafostanice.verifikujTrafostanice();
		trafostanice.dodajTrafostanicu(trafostanica);
		trafostanice.verifikujPoruku("Uspješno završeno.");
		trafostanice.pretraziStavku(homePage.filterKolona3WE, trafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(trafostanica, homePage.podatak2Tabela3WE);
		NeovlastenaPotrosnja neovlastenaPotrosnja = homePage.navigirajNaNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.dodajNeovlastenuPotrosnju(fizickoLice, trafostanica);
		neovlastenaPotrosnja.verifikujPoruku("Uspješno završeno.");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujStavku(kupac, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_026_1_dodavanje_neovlastene_potrosnje_test" })
	public void px_dist_026_2_uredjivanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = homePage.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		fizickaLica.dodajFizickoLice(novoFizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLica.verifikujFizickaLica();
		fizickaLica.verifikujStavku(novoFizickoLice, homePage.podatak2Tabela2WE);
		noviKupac = fizickaLica.kreirajFizickoLice();
		NeovlastenaPotrosnja neovlastenaPotrosnja = homePage.navigirajNaNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujStavku(kupac, homePage.podatak2Tabela2WE);
		neovlastenaPotrosnja.urediNeovlastenuPotrosnju(novoFizickoLice);
		neovlastenaPotrosnja.verifikujPoruku("Uspješno završeno.");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujStavku(noviKupac, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_026_2_uredjivanje_neovlastene_potrosnje_test" })
	public void px_dist_026_3_brisanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = homePage.navigirajNaNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.verifikujStavku(noviKupac, homePage.podatak2Tabela2WE);
		neovlastenaPotrosnja.obrisiStavku();
		neovlastenaPotrosnja.verifikujPoruku("Brisanje je uspješno završeno");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikujPraznuTabelu();
	}
	
}