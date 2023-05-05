package com.platformX.distribution.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.distribution.page.PocetnaStranicaPXD;
import com.platformX.distribution.page.RazlogNeizvrsavanjaZahtjeva;
import com.platformX.distribution.page.UgovorOPrikljucenju;
import com.platformX.distribution.page.ZahtjeviZaDostavuPodataka;
import com.platformX.distribution.page.ZahtjeviZaIskljucenja;
import com.platformX.distribution.page.ZahtjeviZaUkljucenja;
import com.platformX.distribution.page.ZbirnaKontrolnaMjernaMjesta;
import com.platformX.distribution.page.AktivnaIskljucenjaMjernihMjesta;
import com.platformX.distribution.page.DeklaracijaOPrikljucku;
import com.platformX.distribution.page.ElektroenergetskeSaglasnosti;
import com.platformX.distribution.page.EnergetskaKartica;
import com.platformX.distribution.page.IndirektnaMjernaMjesta;
import com.platformX.distribution.page.KontrolaMjernogMjesta;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.MjernaMjesta;

public class PX_DIST_006_Verifikacija_Sekcije_Mjerna_Mjesta_Test {

	public PX_DIST_006_Verifikacija_Sekcije_Mjerna_Mjesta_Test() throws IOException, FileNotFoundException {
		super();
	}

	private WebDriver driver;
	private final String PLATFORMX_DISTRIBUTION_PROPERTIES = "platformx.distribution.properties";

	@Test(description = "test prolazi kroz sve stranice iz sekcije MJERNA MJESTA i verifikuje ih")
	public void px_dist_006_verifikacije_sekcije_mjerna_mjesta_test() throws Exception {

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

		LogIn logIn = new LogIn(driver, PLATFORMX_DISTRIBUTION_PROPERTIES);
		logIn.verifikujLogIn();
		logIn.logIn();
		PocetnaStranicaPXD pocetna = new PocetnaStranicaPXD(driver);
		pocetna.verifikujPocetnuStranicu();
		MjernaMjesta mjernaMjesta = pocetna.navigirajNaMjernaMjesta();
		mjernaMjesta.verifikujMjernaMjesta();
		ZbirnaKontrolnaMjernaMjesta zbirnaMjernaMjesta = pocetna.navigirajNaZbirnaKontrolnaMjernaMjesta();
		zbirnaMjernaMjesta.verifikujZbirnaKontrolnaMjernaMjesta();
		EnergetskaKartica kartica = pocetna.navigirajNaEnergetskaKartica();
		kartica.verifikujEnergetskaKartica();
		ZahtjeviZaDostavuPodataka zahtjeviZaDostavu = pocetna.navigirajNaZahtjeviZaDostavuPodataka();
		zahtjeviZaDostavu.verifikujZahtjeviZaDostavuPodataka();
		ZahtjeviZaIskljucenja zahtjeviZaIskljucenja = pocetna.navigirajNaZahtjeviZaIskljucenja();
		zahtjeviZaIskljucenja.verifikujZahtjeviZaIskljucenja();
		ZahtjeviZaUkljucenja zahtjeviZaUkljucenja = pocetna.navigirajNaZahtjeviZaUkljucenja();
		zahtjeviZaUkljucenja.verifikujZahtjeviZaUkljucenja();
		RazlogNeizvrsavanjaZahtjeva razlogNeizvrsavanjaZahtjeva = pocetna.navigirajNaRazlogNeizvrsavanjaZahtjeva();
		razlogNeizvrsavanjaZahtjeva.verifikujRazlogNeizvrsavanjaZahtjeva();
		AktivnaIskljucenjaMjernihMjesta aktivnaIskljucenjaMjernihMjesta = pocetna.navigirajNaAktivnaIskljucenjaMjernihMjesta();
		aktivnaIskljucenjaMjernihMjesta.verifikujAktivnaIskljucenjaMjernihMjesta();
		IndirektnaMjernaMjesta indirektnaMjernaMjesta = pocetna.navigirajNaIndirektnaMjernaMjesta();
		indirektnaMjernaMjesta.verifikujIndirektnaMjernaMjesta();
		KontrolaMjernogMjesta kontrolaMjernogMjesta = pocetna.navigirajNaKontrolaMjernogMjesta();
		kontrolaMjernogMjesta.verifikujKontrolaMjernogMjesta();
		ElektroenergetskeSaglasnosti elektroenergetskeSaglasnosti = pocetna.navigirajNaElektroenergetskeSaglasnosti();
		elektroenergetskeSaglasnosti.verifikujElektroenergetskeSaglasnosti();
		UgovorOPrikljucenju ugovorOPrikljucenju = pocetna.navigirajNaUgovorOPrikljucenju();
		ugovorOPrikljucenju.verifikujUgovorOPrikljucenju();
		DeklaracijaOPrikljucku deklaracijaOPrikljucku = pocetna.navigirajNaDeklaracijaOPrikljucku();
		deklaracijaOPrikljucku.verifikujDeklaracijaOPrikljucku();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}

}