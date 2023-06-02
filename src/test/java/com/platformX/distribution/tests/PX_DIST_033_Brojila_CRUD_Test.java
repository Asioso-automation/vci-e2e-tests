package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.platformX.base.BaseTest;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RegistarBrojila;

public class PX_DIST_033_Brojila_CRUD_Test  extends BaseTest {

	public PX_DIST_033_Brojila_CRUD_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	@Test
	public void px_dist_033_1_dodavanje_brojila_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD homePage = new PocetnaStranicaPXD(driver);
		homePage.verifikujPocetnuStranicu();
		RegistarBrojila registarBrojilaPage = homePage.navigirajNaRegistarBrojila();
		registarBrojilaPage.verifikujRegistarBrojila();
		String brojilo = registarBrojilaPage.dodajBrojilo();
		registarBrojilaPage.verifikujBrojilo(brojilo);
	}

}