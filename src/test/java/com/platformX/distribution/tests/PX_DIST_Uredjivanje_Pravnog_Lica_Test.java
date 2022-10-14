package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.KoristenaBrojila;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.ObracunskiUgovori;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.PravnaLica;
import com.platformX.distribution.page.RegistarBrojila;


public class PX_DIST_Uredjivanje_Pravnog_Lica_Test  extends BaseTest {

	public PX_DIST_Uredjivanje_Pravnog_Lica_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	
	public void px_dist_dodavanje_pravnog_lica_test() throws Exception {
		
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		PravnaLica pravnaLicaPage = pocetna.navigirajNaPravnaLica();
		pravnaLicaPage.verifikujPravnaLica();
		String pravnaLica = pravnaLicaPage.dodajPravnoLice();
		pravnaLicaPage.verifikujPravnoLice(pravnaLica);
		String novoPravnoLice = pravnaLicaPage.urediPravnoLice();
		pravnaLicaPage.verifikujPravnoLice(novoPravnoLice);
		
		

	}
}
