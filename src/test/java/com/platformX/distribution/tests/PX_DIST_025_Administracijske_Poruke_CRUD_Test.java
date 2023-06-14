package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_025_Administracijske_Poruke_CRUD_Test  extends BaseTest {

	public PX_DIST_025_Administracijske_Poruke_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;
	
	@Test (description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na listi")
	public void px_dist_025_1_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = homePage.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPoruku("Uspješno završeno.");
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikujPoruke();
		poruke.verifikujStavku(podaci[0], homePage.podatak2Tabela3WE);
	}
	
	@Test (description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na pocetnoj stranici")
	public void px_dist_025_2_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = homePage.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPoruku("Uspješno završeno.");
		homePage.navigirajNaPocetnaStranica();
		homePage.osvjeziStranicu();
		homePage.verifikujPocetnuStranicu();
		poruke.verifikujPorukuPocetna(podaci[0], podaci[1]);
	}
	
//	@Test (description="test kreira, verifikuje i uredjuje ADMINISTRACIJSKU PORUKU")
//	public void px_dist_025_3_uredjivanje_administracijske_poruke_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		Poruke poruke = homePage.navigirajNaPoruke();
//		poruke.verifikujPoruke();
//		poruke.pokupiIdPoruke();
//		podaci = poruke.dodajPoruku();
//		poruke.verifikujPoruku("Uspješno završeno.");
//		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
//		poruke.verifikujPoruke();
//		poruke.verifikujStavku(podaci[0], homePage.podatak2Tabela3WE);
////		TODO dodati metodu za uredjivanje poruke
//	}
	
	@Test (description="test kreira, verifikuje i brise ADMINISTRACIJSKU PORUKU")
	public void px_dist_025_4_brisanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poruke poruke = homePage.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPoruku("Uspješno završeno.");
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikujPoruke();
		poruke.verifikujStavku(podaci[0], homePage.podatak2Tabela3WE);
		poruke.obrisiStavku();
		poruke.verifikujPoruku("Brisanje je uspješno završeno");
		poruke.pretraziStavku(homePage.filterKolona3WE, podaci[0]);
		poruke.verifikujPraznuTabelu();
	}

}