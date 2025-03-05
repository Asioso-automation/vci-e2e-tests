package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneNadgrupe;
import com.platformX.util.Helper;

public class PX_DIST_013_Tarifne_Nadgrupe_CRUD_Test extends BaseTest{

	public PX_DIST_013_Tarifne_Nadgrupe_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String tarifnaNadgrupa = "TarifnaNadgrupa " + Helper.getRandomString(4);
	String novaTarifnaNadgrupa = "NovaTNadgrupa " + Helper.getRandomString(4);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_013_1_dodavanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
	    PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
	    homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = new TarifneNadgrupe(driver);
	    tarifneNadgrupe.navigirajVerifikujTarifneNadgrupe();
	    tarifneNadgrupe.dodajTarifnuNadrgupu(tarifnaNadgrupa);
	    tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
	    tarifneNadgrupe.verifikacijaStranice("Tarifni sistem", "Tarifne Nadgrupe", "Tarifne nadgrupe", 1, tarifneNadgrupe.columns, tarifneNadgrupe.buttons);
	    tarifneNadgrupe.verifikujStavku(tarifnaNadgrupa, homePage.podatak2Tabela2WE); 
	  }
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_013_1_dodavanje_tarifne_nadgrupe_test" })
	public void px_dist_013_2_uredjivanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = new TarifneNadgrupe(driver);
		tarifneNadgrupe.navigirajVerifikujTarifneNadgrupe();
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaNadgrupa);
	    tarifneNadgrupe.verifikacijaStranice("Tarifni sistem", "Tarifne Nadgrupe", "Tarifne nadgrupe", 1, tarifneNadgrupe.columns, tarifneNadgrupe.buttons);
	    tarifneNadgrupe.verifikujStavku(tarifnaNadgrupa, homePage.podatak2Tabela2WE); 
		tarifneNadgrupe.urediTarifnuNadgrupu(novaTarifnaNadgrupa);
		tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaNadgrupa);
	    tarifneNadgrupe.verifikacijaStranice("Tarifni sistem", "Tarifne Nadgrupe", "Tarifne nadgrupe", 1, tarifneNadgrupe.columns, tarifneNadgrupe.buttons);
	    tarifneNadgrupe.verifikujStavku(novaTarifnaNadgrupa, homePage.podatak2Tabela2WE); 
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_013_2_uredjivanje_tarifne_nadgrupe_test" })
	public void px_dist_013_3_brisanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = new TarifneNadgrupe(driver);
		tarifneNadgrupe.navigirajVerifikujTarifneNadgrupe();
	    tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaNadgrupa);
	    tarifneNadgrupe.verifikacijaStranice("Tarifni sistem", "Tarifne Nadgrupe", "Tarifne nadgrupe", 1, tarifneNadgrupe.columns, tarifneNadgrupe.buttons);
	    tarifneNadgrupe.verifikujStavku(novaTarifnaNadgrupa, homePage.podatak2Tabela2WE); 
		tarifneNadgrupe.obrisiStavku();
		tarifneNadgrupe.verifikujPoruku("Brisanje je uspješno završeno");
		tarifneNadgrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaNadgrupa);
		tarifneNadgrupe.verifikujPraznuTabelu();
	}

}