package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneGrupe;

public class PX_DIST_016_Tarifne_Grupe_CRUD_Test extends BaseTest{

	public PX_DIST_016_Tarifne_Grupe_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_016_1_dodavanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_016_2_uredjivanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE); 
		String novaTarifnaGrupa = tarifneGrupe.urediTarifnuGrupu();
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(novaTarifnaGrupa, homePage.podatak2Tabela2WE); 
	}

	@Test
	public void px_dist_016_3_brisanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE); 
        tarifneGrupe.obrisiStavku(true);
        tarifneGrupe.verifikujBrisanjeStavke(true, tarifnaGrupa);
	}

}