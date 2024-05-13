package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.PocetnaStranica;
import scp.page.Prostori;
import scp.page.Ugovori;
import scp.page.Vodomjeri;
import scp.page.Kupci;
import scp.page.LogIn;
import scp.page.Mjerila;
import scp.page.Objekti;


public class SCP_00X_Dodavanje_Ugovora_Test extends BaseTest {

	public SCP_00X_Dodavanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test kreira UGOVOR(Gas) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_gas_test() throws Exception {
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
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerila();
		String mjerilo = mjerila.dodajMjerila();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona4WE, mjerilo);
		mjerila.verifikujMjerila();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak4TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreGas();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorGas(fizickoLice, mjerilo);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreGas();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(Gas) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_test() throws Exception {
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
		Mjerila mjerila = pocetna.navigirajNaMjerila();
		mjerila.verifikujMjerila();
		String mjerilo = mjerila.dodajMjerila();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona4WE, mjerilo);
		mjerila.verifikujMjerila();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak4TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreGas();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorGas(pravnoLice, mjerilo);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreGas();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
}