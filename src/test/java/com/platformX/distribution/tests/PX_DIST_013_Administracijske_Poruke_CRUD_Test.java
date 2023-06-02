package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;

public class PX_DIST_013_Administracijske_Poruke_CRUD_Test  extends BaseTest {

	public PX_DIST_013_Administracijske_Poruke_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private String[] podaci;
	
	@Test (description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na listi")
	public void px_dist_013_1_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPorukuLista(podaci[0]);
	}
	
	@Test (description="test kreira i verifikuje ADMINISTRACIJSKU PORUKU na pocetnoj stranici")
	public void px_dist_013_2_dodavanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		pocetna.navigirajNaPocetnaStranica();
		pocetna.osvjeziStranicu();
		pocetna.verifikujPocetnuStranicu();
		poruke.verifikujPorukuPocetna(podaci[0], podaci[1]);
	}
	
	@Test (description="test kreira, verifikuje i uredjuje ADMINISTRACIJSKU PORUKU")
	public void px_dist_013_3_uredjivanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPorukuLista(podaci[0]);
//		TODO dodati metodu za uredjivanje poruke
	}
	
	@Test (description="test kreira, verifikuje i brise ADMINISTRACIJSKU PORUKU")
	public void px_dist_013_4_brisanje_administracijske_poruke_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		poruke.pokupiIdPoruke();
		podaci = poruke.dodajPoruku();
		poruke.verifikujPorukuLista(podaci[0]);
		poruke.obrisiStavku(true);
		poruke.verifikujBrisanjeStavke(false, podaci[0]);
	}

}