package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_013_Dodavanje_Administracijske_Poruke_Test  extends BaseTest {

	public PX_DIST_013_Dodavanje_Administracijske_Poruke_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;
	
	@Test (description="test kreira, verifikuje i brise ADMINISTRACIJSKU PORUKU")
	public void px_dist_013_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		// TODO Napraviti metodu za dodavanje i verifikaciju poruke 
		podaci = poruke.dodajPoruku();
		poruke.verifikujPorukuLista(podaci[0]);
		pocetna.navigirajNaPocetnaStranica();
		pocetna.osvjeziStranicu();
		pocetna.verifikujPocetnuStranicu();
		poruke.verifikujPorukuPocetna(podaci[0], podaci[1]);
		pocetna.navigirajNaPoruke();
		poruke.obrisiStavku(true);
		poruke.verifikujBrisanjeStavke(false, podaci[0]);
	}

}