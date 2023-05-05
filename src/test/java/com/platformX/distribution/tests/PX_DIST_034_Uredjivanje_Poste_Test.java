package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poste;
import com.platformX.distribution.page.LogIn;

public class PX_DIST_034_Uredjivanje_Poste_Test extends BaseTest {

	public PX_DIST_034_Uredjivanje_Poste_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;

	@Test
	public void px_dist_034_uredjivanje_poste_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		Poste poste = homePage.navigirajNaPoste();
		poste.verifikujPoste();
		podaci = poste.dodajPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.verifikujPostu(podaci[0], podaci[1], podaci[2]);
		String novaPosta = poste.urediPostu();
		poste.verifikujPoruku("Uspješno završeno.");
		poste.verifikujPostu(novaPosta, podaci[1], podaci[2]);
	}

}