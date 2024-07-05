package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.util.Helper;
import com.platformX.page.LogIn;
import com.platformX.page.OperativnaPodrucja;

public class PX_006_Operativna_Podrucja_CRUD_Test extends BaseTest {

	public PX_006_Operativna_Podrucja_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	String operativnoPodrucje = "OP " + Helper.getRandomString(5);
	String novoOperativnoPodrucje = "NovoOP " + Helper.getRandomString(5);
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_006_1_dodavanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigateOnPagePX(OperativnaPodrucja.class, "Šifarnici", "Operativna područja");
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.dodajOperativnoPodrucje(operativnoPodrucje);
		operativnaPodrucja.verifikujPoruku("Uspješno završeno.");
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, operativnoPodrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(operativnoPodrucje, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_006_1_dodavanje_operativnog_podrucja_test" })
	public void px_006_2_uredjivanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigateOnPagePX(OperativnaPodrucja.class, "Šifarnici", "Operativna područja");
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, operativnoPodrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(operativnoPodrucje, homePage.podatak2Tabela2WE);
		operativnaPodrucja.urediOperativnoPodrucje(novoOperativnoPodrucje);
		operativnaPodrucja.verifikujPoruku("Uspješno završeno.");
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, novoOperativnoPodrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(novoOperativnoPodrucje, homePage.podatak2Tabela2WE);
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_006_2_uredjivanje_operativnog_podrucja_test" })
	public void px_006_3_brisanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigateOnPagePX(OperativnaPodrucja.class, "Šifarnici", "Operativna područja");
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, novoOperativnoPodrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(novoOperativnoPodrucje, homePage.podatak2Tabela2WE);
		operativnaPodrucja.obrisiStavku();
		operativnaPodrucja.verifikujPoruku("Brisanje je uspješno završeno.");
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, novoOperativnoPodrucje);
		operativnaPodrucja.verifikujPraznuTabelu();
	}

}