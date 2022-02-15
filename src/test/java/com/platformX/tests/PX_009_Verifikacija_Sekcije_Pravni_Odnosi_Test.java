package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.StavkeZahtjevaZaIskljucenje;
import com.platformX.page.StavkeZahtjevaZaUkljucenje;
import com.platformX.page.Tuzbe;
import com.platformX.page.ZahtjeviZaIskljucenje;
import com.platformX.page.ZahtjeviZaUkljucenje;
import com.platformX.page.AktivnaIskljucenja;
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

	@Test (description="test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i IZVJESTAJI i verifikuje ih")
	public void px_009_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Opomene opomene = pocetna.navigirajNaOpomene();
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = pocetna.navigirajNaZahtjeviZaIskljucenje();
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		StavkeZahtjevaZaIskljucenje stavke = pocetna.navigirajNaStavkeZahtjevaZaIskljucenje();
		stavke.verifikujStavkeZahtjevaZaIskljucenja();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = pocetna.navigirajNaIskljucenjaOdStraneODSa();
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = pocetna.navigirajNaZahtjeviZaUkljucenje();
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		StavkeZahtjevaZaUkljucenje stavkeUkljucenja = pocetna.navigirajNaStavkeZahtjevaZaUkljucenje();
		stavkeUkljucenja.verifikujStavkeZahtjevaZaUkljucenja();
		AktivnaIskljucenja aktivnaIskljucenja = pocetna.navigirajNaAktivnaIskljucenja();
		aktivnaIskljucenja.verifikujAktivnaIskljucenja();
		Tuzbe tuzbe = pocetna.navigirajNaTuzbe();
		tuzbe.verifikujTuzbe();
//		Bankroti bankroti = pocetna.navigirajNaBankroti();
//		bankroti.verifikujBankroti();
		// TODO Nova stranica ovdje
		Medijacije medijacije = pocetna.navigirajNaMedijacije();
		medijacije.verifikujMedijacije();
		OtpisiPotrazivanja otpisiPotrazivanja = pocetna.navigirajNaOtpisiPotrazivanja();
		otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		IzvjestajiPage izvjestajiPage = pocetna.navigirajNaIzvjestaji();
		izvjestajiPage.verifikujIzvjestaji();
	}
	
}