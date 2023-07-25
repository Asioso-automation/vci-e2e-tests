package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.UmanjenjaCijene;

public class PX_017_Umanjenja_Cijene_CRUD_Test extends BaseTest {

	public PX_017_Umanjenja_Cijene_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_017_1_dodavanje_umanjenja_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
	}
	
	@Test (description = "pokusaj dodavanja umanjenja cijene za postojeći broj mjeseci")
	public void px_017_2_neuspjesno_dodavanje_umanjenja_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.dodajPredefinisanoUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.verifikujPoruku("Popust za traženi broj mjeseci je već definisan.");
	}
	
	@Test
	public void px_017_3_uredjivanje_umanjenja_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		String noviBrojMjeseci = umanjenjaCijene.urediUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		umanjenjaCijene.osvjeziStranicu();
		umanjenjaCijene.verifikujUmanjenjeCijene(noviBrojMjeseci);
	}
	
	@Test
	public void px_017_4_brisanje_umanjenja_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.obrisiStavku();
		umanjenjaCijene.verifikujPoruku("Brisanje je uspješno završeno.");
//		umanjenjaCijene.pretraziStavku(homePage.filterKolona2WE, brojMjeseci);
		umanjenjaCijene.verifikujPraznuTabelu();
	}
	
}