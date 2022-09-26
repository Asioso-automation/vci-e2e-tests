package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.platformX.distribution.page.IzvorNapajanjaBrojila;
import com.platformX.distribution.page.KoristenaBrojila;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.LokacijaBrojila;
import com.platformX.distribution.page.MogucnostDaljinskogPristupa;
import com.platformX.distribution.page.NaponskiNivoi;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.ProizvodjaciBrojila;
import com.platformX.distribution.page.RazlogPromjeneLokacije;
import com.platformX.distribution.page.RegistarBrojila;
import com.platformX.distribution.page.RelokacijeBrojila;
import com.platformX.distribution.page.SposobnostPrikljucenjaBrojila;
import com.platformX.distribution.page.StrujniNivoi;
import com.platformX.distribution.page.TipoviBrojila;

public class PX_DIST_Verifikacija_Sekcije_Brojila_Test {

	public PX_DIST_Verifikacija_Sekcije_Brojila_Test() throws IOException, FileNotFoundException {
		super();
	}

	private WebDriver driver;
	private final String PLATFORMX_PROPERTIES = "platformx.properties";

	@Test(description = "test prolazi kroz sve stranice iz sekcije BROJILA i verifikuje ih")
	public void px_dist_verifikacije_sekcije_brojila_test() throws Exception {

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
		KoristenaBrojila koristenaBrojila = pocetna.navigirajNaKoristenaBrojila();
	    koristenaBrojila.verifikujKoristenaBrojila();
	    TipoviBrojila tipoviBrojila = pocetna.navigirajNaTipoviBrojila();
	    tipoviBrojila.verifikujTipoviBrojila();
	    RegistarBrojila registarBrojila = pocetna.navigirajNaRegistarBrojila();
	    registarBrojila.verifikujRegistarBrojila();
	    IzvorNapajanjaBrojila izvorNapajanjaBrojila = pocetna.navigirajNaIzvorNapajanjaBrojila();
	    izvorNapajanjaBrojila.verifikujIzvorNapajanjaBrojila();
	    ProizvodjaciBrojila proizvodjaciBrojila = pocetna.navigirajNaProizvodjaciBrojila();
	    proizvodjaciBrojila.verifikujProizvodjaciBrojila();
	    SposobnostPrikljucenjaBrojila sposobnostPrikljucenjaBrojila = pocetna.navigirajNaSposobnostPrikljucenaBrojila();
	    sposobnostPrikljucenjaBrojila.verifikujSposobnostPrikljucenjaBrojila();
	    MogucnostDaljinskogPristupa mogucnostDaljinskogPristupa = pocetna.navigirajNaMogucnostDaljinskogPristupa();
	    mogucnostDaljinskogPristupa.verifikujMogucnostDaljinskogPristupa();
	    LokacijaBrojila lokacijaBrojila = pocetna.navigirajNaLokacijaBrojila();
	    lokacijaBrojila.verifikujLokacijaBrojila();
	    RelokacijeBrojila relokacijeBrojila = pocetna.navigirajNaRelokacijeBrojila();
	    relokacijeBrojila.verifikujRelokacijeBrojila();
	    RazlogPromjeneLokacije razlogPromjeneLokacije = pocetna.navigirajNaRazlogPromjeneLokacije();
	    razlogPromjeneLokacije.verifikujRazlogPromjeneLokacije();
	    NaponskiNivoi naponskiNivoi = pocetna.navigirajNaNaponskiNivoi();
	    naponskiNivoi.verifikujNaponskiNivoi();
	    StrujniNivoi strujniNivoi = pocetna.navigirajNaStrujniNivoi();
	    strujniNivoi.verifikujStrujniNivoi();
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
}
