package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.OdbaceniUgovori;
import com.platformX.page.PravnaLica;
import com.platformX.page.Ugovori;

public class PX_023_Ugovori_CRUD_PositiveTestCases extends BaseTest {

	public PX_023_Ugovori_CRUD_PositiveTestCases() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_023_1_dodavanje_ugovora_test() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "AMOSA542A", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
	}
	
	@Test
	public void px_023_2_dodavanje_potpisanog_ugovora_test() throws Exception {
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
		ugovoriPage.dodajPotpisanUgovor("36Z0100154X", kupac);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
	}
	
	@Test
	public void px_023_3_uredjivanje_ugovora_test() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "dfsf56456", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.urediUgovor();
	}
	
	@Test (enabled = false)		//	Test je trenutno disabled - promijenili su se uslovi za deaktivaciju ugovora i mogucnost ponovnog kreiranja ugovora sa istim mjernim mjestom
	public void px_023_4_deaktivacija_ugovora_test() throws Exception {
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
		ugovoriPage.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36Z0SK009", true);
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.verifikujBrojNecekiranihKolona(1);
		ugovoriPage.deaktivirajUgovor(null);
		//ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		// ugovoriPage.verifikujBrojNecekranihKolona(3);
	}
	
	@Test						/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "odbaci" odbacuje ugovor i provjerava da se ugovor vise ne pojavljuje na stranici Ugovori vec na stranici Odbaceni ugovori*/
	public void px_023_5_odbacivanje_ugovora_test() throws Exception {
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
		ugovoriPage.dodajPotpisanUgovor("SK009281150R", kupac);
		ugovoriPage.pronadjiUgovorPravnoLice(pravnoLice);
		ugovoriPage.verifikujBrojNecekiranihKolona(0);
		ugovoriPage.odbaciUgovor();
		ugovoriPage.verifikujOdbaceniUgovor(kupac);
		homePage.navigirajNaOdbaceniUgovori();
		OdbaceniUgovori odbaceniUgovoriPage = new OdbaceniUgovori(driver);
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovor("SK009281150R");
	}
	
	@Test (enabled = false)
	public void px_023_6_preregistracija_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovoriPage = homePage.navigirajNaUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36Z0SB00");
		ugovoriPage.otvoriPreregistraciju();
		ugovoriPage.preregistrujUgovor();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.verifikujPreregistrovanUgovor("36Z0SB00", "4100010 - Firma 2, Hajduk Veljkova 1, 78000 Banja Luka");
	}

}