package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneNadgrupe;

public class PX_DIST_015_Tarifne_Nadgrupe_CRUD_Test extends BaseTest{

	public PX_DIST_015_Tarifne_Nadgrupe_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_015_1_dodavanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
	    PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
	    homePage.verifikujPocetnuStranicu();
	    TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
	    tarifneNadgrupe.verifikujTarifneNadgrupe();
	    String tarifnaNadgrupa = tarifneNadgrupe.dodajTarifnuNadrgupu();
	    tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
	    tarifneNadgrupe.verifikujTarifneNadgrupe();
	    tarifneNadgrupe.verifikujStavku(tarifnaNadgrupa, homePage.podatak2Tabela2WE); 
	  }
	
	@Test
	public void px_dist_015_2_uredjivanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		String tarifnaNadgrupa = tarifneNadgrupe.dodajTarifnuNadrgupu();
		tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
	    tarifneNadgrupe.verifikujTarifneNadgrupe();
	    tarifneNadgrupe.verifikujStavku(tarifnaNadgrupa, homePage.podatak2Tabela2WE); 
		String novaTarifnaNadgrupa = tarifneNadgrupe.urediTarifnuNadgrupu();
		tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaNadgrupa);
	    tarifneNadgrupe.verifikujTarifneNadgrupe();
	    tarifneNadgrupe.verifikujStavku(novaTarifnaNadgrupa, homePage.podatak2Tabela2WE); 
	}
	
	@Test
	public void px_dist_015_3_brisanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		String tarifnaNadgrupa = tarifneNadgrupe.dodajTarifnuNadrgupu();
		tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
	    tarifneNadgrupe.verifikujTarifneNadgrupe();
	    tarifneNadgrupe.verifikujStavku(tarifnaNadgrupa, homePage.podatak2Tabela2WE); 
		tarifneNadgrupe.obrisiStavku();
		tarifneNadgrupe.verifikujPoruku("Brisanje je uspješno završeno");
		tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
		tarifneNadgrupe.verifikujPraznuTabelu();
	}

}