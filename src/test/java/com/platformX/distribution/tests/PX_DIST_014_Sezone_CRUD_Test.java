package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Sezone;

public class PX_DIST_014_Sezone_CRUD_Test extends BaseTest {

	public PX_DIST_014_Sezone_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_014_1_dodavanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		String sezona = sezone.dodajSezonu();
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, sezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(sezona, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_014_2_uredjivanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		String sezona = sezone.dodajSezonu();
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, sezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(sezona, homePage.podatak2Tabela2WE);
		String novaSezona = sezone.urediSezonu();
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, novaSezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(novaSezona, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_014_3_brisanje_sezone_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		String sezona = sezone.dodajSezonu();
		sezone.verifikujPoruku("Uspješno završeno.");
		sezone.pretraziStavku(homePage.filterKolona2WE, sezona);
		sezone.verifikujSezone();
		sezone.verifikujStavku(sezona, homePage.podatak2Tabela2WE);
		sezone.obrisiStavku(true);
		sezone.verifikujBrisanjeStavke(true, sezona);
	}

}