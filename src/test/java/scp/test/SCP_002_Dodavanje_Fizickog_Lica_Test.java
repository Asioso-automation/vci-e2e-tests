package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.FizickaLica;
import scp.page.Kupci;
import scp.page.PocetnaStranica;
import scp.page.LogIn;

public class SCP_002_Dodavanje_Fizickog_Lica_Test extends BaseTest {

	public SCP_002_Dodavanje_Fizickog_Lica_Test() throws IOException, FileNotFoundException {
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
		String ime = kupci.dodajFizickoLiceKupci();
	//	fizickaLica.verifikujFizickoLice(ime);
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
		String ime = kupci.dodajPravnoLiceKupci();
	//	fizickaLica.verifikujFizickoLice(ime);
	}
	
}