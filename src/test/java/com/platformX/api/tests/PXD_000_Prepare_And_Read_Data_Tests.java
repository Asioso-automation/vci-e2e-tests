package com.platformX.api.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.base.RestApiBase;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.Organizacije;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.Poruke;
import com.platformX.util.PropertiesUtil;
import data.GlobalVariables;

public class PXD_000_Prepare_And_Read_Data_Tests extends BaseTest {

	RestApiBase restApiBase = new RestApiBase();
	protected static final String API_PROPERTIES = "api.properties";
	protected PropertiesUtil properties = new PropertiesUtil(API_PROPERTIES);

	public PXD_000_Prepare_And_Read_Data_Tests() throws IOException {
		super();
	}

	@Test(groups = "Pronadji Poruku")
	public void pxd_003_01_get_administration_message_id_test() throws Exception {
		// PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Poruke poruke = new Poruke(driver);
		poruke.navigirajVerifikujPoruke();
		GlobalVariables.id = poruke.pokupiIdStavkeString();
	}
	
	@Test(groups = "Pronadji Organizaciju")
	public void pxd_004_01_get_company_id_test() throws Exception {
		// PXD UI
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = new Organizacije(driver);
		organizacije.navigirajVerifikujOrganizacije();
		GlobalVariables.id = organizacije.pokupiIdStavkeString();
	}

}