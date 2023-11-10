package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.Bonifikacije;
import scp.page.Kalorimetri;
import scp.page.Korektori;
import scp.page.Kupci;
import scp.page.LogIn;
import scp.page.Mjerila;
import scp.page.PocetnaStranica;
import scp.page.Prostori;
import scp.page.Vodomjeri;


public class SCP_007_Sekcija_Kupci_Test extends BaseTest{

	public SCP_007_Sekcija_Kupci_Test() throws IOException, FileNotFoundException {
		super();
	}

	
	@Test (description=" test kreira FIZICKO LICE iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_fizickog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira PRAVNO LICE iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_pravnog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String pravnoLice = kupci.dodajPravnoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, pravnoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(pravnoLice, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira PROSTOR iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_prostora_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		String prostor = prostori.dodajProstori();
		prostori.verifikujPoruku("Uspješno završeno.");
		prostori.pretraziStavku(pocetna.filterKolona3WE, prostor);
		prostori.verifikujProstore();
		prostori.verifikujStavku(prostor, pocetna.podatak3TabelaWE);
	}
	
	@Test (description=" test kreira MJERILO iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_mjerila_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerila();
		String mjerilo = mjerila.dodajMjerila();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona4WE, mjerilo);
		mjerila.verifikujMjerila();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak4TabelaWE);
	}
	
	@Test (description=" test kreira VODOMJER iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_vodomjera_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodIsWE);
		pocetna.verifikujPocetnuStranicu();
		Vodomjeri vodomjeri = pocetna.navigirajNaVodomjere();
		vodomjeri.verifikujVodomjere();
		String vodomjer = vodomjeri.dodajVodomjere();
		vodomjeri.verifikujPoruku("Uspješno završeno.");
		vodomjeri.pretraziStavku(pocetna.filterKolona4WE, vodomjer);
		vodomjeri.verifikujVodomjere();
		vodomjeri.verifikujStavku(vodomjer, pocetna.podatak4TabelaWE);
	}
	
	@Test (description=" test kreira KALORIMETAR iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_kalorimetra_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		Kalorimetri kalorimetri = pocetna.navigirajNaKalorimetre();
		kalorimetri.verifikujKalorimetre();
		String kalorimetar = kalorimetri.dodajKalorimetre();
		kalorimetri.verifikujPoruku("Uspješno završeno.");
		kalorimetri.pretraziStavku(pocetna.filterKolona4WE, kalorimetar);
		kalorimetri.verifikujKalorimetre();
		kalorimetri.verifikujStavku(kalorimetar, pocetna.podatak4TabelaWE);
	}
	
	
	@Test (description=" test kreira KOREKTOR iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_korektora_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Korektori korektori = pocetna.navigirajNaKorektore();
		korektori.verifikujKorektore();
		String korektor = korektori.dodajKorektore();
		korektori.verifikujPoruku("Uspješno završeno.");
		korektori.pretraziStavku(pocetna.filterKolona2WE, korektor);
		korektori.verifikujKorektore();
		korektori.verifikujStavku(korektor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira BONIFIKACIJU iz sekcije KUPCI i verifikuje ga")
	public void scp_007_dodavanje_bonifikacije_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Bonifikacije bonifikacije = pocetna.navigirajNaBonifikacije();
		bonifikacije.verifikujBonifikacije();
		String bonifikacija = bonifikacije.dodajBonifikacije();
		bonifikacije.verifikujPoruku("Uspješno završeno.");
		bonifikacije.pretraziStavku(pocetna.filterKolona8WE, bonifikacija);
		bonifikacije.verifikujBonifikacije();
		bonifikacije.verifikujStavku(bonifikacija, pocetna.podatak8TabelaWE);
	}
	
}
