package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.KorekcijeEnergetskihObracuna;
import com.platformX.distribution.page.KorekcionaOdobrenjaZaduzenja;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjesecnaOdobrenjaZaduzenja;
import com.platformX.distribution.page.NaloziZaObracun;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_011_Verifikacija_Sekcije_Obracun_Test extends BaseTest {
	
	public PX_DIST_011_Verifikacija_Sekcije_Obracun_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "test prolazi kroz sve stranice iz sekcije OBRACUN i verifikuje ih")
	public void px_dist_011_verifikacija_sekcije_obracun_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		NaloziZaObracun naloziZaObracun = pocetna.navigirajNaNaloziZaObracun();
		naloziZaObracun.verifikujNaloziZaObracun();
		KorekcijeEnergetskihObracuna korekcijeEnergetskihObracuna = pocetna.navigirajNaKorekcijeEnergetskihObracuna();
		korekcijeEnergetskihObracuna.verifikujKorekcijeEnergetskihObracuna();
		MjesecnaOdobrenjaZaduzenja mjesecnaOdobrenjaZaduzenja = pocetna.navigirajNaMjesecnaOdobrenjaZaduzenja();
		mjesecnaOdobrenjaZaduzenja.verifikujMjesecnaOdobrenjaZaduzenja();
		KorekcionaOdobrenjaZaduzenja korekcionaOdobrenjaZaduzenja = pocetna.navigirajNaKorekcionaOdobrenjaZaduzenja();
		korekcionaOdobrenjaZaduzenja.verifikujKorekcionaOdobrenjaZaduzenja();
	}

}