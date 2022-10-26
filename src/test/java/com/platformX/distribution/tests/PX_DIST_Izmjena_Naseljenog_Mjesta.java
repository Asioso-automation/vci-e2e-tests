package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.NaseljenaMjesta;
import com.platformX.distribution.page.PocetnaStranica;

public class PX_DIST_Izmjena_Naseljenog_Mjesta extends BaseTest {

	public PX_DIST_Izmjena_Naseljenog_Mjesta() throws IOException, FileNotFoundException {
		super();
	}

	@Test
	public void px_dist_izmjena_naseljenog_mjesta_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica homePage = new PocetnaStranica(driver);
		homePage.verifikujPocetnuStranicu();
		NaseljenaMjesta naseljenaMjesta = homePage.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		String naseljenoMjesto = naseljenaMjesta.dodajNaseljenoMjesto();
		naseljenaMjesta.verifikujNaseljenoMjesto(naseljenoMjesto);
		String novoNaseljenoMjesto = naseljenaMjesta.izmjeniNaseljenoMjesto();
		naseljenaMjesta.verifikujNaseljenoMjesto(novoNaseljenoMjesto);
		}
}
