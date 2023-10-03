package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poste;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_009_Poste_CRUD_Test extends BaseTest {

	public PX_DIST_009_Poste_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;

	@Test
	public void px_dist_009_1_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
	}
	
	@Test (description= "Pokušaj dodavanja poste sa istim ID-em")
	public void px_dist_009_2_neuspjesno_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		poste.dodajPostuSaPodacima(podaci[0], podaci[1], podaci[2]);
		poste.verifikujPoruku("Pošta već postoji za dati ID.");
	}

	@Test
	public void px_dist_009_3_uredjivanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		String novaPosta = poste.urediPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
	}
	
	@Test
	public void px_dist_009_4_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje je uspješno završeno");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPraznuTabelu();
	}

	@Test
	public void px_dist_009_5_neuspjesno_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, "Novi Beograd");
		poste.verifikujPoste();
		poste.verifikujStavku("11070", homePage.podatak2Tabela1WE);
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}