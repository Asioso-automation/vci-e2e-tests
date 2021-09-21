package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;

public class PX_023_Izmjena_Banke_Test extends BaseTest {

	public PX_023_Izmjena_Banke_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_023_izmjena_banke_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		String novaBanka = banke.izmjeniBanku();
		banke.verifikujBanku(novaBanka);
	}

}