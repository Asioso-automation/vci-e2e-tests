package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.UmanjenjaCijene;

public class PX_015_Neuspjesno_Dodavanje_Umanjenja_Cijene_Test extends BaseTest {

	public PX_015_Neuspjesno_Dodavanje_Umanjenja_Cijene_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "pokusaj dodavanja umanjenja cijene za postojeći broj mjeseci")
	public void px_015_neuspjesno_dodavanje_umanjenja_cijene_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		UmanjenjaCijene umanjenjaCijene = homePage.navigirajNaUmanjenjaCijene();
		umanjenjaCijene.verifikujUmanjenjaCijene();
		String brojMjeseci = umanjenjaCijene.dodajUmanjenjeCijene();
		umanjenjaCijene.verifikujUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.dodajPredefinisanoUmanjenjeCijene(brojMjeseci);
		umanjenjaCijene.verifikujPoruku("Popust za traženi broj mjeseci je već definisan.");
	}
}