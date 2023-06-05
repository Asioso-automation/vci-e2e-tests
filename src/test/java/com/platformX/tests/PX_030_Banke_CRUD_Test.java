package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;

public class PX_030_Banke_CRUD_Test extends BaseTest {

	public PX_030_Banke_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_030_1_dodavanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
	}
	
	@Test (description = "pokusaj dodavanja banke sa postojecim nazivom")
	public void px_030_2_neuspjesno_dodavanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		banke.dodajBankuSaImenom(banka);
		banke.verifikujPoruku("Ovaj naziv banke je već u upotrebi.");	
	}
	
	@Test
	public void px_030_3_uredjivanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		String novaBanka = banke.urediBanku();
		banke.verifikujBanku(novaBanka);
	}
	
	@Test
	public void px_030_4_brisanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		homePage.obrisiStavku(true);
		banke.verifikujBrisanjeBanke(banka);
	}

}