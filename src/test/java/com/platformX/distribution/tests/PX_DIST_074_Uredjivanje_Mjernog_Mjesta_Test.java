package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_074_Uredjivanje_Mjernog_Mjesta_Test  extends BaseTest {

	public PX_DIST_074_Uredjivanje_Mjernog_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_074_uredjivanje_mjernog_mjesta_Test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjestaPage = homePage.navigirajNaMjernaMjesta();
		mjernaMjestaPage.verifikujMjernaMjesta();
		String mjernoMjesto = mjernaMjestaPage.dodajMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.verifikujMjernoMjesto(mjernoMjesto);
		String novoMjernoMjesto = mjernaMjestaPage.urediMjernoMjesto();
		mjernaMjestaPage.verifikujPoruku("Uspješno završeno.");
		mjernaMjestaPage.verifikujMjernoMjesto(novoMjernoMjesto);
	}

}