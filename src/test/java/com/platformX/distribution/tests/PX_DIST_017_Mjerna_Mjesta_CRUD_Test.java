package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.ObracunskaMjernaMjesta;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.util.Helper;

public class PX_DIST_017_Mjerna_Mjesta_CRUD_Test  extends BaseTest {

	public PX_DIST_017_Mjerna_Mjesta_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String sifraMjernogMjesta = Helper.getRandomNumber(6);
	String novaSifraMjernogMjesta = Helper.getRandomNumber(6);
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void px_dist_017_1_dodavanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskaMjernaMjesta mjernaMjesta = homePage.navigateOnPage(ObracunskaMjernaMjesta.class, "Mjerna mjesta", "Obračunska mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.dodajMjernoMjesto(sifraMjernogMjesta);
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona4WE, sifraMjernogMjesta);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(sifraMjernogMjesta, homePage.podatak2Tabela4WE);
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_1_dodavanje_mjernog_mjesta_test" })
	public void px_dist_017_2_uredjivanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskaMjernaMjesta mjernaMjesta = homePage.navigateOnPage(ObracunskaMjernaMjesta.class, "Mjerna mjesta", "Obračunska mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.pretraziStavku(homePage.filterKolona4WE, sifraMjernogMjesta);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(sifraMjernogMjesta, homePage.podatak2Tabela4WE);
		mjernaMjesta.urediMjernoMjesto(novaSifraMjernogMjesta);
		mjernaMjesta.verifikujPoruku("Uspješno završeno.");
		mjernaMjesta.pretraziStavku(homePage.filterKolona4WE, novaSifraMjernogMjesta);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(novaSifraMjernogMjesta, homePage.podatak2Tabela4WE);
	}
	
	@Test (retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_dist_017_2_uredjivanje_mjernog_mjesta_test" })
	public void px_dist_017_3_brisanje_mjernog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		ObracunskaMjernaMjesta mjernaMjesta = homePage.navigateOnPage(ObracunskaMjernaMjesta.class, "Mjerna mjesta", "Obračunska mjerna mjesta");
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.pretraziStavku(homePage.filterKolona4WE, novaSifraMjernogMjesta);
		mjernaMjesta.verifikujMjernaMjesta();
		mjernaMjesta.verifikujStavku(novaSifraMjernogMjesta, homePage.podatak2Tabela4WE);
		mjernaMjesta.obrisiStavku();
		mjernaMjesta.verifikujPoruku("Brisanje je uspješno završeno");
		mjernaMjesta.pretraziStavku(homePage.filterKolona4WE, novaSifraMjernogMjesta);
		mjernaMjesta.verifikujPraznuTabelu();
	}
	
}