package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;
import scp.page.Drzave;
import scp.page.Entiteti;
import scp.page.LogIn;
import scp.page.MjesneZajednice;
import scp.page.NaseljenaMjesta;
import scp.page.PocetnaStranica;
import scp.page.Reoni;

public class SCP_005_Sekcija_Sifarnici_Test extends BaseTest{

	public SCP_005_Sekcija_Sifarnici_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description=" test kreira DRZAVU iz sekcije SIFARNICI i verifikuje je")
	public void scp_005_dodavanje_drzave_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Drzave drzave = pocetna.navigirajNaDrzave();
		drzave.verifikujDrzave();
		String drzava = drzave.dodajDrzave();
		drzave.verifikujPoruku("Uspješno završeno.");
		drzave.pretraziStavku(pocetna.filterKolona2WE, drzava);
		drzave.verifikujDrzave();
		drzave.verifikujStavku(drzava, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira ENTITET iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_entiteta_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntitete();
		String entitet = entiteti.dodajEntitete();
		entiteti.verifikujPoruku("Uspješno završeno.");
		entiteti.pretraziStavku(pocetna.filterKolona2WE, entitet);
		entiteti.verifikujEntitete();
		entiteti.verifikujStavku(entitet, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira NASELJENO MJESTO iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_naseljenog_mjesta_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		NaseljenaMjesta nasMjesta = pocetna.navigirajNaNaseljenaMjesta();
		nasMjesta.verifikujNaseljenaMjestaGas();
		String nasMjesto = nasMjesta.dodajNaseljenaMjesta();
		nasMjesta.verifikujPoruku("Uspješno završeno.");
		nasMjesta.pretraziStavku(pocetna.filterKolona2WE, nasMjesto);
		nasMjesta.verifikujNaseljenaMjestaGas();
		nasMjesta.verifikujStavku(nasMjesto, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira NASELJENO MJESTO iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_naseljenog_mjesta__test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		NaseljenaMjesta nasMjesta = pocetna.navigirajNaNaseljenaMjesta();
		nasMjesta.verifikujNaseljenaMjesta();
		String nasMjesto = nasMjesta.dodajNaseljenaMjesta();
		nasMjesta.verifikujPoruku("Uspješno završeno.");
		nasMjesta.pretraziStavku(pocetna.filterKolona2WE, nasMjesto);
		nasMjesta.verifikujNaseljenaMjesta();
		nasMjesta.verifikujStavku(nasMjesto, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira MJESNU ZAJEDNICU iz sekcije SIFARNICI i verifikuje je")
	public void scp_005_dodavanje_mjesne_zajednice_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		MjesneZajednice zajednice = pocetna.navigirajNaMjesneZajednice();
		zajednice.verifikujMjesneZajednice();
		String zajednica = zajednice.dodajMjesneZajednice();
		zajednice.verifikujPoruku("Uspješno završeno.");
		zajednice.pretraziStavku(pocetna.filterKolona2WE, zajednica);
		zajednice.verifikujMjesneZajednice();
		zajednice.verifikujStavku(zajednica, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira REON iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_reona_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Reoni reoni = pocetna.navigirajNaReone();
		reoni.verifikujReone();
		String reon = reoni.dodajReone();
		reoni.verifikujPoruku("Uspješno završeno.");
		reoni.pretraziStavku(pocetna.filterKolona2WE, reon);
		reoni.verifikujReone();
		reoni.verifikujStavku(reon, pocetna.podatak2TabelaWE);
	}
	
}
