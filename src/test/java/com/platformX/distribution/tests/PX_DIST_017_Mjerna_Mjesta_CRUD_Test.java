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
	
	@Test
	public void px_dist_017_1_dodavanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
	}

	@Test
	public void px_dist_017_2_uredjivanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		String novoMjernoMjesto = mjernaMjestaPage.urediMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, novoMjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(novoMjernoMjesto, homePage.podatak2Tabela3WE);
	}
	
	@Test
	public void px_dist_017_3_brisanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.pretraziStavku(homePage.filterKolona3WE, mjernoMjesto);
		mjernaMjestaPage.verifikujMjernaMjesta();
		mjernaMjestaPage.verifikujStavku(mjernoMjesto, homePage.podatak2Tabela3WE);
		mjernaMjestaPage.obrisiStavku(true);
		mjernaMjestaPage.verifikujBrisanjeStavke(false, mjernoMjesto);
	}
	
}