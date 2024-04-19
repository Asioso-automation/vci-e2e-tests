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
    public void scp_001_1_logIn_logOut_cistoca_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
		logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgCistocaGradiskaWE);
		pocetna.verifikujPocetnuStranicu();
		pocetna.izlogujSe();
		logIn.verifikujLogIn();
	}

    @Test (description="logIn i logOut sa verifikacijama stranica")
    public void scp_001_2_logIn_logOut_grad_gradiska_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
        logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgGradGradiskaWE);
        pocetna.verifikujPocetnuStranicu();
        pocetna.izlogujSe();
        logIn.verifikujLogIn();
    }
    
    @Test (description="logIn i logOut sa verifikacijama stranica")
    public void scp_001_2_logIn_logOut_gas_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
        logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgGasWE);
        pocetna.verifikujPocetnuStranicu();
        pocetna.izlogujSe();
        logIn.verifikujLogIn();
    }
    
    @Test (description="logIn i logOut sa verifikacijama stranica")
    public void scp_001_2_logIn_logOut_vodovod_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
        logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgVodovodGradiskaWE);
        pocetna.verifikujPocetnuStranicu();
        pocetna.izlogujSe();
        logIn.verifikujLogIn();
    }
    
    @Test (description="logIn i logOut sa verifikacijama stranica")
    public void scp_001_2_logIn_logOut_toplana_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
        logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgToplanaGradiskaWE);
        pocetna.verifikujPocetnuStranicu();
        pocetna.izlogujSe();
        logIn.verifikujLogIn();
    }
    
    @Test (description="logIn i logOut sa verifikacijama stranica")
    public void scp_001_2_logIn_logOut_son_test() throws Exception {
        LogIn logIn = new LogIn(driver, SCP_PROPERTIES);
        PocetnaStranica pocetna = new PocetnaStranica(driver);
        logIn.verifikujLogIn();
        logIn.logIn(pocetna.orgSonWE);
        pocetna.verifikujPocetnuStranicu();
        pocetna.izlogujSe();
        logIn.verifikujLogIn();
    }
    
}