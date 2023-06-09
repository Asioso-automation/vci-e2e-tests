package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Monteri;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_011_Monteri_CRUD_Test extends BaseTest {

	public PX_DIST_011_Monteri_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_011_1_dodavanje_montera_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Monteri monteri = homePage.navigirajNaMonteri();
		monteri.verifikujMonteri();
		String monter = monteri.dodajMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.pretraziStavku(homePage.filterKolona2WE, monter);
		monteri.verifikujMonteri();
		monteri.verifikujStavku(monter, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_011_2_uredjivanje_montera_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Monteri monteri = homePage.navigirajNaMonteri();
		monteri.verifikujMonteri();
		String monter = monteri.dodajMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.pretraziStavku(homePage.filterKolona2WE, monter);
		monteri.verifikujMonteri();
		monteri.verifikujStavku(monter, homePage.podatak2Tabela2WE);
		String noviMonter = monteri.urediMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.pretraziStavku(homePage.filterKolona2WE, noviMonter);
		monteri.verifikujMonteri();
		monteri.verifikujStavku(noviMonter, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_011_3_brisanje_montera_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Monteri monteri = homePage.navigirajNaMonteri();
		monteri.verifikujMonteri();
		String monter = monteri.dodajMontera();
		monteri.verifikujPoruku("Uspješno završeno.");
		monteri.pretraziStavku(homePage.filterKolona2WE, monter);
		monteri.verifikujMonteri();
		monteri.verifikujStavku(monter, homePage.podatak2Tabela2WE);
		monteri.obrisiStavku(true);
		monteri.verifikujBrisanjeStavke(true, monter);
	}
	
}