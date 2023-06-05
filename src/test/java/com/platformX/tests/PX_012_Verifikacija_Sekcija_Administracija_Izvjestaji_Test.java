package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Poruke;
import com.platformX.page.DnevnikIzmjena;
import com.platformX.page.EmailObavjestenja;
import com.platformX.page.Izvjestaji;
import com.platformX.page.Korisnici;
import com.platformX.page.LogIn;

public class PX_012_Verifikacija_Sekcija_Administracija_Izvjestaji_Test extends BaseTest {

	public PX_012_Verifikacija_Sekcija_Administracija_Izvjestaji_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcija ADMINISTRACIJA i IZVJESTAJI i verifikuje ih")
	public void px_012_verifikacija_sekcija_administracija_izvjestaji_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Korisnici korisnici = pocetna.navigirajNaKorisnici();
		korisnici.verifikujKorisnici();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		EmailObavjestenja emailObavjestenja = pocetna.navigirajNaEmailObavjestenja();
		emailObavjestenja.verifikujEmailObavjestenja();
	    DnevnikIzmjena dnevnikIzmjena = pocetna.navigirajNaDnevnikIzmjena();
		dnevnikIzmjena.verifikujDnevnikIzmjena();
		Izvjestaji izvjestaji = pocetna.navigirajNaIzvjestaji();
		izvjestaji.verifikujIzvjestaji();
	}
	
}