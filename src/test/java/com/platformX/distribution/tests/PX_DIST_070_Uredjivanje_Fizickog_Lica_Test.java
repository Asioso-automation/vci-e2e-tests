package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_070_Uredjivanje_Fizickog_Lica_Test  extends BaseTest {

	public PX_DIST_070_Uredjivanje_Fizickog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_070_uredjivanje_fizickog_lica_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		FizickaLica fizickaLicaPage = homePage.navigirajNaFizickaLica();
		fizickaLicaPage.verifikujFizickaLica();
		String fizickaLica = fizickaLicaPage.dodajFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.verifikujFizickoLice(fizickaLica);
		String novoFizickoLice = fizickaLicaPage.urediFizickoLice();
		fizickaLicaPage.verifikujPoruku("Uspješno završeno.");
		fizickaLicaPage.verifikujFizickoLice(novoFizickoLice);
	}

}