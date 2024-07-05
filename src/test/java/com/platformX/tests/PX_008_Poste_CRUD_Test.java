package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Poste;
import com.platformX.util.Helper;
import com.platformX.page.LogIn;

public class PX_008_Poste_CRUD_Test extends BaseTest {

	public PX_008_Poste_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	String[] podaci = new String[3];
	String novaPosta = "NovaPosta " + Helper.getRandomString(5);
	String[] podaci1 = new String[3];

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void px_008_1_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.dodajPostu(podaci);
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
//		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);		
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
	}
	
	@Test(description= "Pokušaj dodavanja poste sa istim ID-em")
	public void px_008_2_neuspjesno_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.dodajPostu(podaci1);
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, podaci1[0]);
		poste.verifikujPoste();
//		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);		
		poste.verifikujPostu(podaci1[0], podaci1[1], podaci1[2]);
		poste.dodajPostuSaPodacima(podaci1[0], podaci1[1], podaci1[2]);
		poste.verifikujPoruku("Pošta sa ovim brojem već postoji.");
	}
	
	@Test(description= "Pokušaj dodavanja poste sa istim ID-em", retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_008_1_dodavanje_poste_test" })
	public void px_008_3_uredjivanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, podaci[0]);
		poste.verifikujPoste();
//		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);		
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		poste.urediPostu(novaPosta);
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPoste();
//		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);		
		poste.verifikujPostu(novaPosta, podaci[1], podaci[2]);
	}
	
	@Test(description= "Pokušaj dodavanja poste sa istim ID-em", retryAnalyzer = RetryAnalyzer.class, dependsOnMethods = { "px_008_3_uredjivanje_poste_test" })
	public void px_008_4_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPoste();
//		poste.verifikujStavku(podaci[1], homePage.podatak2Tabela1WE);		
		poste.verifikujPostu(novaPosta, podaci[1], podaci[2]);
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje je uspješno završeno.");
		poste.pretraziStavku(homePage.filterKolona2WE, novaPosta);
		poste.verifikujPraznuTabelu();
	}
	
	@Test
	public void px_008_5_neuspjesno_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigateOnPage("PX", Poste.class, "Šifarnici", "Pošte");
		poste.verifikujPoste();
		poste.pretraziStavku(homePage.filterKolona2WE, "Banja Luka");
		poste.verifikujPoste();
		poste.verifikujPostu("Banja Luka", "78000", "");
		poste.obrisiStavku();
		poste.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}