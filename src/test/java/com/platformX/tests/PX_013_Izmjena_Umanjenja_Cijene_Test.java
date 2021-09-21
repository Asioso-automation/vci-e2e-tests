package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UmanjenjaCijene;

public class PX_013_Izmjena_Umanjenja_Cijene_Test extends BaseTest {

	public PX_013_Izmjena_Umanjenja_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_013_izmjena_umanjenja_cijene_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		String noviBrojMjeseci = umanjenjaCijene.izmjeniUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		umanjenjaCijene.osvjeziStranicu();
		umanjenjaCijene.verifikujUmanjenjeCijene(noviBrojMjeseci);
	}
}