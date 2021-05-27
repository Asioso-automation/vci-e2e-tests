package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UgovoriPage;

public class QA_029_Provjera_Validacija_Na_Izmjeni_Ugovora_Test extends BaseTest {

	public QA_029_Provjera_Validacija_Na_Izmjeni_Ugovora_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_029_provjera_validacija_na_izmjeni_ugovora_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		UgovoriPage ugovoriPage = homePage.navigateToUgovori();
		ugovoriPage.verifikujUgovori();
		ugovoriPage.pronadjiUgovorPoEic("36ZBLNG");
		ugovoriPage.verifikujObaveznaPoljaIzmjenaUgovora();
	}
}