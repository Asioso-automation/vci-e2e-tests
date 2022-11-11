package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;
import com.platformX.distribution.page.KategorijePotrosnje;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TarifneNadgrupe;

public class PX_DIST_Uredjivanje_TarifneNadgrupe_Test extends BaseTest {

	public PX_DIST_Uredjivanje_TarifneNadgrupe_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_uredjivanje_tarifnenadgrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		String tarifnaNadgrupa = tarifneNadgrupe.dodajTarifnuNadrgupu();
		tarifneNadgrupe.verifikujTarifnuNadgrupu(tarifnaNadgrupa);
		String novaTarifnaNadgrupa = tarifneNadgrupe.urediTarifnuNadgrupu();
		tarifneNadgrupe.verifikujTarifnuNadgrupu(novaTarifnaNadgrupa);
	}

}