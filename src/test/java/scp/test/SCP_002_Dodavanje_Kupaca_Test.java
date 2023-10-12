package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.Kupci;
import scp.page.PocetnaStranica;
import scp.page.LogIn;

public class SCP_002_Dodavanje_Kupaca_Test extends BaseTest {

	public SCP_002_Dodavanje_Kupaca_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="")
	public void scp_002_dodavanje_fizickog_lica_test() throws Exception {
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
	}

	@Test (description="")
	public void scp_002_dodavanje_pravnog_lica_test() throws Exception {
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
	}
	
}