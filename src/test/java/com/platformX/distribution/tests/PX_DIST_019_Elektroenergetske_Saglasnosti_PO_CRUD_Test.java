//package com.platformX.distribution.tests;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.testng.annotations.Test;
//
//import com.platformX.base.BaseTest;
//import com.platformX.base.RetryAnalyzer;
//import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
//import com.platformX.distribution.page.LogIn;
//import com.platformX.distribution.page.PocetnaStranicaPXD;
//import com.platformX.util.Helper;
//
//public class PX_DIST_019_Elektroenergetske_Saglasnosti_PO_CRUD_Test extends BaseTest {
//
//	public PX_DIST_019_Elektroenergetske_Saglasnosti_PO_CRUD_Test() throws IOException, FileNotFoundException {
//		super();
//	}
//	
////	CRUD testovi za elektroenergetske saglasnosti tip EES 4 - Privremeni objekti
//	
//	String eeSaglasnost = new String();
//	String brojProtokola2 = "protokolBr.20_" + Helper.getRandomString(5);
//	String brojProtokola2Tabela = brojProtokola2 + "EES";
//	String brojProtokola3 = "protokolBr.30_" + Helper.getRandomString(5);
//	String brojProtokola3Tabela = brojProtokola3 + "EES";
//	
//	@Test (description = "Kreiranje EES za preivremene objekte za kategoriju 20 - Domaćinstva; Direktna brojila", retryAnalyzer = RetryAnalyzer.class)
//	public void px_dist_019_1_dodavanje_elektroenergetske_saglasnosti_privremeni_objekti_20_test1() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
//		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
//		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Privremeni objekti", "20 - Domaćinstva", null);
////		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola2);
//		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostPO(brojProtokola2);
//		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
//		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
//		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
//		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola2Tabela, homePage.podatak2Tabela2WE);
//	}
//	
////	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_018_1_dodavanje_elektroenergetske_saglasnosti_srednji_napon_40_test1" })
////	public void px_dist_018_1_brisanje_elektroenergetske_saglasnosti_srednji_napon_40_test2() throws Exception {
////		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
////		logIn.verifikujLogIn();
////		logIn.logIn();
////		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
////		homePage.verifikujPocetnuStranicu();
////		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
////		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
////		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
////		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
////		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola2Tabela, homePage.podatak2Tabela2WE);
////		elektroenergetskeSaglasnosti.obrisiStavku();
////		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
////		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
////		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
////	}
//	
//}
