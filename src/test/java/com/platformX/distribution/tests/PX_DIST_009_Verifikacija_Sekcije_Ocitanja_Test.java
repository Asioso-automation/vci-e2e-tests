package com.platformX.distribution.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.CitaciPoCitackimHodovima;
import com.platformX.distribution.page.CitackeListe;
import com.platformX.distribution.page.CitackiHodovi;
import com.platformX.distribution.page.ImportiOcitanja;
import com.platformX.distribution.page.IzmijenjenaOcitanja;
import com.platformX.distribution.page.KorekcijeOcitanja;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MonitoringOcitanja;
import com.platformX.distribution.page.NevalidnaOcitanja;
import com.platformX.distribution.page.OcitanjaBrojila;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.ZbirnaKontrolnaOcitanja;
import com.platformX.distribution.page.ZbirnaKontrolnaPotrosnja;



public class PX_DIST_009_Verifikacija_Sekcije_Ocitanja_Test extends BaseTest{

	public PX_DIST_009_Verifikacija_Sekcije_Ocitanja_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test (description = "test prolazi kroz sve stranice iz sekcije OCITANJA i verifikuje ih")
	
	public void px_dist_009_verifikacija_sekcija_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		OcitanjaBrojila ocitanjabrojila = pocetna.navigirajNaOcitanjaBrojila();
		ocitanjabrojila.verifikujOcitanjaBrojila();
		KorekcijeOcitanja korekcijeocitanja = pocetna.navigirajNaKorekcijeOcitanja();
		korekcijeocitanja.verifikujKorekcijeOcitanja();
		ImportiOcitanja importiocitanja = pocetna.navigirajNaImportiOcitanja();
		importiocitanja.verifikujImportiOcitanja();
		IzmijenjenaOcitanja izmijenjenaocitanja = pocetna.navigirajNaIzmijenjenaOcitanja();
		izmijenjenaocitanja.verifikujIzmijenjenaOcitanja();
		NevalidnaOcitanja nevalidnaocitanja = pocetna.navigirajNaNevalidnaOcitanja();
		nevalidnaocitanja.verifikujNevalidnaOcitanja();
		CitackiHodovi citackihodovi = pocetna.navigirajNaCitackiHodovi();
		citackihodovi.verifikujCitackiHodovi();
		CitackeListe citackeliste = pocetna.navigirajNaCitackeListe();
		citackeliste.verifikujCitackeListe();
		CitaciPoCitackimHodovima citaciPoCitackimHodovima = pocetna.navigirajNaCitaciPoCitackimHodovima();
		citaciPoCitackimHodovima.verifikujCitaciPoCitackimHodovima();
		ZbirnaKontrolnaOcitanja zbirnaKontrolnaOcitanja = pocetna.navigirajNaZbirnaKontrolnaOcitanja();
		zbirnaKontrolnaOcitanja.verifikujZbirnaKontrolnaOcitanja();
		ZbirnaKontrolnaPotrosnja zbirnaKontrolnaPotrosnja = pocetna.navigirajNaZbirnaKontrolnaPotrosnja();
		zbirnaKontrolnaPotrosnja.verifikujZbirnaKontrolnaPotrosnja();
		MonitoringOcitanja monitoringOcitanja = pocetna.navigirajNaMonitoringOcitanja();
		monitoringOcitanja.verifikujMonitoringOcitanja();
		
	}
	
}
