package scp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.platformX.base.BaseTest;

import scp.page.LogIn;
import scp.page.PocetnaStranica;
import scp.page.TefObrasci;

public class SCP_010_Sekcija_Obracun_Test extends BaseTest{

	public SCP_010_Sekcija_Obracun_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description=" test kreira TEF OBRAZAC  iz sekcije OBRAČUN i verifikuje ga")
	public void scp_009_dodavanje_tef_obrasca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		driver.manage().window().maximize();
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		TefObrasci tef = pocetna.navigirajNaTefObrasce();
		tef.verifikujTefObrasce();
		String obrazac = tef.dodajTefObrazac();
		tef.verifikujPoruku("Uspješno završeno.");
		tef.pretraziStavku(pocetna.filterKolona4WE, obrazac);
		tef.verifikujTefObrasce();
		tef.verifikujStavku(obrazac, pocetna.podatak4TabelaWE);
	}

}
