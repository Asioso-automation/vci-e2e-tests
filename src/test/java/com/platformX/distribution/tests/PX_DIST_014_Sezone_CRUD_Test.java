package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Sezone;
import com.platformX.util.Helper;

public class PX_DIST_014_Sezone_CRUD_Test extends BaseTest {

	public PX_DIST_014_Sezone_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String sezona = "Sezona " + Helper.getRandomString(5);
	String novaSezona = "NovaSezona " + Helper.getRandomString(5);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_014_1_dodavanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		sezone.dodajSezonu(sezona);
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, sezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(sezona, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_014_1_dodavanje_sezone_test" })
	public void px_dist_014_2_uredjivanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		sezone.pretraziStavku(homePage.filterKolona2WE, sezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(sezona, homePage.podatak2Tabela2WE);
		sezone.urediSezonu(novaSezona);
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, novaSezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(novaSezona, homePage.podatak2Tabela2WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_014_2_uredjivanje_sezone_test" })
	public void px_dist_014_3_brisanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		sezone.pretraziStavku(homePage.filterKolona2WE, novaSezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(novaSezona, homePage.podatak2Tabela2WE);
		sezone.obrisiStavku();
		sezone.verifikujPoruku("Brisanje je uspješno završeno");
		sezone.pretraziStavku(homePage.filterKolona2WE, novaSezona);
		sezone.verifikujPraznuTabelu();
	}

}