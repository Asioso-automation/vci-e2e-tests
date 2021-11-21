package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Poste;
import com.platformX.page.LogIn;

public class PX_074_Brisanje_Poste_Test extends BaseTest {

	public PX_074_Brisanje_Poste_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;

	@Test
	public void px_074_brisanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		poste.obrisiPostu();
		poste.verifikujBrisanjePoste(podaci[0]);
	}

}