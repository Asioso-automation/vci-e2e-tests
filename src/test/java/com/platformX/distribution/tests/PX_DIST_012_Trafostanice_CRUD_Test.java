package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.CitackiHodovi;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Trafostanice;
import com.platformX.util.Helper;

public class PX_DIST_012_Trafostanice_CRUD_Test extends BaseTest {

	public PX_DIST_012_Trafostanice_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String trafostanica = "Trafostanica " + Helper.getRandomString(4);
	String novaTrafostanica = "NovaTrafostanica " + Helper.getRandomString(4);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_012_1_dodavanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		trafostanice.dodajTrafostanicu(trafostanica);
		trafostanice.verifikujPoruku("Uspješno završeno.");
		trafostanice.pretraziStavku(homePage.filterKolona3WE, trafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(trafostanica, homePage.podatak2Tabela3WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_012_1_dodavanje_trafostanice_test" })
	public void px_dist_012_2_uredjivanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		trafostanice.pretraziStavku(homePage.filterKolona3WE, trafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(trafostanica, homePage.podatak2Tabela3WE);
		trafostanice.urediTrafostanicu(novaTrafostanica);
		trafostanice.verifikujPoruku("Uspješno završeno.");
		trafostanice.pretraziStavku(homePage.filterKolona3WE, novaTrafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(novaTrafostanica, homePage.podatak2Tabela3WE);
	}
		
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_012_2_uredjivanje_trafostanice_test" })
	public void px_dist_012_3_brisanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		trafostanice.pretraziStavku(homePage.filterKolona3WE, novaTrafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(novaTrafostanica, homePage.podatak2Tabela3WE);
		String trafostanicaId = trafostanice.kreirajTrafostanicu();
		CitackiHodovi citackiHodovi = homePage.navigateOnPage(CitackiHodovi.class, "Očitanja", "Čitački hodovi");
		citackiHodovi.verifikujCitackiHodovi();
		citackiHodovi.pretraziStavku(homePage.filterKolona4WE, trafostanicaId);
		citackiHodovi.verifikujCitackiHodovi();
		citackiHodovi.verifikujStavku(trafostanicaId, homePage.podatak2Tabela4WE);
		citackiHodovi.obrisiStavku();
		citackiHodovi.verifikujPoruku("Brisanje je uspješno završeno");
		citackiHodovi.pretraziStavku(homePage.filterKolona4WE, trafostanicaId);
		citackiHodovi.verifikujPraznuTabelu();
		homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		trafostanice.pretraziStavku(homePage.filterKolona3WE, novaTrafostanica);
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku(novaTrafostanica, homePage.podatak2Tabela3WE);
		trafostanice.obrisiStavku();
		trafostanice.verifikujPoruku("Brisanje je uspješno završeno");
		trafostanice.pretraziStavku(homePage.filterKolona3WE, novaTrafostanica);
		trafostanice.verifikujPraznuTabelu();
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_012_4_neuspjesno_brisanje_trafostanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Trafostanice trafostanice = homePage.navigateOnPage(Trafostanice.class, "Šifarnici", "Trafostanice");
		trafostanice.verifikujTrafostanice();
		trafostanice.pretraziStavku(homePage.filterKolona3WE, "ŽTS MOČILA");				// promijenjeno sa 001-Gradac na ŽTS MOČILA
		trafostanice.verifikujTrafostanice();
		trafostanice.verifikujStavku("ŽTS MOČILA", homePage.podatak2Tabela3WE);
		trafostanice.obrisiStavku();
		trafostanice.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}