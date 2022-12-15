package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;


public class PX_DIST_Brisanje_Fizickog_Lica_Test  extends BaseTest {

	public PX_DIST_Brisanje_Fizickog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_brisanje_fizickog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = pocetna.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickaLica = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujFizickoLice(fizickaLica);
		fizickaLicaPage.obrisiFizickoLice();
		fizickaLicaPage.verifikujBrisanjeFizickogLica(fizickaLica);
	}

}