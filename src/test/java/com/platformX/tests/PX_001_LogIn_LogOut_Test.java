package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.base.RetryAnalyzer;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.LogIn;

public class PX_001_LogIn_LogOut_Test extends BaseTest {

	public PX_001_LogIn_LogOut_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (retryAnalyzer = RetryAnalyzer.class, description="logIn i logOut sa verifikacijama stranica")
	public void px_001_logIn_logOut_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		pocetna.logOut();
		logIn.verifikujLogIn();
	}

}