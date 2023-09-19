package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.OperativnaPodrucja;

public class PX_006_Operativna_Podrucja_CRUD_Test extends BaseTest {

	public PX_006_Operativna_Podrucja_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_006_1_dodavanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigirajNaOperativnaPodrucja();
		operativnaPodrucja.verifikujOperativnaPodrucja();
		String podrucje = operativnaPodrucja.dodajOperativnoPodrucje();
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, podrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(podrucje, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_006_2_uredjivanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigirajNaOperativnaPodrucja();
		operativnaPodrucja.verifikujOperativnaPodrucja();
		String podrucje = operativnaPodrucja.dodajOperativnoPodrucje();
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, podrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(podrucje, homePage.podatak2Tabela2WE);
		String novoPodrucje = operativnaPodrucja.urediOperativnoPodrucje();
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, novoPodrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(novoPodrucje, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_006_3_brisanje_operativnog_podrucja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		OperativnaPodrucja operativnaPodrucja = homePage.navigirajNaOperativnaPodrucja();
		operativnaPodrucja.verifikujOperativnaPodrucja();
		String podrucje = operativnaPodrucja.dodajOperativnoPodrucje();
		operativnaPodrucja.verifikujPoruku("Uspješno završeno.");
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, podrucje);
		operativnaPodrucja.verifikujOperativnaPodrucja();
		operativnaPodrucja.verifikujStavku(podrucje, homePage.podatak2Tabela2WE);
		operativnaPodrucja.obrisiStavku();
		operativnaPodrucja.verifikujPoruku("Brisanje je uspješno završeno.");
		operativnaPodrucja.pretraziStavku(homePage.filterKolona2WE, podrucje);
		operativnaPodrucja.verifikujPraznuTabelu();
	}

}