package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.TarifneNadgrupe;

public class PX_DIST_053_Brisanje_TarifneNadgrupe_Test extends BaseTest{

	public PX_DIST_053_Brisanje_TarifneNadgrupe_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_053_brisanje_tarifnenadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		String tarifnaNadgrupa = tarifneNadgrupe.dodajTarifnuNadrgupu();
		tarifneNadgrupe.verifikujPoruku("Uspješno završeno.");
		tarifneNadgrupe.verifikujTarifnuNadgrupu(tarifnaNadgrupa);
		tarifneNadgrupe.obrisiStavku(true);
		tarifneNadgrupe.verifikujBrisanjeStavke(true, tarifnaNadgrupa);
	}

}