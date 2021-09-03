package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.UmanjenjaCijene;

public class QA_061_Neuspjesno_Dodavanje_Umanjenja_Cijene_Test extends BaseTest {

	public QA_061_Neuspjesno_Dodavanje_Umanjenja_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "pokusaj dodavanja umanjenja cijene za vec dodan broj mjeseci")
	public void qa_061_neuspjesno_dodavanje_umanjenja_cijene_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.dodajPredefinisanoUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.verifikujPoruku("Popust za traženi broj mjeseci je već definisan.");
	}
}