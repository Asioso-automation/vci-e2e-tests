package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Opstine;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_017_Opstine_CRUD_Test extends BaseTest {
	
	public PX_DIST_017_Opstine_CRUD_Test() throws IOException, FileNotFoundException {
	super();
}

	@Test
	public void px_dist_026_dodavanje_opstine_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Opstine opstine = homePage.navigirajNaOpstine();
		opstine.verifikujOpstine();
		String opstina = opstine.dodajOpstinu();
		opstine.verifikujPoruku("Uspješno završeno.");
		opstine.pretraziStavku(homePage.filterKolona2WE, opstina);
		opstine.verifikujOpstine();
		opstine.verifikujStavku(opstina, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_027_uredjivanje_opstine_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Opstine opstine = homePage.navigirajNaOpstine();
		opstine.verifikujOpstine();
		String opstina = opstine.dodajOpstinu();
		opstine.verifikujPoruku("Uspješno završeno.");
		opstine.pretraziStavku(homePage.filterKolona2WE, opstina);
		opstine.verifikujOpstine();
		opstine.verifikujStavku(opstina, homePage.podatak2Tabela2WE);
		String novaOpstina = opstine.urediOpstinu();
		opstine.verifikujPoruku("Uspješno završeno.");
		opstine.pretraziStavku(homePage.filterKolona2WE, novaOpstina);
		opstine.verifikujOpstine();
		opstine.verifikujStavku(novaOpstina, homePage.podatak2Tabela2WE);
	}
	
	@Test
	public void px_dist_028_brisanje_opstine_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Opstine opstine = homePage.navigirajNaOpstine();
		opstine.verifikujOpstine();
		String opstina = opstine.dodajOpstinu();
		opstine.verifikujPoruku("Uspješno završeno.");
		opstine.pretraziStavku(homePage.filterKolona2WE, opstina);
		opstine.verifikujOpstine();
		opstine.verifikujStavku(opstina, homePage.podatak2Tabela2WE);
		opstine.obrisiStavku(true);
		opstine.verifikujBrisanjeStavke(true, opstina);
	}

}