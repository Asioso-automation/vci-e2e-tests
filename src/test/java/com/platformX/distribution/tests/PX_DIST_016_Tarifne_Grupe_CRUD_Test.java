package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneGrupe;
import com.platformX.util.Helper;

public class PX_DIST_016_Tarifne_Grupe_CRUD_Test extends BaseTest{

	public PX_DIST_016_Tarifne_Grupe_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String tarifnaGrupa = "TarifnaGrupa " + Helper.getRandomString(4);
	String novaTarifnaGrupa = "NovaTarifnaGrupa " + Helper.getRandomString(4);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_016_1_dodavanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage(TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.dodajTarifnuGrupu(tarifnaGrupa);
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE); 
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_016_1_dodavanje_tarifne_grupe_test" })
	public void px_dist_016_2_uredjivanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage(TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE); 
		tarifneGrupe.urediTarifnuGrupu(novaTarifnaGrupa);
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(novaTarifnaGrupa, homePage.podatak2Tabela2WE); 
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_016_2_uredjivanje_tarifne_grupe_test" })
	public void px_dist_016_3_brisanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage(TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(novaTarifnaGrupa, homePage.podatak2Tabela2WE);
		tarifneGrupe.obrisiStavku();
		tarifneGrupe.verifikujPoruku("Brisanje je uspješno završeno");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujPraznuTabelu();
	}

}