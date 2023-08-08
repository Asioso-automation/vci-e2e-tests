package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.FizickaLica;
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
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		String ime = fizickaLica.dodajFizickoLice();
		fizickaLica.verifikujFizickoLice(ime);
	}

}