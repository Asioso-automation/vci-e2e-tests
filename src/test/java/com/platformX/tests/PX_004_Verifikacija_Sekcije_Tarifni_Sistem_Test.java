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

	@Test (description="test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih")
	public void px_004_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		KategorijePotrosnje kategorijePotrosnje = pocetna.navigirajNaKategorijePotrosnje();
		kategorijePotrosnje.verifikujKategorijePotrosnje();
		TarifneNadgrupe tarifneNadgrupe = pocetna.navigirajNaTarifneNadgrupe();
		tarifneNadgrupe.verifikujTarifneNadgrupe();
		TarifneGrupe tarifneGrupe = pocetna.navigirajNaTarifneGrupe();
		tarifneGrupe.verifikujTarifneGrupe();
		Sezone sezone = pocetna.navigirajNaSezone();
		sezone.verifikujSezone();
		ObracunskaSnaga obracunskaSnaga = pocetna.navigirajNaObracunskaSnaga();
		obracunskaSnaga.verifikujObracunskaSnaga();
		KategorijeCijena kategorijeCijena = pocetna.navigirajNaKategorijeCijena();
		kategorijeCijena.verifikujKategorijeCijena();
		Cjenovnik cjenovnik = pocetna.navigirajNaCjenovnik();
		cjenovnik.verifikujCjenovnik();
	}
	
}