package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.MjernaMjesta;

public class PX_011_Pretraga_Mjernih_Mjesta_Sa_Pocetne_Stranice_Test extends BaseTest {

	public PX_011_Pretraga_Mjernih_Mjesta_Sa_Pocetne_Stranice_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_011_pretraga_mjernih_mjesta_sa_pocetne_stranice_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		homePage.pretraziMjernaMjesta("36Z03800001H");
		MjernaMjesta mjernaMjesta = new MjernaMjesta(driver);
		mjernaMjesta.verifikujDetaljeMjernogMjesta();
	}

}