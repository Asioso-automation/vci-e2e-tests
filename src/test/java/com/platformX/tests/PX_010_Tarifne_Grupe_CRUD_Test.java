package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.TarifneGrupe;
import com.platformX.util.Helper;
import com.platformX.page.LogIn;

public class PX_010_Tarifne_Grupe_CRUD_Test extends BaseTest {

	public PX_010_Tarifne_Grupe_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String tarifnaGrupa = "TG " + Helper.getRandomString(5);
	String novaTarifnaGrupa = "NovaTG " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_010_1_dodavanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage("PX", TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.dodajTarifnuGrupu(tarifnaGrupa);
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, tarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(tarifnaGrupa, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_010_1_dodavanje_tarifne_grupe_test" })
	public void px_010_2_uredjivanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage("PX", TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
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
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_010_2_uredjivanje_tarifne_grupe_test" })
	public void px_010_3_brisanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigateOnPage("PX", TarifneGrupe.class, "Tarifni sistem", "Tarifne grupe");
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujStavku(novaTarifnaGrupa, homePage.podatak2Tabela2WE);
		tarifneGrupe.obrisiStavku();
		tarifneGrupe.verifikujPoruku("Brisanje je uspješno završeno.");
		tarifneGrupe.pretraziStavku(homePage.filterKolona2WE, novaTarifnaGrupa);
		tarifneGrupe.verifikujPraznuTabelu();
	}

}