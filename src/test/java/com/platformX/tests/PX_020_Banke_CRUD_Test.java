package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;

public class PX_020_Banke_CRUD_Test extends BaseTest {

	public PX_020_Banke_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_020_1_dodavanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
	}
	
	@Test (description = "pokusaj dodavanja banke sa postojecim nazivom")
	public void px_020_2_neuspjesno_dodavanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		banke.dodajBankuSaImenom(banka);
		banke.verifikujPoruku("Ovaj naziv banke je već u upotrebi.");	
	}
	
	@Test
	public void px_020_3_uredjivanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		String novaBanka = banke.urediBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, novaBanka);
		banke.verifikujBanke();
		banke.verifikujStavku(novaBanka, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_020_4_brisanje_banke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		Banke banke = homePage.navigateOnPage("PX", Banke.class, "Finansije", "Banke");
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		banke.obrisiStavku();
//		banke.verifikujPoruku("Brisanje je uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujPraznuTabelu();
	}

}