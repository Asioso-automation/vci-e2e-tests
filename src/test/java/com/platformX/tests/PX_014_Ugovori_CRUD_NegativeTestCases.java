package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class PX_014_Ugovori_CRUD_NegativeTestCases extends BaseTest {

	public PX_014_Ugovori_CRUD_NegativeTestCases() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (enabled = false, description= "Ugovor postoji za traženo mjerno mjesto")	// Ne radi lookup "Mjerno mjesto (EIC)"
	public void px_014_1_neuspjesno_dodavanje_ugovora_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1514BASD99", true);
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1514BASD99", true);
		ugovori.verifikujPorukuForme("Ugovor za traženo mjerno mjesto, 1514BASD99 , već postoji u navedenom periodu.");
	}
	
	@Test (enabled = false, description= "Datum početka je prije početka obračunskog perioda")
	public void px_014_2_neuspjesno_dodavanje_ugovora_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.06.2020.", "15.06.2020.", "1514BASD99", true);
		ugovori.verifikujPorukuForme("Početni datum ne smije biti prije početka aktivnog perioda.");
	}
	
	@Test (enabled = false, description = "Obrazac za broj protokola ne postoji")
	public void px_014_3_neuspjesno_dodavanje_ugovora_test3() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36K085053", true);
		ugovori.verifikujPorukuForme("Obrazac za traženi ODS i tarifnu grupu u traženom periodu ne postoji.");
	}
	
	@Test (enabled = false, description= "Pokušaj dodavanja ugovora bez reaktivnog brojila")
	public void px_014_4_neuspjesno_dodavanje_ugovora_test4() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36066699C", false);
		ugovori.verifikujPorukuForme("Reaktivna konstanta za odabranu tarifnu grupu ne smije biti prazna.");
	}
	
	@Test (enabled = false)				/* Test provjerava da je nemoguce deaktivirati ugovor kada se izabere prosli datum za datum deaktivacije (01.01.2020.) i verifikuje validacionu poruku */
	public void px_014_5_neuspjesna_deaktivacija_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPagePX(PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "3PD53B2W", true);
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		ugovori.verifikujBrojNecekiranihKolona(1);
		ugovori.deaktivirajUgovor("01.01.2020.");
	}
	
	@Test (enabled = false)
	public void px_014_6_neuspjesno_odbacivanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();	
		Ugovori ugovori = homePage.navigateOnPagePX(Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPoEic("36ZBLNG");
		ugovori.odbaciUgovor();
		ugovori.verifikujPoruku("Odbacivanje ovog ugovora nije moguće.");
	}

}