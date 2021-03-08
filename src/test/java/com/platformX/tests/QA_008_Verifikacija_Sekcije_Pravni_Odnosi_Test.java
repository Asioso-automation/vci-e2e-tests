package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.IzvjestajiPage;
import com.platformX.page.LogInPage;
import com.platformX.page.Opomene;

public class QA_008_Verifikacija_Sekcije_Pravni_Odnosi_Test extends BaseTest {

	public QA_008_Verifikacija_Sekcije_Pravni_Odnosi_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz sve stranice iz sekcije PRAVNI ODNOSI i IZVJESTAJI i verifikuje ih

	@Test
	public void qa_007_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Opomene opomene = homePage.navigateToOpomene();
		opomene.verifikujOpomene();
		IzvjestajiPage izvjestajiPage = homePage.navigateToIzvjestaji();
		izvjestajiPage.verifikujIzvjestaji();
	}
}