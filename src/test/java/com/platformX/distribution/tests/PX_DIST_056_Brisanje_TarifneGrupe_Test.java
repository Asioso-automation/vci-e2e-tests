package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneGrupe;

public class PX_DIST_056_Brisanje_TarifneGrupe_Test extends BaseTest{

	public PX_DIST_056_Brisanje_TarifneGrupe_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_056_brisanje_tarifnegrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujPoruku("Uspješno završeno.");
        tarifneGrupe.verifikujTarifnuGrupu(tarifnGrupa);
        tarifneGrupe.obrisiStavku(true);
        tarifneGrupe.verifikujBrisanjeStavke(true, tarifnGrupa);
	}

}