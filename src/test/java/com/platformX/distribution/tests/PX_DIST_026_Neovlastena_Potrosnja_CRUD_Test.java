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
	
	@Test (enabled = false, retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_026_1_dodavanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = new FizickaLica(driver);
		fizickaLica.navigirajVerifikujFizickaLica();
		fizickaLica.dodajFizickoLice(fizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		fizickaLica.verifikacijaStranice("Kupci", "Fizička Lica", "Fizička lica", 1, fizickaLica.columns, fizickaLica.buttons);
		fizickaLica.verifikujStavku(fizickoLice, homePage.podatak2Tabela2WE);
		kupac = fizickaLica.kreirajFizickoLice();
		Trafostanice trafostanice = new Trafostanice(driver);
		trafostanice.navigirajVerifikujTrafostanice();
		trafostanice.dodajTrafostanicu(trafostanica);
		trafostanice.verifikujPoruku("Uspješno završeno.");
		trafostanice.pretraziStavku(homePage.filterKolona3WE, trafostanica);
		trafostanice.verifikacijaStranice("Šifarnici", "Trafostanice", "Trafostanice", 1, trafostanice.columns, trafostanice.buttons);
		trafostanice.verifikujStavku(trafostanica, homePage.podatak2Tabela3WE);
		NeovlastenaPotrosnja neovlastenaPotrosnja = new NeovlastenaPotrosnja(driver);
		neovlastenaPotrosnja.navigirajVerifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.dodajNeovlastenuPotrosnju(fizickoLice, trafostanica);
		neovlastenaPotrosnja.verifikujPoruku("Uspješno završeno.");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		neovlastenaPotrosnja.verifikacijaStranice("Neovlaštena potrošnja", "Neovlaštena Potrošnja", "Neovlaštena potrošnja", 2, neovlastenaPotrosnja.columns, neovlastenaPotrosnja.buttons);
		neovlastenaPotrosnja.verifikujStavku(kupac, homePage.podatak2Tabela2WE);
	}
	
	@Test (enabled = false, retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_026_1_dodavanje_neovlastene_potrosnje_test" })
	public void px_dist_026_2_uredjivanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = new FizickaLica(driver);
		fizickaLica.navigirajVerifikujFizickaLica();
		fizickaLica.dodajFizickoLice(novoFizickoLice);
		fizickaLica.verifikujPoruku("Uspješno završeno.");
		fizickaLica.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		fizickaLica.verifikacijaStranice("Kupci", "Fizička Lica", "Fizička lica", 1, fizickaLica.columns, fizickaLica.buttons);
		fizickaLica.verifikujStavku(novoFizickoLice, homePage.podatak2Tabela2WE);
		noviKupac = fizickaLica.kreirajFizickoLice();
		NeovlastenaPotrosnja neovlastenaPotrosnja = new NeovlastenaPotrosnja(driver);
		neovlastenaPotrosnja.navigirajVerifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, fizickoLice);
		neovlastenaPotrosnja.verifikacijaStranice("Neovlaštena potrošnja", "Neovlaštena Potrošnja", "Neovlaštena potrošnja", 2, neovlastenaPotrosnja.columns, neovlastenaPotrosnja.buttons);
		neovlastenaPotrosnja.verifikujStavku(kupac, homePage.podatak2Tabela2WE);
		neovlastenaPotrosnja.urediNeovlastenuPotrosnju(novoFizickoLice);
		neovlastenaPotrosnja.verifikujPoruku("Uspješno završeno.");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikacijaStranice("Neovlaštena potrošnja", "Neovlaštena Potrošnja", "Neovlaštena potrošnja", 2, neovlastenaPotrosnja.columns, neovlastenaPotrosnja.buttons);
		neovlastenaPotrosnja.verifikujStavku(noviKupac, homePage.podatak2Tabela2WE);
	}
	
	@Test (enabled = false, retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_026_2_uredjivanje_neovlastene_potrosnje_test" })
	public void px_dist_026_3_brisanje_neovlastene_potrosnje_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NeovlastenaPotrosnja neovlastenaPotrosnja = new NeovlastenaPotrosnja(driver);
		neovlastenaPotrosnja.navigirajVerifikujNeovlastenaPotrosnja();
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikacijaStranice("Neovlaštena potrošnja", "Neovlaštena Potrošnja", "Neovlaštena potrošnja", 2, neovlastenaPotrosnja.columns, neovlastenaPotrosnja.buttons);
		neovlastenaPotrosnja.verifikujStavku(noviKupac, homePage.podatak2Tabela2WE);
		neovlastenaPotrosnja.obrisiStavku();
		neovlastenaPotrosnja.verifikujPoruku("Brisanje je uspješno završeno");
		neovlastenaPotrosnja.pretraziStavku(homePage.filterKolona2WE, novoFizickoLice);
		neovlastenaPotrosnja.verifikujPraznuTabelu();
	}
	
}