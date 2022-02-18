package com.platformX.tests;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import com.platformX.page.LogIn;

public class PX_002_Provjera_Validacija_Na_LogIn_Formi_Test extends BaseTest {

	public PX_002_Provjera_Validacija_Na_LogIn_Formi_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="pogresna lozinka")
	public void px_002_validno_korisnicko_ime_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.provjeraValidacija(platformx_properties.getValue("USER.NAME"), "Pa$$w0rd");
	}
	
	@Test (description="pogrešno korisničko ime")
	public void px_002_validna_lozinka_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.provjeraValidacija("korisnickoime", platformx_properties.getValue("PASSWORD"));
	}
	
	@Test (description="pogrešno korisničko ime i lozinka")
	public void px_002_nevalidni_kredencijali_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.provjeraValidacija("korisnickoime", "Pa$$w0rd");
	}

}