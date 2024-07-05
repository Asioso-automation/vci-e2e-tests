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

public class PX_019_Uplate_CRUD_Test extends BaseTest {

	public PX_019_Uplate_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test(enabled=false)
	public void px_019_1_dodavanje_uplate_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		homePage.navigateOnPagePX(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(bankaTabela, ziroRacunTabela);
		dnevniciUplataPage.navigateToUplateSaStranice();
		dnevniciUplataPage.navigateToDodajUplatuSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatu();
		uplatePage.verifikujUplatu(uplatilac);
	}
	
	@Test(enabled=false)
	public void px_019_2_dodavanje_uplate_poziv_na_broj_test1() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		homePage.navigateOnPagePX(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(bankaTabela, ziroRacunTabela);
		dnevniciUplataPage.navigateToUplateSaStranice();
		dnevniciUplataPage.navigateToDodajUplatuSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.dodajUplatuPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
	}
	
	@Test(enabled=false)
	public void px_019_3_dodavanje_uplate_poziv_na_broj_test2() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		homePage.navigateOnPagePX(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		DnevniciUplata dnevniciUplataPage = new DnevniciUplata(driver);
		dnevniciUplataPage.verifikujDnevniciUplata();
		dnevniciUplataPage.dodajDnevnikUplata(banka, ziroRacun);
		dnevniciUplataPage.verifyDnevnikUplata(bankaTabela, ziroRacunTabela);
		dnevniciUplataPage.navigateToUplateSaStranice();
		dnevniciUplataPage.navigateToDodajUplatuSaSDetalja();
		UplatePage uplatePage = new UplatePage(driver);
		String uplatilac = uplatePage.obrisiPozivNaBroj();
		uplatePage.verifikujUplatu(uplatilac);
	}
	
	@Test(enabled=false)
	public void px_019_4_dodavanje_uplate_sa_kupcem_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		String bankaTabela = banke.verifikujBanku(banka);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		String ziroRacunTabela = ziroRacuni.verifikujZiroRacun(ziroRacun);
		homePage.navigateOnPagePX(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
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