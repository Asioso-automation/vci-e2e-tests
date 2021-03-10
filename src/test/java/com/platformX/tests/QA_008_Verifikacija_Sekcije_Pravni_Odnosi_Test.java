package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Tuzbe;
import com.platformX.page.ZahtjeviZaIskljucenje;
import com.platformX.page.ZahtjeviZaUkljucenje;
import com.platformX.page.IskljucenjaOdStraneODSa;
import com.platformX.page.IzvjestajiPage;
import com.platformX.page.LogInPage;
import com.platformX.page.Opomene;

public class QA_008_Verifikacija_Sekcije_Pravni_Odnosi_Test extends BaseTest {

	public QA_008_Verifikacija_Sekcije_Pravni_Odnosi_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije PRAVNI ODNOSI i IZVJESTAJI i verifikuje ih

	@Test
	public void qa_008_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Opomene opomene = homePage.navigateToOpomene();
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = homePage.navigateToZahtjeviZaIskljucenje();
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = homePage.navigateToIskljucenjaOdStraneODSa();
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = homePage.navigateToZahtjeviZaUkljucenje();
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		Tuzbe tuzbe = homePage.navigateToTuzbe();
		tuzbe.verifikujTuzbe();
		IzvjestajiPage izvjestajiPage = homePage.navigateToIzvjestaji();
		izvjestajiPage.verifikujIzvjestaji();
	}
}