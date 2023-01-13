package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.TarifneGrupe;

public class PX_DIST_055_Uredjivanje_TarifneGrupe_Test extends BaseTest {

	public PX_DIST_055_Uredjivanje_TarifneGrupe_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_055_uredjivanje_tarifnegrupe_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		String tarifnaGrupa = tarifneGrupe.dodajTarifnuGrupu();
		tarifneGrupe.verifikujTarifnuGrupu(tarifnaGrupa);
		String novaTarifnaGrupa = tarifneGrupe.urediTarifnuGrupu();
		tarifneGrupe.verifikujTarifnuGrupu(novaTarifnaGrupa);
	}

}