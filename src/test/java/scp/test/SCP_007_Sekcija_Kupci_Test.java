package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.LogIn;
import scp.page.Mjerila;
import scp.page.PocetnaStranica;
import scp.page.Prostori;

public class SCP_007_Sekcija_Kupci_Test extends BaseTest{

	public SCP_007_Sekcija_Kupci_Test() throws IOException, FileNotFoundException {
		super();
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
		mjerila.verifikujStavku(mjerilo, pocetna.podatak2Tabela4bWE);
	}
}
