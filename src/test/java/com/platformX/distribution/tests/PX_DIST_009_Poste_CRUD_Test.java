package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poste;
import com.platformX.util.Helper;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_009_Poste_CRUD_Test extends BaseTest {

	public PX_DIST_009_Poste_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String[] podaci = new String[3];
	String novaPosta = "NovaPosta " + Helper.getRandomString(5);

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_009_1_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.dodajPostu(podaci);
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
	}
	
	@Test (description= "Pokušaj dodavanja poste sa istim ID-em", retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_009_1_dodavanje_poste_test" })
	public void px_dist_009_2_neuspjesno_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		poste.dodajPostuSaPodacima(podaci[0], podaci[1], podaci[2]);
		poste.verifikujPoruku("Pošta već postoji za dati ID.");
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_009_1_dodavanje_poste_test" })
	public void px_dist_009_3_uredjivanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		poste.urediPostu(novaPosta);
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_009_3_uredjivanje_poste_test" })
	public void px_dist_009_4_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje je uspješno završeno");
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPraznuTabelu();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_009_5_neuspjesno_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage(Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, "Zagreb");			// promijenjeno sa Novi Beograd na Zagreb
		poste.verifikujPoste();
		poste.verifikujStavku("10000", homePage.podatak2Tabela1WE);			// promijenjeno sa 11070 na 10000
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}