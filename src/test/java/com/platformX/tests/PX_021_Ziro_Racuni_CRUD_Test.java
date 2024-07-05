package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.ZiroRacuni;

public class PX_021_Ziro_Racuni_CRUD_Test extends BaseTest {

	public PX_021_Ziro_Racuni_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_021_1_dodavanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujPoruku("Uspješno završeno.");
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		ziroRacuni.verifikujPoruku("Uspješno završeno.");
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, ziroRacun);
		ziroRacuni.verifikujZiroRacuni();
		ziroRacuni.verifikujStavku(ziroRacun, homePage.podatak2Tabela3WE);
	}
	
	@Test (description = "pokusaj dodavanja ziro racuna sa postojecim brojem")
	public void px_021_2_neuspjesno_dodavanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, ziroRacun);
		ziroRacuni.verifikujZiroRacuni();
		ziroRacuni.verifikujStavku(ziroRacun, homePage.podatak2Tabela3WE);
		ziroRacuni.dodajZiroRacunSaBrojem(banka, ziroRacun);
		ziroRacuni.verifikujPoruku("Ovaj žiro račun je već u upotrebi.");
	}
	
	@Test
	public void px_021_3_uredjivanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, ziroRacun);
		ziroRacuni.verifikujZiroRacuni();
		ziroRacuni.verifikujStavku(ziroRacun, homePage.podatak2Tabela3WE);
		String noviZiroRacun = ziroRacuni.urediZiroRacun();
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, noviZiroRacun);
		ziroRacuni.verifikujZiroRacuni();
		ziroRacuni.verifikujStavku(noviZiroRacun, homePage.podatak2Tabela3WE);
	}
	
	@Test
	public void px_021_4_brisanje_ziro_racuna_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.navigateOnPagePX(Banke.class, "Finansije", "Banke");
		Banke banke = new Banke(driver);
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.pretraziStavku(homePage.filterKolona2WE, banka);
		banke.verifikujBanke();
		banke.verifikujStavku(banka, homePage.podatak2Tabela2WE);
		homePage.navigateOnPagePX(ZiroRacuni.class, "Finansije", "Žiro računi");
		ZiroRacuni ziroRacuni = new ZiroRacuni(driver);
		ziroRacuni.verifikujZiroRacuni();
		String ziroRacun = ziroRacuni.dodajZiroRacun(banka);
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, ziroRacun);
		ziroRacuni.verifikujZiroRacuni();
		ziroRacuni.verifikujStavku(ziroRacun, homePage.podatak2Tabela3WE);
		ziroRacuni.obrisiStavku();
		ziroRacuni.verifikujPoruku("Brisanje je uspješno završeno.");
		ziroRacuni.pretraziStavku(homePage.filterKolona3WE, ziroRacun);
		ziroRacuni.verifikujPraznuTabelu();
	}

}