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
//public class PX_DIST_018_Elektroenergetske_Saglasnosti_SN_CRUD_Test extends BaseTest {
//
//	public PX_DIST_018_Elektroenergetske_Saglasnosti_SN_CRUD_Test() throws IOException, FileNotFoundException {
//		super();
//	}
//
//	String eeSaglasnost = new String();
//	String brojProtokola = "protokolBr.NestandardniPrikljucak" + Helper.getRandomString(5);
//	String brojProtokolaTabela = brojProtokola + "EES";
//	
//	@Test (description = "Kreiranje EES za srednji napon za kategoriju 40 - Potrošnja na naponskom nivou od 1 kV do 35 kV; Indirektna mjerna garnitura", retryAnalyzer = RetryAnalyzer.class)
//	public void px_dist_018_1_dodavanje_elektroenergetske_saglasnosti_srednji_napon_40_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
//		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
//		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Srednji napon", "40 - Potrošnja na naponskom nivou", null);
//		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola);
//		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostSN(40);
////		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
////		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
////		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
////		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokolaTabela, homePage.podatak2Tabela2WE);
//	}
//	
//	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_018_1_dodavanje_elektroenergetske_saglasnosti_srednji_napon_10_test" })
//	public void px_dist_018_1_brisanje_elektroenergetske_saglasnosti_srednji_napon_40_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
//		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
//		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
//		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
//		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokolaTabela, homePage.podatak2Tabela2WE);
//		elektroenergetskeSaglasnosti.obrisiStavku();
//		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
//		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola);
//		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
//	}
//
//	
//}