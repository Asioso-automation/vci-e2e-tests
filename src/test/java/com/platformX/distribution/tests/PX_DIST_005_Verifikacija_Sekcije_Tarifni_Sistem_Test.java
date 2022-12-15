package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.CjenovnikMrezarine;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.ObracunskaSnaga;
import com.platformX.distribution.page.Sezone;
import com.platformX.distribution.page.TarifneGrupe;
import com.platformX.distribution.page.KategorijePotrosnje;
import com.platformX.distribution.page.TarifneNadgrupe;

public class PX_DIST_005_Verifikacija_Sekcije_Tarifni_Sistem_Test extends BaseTest {

	public PX_DIST_005_Verifikacija_Sekcije_Tarifni_Sistem_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_005_verifikacija_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		Sezone sezone = pocetna.navigirajNaSezone();
		sezone.verifikujSezone();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		CjenovnikMrezarine cjenovnik = pocetna.navigirajNaCjenovnikMrezarine();
		cjenovnik.verifikujCjenovnikMrezarine();
	}
	
}