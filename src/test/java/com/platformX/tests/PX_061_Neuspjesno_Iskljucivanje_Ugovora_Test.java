package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.Ugovori;
import com.platformX.page.PravnaLica;

public class PX_061_Neuspjesno_Iskljucivanje_Ugovora_Test extends BaseTest {

	public PX_061_Neuspjesno_Iskljucivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_038_neuspjesno_iskljucivanje_ugovora_test() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36Z0S501070Z", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.iskljuciUgovor("15.07.2019.");
		ugovoriPage.provjeraIskljucenostiUgovora("Isključi");
	}

}