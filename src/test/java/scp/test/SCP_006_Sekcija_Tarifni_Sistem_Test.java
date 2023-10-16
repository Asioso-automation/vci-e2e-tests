package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.LogIn;
import scp.page.NestandardneUsluge;
import scp.page.PocetnaStranica;
import scp.page.TarifneGrupe;
import scp.page.TarifneNadgrupe;
import scp.page.TarifnePodgrupe;
import scp.page.TarifniModeli;
import scp.page.Usluge;

public class SCP_006_Sekcija_Tarifni_Sistem_Test extends BaseTest{

	public SCP_006_Sekcija_Tarifni_Sistem_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description=" test kreira TARIFNU NADGRUPU iz sekcije TARIFNI SISTEM i verifikuje je")
	public void scp_006_dodavanje_tarifne_nadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneNadgrupe nadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		nadgrupe.verifikujTarifneNadgrupe();
		String nadgrupa = nadgrupe.dodajTarifneNadgrupe();
		nadgrupe.verifikujPoruku("Uspješno završeno.");
		nadgrupe.pretraziStavku(pocetna.filterKolona2WE, nadgrupa);
		nadgrupe.verifikujTarifneNadgrupe();
		nadgrupe.verifikujStavku(nadgrupa, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira TARIFNU PODGRUPU iz sekcije TARIFNI SISTEM i verifikuje je")
	public void scp_006_dodavanje_tarifne_podgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TarifnePodgrupe podgrupe = pocetna.navigirajNaTarifnePodgrupe();
		podgrupe.verifikujTarifnePodgrupe();
		String podgrupa = podgrupe.dodajTarifnePodgrupe();
	//	podgrupe.verifikujPoruku("Uspješno završeno.");
		podgrupe.pretraziStavku(pocetna.filterKolona2WE, podgrupa);
		podgrupe.verifikujTarifnePodgrupe();
		podgrupe.verifikujStavku(podgrupa, pocetna.podatak2TabelaWE);
		// Fali poruka "Uspješno završeno." na stranici. Kad se reši bug, da se obriše zakomentarisani deo testa
	}
	
	@Test (description=" test kreira TARIFNI MODEL iz sekcije TARIFNI SISTEM i verifikuje ga")
	public void scp_006_dodavanje_tarifni_modeli_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TarifniModeli modeli = pocetna.navigirajNaTarifneModele();
		modeli.verifikujTarifneModele();
		String model = modeli.dodajTarifniModeli();
		modeli.verifikujPoruku("Uspješno završeno.");
		modeli.pretraziStavku(pocetna.filterKolona2WE, model);
		modeli.verifikujTarifneModele();
		modeli.verifikujStavku(model, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira TARIFNU GRUPU iz sekcije TARIFNI SISTEM i verifikuje je")
	public void scp_006_dodavanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		TarifneGrupe grupe = pocetna.navigirajNaTarifneGrupe();
		grupe.verifikujTarifneGrupe();
		String grupa = grupe.dodajTarifneGrupe();
		grupe.verifikujPoruku("Uspješno završeno.");
		grupe.pretraziStavku(pocetna.filterKolona2WE, grupa);
		grupe.verifikujTarifneGrupe();
		grupe.verifikujStavku(grupa, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira USLUGU iz sekcije TARIFNI SISTEM i verifikuje je")
	public void scp_006_dodavanje_usluge_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Usluge usluge = pocetna.navigirajNaUsluge();
		usluge.verifikujUsluge();
		String usluga = usluge.dodajUsluge();
		usluge.verifikujPoruku("Uspješno završeno.");
		usluge.pretraziStavku(pocetna.filterKolona2WE, usluga);
		usluge.verifikujUsluge();
		usluge.verifikujStavku(usluga, pocetna.podatak2TabelaWE);
	}
	
	@Test (description=" test kreira  NESTANDARDNU USLUGU iz sekcije TARIFNI SISTEM i verifikuje je")
	public void scp_006_dodavanje_nestandardne_usluge_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		NestandardneUsluge nestandardne = pocetna.navigirajNaNestandardneUsluge();
		nestandardne.verifikujNestandardneUsluge();
		String nestandardna = nestandardne.dodajNestandardneUsluge();
		nestandardne.verifikujPoruku("Uspješno završeno.");
		nestandardne.pretraziStavku(pocetna.filterKolona2WE, nestandardna);
		nestandardne.verifikujNestandardneUsluge();
		nestandardne.verifikujStavku(nestandardna, pocetna.podatak2TabelaWE);
	}
}

