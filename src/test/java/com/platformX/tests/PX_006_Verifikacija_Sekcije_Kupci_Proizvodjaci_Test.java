package com.platformX.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.page.Anketari;
import com.platformX.page.Ankete;
import com.platformX.page.Dokumenti;
import com.platformX.page.LogIn;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.Prijave;

public class PX_006_Verifikacija_Sekcije_Kupci_Proizvodjaci_Test extends BaseTest {

	public PX_006_Verifikacija_Sekcije_Kupci_Proizvodjaci_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="test prolazi kroz sve stranice iz sekcije KUPCI-PROIZVOĐAČI i verifikuje ih")
	public void px_006_verifikacija_sekcije_kupci_proizvodjaci_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Prijave prijave = pocetna.navigirajNaPrijave();
		prijave.verifikujPrijave();
		Dokumenti dokumenti = pocetna.navigirajNaDokumenti();
		dokumenti.verifikujDokumenti();
		Anketari anketari = pocetna.navigirajNaAnketari();
		anketari.verifikujAnketari();
		Ankete ankete = pocetna.navigirajNaAnkete();
		ankete.verifikujAnkete();
	}
	
}