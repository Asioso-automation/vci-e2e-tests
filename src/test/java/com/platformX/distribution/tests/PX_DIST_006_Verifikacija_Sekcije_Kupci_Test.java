package com.platformX.distribution.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.FizickaLica;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.PravnaLica;
import com.platformX.distribution.page.ZahtjeviZaDostavuPodatakaKUPCI;

public class PX_DIST_006_Verifikacija_Sekcije_Kupci_Test {

	public PX_DIST_006_Verifikacija_Sekcije_Kupci_Test() throws IOException, FileNotFoundException {
		super();
	}

	private WebDriver driver;
	private final String PLATFORMX_PROPERTIES = "platformx.properties";

	@Test(description = "test prolazi kroz sve stranice iz sekcije KUPCI i verifikuje ih")
	public void px_dist_005_verifikacije_sekcije_kupci_test() throws Exception {

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
		PravnaLica pravnaLica = pocetna.navigirajNaPravnaLica();
		pravnaLica.verifikujPravnaLica();
		FizickaLica fizickaLica = pocetna.navigirajNaFizickaLica();
		fizickaLica.verifikujFizickaLica();
		ZahtjeviZaDostavuPodatakaKUPCI zahtjeviZaDostavuPodatakaKupci = pocetna.navigirajNaZahtjeviZaDostavuPodatakaKUPCI();
		zahtjeviZaDostavuPodatakaKupci.verifikujZahtjeviZaDostavuPodatakaKUPCI();
		
	
	}

	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}

}