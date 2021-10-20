package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.Djelatnosti;
import com.platformX.page.Entiteti;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;
import com.platformX.page.NaseljenaMjesta;
import com.platformX.page.OperativnaPodrucja;
import com.platformX.page.OperatoriSistema;
import com.platformX.page.Opstine;
import com.platformX.page.Organizacije;
import com.platformX.page.Poste;
import com.platformX.page.RadneJedinice;
import com.platformX.page.Ulice;

public class PX_003_Verifikacija_Sekcije_Sifarnici_Test extends BaseTest {

	public PX_003_Verifikacija_Sekcije_Sifarnici_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Test prolazi kroz stranice sekcije SIFARNICI i verifikuje ih

	@Test
	public void px_003_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetnaStranica = new PocetnaStranica(driver);
		pocetnaStranica.verifyHomePage();
		Organizacije organizacije = pocetnaStranica.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		OperatoriSistema operatoriSistema = pocetnaStranica.navigirajNaOperatoreSistema();
		operatoriSistema.verifikujOperatoreSistema();
		RadneJedinice radneJedinice = pocetnaStranica.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		OperativnaPodrucja opertivnaPodrucja = pocetnaStranica.navigirajNaOperativnaPodrucja();
		opertivnaPodrucja.verifikujOperativnaPodrucja();
		Djelatnosti djelatnosti = pocetnaStranica.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetnaStranica.navigirajNaEntitete();
		entiteti.verifikujEntitete();
		Opstine opstine = pocetnaStranica.navigirajNaOpstine();
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetnaStranica.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetnaStranica.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetnaStranica.navigirajNaUlice();
		ulice.verifikujUlice();
	}
}