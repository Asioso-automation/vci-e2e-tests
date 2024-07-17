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

	@Test (description="test kreira UGOVOR(Vodovod) za FIZICKO LICE i verifikuje ga")
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
		mjerila.verifikujMjerilaVodovod();
		String mjerilo = mjerila.dodajMjerilaVodovod();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona3WE, mjerilo);
		mjerila.verifikujMjerilaVodovod();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak3TabelaWE);
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
	
	@Test (description="test kreira UGOVOR(Vodovod) za PRAVNO LICE i verifikuje ga")
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
		mjerila.verifikujMjerilaVodovod();
		String mjerilo = mjerila.dodajMjerilaVodovod();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona3WE, mjerilo);
		mjerila.verifikujMjerilaVodovod();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak3TabelaWE);
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
		String mjerilo = mjerila.dodajMjerilaGas();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona3WE, mjerilo);
		mjerila.verifikujMjerila();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak3TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriGas();
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
	public void scp_00X_dodavanje_ugovora_pravno_lice_gas_test() throws Exception {
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
		String mjerilo = mjerila.dodajMjerilaGas();
		mjerila.verifikujPoruku("Uspješno završeno.");
		mjerila.pretraziStavku(pocetna.filterKolona3WE, mjerilo);
		mjerila.verifikujMjerila();
		mjerila.verifikujStavku(mjerilo, pocetna.podatak3TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriGas();
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
	
	@Test (description="test kreira UGOVOR(Cistoca) za FIZICKO LICE i verifikuje ga")
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
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstoriOpstinaCistoca();
		String ugovor = ugovori.dodajUgovorCistoca(fizickoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreCistoca();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(Cistoca) za PRAVNO LICE i verifikuje ga")
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
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreCistoca();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstoriOpstinaCistoca();
		String ugovor = ugovori.dodajUgovorCistoca(pravnoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreCistoca();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(Opstina) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreOpstina();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstoriOpstinaCistoca();
		String ugovor = ugovori.dodajUgovorOpstina(fizickoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreOpstina();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(Opstina) za PRAVNO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_pravno_lice_opstina_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String pravnoLice = kupci.dodajPravnoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, pravnoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(pravnoLice, pocetna.podatak2TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstoreOpstinaCistoca();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriOpstinaCistoca();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreOpstina();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstoriOpstinaCistoca();
		String ugovor = ugovori.dodajUgovorOpstina(pravnoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreOpstina();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}
	
	@Test (description="test kreira UGOVOR(Toplana) za FIZICKO LICE i verifikuje ga")
	public void scp_00X_dodavanje_ugovora_fizicko_lice_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Kupci kupci = pocetna.navigirajNaKupce();
		kupci.verifikujKupce();
		String fizickoLice = kupci.dodajFizickoLiceKupci();
		kupci.verifikujPoruku("Uspješno završeno.");
		kupci.pretraziStavku(pocetna.filterKolona2WE, fizickoLice);
		kupci.verifikujKupce();
		kupci.verifikujStavku(fizickoLice, pocetna.podatak2TabelaWE);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		objekti.dodajObjekat();
		Prostori prostori = pocetna.navigirajNaProstore();
		prostori.verifikujProstore();
		objekti.navigirajNaObjekte();
		objekti.verifikujObjekte();
		prostori.dodajProstoriGas();
		Ugovori ugovori = pocetna.navigirajNaUgovore();
		ugovori.verifikujUgovoreToplana();
		ugovori.navigirajNaObjekte();
		prostori.dodajUgovorProstori();
		String ugovor = ugovori.dodajUgovorToplana(fizickoLice);
		ugovori.verifikujPoruku("Uspješno završeno.");
		ugovori.pretraziStavku(pocetna.filterKolona2WE, ugovor);
		ugovori.verifikujUgovoreToplana();
		ugovori.verifikujStavku(ugovor, pocetna.podatak2TabelaWE);
	}

	
}