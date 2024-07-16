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
import scp.page.Objekti;
import scp.page.PocetnaStranica;
import scp.page.Prostori;
import scp.page.Vodomjeri;


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
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti = pocetna.navigirajNaObjekte();
		String prostor = prostori.dodajProstori();
		//prostori.verifikujPoruku("Uspješno završeno.");
		prostori.pretraziStavku(pocetna.filterKolona6ProstoriWE, prostor);
		prostori.verifikujStavku(prostor, pocetna.podatak6TabelaProstoriWE);
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
