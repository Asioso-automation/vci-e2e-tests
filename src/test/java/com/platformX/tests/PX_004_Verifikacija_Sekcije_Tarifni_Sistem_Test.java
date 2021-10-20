package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Cjenovnik;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijena;
import com.platformX.page.LogIn;
import com.platformX.page.ObracunskaSnaga;
import com.platformX.page.Sezone;
import com.platformX.page.TarifneGrupe;
import com.platformX.page.KategorijePotrosnje;
import com.platformX.page.TarifneNadgrupe;

public class PX_004_Verifikacija_Sekcije_Tarifni_Sistem_Test extends BaseTest {

	public PX_004_Verifikacija_Sekcije_Tarifni_Sistem_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih

	@Test
	public void px_004_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		KategorijePotrosnje kategorijePotrosnje = homePage.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		TarifneNadgrupe tarifneNadgrupe = homePage.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = homePage.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		Sezone sezone = homePage.navigirajNaSezone();
		sezone.verifikujSezone();
		ObracunskaSnaga obracunskaSnaga = homePage.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		KategorijeCijena kategorijeCijena = homePage.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		Cjenovnik cjenovnik = homePage.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
}