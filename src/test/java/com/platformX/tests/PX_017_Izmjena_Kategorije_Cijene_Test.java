package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogInPage;

public class PX_017_Izmjena_Kategorije_Cijene_Test extends BaseTest {

	public PX_017_Izmjena_Kategorije_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_017_izmjena_kategorije_cijene_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
		String novaKategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(novaKategorija);
	}

}