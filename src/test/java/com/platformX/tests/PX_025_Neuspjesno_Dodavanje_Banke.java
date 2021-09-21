package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Banke;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogInPage;

public class PX_025_Neuspjesno_Dodavanje_Banke extends BaseTest {

	public PX_025_Neuspjesno_Dodavanje_Banke() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description = "pokusaj dodavanja banke sa postojecim nazivom")
	public void px_025_neuspjesno_dodavanje_banke_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifyHomePage();
		Banke banke = homePage.navigirajNaBanke();
		banke.verifikujBanke();
		String banka = banke.dodajBanku();
		banke.verifikujBanku(banka);
		banke.dodajBankuSaImenom(banka);
		banke.verifikujPoruku("Ovaj naziv banke je već u upotrebi.");	
	}

}