package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Avansi;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.FinansijskeKartice;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PreknjizavanjaUplata;
import com.platformX.page.LogIn;
import com.platformX.page.NerasporedjeneUplate;
import com.platformX.page.Reprogrami;
import com.platformX.page.SveUplate;
import com.platformX.page.VrsteKnjizenja;
import com.platformX.page.VrsteStavkiFinansijskeKartice;
import com.platformX.page.ZiroRacuni;

public class PX_008_Verifikacija_Sekcije_Finansije_Test extends BaseTest {

	public PX_008_Verifikacija_Sekcije_Finansije_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih

	@Test
	public void px_008_verifikacija_sekcije_finansije_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		FinansijskeKartice finansijskeKartice = homePage.navigirajNaFinansijskeKartice();
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = homePage.navigirajNaDnevniciUplata();
		dnevniciUplata.verifikujDnevniciUplata();
		PreknjizavanjaUplata preknjizavanja = homePage.navigirajNaPreknjizavanjaUplata();
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplate sveUplate = homePage.navigirajNaSveUplate();
		sveUplate.verifikujSveUplate();
		NerasporedjeneUplate nerasporedjeneUplate = homePage.navigirajNaNerasporedjeneUplate();
		nerasporedjeneUplate.verifikujNerasporedjeneUplate();
		Avansi avansi = homePage.navigirajNaAvansi();
		avansi.verifikujAvansi();
		Reprogrami reprogrami = homePage.navigirajNaReprogrami();
		reprogrami.verifikujReprogrami();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziroRacuni = homePage.navigirajNaZiroRacuni();
		ziroRacuni.verifikujZiroRacuni();
		VrsteKnjizenja vrsteKnjizenja = homePage.navigirajNaVrsteKnjizenja();
		vrsteKnjizenja.verifikujVrsteKnjizenja();
		VrsteStavkiFinansijskeKartice vrsteStavkiFinansijskeKartice = homePage.navigirajNaVrsteStavkiFinansijskeKartice();
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
	}
}