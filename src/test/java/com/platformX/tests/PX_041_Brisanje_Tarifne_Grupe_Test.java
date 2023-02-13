package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.TarifneGrupe;
import com.platformX.page.LogIn;

public class PX_041_Brisanje_Tarifne_Grupe_Test extends BaseTest {

	public PX_041_Brisanje_Tarifne_Grupe_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_041_brisanje_tarifne_grupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujTarifnuGrupu(tarifnaGrupa);
		homePage.obrisiStavku(true);
		tarifneGrupe.verifikujTarifneGrupe();
		tarifneGrupe.verifikujBrisanjeTarifneGrupe(tarifnaGrupa);
	}

}