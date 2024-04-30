package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.Korektori;
import scp.page.LogIn;
import scp.page.Mjerila;
import scp.page.PocetnaStranica;
import scp.page.ProizvodjaciMjerila;
import scp.page.TipoviMjerila;
import scp.page.VrsteMjerila;

public class SCP_008_Sekcija_Mjerila_Test extends BaseTest {

	public SCP_008_Sekcija_Mjerila_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	  @Test (description=" test kreira MJERILO iz sekcije MJERILA i verifikuje ga")
	  public void scp_008_dodavanje_mjerila_test() throws Exception { LogIn logIn =
	  new LogIn(driver, SCP_PROPERTIES); PocetnaStranica pocetna = new
	  PocetnaStranica(driver); driver.manage().window().maximize();
	  logIn.verifikujLogIn(); logIn.logIn(pocetna.orgGasWE);
	  pocetna.verifikujPocetnuStranicu();
	  Mjerila mjerila =	pocetna.navigirajNaMjerila();
	  mjerila.verifikujMjerila();
	  String mjerilo = mjerila.dodajMjerila(); 
	  mjerila.verifikujPoruku("Uspješno završeno.");
	  mjerila.pretraziStavku(pocetna.filterKolona4WE, mjerilo);
	  mjerila.verifikujMjerila(); mjerila.verifikujStavku(mjerilo,
	  pocetna.podatak4TabelaWE); }
	  
	 
	
	  @Test (description=" test kreira KOREKTOR iz sekcije KUPCI i verifikuje ga")
	  public void scp_007_dodavanje_korektora_test() throws Exception { 
	  LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
	  PocetnaStranica pocetna = new PocetnaStranica(driver);
	  driver.manage().window().maximize();
	  logIn.verifikujLogIn(); logIn.logIn(pocetna.orgGasWE);
	  pocetna.verifikujPocetnuStranicu();
	  Korektori korektori = pocetna.navigirajNaKorektore();
	  String korektor = korektori.dodajKorektore();
	  korektori.verifikujPoruku("Uspješno završeno.");
	  korektori.pretraziStavku(pocetna.filterKolona4WE, korektor);
	  korektori.verifikujStavku(korektor, pocetna.podatak4TabelaWE); }
	 

	@Test(description = " test kreira TIP MJERILA  iz sekcije MJERILA i verifikuje ga")
	public void scp_008_dodavanje_tipovi_mjerila_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TipoviMjerila tipovi = pocetna.navigirajNaTipoveMjerila();
		tipovi.verifikujTipoviMjerila();
		String tipMjerila = tipovi.dodajTipoviMjerila();
		tipovi.verifikujPoruku("Uspješno završeno.");
		tipovi.pretraziStavku(pocetna.filterKolona2WE, tipMjerila);
		tipovi.verifikujTipoviMjerila();
		tipovi.verifikujStavku(tipMjerila, pocetna.podatak2TabelaWE);
	}

	@Test(description = " test kreira PROIZVODJACA MJERILA  iz sekcije MJERILA i verifikuje ga")
	public void scp_008_dodavanje_proizvodjaci_mjerila_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		ProizvodjaciMjerila proizvodjaci = pocetna.navigirajNaProizvodjaceMjerila();
		proizvodjaci.verifikujProizvodjaceMjerila();
		String proizvodjac = proizvodjaci.dodajProizvodjaciMjerila();
		proizvodjaci.verifikujPoruku("Uspješno završeno.");
		proizvodjaci.pretraziStavku(pocetna.filterKolona2WE, proizvodjac);
		proizvodjaci.verifikujProizvodjaceMjerila();
		proizvodjaci.verifikujStavku(proizvodjac, pocetna.podatak2TabelaWE);
	}

	@Test(description = " test kreira VRSTU MJERILA  iz sekcije MJERILA i verifikuje ga")
	public void scp_008_dodavanje_vrste_mjerila_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		VrsteMjerila vrste = pocetna.navigirajNaVrsteMjerila();
		vrste.verifikujVrsteMjerila();
		String vrsta = vrste.dodajVrsteMjerila();
		vrste.verifikujPoruku("Uspješno završeno.");
		vrste.pretraziStavku(pocetna.filterKolona2WE, vrsta);
		vrste.verifikujVrsteMjerila();
		vrste.verifikujStavku(vrsta, pocetna.podatak2TabelaWE);
	}

}
