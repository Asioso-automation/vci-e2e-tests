package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Poste;
import com.platformX.page.LogIn;

public class PX_008_Poste_CRUD_Test extends BaseTest {

	public PX_008_Poste_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;

	@Test
	public void px_008_1_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
	}
	
	@Test (description= "Pokušaj dodavanja poste sa istim ID-em")
	public void px_008_2_neuspjesno_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		poste.dodajPostuSaPodacima(podaci[0], podaci[1], podaci[2]);
		poste.verifikujPoruku("Pošta sa ovim brojem već postoji.");
	}
	
	@Test
	public void px_008_3_uredjivanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		String novaPosta = poste.urediPostu();
		poste.verifikujPostu(novaPosta, podaci[1], podaci[2]);
	}
	
	@Test
	public void px_008_4_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		homePage.obrisiStavku(true);
		poste.verifikujBrisanjePoste(podaci[0]);
	}
	
	public void px_008_5_neuspjesno_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		poste.verifikujPostu("Banja Luka", "78000", "");
		homePage.obrisiStavku(false);
		poste.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}