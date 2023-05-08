package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.UplatePage;
import com.platformX.page.ZiroRacuni;

public class PX_034_Preknjizavanje_Dnevnika_Uplata_Test extends BaseTest {

	public PX_034_Preknjizavanje_Dnevnika_Uplata_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_034_preknjizavanje_dnevnika_uplata_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		pocetna.navigirajNaBanke();
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		pocetna.navigirajNaZiroRacuni();
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		pocetna.navigirajNaDnevniciUplata();
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(bankaTabela, ziroRacunTabela);
		dnevniciUplataPage.navigateToUplateSaStranice();
		dnevniciUplataPage.navigateToDodajUplatuSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatuKupac();
		uplatePage.verifikujUplatu(uplatilac);
	}

}