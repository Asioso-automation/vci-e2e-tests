package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class PX_046_Neuspjesno_Dodavanje_Ugovora_Test4 extends BaseTest {

	public PX_046_Neuspjesno_Dodavanje_Ugovora_Test4() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description= "Pokušaj dodavanja ugovora bez reaktivnog brojila")
	public void px_046_nesupjesno_dodavanje_ugovora_test4() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36066699C", false);
		ugovoriPage.verifikujPorukuForme("Reaktivno brojilo ne smije biti prazno za odabranu tarifnu grupu.");
	}

}