package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class PX_043_Neuspjesno_Dodavanje_Ugovora_Test1 extends BaseTest {

	public PX_043_Neuspjesno_Dodavanje_Ugovora_Test1() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description= "Ugovor postoji za traženo mjerno mjesto")
	public void px_043_neuspjesno_dodavanje_ugovora_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLicaPage.kreirajKupca();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1514BASD99", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "1514BASD99", true);
		ugovoriPage.verifikujPorukuForme("već postoji u navedenom periodu.");
	}

}