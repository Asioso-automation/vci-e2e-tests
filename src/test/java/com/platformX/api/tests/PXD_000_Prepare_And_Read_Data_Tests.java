package com.platformX.api.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.PageBase;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Organizacije;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.util.PropertiesUtil;

public class PXD_000_Prepare_And_Read_Data_Tests extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
	protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);

	public PXD_000_Prepare_And_Read_Data_Tests() throws IOException {
		super();
	}

	@Test(groups = "Pronadji Terensku Jedinicu")
	public void pxd_005_01_get_field_unit_test1() throws Exception {
		// PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		PageBase.id = terenskeJedinice.pokupiIdStavke();
	}

	@Test(groups = "Pronadji Organizaciju")
	public void pxd_004_01_get_company_test1() throws Exception {
		// PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		PageBase.id = organizacije.pokupiIdStavke();
	}

	@Test(groups = "Pronadji Poruku")
	public void pxd_003_01_get_administration_message_test1() throws Exception {
		// PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = pocetna.navigirajNaPoruke();
		poruke.verifikujPoruke();
		PageBase.id = poruke.pokupiIdStavke();
	}
}