package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class PX_044_Neuspjesno_Dodavanje_Ugovora_Test2 extends BaseTest {

	public PX_044_Neuspjesno_Dodavanje_Ugovora_Test2() throws IOException, FileNotFoundException {
		super();
	}

	// Datum pocetka je prije pocetka obracunskog perioda
	
	@Test
	public void px_044_nesupjesno_dodavanje_ugovora_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		PravnaLica pravnaLicaPage = homePage.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnoLice = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnaLica();
		pravnaLicaPage.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLicaPage.kreirajKupca();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.06.2020.", "15.06.2020.", "1514BASD99", true);
		ugovoriPage.verifikujPorukuForme("Početni datum ne smije biti prije početka aktivnog perioda.");
	}

}