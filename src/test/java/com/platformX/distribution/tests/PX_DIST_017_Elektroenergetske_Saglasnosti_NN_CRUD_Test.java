package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_017_Elektroenergetske_Saglasnosti_NN_CRUD_Test extends BaseTest {

	public PX_DIST_017_Elektroenergetske_Saglasnosti_NN_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String eeSaglasnost = new String();
	String brojProtokola = "protokolBr.10_" + Helper.getRandomString(5);
	String brojProtokolaTabela = brojProtokola + "EES";
	String brojProtokola1 = "protokolBr.20_" + Helper.getRandomString(5);
	String brojProtokola1Tabela = brojProtokola1 + "EES";

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niskiNapon_10_javna_rasvjeta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "10 - Javna rasvjeta");
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(10);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokolaTabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niskiNapon_20_domacinstva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "20 - Domaćinstva");
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola1);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(20);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola1);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola1Tabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niskiNapon_10_javna_rasvjeta_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niskiNapon_10_javna_rasvjeta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokolaTabela, homePage.podatak2Tabela2WE);
		elektroenergetskeSaglasnosti.obrisiStavku();
		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niskiNapon_20_domacinstva_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niskiNapon_20_domacinstva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola1);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola1Tabela, homePage.podatak2Tabela2WE);
		elektroenergetskeSaglasnosti.obrisiStavku();
		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}

	
}