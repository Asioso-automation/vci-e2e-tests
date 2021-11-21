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

	@Test (description="test prolazi kroz sve stranice iz sekcije ŠIFARNICI i verifikuje ih")
	public void px_003_verifikacije_sekcije_sifarnici_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		OperatoriSistema operatoriSistema = pocetna.navigirajNaOperatoreSistema();
		operatoriSistema.verifikujOperatoreSistema();
		RadneJedinice radneJedinice = pocetna.navigirajNaRadneJedinice();
		radneJedinice.verifikujRadneJedinice();
		OperativnaPodrucja opertivnaPodrucja = pocetna.navigirajNaOperativnaPodrucja();
		opertivnaPodrucja.verifikujOperativnaPodrucja();
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