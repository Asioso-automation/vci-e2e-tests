package scp.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.PocetnaStranica;
import scp.page.LogIn;
import scp.page.Objekti;

public class SCP_003_Dodavanje_Objekta_Test extends BaseTest {

	public SCP_003_Dodavanje_Objekta_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="")
	public void scp_003_dodavanje_objekta_vodovod_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgVodovodGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}
	
	@Test (description="")
	public void scp_003_dodavanje_objekta_toplana_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgToplanaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}
	
	@Test (description="")
	public void scp_003_dodavanje_objekta_cistoca_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}
	
	@Test (description="")
	public void scp_003_dodavanje_objekta_grad_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGradGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}
	
	@Test (description="")
	public void scp_003_dodavanje_objekta_gas_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgGasWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}
	
	@Test (description="")
	public void scp_003_dodavanje_objekta_son_test() throws Exception {
		LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
		logIn.logIn(pocetna.orgSonWE);
		pocetna.verifikujPocetnuStranicu();
		Objekti objekti = pocetna.navigirajNaObjekte();
		objekti.verifikujObjekte();
		String objekat = objekti.dodajObjekat();
		objekti.verifikujPoruku("Uspješno završeno.");
		objekti.pretraziStavku(pocetna.filterKolona4WE, objekat);
		objekti.verifikujObjekte();
		objekti.verifikujStavku(objekat, pocetna.podatak4TabelaWE);
	}

}