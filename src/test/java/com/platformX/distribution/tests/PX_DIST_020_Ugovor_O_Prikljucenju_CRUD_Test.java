package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.UgovoriOPrikljucenju;

public class PX_DIST_020_Ugovor_O_Prikljucenju_CRUD_Test extends BaseTest{

	public PX_DIST_020_Ugovor_O_Prikljucenju_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}

//	trenutno se mijenja ova forma - prilagoditi testove nakon release-a
	
//	@Test (enabled = false)
//	public void px_dist_020_1_dodavanje_ugovora_o_prikljucenju_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.dodajElektronergetskuSaglasnostD("string");
//		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
//		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, elSaglasnost);
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujStavku(elSaglasnost, homePage.podatak2Tabela2WE);
//		UgovorOPrikljucenju ugovor = homePage.navigirajNaUgovorOPrikljucenju();
//		ugovor.verifikujUgovorOPrikljucenju();
//		String brojProtokola = ugovor.dodajUgovorOPrikljucenju(elSaglasnost);
//		ugovor.verifikujPoruku("Uspješno završeno.");
//		ugovor.pretraziStavku(homePage.filterKolona4WE, brojProtokola);
//		ugovor.verifikujUgovorOPrikljucenju();
//		ugovor.verifikujStavku(brojProtokola, homePage.podatak2Tabela4WE);
//	}
//	
//	@Test (enabled = false)
//	public void px_dist_020_2_uredjivanje_ugovora_o_prikljucenju_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.dodajElektronergetskuSaglasnostD("string");
//		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
//		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, elSaglasnost);
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujStavku(elSaglasnost, homePage.podatak2Tabela2WE);
//		UgovorOPrikljucenju ugovor = homePage.navigirajNaUgovorOPrikljucenju();
//		ugovor.verifikujUgovorOPrikljucenju();
//		String brojProtokola = ugovor.dodajUgovorOPrikljucenju(elSaglasnost);
//		ugovor.verifikujPoruku("Uspješno završeno.");
//		ugovor.pretraziStavku(homePage.filterKolona4WE, brojProtokola);
//		ugovor.verifikujUgovorOPrikljucenju();
//		ugovor.verifikujStavku(brojProtokola, homePage.podatak2Tabela4WE);
//		ugovor.urediUgovorOPrikljucenju();
//		ugovor.verifikujPoruku("Uspješno završeno.");
//	}
//	
//	@Test (enabled = false)
//	public void px_dist_020_3_brisanje_ugovora_o_prikljucenju_test() throws Exception {
//		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
//		logIn.verifikujLogIn();
//		logIn.logIn();
//		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
//		homePage.verifikujPocetnuStranicu();
//		ElektroenergetskeSaglasnosti elSaglasnosti = homePage.navigirajNaElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.dodajElektronergetskuSaglasnostD("string");
//		elSaglasnosti.verifikujPoruku("Uspješno završeno.");
//		elSaglasnosti.pretraziStavku(homePage.filterKolona2WE, elSaglasnost);
//		elSaglasnosti.verifikujElektroenergetskeSaglasnosti();
//		elSaglasnosti.verifikujStavku(elSaglasnost, homePage.podatak2Tabela2WE);
//		UgovorOPrikljucenju ugovor = homePage.navigirajNaUgovorOPrikljucenju();
//		ugovor.verifikujUgovorOPrikljucenju();
//		String brojProtokola = ugovor.dodajUgovorOPrikljucenju(elSaglasnost);
//		ugovor.verifikujPoruku("Uspješno završeno.");
//		ugovor.pretraziStavku(homePage.filterKolona4WE, brojProtokola);
//		ugovor.verifikujUgovorOPrikljucenju();
//		ugovor.verifikujStavku(brojProtokola, homePage.podatak2Tabela4WE);
//		ugovor.obrisiStavku();
//		ugovor.verifikujPoruku("Brisanje je uspješno završeno");
//		ugovor.pretraziStavku(homePage.filterKolona4WE, brojProtokola);
//		ugovor.verifikujPraznuTabelu();
//	}

}