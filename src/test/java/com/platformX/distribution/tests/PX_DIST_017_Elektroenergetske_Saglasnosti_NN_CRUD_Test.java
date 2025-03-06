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
	String brojProtokola1 = "protokolBr.10_" + Helper.getRandomString(5);
	String brojProtokola1Tabela = brojProtokola1 + "EES";
	String brojProtokola2 = "protokolBr.20_" + Helper.getRandomString(5);
	String brojProtokola2Tabela = brojProtokola2 + "EES";
	String brojProtokola3 = "protokolBr.30_" + Helper.getRandomString(5);
	String brojProtokola3Tabela = brojProtokola3 + "EES";
	String brojProtokola23 = "protokolBr.2030_" + Helper.getRandomString(5);
	String brojProtokola23Tabela = brojProtokola23 + "EES";


	@Test (description = "Kreiranje EES za niski napon za kategoriju 10 - Javna rasvjeta; Direktna mjerna garnitura", retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_10_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "10 - Javna rasvjeta", null);
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola1);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(10);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola1);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola1Tabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (description = "Kreiranje EES za niski napon za kategoriju 20 - Domaćinstva; Direktna brojila", retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_20_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "20 - Domaćinstva", null);
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola2);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(20);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola2Tabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (description = "Kreiranje EES za niski napon za kategoriju 30 - Ostala potrošnja na niskom naponu; Direktna mjerna garnitura", retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_30_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "30 - Ostala potrošnja na niskom naponu", null);
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola3);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(30);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola3);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola3Tabela, homePage.podatak2Tabela2WE);
	}
	
	@Test (description = "Kreiranje EES za niski napon za kategorije 20 - Domaćinstva i 30 - Ostala potrošnja na niskom naponu; Direktna mjerna garnitura", retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_20_30_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.dodajOdaberiTipEES("Niski napon", "20 - Domaćinstva", "30 - Ostala potrošnja na niskom naponu");
		elektroenergetskeSaglasnosti.popuniZajednickaPoljaEES(brojProtokola23);
		elektroenergetskeSaglasnosti.dodajElektronergetskuSaglasnostNN(2030);
		elektroenergetskeSaglasnosti.verifikujPoruku("Uspješno završeno.");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola23);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola23Tabela, homePage.podatak2Tabela2WE);
	}

	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_10_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niski_napon_10_test() throws Exception {
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
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola1);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_20_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niski_napon_20_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola2Tabela, homePage.podatak2Tabela2WE);
		elektroenergetskeSaglasnosti.obrisiStavku();
		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola2);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_30_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niski_napon_30_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola3);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola3Tabela, homePage.podatak2Tabela2WE);
		elektroenergetskeSaglasnosti.obrisiStavku();
		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola3);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_elektroenergetske_saglasnosti_niski_napon_20_30_test" })
	public void px_dist_017_2_brisanje_elektroenergetske_saglasnosti_niski_napon_20_30_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = new ElektroenergetskeSaglasnosti(driver);
		elektroenergetskeSaglasnosti.navigirajVerifikujElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola23);
		elektroenergetskeSaglasnosti.verifikacijaStranice("Mjerna mjesta", "Elektroenergetske Saglasnosti", "Elektroenergetske saglasnosti", 1, elektroenergetskeSaglasnosti.columns, elektroenergetskeSaglasnosti.buttons);
		elektroenergetskeSaglasnosti.verifikujStavku(brojProtokola23Tabela, homePage.podatak2Tabela2WE);
		elektroenergetskeSaglasnosti.obrisiStavku();
		elektroenergetskeSaglasnosti.verifikujPoruku("Brisanje je uspješno završeno");
		elektroenergetskeSaglasnosti.pretraziStavku(homePage.filterKolona2WE, brojProtokola23);
		elektroenergetskeSaglasnosti.verifikujPraznuTabelu();
	}

	
}