package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogIn;

public class PX_016_Dodavanje_Kategorije_Cijene_Test extends BaseTest {

	public PX_016_Dodavanje_Kategorije_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_016_dodavanje_kategorije_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		String kategorija = kategorijeCijena.dodajKategoriju();
		kategorijeCijena.verifikujKategoriju(kategorija);
	}

}