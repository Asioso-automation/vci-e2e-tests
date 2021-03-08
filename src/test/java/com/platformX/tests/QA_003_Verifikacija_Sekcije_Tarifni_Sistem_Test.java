package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.CjenovnikPage;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.KategorijeCijenaPage;
import com.platformX.page.LogInPage;
import com.platformX.page.ObracunskaSnagaPage;
import com.platformX.page.SezonePage;
import com.platformX.page.TarifneGrupePage;
import com.platformX.page.TarifneKategorijePage;
import com.platformX.page.TarifneNadgrupePage;

public class QA_003_Verifikacija_Sekcije_Tarifni_Sistem_Test extends BaseTest {

	public QA_003_Verifikacija_Sekcije_Tarifni_Sistem_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije TARIFNI SISTEM i verifikuje ih

	@Test
	public void qa_003_verifikacije_sekcije_tarifni_sistem_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		TarifneKategorijePage tarifneKategorijePage = homePage.navigateToTarifneKategorije();
		tarifneKategorijePage.verifikujTarifneKategorije();
		TarifneNadgrupePage tarifneNadgrupePage = homePage.navigateToTarifneNadgrupe();
		tarifneNadgrupePage.verifikujTarifneNadgrupe();
		TarifneGrupePage tarifneGrupePage = homePage.navigateToTarifneGrupe();
		tarifneGrupePage.verifikujTarifneGrupe();
		SezonePage sezonePage = homePage.navigateToSezone();
		sezonePage.verifikujSezone();
		ObracunskaSnagaPage obracunskaSnagaPage = homePage.navigateToObracunskaSnaga();
		obracunskaSnagaPage.verifikujObracunskaSnaga();
		KategorijeCijenaPage kategorijeCijenaPage = homePage.navigateToKategorijeCijena();
		kategorijeCijenaPage.verifikujKategorijeCijena();
		CjenovnikPage cjenovnikPage = homePage.navigateToCjenovnik();
		cjenovnikPage.verifikujCjenovnik();
	}
}