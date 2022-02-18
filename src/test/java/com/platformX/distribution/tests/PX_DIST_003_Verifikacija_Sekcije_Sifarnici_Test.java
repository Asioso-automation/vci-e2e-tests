package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Poste;
import com.platformX.distribution.page.Ulice;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.NaseljenaMjesta;
import com.platformX.distribution.page.Opstine;
import com.platformX.distribution.page.Organizacije;
import com.platformX.distribution.page.Djelatnosti;
import com.platformX.distribution.page.Entiteti;

public class PX_DIST_003_Verifikacija_Sekcije_Sifarnici_Test extends BaseTest {

	public PX_DIST_003_Verifikacija_Sekcije_Sifarnici_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije ŠIFARNICI i verifikuje ih")
	public void px_dist_003_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
//		RadneJedinice radneJedinice = pocetna.navigirajNaRadneJedinice();
//		radneJedinice.verifikujRadneJedinice();
		Djelatnosti djelatnosti = pocetna.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigirajNaOpstine();
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
	}
	
}