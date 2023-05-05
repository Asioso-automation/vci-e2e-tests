package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.NaseljenaMjesta;
import com.platformX.distribution.page.PocetnaStranicaPXD;

public class PX_DIST_030_Uredjivanje_Naseljenog_Mjesta_Test extends BaseTest {

	public PX_DIST_030_Uredjivanje_Naseljenog_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_030_uredjivanje_naseljenog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljenaMjesta = homePage.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		String naseljenoMjesto = naseljenaMjesta.dodajNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.verifikujNaseljenoMjesto(naseljenoMjesto);
		String novoNaseljenoMjesto = naseljenaMjesta.urediNaseljenoMjesto();
		naseljenaMjesta.verifikujPoruku("Uspješno završeno.");
		naseljenaMjesta.verifikujNaseljenoMjesto(novoNaseljenoMjesto);
	}

}