package com.platformX.distribution.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.Poste;
import com.platformX.distribution.page.PresjeciVoda;
import com.platformX.distribution.page.PrikljucneSnage;
import com.platformX.distribution.page.SektorDjelatnosti;
import com.platformX.distribution.page.Snabdjevaci;
import com.platformX.distribution.page.TerenskeJedinice;
import com.platformX.distribution.page.TipoviIzolacija;
import com.platformX.distribution.page.TipoviMjernihMostova;
import com.platformX.distribution.page.TipoviPrikljucnogVoda;
import com.platformX.distribution.page.Trafostanice;
import com.platformX.distribution.page.Ulice;
import com.platformX.distribution.page.Vlasnistva;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.LokacijeMjernihMjesta;
import com.platformX.distribution.page.LokacijeMontera;
import com.platformX.distribution.page.MaterijaliOrmaricaBrojila;
import com.platformX.distribution.page.MaterijaliProvodnika;
import com.platformX.distribution.page.MjestaPrikljucenja;
import com.platformX.distribution.page.Monteri;
import com.platformX.distribution.page.NaciniPolaganjaInstalacija;
import com.platformX.distribution.page.NaseljenaMjesta;
import com.platformX.distribution.page.NazivnaStruja;
import com.platformX.distribution.page.Opstine;
import com.platformX.distribution.page.Organizacije;
import com.platformX.distribution.page.Citaci;
import com.platformX.distribution.page.Djelatnosti;
import com.platformX.distribution.page.Entiteti;
import com.platformX.distribution.page.FizickeLokacije;

public class PX_DIST_003_Verifikacija_Sekcije_Sifarnici_Test {

	public PX_DIST_003_Verifikacija_Sekcije_Sifarnici_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private WebDriver driver;
	private final String PLATFORMX_PROPERTIES = "platformx.properties";

	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI i verifikuje ih")
	public void px_dist_003_verifikacije_sekcije_sifarnici_test() throws Exception {
		
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("incognito");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
		} catch (Exception e) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C://Program Files//Google//Chrome//Application//chrome.exe");
			options.addArguments("--start-maximized");
			options.addArguments("incognito");
			options.addArguments("chrome.switches", "--disable-extensions");
			driver = new ChromeDriver(options);
		}
		
		LogIn logIn = new LogIn(driver, PLATFORMX_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		Organizacije organizacije = pocetna.navigirajNaOrganizacije();
		organizacije.verifikujOrganizacije();
		TerenskeJedinice terenskeJedinice = pocetna.navigirajNaTerenskeJedinice();
		terenskeJedinice.verifikujTerenskeJedinice();
		FizickeLokacije fizickeLokacije = pocetna.navigirajNaFizickeLokacije();
		fizickeLokacije.verifikujFizickeLokacije();
		Snabdjevaci snabdjevaci = pocetna.navigirajNaSnabdjevaci();
		snabdjevaci.verifikujSnabdjevaci();
		Citaci citaci = pocetna.navigirajNaCitaci();
		citaci.verifikujCitaci();
		SektorDjelatnosti sektor = pocetna.navigirajNaSektorDjelatnosti();
		sektor.verifikujSektorDjelatnosti();
		Djelatnosti djelatnosti = pocetna.navigirajNaDjelatnosti();
		djelatnosti.verifikujDjelatnosti();
		Entiteti entiteti = pocetna.navigirajNaEntitete();
		entiteti.verifikujEntitete();
		Opstine opstine = pocetna.navigirajNaOpstine();
		opstine.verifikujOpstine();
		NaseljenaMjesta naseljenaMjesta = pocetna.navigirajNaNaseljenaMjesta();
		naseljenaMjesta.verifikujNaseljenaMjesta();
		Poste poste = pocetna.navigirajNaPoste();
		poste.verifikujPoste();
		Ulice ulice = pocetna.navigirajNaUlice();
		ulice.verifikujUlice();
		Monteri monteri = pocetna.navigirajNaMonteri();
		monteri.verifikujMonteri();
		LokacijeMontera lokacije = pocetna.navigirajNaLokacijeMontera();
		lokacije.verifikujLokacijeMontera();
		Trafostanice trafostanice = pocetna.navigirajNaTrafostanice();
		trafostanice.verifikujTrafostanice();
		Vlasnistva vlasnistva = pocetna.navigirajNaVlasnistva();
		vlasnistva.verifikujVlasnistva();
//		dodati Vrste podrucja
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
	
}