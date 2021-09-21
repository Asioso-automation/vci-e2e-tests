package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.LogInPage;

public class PX_002_Provjera_Validacija_Na_LogIn_Formi_Test extends BaseTest {

	public PX_002_Provjera_Validacija_Na_LogIn_Formi_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	// Verifikacije bezuspjesnog logovanja

	@Test
	public void px_002_validno_korisnicko_ime_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.provjeraValidacija("nebojsa.milojevic", "Pa$$w0rd");
	}
	
	@Test
	public void px_002_validna_lozinka_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.provjeraValidacija("korisnickoime", "Q4NesoMil1");
	}
	
	@Test
	public void px_002_nevalidni_kredencijali_test() throws Exception {
		LogInPage logInPage = new LogInPage(driver, PLATFORMX_PROPERTIES);
		logInPage.verifyLogInPage();
		logInPage.provjeraValidacija("korisnickoime", "Pa$$w0rd");
	}

}