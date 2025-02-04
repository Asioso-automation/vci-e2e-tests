package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_025_Administracijske_Poruke_CRUD_Test  extends BaseTest {

	public PX_DIST_025_Administracijske_Poruke_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
//	private String[] podaci;
	String[] podaci = new String[2];
	String[] podaci1 = new String[2];
	
	@Test (description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na listi", retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_025_1_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = new Poruke(driver);
		poruke.navigirajVerifikujPoruke();
		poruke.dodajPoruku(podaci);
		poruke.verifikujPoruku("Uspješno završeno.");
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikacijaStranice("Administracija", "Poruke", "Poruke", 2, poruke.columns, poruke.buttons);
		poruke.verifikujStavku(podaci[0], homePage.podatak2Tabela3WE);
	}
	
	@Test (enabled=false, description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na pocetnoj stranici")		//na pocetnoj stranici su poruke vidljive nakon klika na button filter
	public void px_dist_025_2_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = new Poruke(driver);
		poruke.navigirajVerifikujPoruke();
		poruke.dodajPoruku(podaci1);
		poruke.verifikujPoruku("Uspješno završeno.");
		homePage.navigirajNaPocetnaStranica();
		homePage.osvjeziStranicu();
		homePage.verifikujPocetnuStranicu();
		poruke.verifikujPorukuPocetna(podaci1[0], podaci1[1]);
	}
	
//	TODO dodati test za uredjivanje administracijske poruke
	
	@Test (description="test kreira, verifikuje i brise ADMINISTRACIJSKU PORUKU", retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_025_1_dodavanje_administracijske_poruke_test" })
	public void px_dist_025_4_brisanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = new Poruke(driver);
		poruke.navigirajVerifikujPoruke();
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikacijaStranice("Administracija", "Poruke", "Poruke", 2, poruke.columns, poruke.buttons);
		poruke.verifikujStavku(podaci[0], homePage.podatak2Tabela3WE);
		poruke.obrisiStavku();
		poruke.verifikujPoruku("Brisanje je uspješno završeno");
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikujPraznuTabelu();
	}

}