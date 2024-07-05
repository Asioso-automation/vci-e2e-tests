package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.UplatePage;
import com.platformX.page.LogIn;
import com.platformX.page.ZiroRacuni;

public class PX_018_Dnevnici_Uplata_CRUD_Test extends BaseTest {

	public PX_018_Dnevnici_Uplata_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(enabled=false)
	public void px_018_1_dodavanje_dnevnika_uplata_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		homePage.navigateOnPage("PX", ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		homePage.navigateOnPage("PX", DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(bankaTabela, ziroRacunTabela);
	}
	
	@Test(enabled=false)
	public void px_018_2_preknjizavanje_dnevnika_uplata_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		pocetna.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		pocetna.navigateOnPage("PX", ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		pocetna.navigateOnPage("PX", DnevniciUplata.class, "Finansije", "Dnevnici uplata");
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