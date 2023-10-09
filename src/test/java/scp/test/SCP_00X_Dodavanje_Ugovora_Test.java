package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.FizickaLica;
import scp.page.PocetnaStranica;
import scp.page.LogIn;
import scp.page.Objekti;

public class SCP_00X_Dodavanje_Ugovora_Test extends BaseTest {

	public SCP_00X_Dodavanje_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="")
	public void scp_002_dodavanje_ugovora_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		String ime = fizickaLica.dodajFizickoLice();
		fizickaLica.verifikujFizickoLice(ime);
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String broj = objekti.dodajObjekat();
		objekti.verifikujObjekat(broj);
	}

}