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
	
	@Test (description="test kreira UGOVOR(VODOVOD) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
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
		ugovori.verifikujUgovoreVodovod();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorVodovod(fizickoLice, mjerilo);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreVodovod();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(VODOVOD) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
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
		ugovori.verifikujUgovoreVodovod();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorVodovod(pravnoLice, mjerilo);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreVodovod();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(VODOVOD-PAUSAL) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_pausal_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodIsWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreVodovod();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorPausal(fizickoLice);	
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreVodovod();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);	
	}
	
	@Test (description="test kreira UGOVOR(VODOVOD-PAUSAL) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_pausal_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodIsWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String pravnoLice = kupci.dodajPravnoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, pravnoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(pravnoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreVodovod();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorPausal(pravnoLice);	
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreVodovod();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);	
	}
	
	@Test (description="test kreira UGOVOR(TOPLANA) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreToplana();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorToplana(fizickoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreToplana();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(TOPLANA) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaInsWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String pravnoLice = kupci.dodajPravnoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, pravnoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(pravnoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreToplana();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorToplana(pravnoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreToplana();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(CISTOCA) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorCistoca(fizickoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreCistoca();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}

	@Test (description="test kreira UGOVOR(CISTOCA) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String pravnoLice = kupci.dodajPravnoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, pravnoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(pravnoLice, pocetna.podatak2TabelaWE);
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		prostori.dodajProstori();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		ugovori.navigirajNaProstore();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorCistoca(pravnoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreCistoca();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}


}