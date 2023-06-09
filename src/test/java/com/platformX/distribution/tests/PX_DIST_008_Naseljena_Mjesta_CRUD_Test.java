package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.NaseljenaMjesta;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_008_Naseljena_Mjesta_CRUD_Test extends BaseTest{

	public PX_DIST_008_Naseljena_Mjesta_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_008_1_dodavanje_naseljenog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljenaMjesta = homePage.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		String naseljenoMjesto = naseljenaMjesta.dodajNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.pretraziStavku(homePage.filterKolona2WE, naseljenoMjesto);
		naseljenaMjesta.verifikujNaseljenaMjesta();
		naseljenaMjesta.verifikujStavku(naseljenoMjesto, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_008_2_uredjivanje_naseljenog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljenaMjesta = homePage.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		String naseljenoMjesto = naseljenaMjesta.dodajNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.pretraziStavku(homePage.filterKolona2WE, naseljenoMjesto);
		naseljenaMjesta.verifikujNaseljenaMjesta();
		naseljenaMjesta.verifikujStavku(naseljenoMjesto, homePage.podatak2Tabela2WE);
		String novoNaseljenoMjesto = naseljenaMjesta.urediNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.pretraziStavku(homePage.filterKolona2WE, novoNaseljenoMjesto);
		naseljenaMjesta.verifikujNaseljenaMjesta();
		naseljenaMjesta.verifikujStavku(novoNaseljenoMjesto, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_008_3_brisanje_naseljenog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljenaMjesta = homePage.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		String naseljenoMjesto = naseljenaMjesta.dodajNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.pretraziStavku(homePage.filterKolona2WE, naseljenoMjesto);
		naseljenaMjesta.verifikujNaseljenaMjesta();
		naseljenaMjesta.verifikujStavku(naseljenoMjesto, homePage.podatak2Tabela2WE);
		naseljenaMjesta.obrisiStavku(true);
		naseljenaMjesta.verifikujBrisanjeStavke(true, naseljenoMjesto);
	}

}