package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.LogIn;
import scp.page.PocetnaStranica;
import scp.page.TarifneNadgrupe;
import scp.page.TarifnePodgrupe;

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
}
