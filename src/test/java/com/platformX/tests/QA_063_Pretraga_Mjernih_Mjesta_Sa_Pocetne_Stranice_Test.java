package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;
import com.platformX.page.MjernaMjestaPage;

public class QA_063_Pretraga_Mjernih_Mjesta_Sa_Pocetne_Stranice_Test extends BaseTest {

	public QA_063_Pretraga_Mjernih_Mjesta_Sa_Pocetne_Stranice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void qa_063_pretraga_mjernih_mjesta_sa_pocetne_stranice_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		homePage.pretraziMjernaMjesta("36Z03800001H");
		MjernaMjestaPage mjernaMjesta = new MjernaMjestaPage(driver);
		mjernaMjesta.verifikujDetaljeMjernogMjesta();
	}

}