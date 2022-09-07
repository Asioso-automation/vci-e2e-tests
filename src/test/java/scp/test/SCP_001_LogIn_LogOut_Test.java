package scp.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.base.BaseTest;
import scp.page.PocetnaStranica;

import scp.page.LogIn;

public class SCP_001_LogIn_LogOut_Test extends BaseTest {

	public SCP_001_LogIn_LogOut_Test() throws IOException, FileNotFoundException {
		super();
	}

	@Test (description="logIn i logOut sa verifikacijama stranica")
	public void scp_001_logIn_logOut_test() throws Exception {
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		pocetna.izlogujSe();
		logIn.verifikujLogIn();
	}

}