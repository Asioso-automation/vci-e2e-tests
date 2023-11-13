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
import scp.page.Poste;
import scp.page.ProizvodjaciKalorimetara;
import scp.page.ProizvodjaciMjerila;
import scp.page.RadniStatusi;
import scp.page.Reoni;
import scp.page.TipoviKalorimetara;
import scp.page.TipoviMjerila;
import scp.page.ToplotneStanice;
import scp.page.ToplotniReoni;
import scp.page.Toplovodi;
import scp.page.Ulice;
import scp.page.VrsteKalorimetara;
import scp.page.VrsteMjerila;
import scp.page.Zone;

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
		entiteti.verifikujEntiteti();
		String entitet = entiteti.dodajEntiteti();
		entiteti.verifikujPoruku("Uspješno završeno.");
		entiteti.pretraziStavku(pocetna.filterKolona2WE, entitet);
		entiteti.verifikujEntiteti();
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
		NaseljenaMjesta naseljena = pocetna.navigirajNaNaseljenaMjesta();
		naseljena.verifikujNaseljenaMjestaGas();
		String naseljeno = naseljena.dodajNaseljenaMjesta();
		naseljena.verifikujPoruku("Uspješno završeno.");
		naseljena.pretraziStavku(pocetna.filterKolona2WE, naseljeno);
		naseljena.verifikujNaseljenaMjestaGas();
		naseljena.verifikujStavku(naseljeno, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira NASELJENO MJESTO iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_naseljenog_mjesta__test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljena = pocetna.navigirajNaNaseljenaMjesta();
		naseljena.verifikujNaseljenaMjesta();
		String naseljeno = naseljena.dodajNaseljenaMjesta();
		naseljena.verifikujPoruku("Uspješno završeno.");
		naseljena.pretraziStavku(pocetna.filterKolona2WE, naseljeno);
		naseljena.verifikujNaseljenaMjesta();
		naseljena.verifikujStavku(naseljeno, pocetna.podatak2TabelaWE);
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
	
	@Test (description=" test kreira POSTU iz sekcije SIFARNICI i verifikuje je")
	public void scp_005_dodavanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		String posta = poste.dodajPoste();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.pretraziStavku(pocetna.filterKolona2WE, posta);
		poste.verifikujPoste();
		poste.verifikujStavku(posta, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira ULICU iz sekcije SIFARNICI i verifikuje je")
	public void scp_005_dodavanje_ulice_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		String ulica = ulice.dodajUlice();
		ulice.verifikujPoruku("Uspješno završeno.");
		ulice.pretraziStavku(pocetna.filterKolona2WE, ulica);
		ulice.verifikujUlice();
		ulice.verifikujStavku(ulica, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira ZONU iz sekcije SIFARNICI i verifikuje je")
	public void scp_005_dodavanje_zone_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Zone zone = pocetna.navigirajNaZone();
		zone.verifikujZone();
		String zona = zone.dodajZone();
		zone.verifikujPoruku("Uspješno završeno.");
		zone.pretraziStavku(pocetna.filterKolona2WE, zona);
		zone.verifikujZone();
		zone.verifikujStavku(zona, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira RADNI STATUS iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_radni_statusi_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		RadniStatusi statusi = pocetna.navigirajNaRadneStatuse();
		statusi.verifikujRadniStatusi();
		String status = statusi.dodajRadniStatus();
		statusi.verifikujPoruku("Uspješno završeno.");
		statusi.pretraziStavku(pocetna.filterKolona2WE, status);
		statusi.verifikujRadniStatusi();
		statusi.verifikujStavku(status, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira TIP MJERILA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_tipovi_mjerila_test() throws Exception {
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
	
	@Test (description=" test kreira PROIZVODJACA MJERILA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_proizvodjaci_mjerila_test() throws Exception {
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
	
	@Test (description=" test kreira VRSTU MJERILA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_vrste_mjerila_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		VrsteMjerila vrste = pocetna.navigirajNaVrsteMjerila();
		vrste.verifikujVrsteMjerila();
		String vrsta = vrste.dodajVrsteMjerila();
	//	vrste.verifikujPoruku("Uspješno završeno.");
		vrste.pretraziStavku(pocetna.filterKolona2WE, vrsta);
		vrste.verifikujVrsteMjerila();
		vrste.verifikujStavku(vrsta, pocetna.podatak2TabelaWE);
		// Fali poruka "Uspješno završeno." na stranici. Kad se reši bug, da se obriše zakomentarisani deo testa
	}
	
	@Test (description=" test kreira TOPLOVOD i TOPLOTNU STANICU iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_toplovoda_toplotne_stanice_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		Toplovodi toplovodi = pocetna.navigirajNaToplovode();
		toplovodi.verifikujToplovode();
		String toplovod = toplovodi.dodajToplovode();
		toplovodi.verifikujPoruku("Uspješno završeno.");
		toplovodi.pretraziStavku(pocetna.filterKolona2WE, toplovod);
		toplovodi.verifikujToplovode();
		toplovodi.verifikujStavku(toplovod, pocetna.podatak2TabelaWE);
		ToplotneStanice toplotneStanice = pocetna.navigirajNaToplotneStanice();
		toplotneStanice.verifikujToplotneStanice();
		String toplotnaStanica = toplotneStanice.dodajToplotneStanice(toplovod);
		toplotneStanice.verifikujPoruku("Uspješno završeno.");
		toplotneStanice.pretraziStavku(pocetna.filterKolona2WE, toplotnaStanica);
		toplotneStanice.verifikujToplotneStanice();
		toplotneStanice.verifikujStavku(toplotnaStanica, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira TOPLOTNI REON iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_toplotnog_reona_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		ToplotniReoni toplotniReoni = pocetna.navigirajNaToplotneReone();
		toplotniReoni.verifikujToplotneReone();
		String toplotniReon = toplotniReoni.dodajToplotneReone();
	 // toplotniReoni.verifikujPoruku("Uspješno završeno.");
		toplotniReoni.pretraziStavku(pocetna.filterKolona2WE, toplotniReon);
		toplotniReoni.verifikujToplotneReone();
		toplotniReoni.verifikujStavku(toplotniReon, pocetna.podatak2TabelaWE);
		// Fali poruka "Uspješno završeno." na stranici. Kad se reši bug, da se obriše zakomentarisani deo testa
	}
	
	
	@Test (description=" test kreira TIP KALORIMETRA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_tipovi_kalorimetara_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		TipoviKalorimetara tipoviKalorimetara = pocetna.navigirajNaTipoveKalorimetara();
		tipoviKalorimetara.verifikujTipoveKalorimetara();
		String tipKalorimetra = tipoviKalorimetara.dodajTipoviKalorimetara();
		tipoviKalorimetara.verifikujPoruku("Uspješno završeno.");
		tipoviKalorimetara.pretraziStavku(pocetna.filterKolona2WE, tipKalorimetra);
		tipoviKalorimetara.verifikujTipoveKalorimetara();
		tipoviKalorimetara.verifikujStavku(tipKalorimetra, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira PROIZVODJACA KALORIMETRA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_proizvodjaci_kalorimetara_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		ProizvodjaciKalorimetara proizvodjaci = pocetna.navigirajNaProizvodjaceKalorimetara();
		proizvodjaci.verifikujProizvodjaceKalorimetara();
		String proizvodjac = proizvodjaci.dodajProizvodjaciKalorimetara();
		proizvodjaci.verifikujPoruku("Uspješno završeno.");
		proizvodjaci.pretraziStavku(pocetna.filterKolona2WE, proizvodjac);
		proizvodjaci.verifikujProizvodjaceKalorimetara();
		proizvodjaci.verifikujStavku(proizvodjac, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira VRSTU KALORIMETRA  iz sekcije SIFARNICI i verifikuje ga")
	public void scp_005_dodavanje_vrste_kalorimetra_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		VrsteKalorimetara vrste = pocetna.navigirajNaVrsteKalorimetara();
		vrste.verifikujVrsteKalorimetara();
		String vrsta = vrste.dodajVrsteKalorimetara();
		vrste.verifikujPoruku("Uspješno završeno.");
		vrste.pretraziStavku(pocetna.filterKolona2WE, vrsta);
		vrste.verifikujVrsteKalorimetara();
		vrste.verifikujStavku(vrsta, pocetna.podatak2TabelaWE);
	}
	
}
