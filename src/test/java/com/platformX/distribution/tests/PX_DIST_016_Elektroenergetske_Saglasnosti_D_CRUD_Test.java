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

public class PX_DIST_016_Elektroenergetske_Saglasnosti_D_CRUD_Test extends BaseTest{

	public PX_DIST_016_Elektroenergetske_Saglasnosti_D_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
//	CRUD testovi za elektroenergetske saglasnosti tip EES 1 - Domaćinstva

	String eeSaglasnost = new String();
	String brojProtokola = "protokolBr." + Helper.getRandomString(5);
	String brojProtokolaTabela = brojProtokola + "EES";
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_016_1_dodavanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Domaćinstva", "20 - Domaćinstva", null);
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostD();
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokolaTabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_016_1_dodavanje_elektroenergetske_saglasnosti_domacinstva_test" })
	public void px_dist_016_2_brisanje_elektroenergetske_saglasnosti_domacinstva_test() throws Exception {
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
	

}