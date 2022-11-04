package com.platformX.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.StavkeZahtjevaZaIskljucenje;
import com.platformX.page.StavkeZahtjevaZaUkljucenje;
import com.platformX.page.StecajeviLikvidacije;
import com.platformX.page.Tuzbe;
import com.platformX.page.UkljucenjaOdStraneODSa;
import com.platformX.page.UkljucenjaPoZahtjevuKupca;
import com.platformX.page.ZahtjeviZaIskljucenje;
import com.platformX.page.ZahtjeviZaUkljucenje;
import com.platformX.distribution.page.MjernaMjesta;
import com.platformX.page.AktivnaIskljucenja;
import com.platformX.page.IskljucenjaOdStraneODSa;
import com.platformX.page.IskljucenjaPoZahtjevuKupca;
import com.platformX.page.LogIn;
import com.platformX.page.Medijacije;
import com.platformX.page.ObrasciBrojaProtokolaOpomenaPredUtuzenje;
import com.platformX.page.Opomene;
import com.platformX.page.OpomenePredUtuzenje;
import com.platformX.page.OtpisiPotrazivanja;

public class PX_009_Verifikacija_Sekcije_Pravni_Odnosi_Test {

	public PX_009_Verifikacija_Sekcije_Pravni_Odnosi_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private WebDriver driver;
	// private PropertiesUtil platformx_properties = null;
	private final String PLATFORMX_PROPERTIES = "platformx.properties";

	@Test (description="test prolazi kroz sve stranice iz sekcija PRAVNI ODNOSI i IZVJESTAJI i verifikuje ih")
	public void px_009_verifikacija_sekcije_pravni_odnosi_test() throws Exception {
		
	try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--window-size=1500,800");
			options.addArguments("incognito");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
			} catch (Exception e) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
			options.setBinary("C://Program Files//Google//Chrome//Application//chrome.exe");
		    options.addArguments("--start-maximized");
//			options.addArguments("--window-size=1366,768");
			options.addArguments("incognito");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
//			driver.manage().window().maximize();
			  }
		// Test ne radi u prozoru odredjene velicine, zbog puno stavki u sekciji, zato je ovaj test maximized
		
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Opomene opomene = pocetna.navigirajNaOpomene();
		opomene.verifikujOpomene();
		ZahtjeviZaIskljucenje zahtjeviZaIskljucenje = pocetna.navigirajNaZahtjeviZaIskljucenje();
		zahtjeviZaIskljucenje.verifikujZahtjeviZaIskljucenje();
		StavkeZahtjevaZaIskljucenje stavke = pocetna.navigirajNaStavkeZahtjevaZaIskljucenje();
		stavke.verifikujStavkeZahtjevaZaIskljucenja();
		IskljucenjaOdStraneODSa iskljucenjaOdStraneODSa = pocetna.navigirajNaIskljucenjaOdStraneODSa();
		iskljucenjaOdStraneODSa.verifikujIskljucenjaOdStraneODSa();
		IskljucenjaPoZahtjevuKupca iskljucenjaPoZahtjevuKupca = pocetna.navigirajNaIskljucenjaPoZahtjevuKupca();
		iskljucenjaPoZahtjevuKupca.verifikujIskljucenjaPoZahtjevuKupca();
		AktivnaIskljucenja aktivnaIskljucenja = pocetna.navigirajNaAktivnaIskljucenja();
		aktivnaIskljucenja.verifikujAktivnaIskljucenja();
		ZahtjeviZaUkljucenje zahtjeviZaUkljucenje = pocetna.navigirajNaZahtjeviZaUkljucenje();
		zahtjeviZaUkljucenje.verifikujZahtjeviZaUkljucenje();
		StavkeZahtjevaZaUkljucenje stavkeUkljucenja = pocetna.navigirajNaStavkeZahtjevaZaUkljucenje();
		stavkeUkljucenja.verifikujStavkeZahtjevaZaUkljucenja();
		UkljucenjaOdStraneODSa ukljucenjaOdStraneODSa = pocetna.navigirajNaUkljucenjaOdStraneODSa();
		ukljucenjaOdStraneODSa.verifikujUkljucenaOdStraneODSa();
		UkljucenjaPoZahtjevuKupca ukljucenjaPoZahtjevuKupca = pocetna.navigirajNaUkljucenjaPoZahtjevuKupca();
		ukljucenjaPoZahtjevuKupca.verifikujUkljucenaPoZahtjevuKupca();
		OpomenePredUtuzenje opomenePredUtuzenje = pocetna.navigirajNaOpomenePredUtuzenje();
		opomenePredUtuzenje.verifikujOpomenePredUtuzenje();
		ObrasciBrojaProtokolaOpomenaPredUtuzenje obrasciBrojaProtokolaOpomenaPredUtuzenje = pocetna.navigirajNaObrasciBrojaProtokolaOpomenaPredUtuzenje();
		obrasciBrojaProtokolaOpomenaPredUtuzenje.verifikujObrasciBrojaProtokolaOpomenaPredUtuzenje();
		Tuzbe tuzbe = pocetna.navigirajNaTuzbe();
		tuzbe.verifikujTuzbe();
		StecajeviLikvidacije stecajevi = pocetna.navigirajNaStecajeviLikvidacije();
		stecajevi.verifikujStecajeviLikvidacije();
		Medijacije medijacije = pocetna.navigirajNaMedijacije();
		medijacije.verifikujMedijacije();
		//OtpisiPotrazivanja otpisiPotrazivanja = pocetna.navigirajNaOtpisiPotrazivanja();
		//otpisiPotrazivanja.verifikujOtpisiPotrazivanja();
		
	}
	@AfterTest
	public void terminateBrowser(){
	driver.quit();
	}
	
}