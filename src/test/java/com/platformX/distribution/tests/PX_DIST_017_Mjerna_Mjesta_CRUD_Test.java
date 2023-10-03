package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_017_Mjerna_Mjesta_CRUD_Test  extends BaseTest {

	public PX_DIST_017_Mjerna_Mjesta_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (enabled = false)
	public void px_dist_017_1_dodavanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
	}

	@Test (enabled = false)
	public void px_dist_017_2_uredjivanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		String novoMjernoMjesto = mjernaMjesta.urediMjernoMjesto();
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, novoMjernoMjesto);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(novoMjernoMjesto, homePage.podatak2Tabela3WE);
	}
	
	@Test (enabled = false)
	public void px_dist_017_3_brisanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = homePage.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjesta.dodajMjernoMjesto();
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		mjernaMjesta.obrisiStavku();
		mjernaMjesta.verifikujPoruku("Brisanje je uspješno završeno");
		mjernaMjesta.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjesta.verifikujPraznuTabelu();
	}
	
}