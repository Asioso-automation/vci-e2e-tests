package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Tuzbe;
import com.platformX.page.ZahtjeviZaIskljucenje;
import com.platformX.page.ZahtjeviZaUkljucenje;
import com.platformX.page.Bankroti;
import com.platformX.page.IskljucenjaOdStraneODSa;
import com.platformX.page.IzvjestajiPage;
import com.platformX.page.LogIn;
import com.platformX.page.Medijacije;
import com.platformX.page.Opomene;
import com.platformX.page.OtpisiPotrazivanja;

public class PX_009_Verifikacija_Sekcije_Pravni_Odnosi_Test extends BaseTest {

	public PX_009_Verifikacija_Sekcije_Pravni_Odnosi_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i IZVJESTAJI i verifikuje ih

	@Test
	public void px_009_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Opomene opomene = homePage.navigirajNaOpomene();
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = homePage.navigirajNaZahtjeviZaIskljucenje();
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = homePage.navigirajNaIskljucenjaOdStraneODSa();
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = homePage.navigirajNaZahtjeviZaUkljucenje();
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		Tuzbe tuzbe = homePage.navigirajNaTuzbe();
		tuzbe.verifikujTuzbe();
		Bankroti bankroti = homePage.navigirajNaBankroti();
		bankroti.verifikujBankroti();
		Medijacije medijacije = homePage.navigirajNaMedijacije();
		medijacije.verifikujMedijacije();
		OtpisiPotrazivanja otpisiPotrazivanja = homePage.navigirajNaOtpisiPotrazivanja();
		otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		IzvjestajiPage izvjestajiPage = homePage.navigirajNaIzvjestaji();
		izvjestajiPage.verifikujIzvjestaji();
	}
}