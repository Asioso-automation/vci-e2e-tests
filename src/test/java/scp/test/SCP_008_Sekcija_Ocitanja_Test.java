package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.LogIn;
import scp.page.PocetnaStranica;
import scp.page.ZoneOcitanja;

public class SCP_008_Sekcija_Ocitanja_Test extends BaseTest{

	public SCP_008_Sekcija_Ocitanja_Test() throws IOException, FileNotFoundException {
		super();
	}


	@Test (description=" test kreira ZONU OCITANJA iz sekcije OCITANJA i verifikuje ga")
	public void scp_008_dodavanje_zone_ocitanja_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		ZoneOcitanja zone = pocetna.navigirajNaZoneOcitanja();
		zone.verifikujZoneOcitanja();
		String zona = zone.dodajZoneOcitanja();
		zone.verifikujPoruku("Uspješno završeno.");
		zone.pretraziStavku(pocetna.filterKolona2WE, zona);
		zone.verifikujZoneOcitanja();
		zone.verifikujStavku(zona, pocetna.podatak2TabelaWE);
	}
	
}
