package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Poste;
import com.platformX.page.LogIn;

public class PX_072_Neuspjesno_Brisanje_Poste_Test extends BaseTest {

	public PX_072_Neuspjesno_Brisanje_Poste_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_072_neuspjesno_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		poste.verifikujPostu("Pale", "71420", "");
		poste.obrisiPostu();
		poste.verifikujPoruku("Brisanje ovog zapisa nije moguće.");
	}

}