package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PravnaLica;
import com.platformX.page.LogIn;
import com.platformX.page.OdbaceniUgovori;
import com.platformX.page.Ugovori;

public class PX_054_Odbacivanje_Ugovora_Test extends BaseTest {

	public PX_054_Odbacivanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "odbaci" odbacuje ugovor
	 i provjerava da se ugovor vise ne pojavljuje na stranici Ugovori vec na stranici Odbaceni ugovori*/

	@Test
	public void px_054_odbacivanje_ugovora_test() throws Exception {
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
		ugovoriPage.dodajPotpisanUgovor("SK009281150R", kupac);
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.verifikujBrojNecekiranihKolona(1);
		ugovoriPage.odbaciUgovor();
		ugovoriPage.verifikujOdbaceniUgovor(kupac);
		homePage.navigirajNaOdbaceniUgovori();
		OdbaceniUgovori odbaceniUgovoriPage = new OdbaceniUgovori(driver);
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovor("SK009281150R");
	}

}