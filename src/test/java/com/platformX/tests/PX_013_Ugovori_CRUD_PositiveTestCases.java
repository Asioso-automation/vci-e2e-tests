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

public class PX_013_Ugovori_CRUD_PositiveTestCases extends BaseTest {

	public PX_013_Ugovori_CRUD_PositiveTestCases() throws IOException, FileNotFoundException {
		super();
	}

	@Test (enabled = false)	// Ne radi lookup "Mjerno mjesto (EIC)"
	public void px_013_1_dodavanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "AMOSA542A", true);
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
	}
	
	@Test (enabled = false)
	public void px_013_2_dodavanje_potpisanog_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajPotpisanUgovor("36Z0100154X", kupac);
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
	}
	
	@Test (enabled = false)
	public void px_013_3_uredjivanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "dfsf56456", true);
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		ugovori.urediUgovor();
	}
	
	@Test (enabled = false)		//	Test je trenutno disabled - promijenili su se uslovi za deaktivaciju ugovora i mogucnost ponovnog kreiranja ugovora sa istim mjernim mjestom
	public void px_013_4_deaktivacija_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajUgovor(kupac, "7 - Kategorija cijene 2", "15.07.2020.", "15.07.2020.", "36Z0SK009", true);
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		ugovori.verifikujBrojNecekiranihKolona(1);
		ugovori.deaktivirajUgovor(null);
		//ugovoriPage.verifikujUgovori();
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		// ugovoriPage.verifikujBrojNecekranihKolona(3);
	}
	
	@Test (enabled = false)						/* Test dodaje ugovor koji je potpisan, zatim kroz opciju "odbaci" odbacuje ugovor i provjerava da se ugovor vise ne pojavljuje na stranici Ugovori vec na stranici Odbaceni ugovori*/
	public void px_013_5_odbacivanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		PravnaLica pravnaLica = homePage.navigateOnPage("PX", PravnaLica.class, "Kupci", "Pravna lica");
		pravnaLica.verifikujPravnaLica();
		String pravnoLice = pravnaLica.dodajPravnoLice();
		pravnaLica.verifikujPravnaLica();
		pravnaLica.verifikujPravnoLice(pravnoLice);
		String kupac = pravnaLica.kreirajKupca();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.dodajPotpisanUgovor("SK009281150R", kupac);
		ugovori.pronadjiUgovorPravnoLice(pravnoLice);
		ugovori.verifikujBrojNecekiranihKolona(0);
		ugovori.odbaciUgovor();
		ugovori.verifikujOdbaceniUgovor(kupac);
		homePage.navigateOnPage("PX", OdbaceniUgovori.class, "Kupci", "Odbačeni ugovori");
		OdbaceniUgovori odbaceniUgovoriPage = new OdbaceniUgovori(driver);
		odbaceniUgovoriPage.verifikujOdbaceniUgovori();
		odbaceniUgovoriPage.verifikujOdbaceniUgovor("SK009281150R");
	}
	
	@Test (enabled = false)
	public void px_013_6_preregistracija_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Ugovori ugovori = homePage.navigateOnPage("PX", Ugovori.class, "Kupci", "Ugovori");
		ugovori.verifikujUgovori();
		ugovori.pronadjiUgovorPoEic("36Z0SB00");
		ugovori.otvoriPreregistraciju();
		ugovori.preregistrujUgovor();
		ugovori.verifikujUgovori();
		ugovori.verifikujPreregistrovanUgovor("36Z0SB00", "4100010 - Firma 2, Hajduk Veljkova 1, 78000 Banja Luka");
	}

}