package com.platformX.distribution.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.platformX.distribution.page.KlaseTacnostiBrojila;
import com.platformX.distribution.page.KlaseTacnostiNaponskogTransformatora;
import com.platformX.distribution.page.KlaseTacnostiStrujnogTransformatora;
import com.platformX.distribution.page.LogIn;
import com.platformX.distribution.page.LokacijeMjernihMjesta;
import com.platformX.distribution.page.MaterijaliOrmaricaBrojila;
import com.platformX.distribution.page.MaterijaliProvodnika;
import com.platformX.distribution.page.MjestaPrikljucenja;
import com.platformX.distribution.page.NaciniPlacanja;
import com.platformX.distribution.page.NaciniPolaganjaInstalacija;
import com.platformX.distribution.page.NaciniUpravljanjaPotrosnjom;
import com.platformX.distribution.page.NazivnaStruja;
import com.platformX.distribution.page.NazivneStrujeBrojila;
import com.platformX.distribution.page.NazivneStrujeOsiguraca;
import com.platformX.distribution.page.PocetnaStranica;
import com.platformX.distribution.page.PresjeciVoda;
import com.platformX.distribution.page.PrikljucneSnage;
import com.platformX.distribution.page.RazloziPribavljanjaEES;
import com.platformX.distribution.page.RokoviVazenja;
import com.platformX.distribution.page.SistemiZastiteOdIndDodira;
import com.platformX.distribution.page.SistemiZastiteOdPrenapona;
import com.platformX.distribution.page.TipoviIzolacija;
import com.platformX.distribution.page.TipoviMjernihMostova;
import com.platformX.distribution.page.TipoviPrikljucnogVoda;
import com.platformX.distribution.page.TipoviStandardnogPrikljucka;
import com.platformX.distribution.page.VrsteImpulsnihUredjaja;
import com.platformX.distribution.page.VrsteObjekata;
import com.platformX.distribution.page.VrsteUpravljackihUredjaja;
import com.platformX.distribution.page.VrsteZastitnihUredjaja;

public class PX_DIST_004_Verifikacija_Sekcije_Sifarnici_Za_Zapisnike_Test {
	
	public PX_DIST_004_Verifikacija_Sekcije_Sifarnici_Za_Zapisnike_Test() throws IOException, FileNotFoundException {
		super();
	}
	
	private WebDriver driver;
	private final String PLATFORMX_DISTRIBUTION_PROPERTIES = "platformx.distribution.properties";

	@Test (description="test prolazi kroz sve stranice iz sekcije SIFARNICI ZA ZAPISNIKE i verifikuje ih")
	public void px_dist_004_verifikacije_sekcije_sifarnici_za_zapisnike_test() throws Exception {
		
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
		PocetnaStranica pocetna = new PocetnaStranica(driver);
		pocetna.verifikujPocetnuStranicu();
		NaciniPolaganjaInstalacija naciniPolaganjaInstalacija = pocetna.navigirajNaNaciniPolaganjaInstalacija();
		naciniPolaganjaInstalacija.verifikujNaciniPolaganjaInstalacija();
		NazivnaStruja nazivnaStruja = pocetna.navigirajNaNazivnaStruja();
		nazivnaStruja.verifikujNazivnaStruja();
		MaterijaliOrmaricaBrojila materijaliOrmaricaBrojila = pocetna.navigirajNaMaterijaliOrmaricaBrojila();
		materijaliOrmaricaBrojila.verifikujMaterijaliOrmaricaBrojila();
		LokacijeMjernihMjesta lokacijeMjernihMjesta = pocetna.navigirajNaLokacijeMjernihMjesta();
		lokacijeMjernihMjesta.verifikujLokacijeMjernihMjesta();
		TipoviMjernihMostova tipoviMjernihMostova = pocetna.navigirajNaTipoviMjernihMostova();
		tipoviMjernihMostova.verifikujTipoviMjernihMostova();
		TipoviIzolacija tipoviIzolacija = pocetna.navigirajNaTipoviIzolacija();
		tipoviIzolacija.verifikujTipoviIzolacija();
		MjestaPrikljucenja mjestaPrikljucenja = pocetna.navigirajNaMjestaPrikljucenja();
		mjestaPrikljucenja.verifikujMjestaPrikljucenja();
		PresjeciVoda presjeciVoda = pocetna.navigirajNaPresjeciVoda();
		presjeciVoda.verifikujPresjeciVoda();
		MaterijaliProvodnika materijaliProvodnika = pocetna.navigirajNaMaterijaliProvodnika();
		materijaliProvodnika.verifikujMaterijaliProvodnika();
		TipoviPrikljucnogVoda tipoviPrikljucnogVoda = pocetna.navigirajNaTipoviPrikljucnogVoda();
		tipoviPrikljucnogVoda.verifikujTipoviPrikljucnogVoda();
		PrikljucneSnage prikljucneSnage = pocetna.navigirajNaPrikljucneSnage();
		prikljucneSnage.verifikujPrikljucneSnage();
		NaciniUpravljanjaPotrosnjom naciniUpravljanjaPotrosnjom = pocetna.navigirajNaNaciniUpravljanjaPotrosnjom();
		naciniUpravljanjaPotrosnjom.verifikujNaciniUpravljanjaPotrosnjom();
		VrsteUpravljackihUredjaja vrsteUpravljackihUredjaja = pocetna.navigirajNaVrsteUpravljackihUredjaja();
		vrsteUpravljackihUredjaja.verifikujVrsteUpravljackihUredjaja();
		VrsteImpulsnihUredjaja vrsteImpulsnihUredjaja = pocetna.navigirajNaVrsteImpulsnihUredjaja();
		vrsteImpulsnihUredjaja.verifikujVrsteImpulsnihUredjaja();
		SistemiZastiteOdIndDodira sistemiZastiteOdIndDodira = pocetna.navigirajNaSistemiZastiteOdIndDodira();
		sistemiZastiteOdIndDodira.verifikujSistemiZastiteOdIndDodira();
		KlaseTacnostiBrojila klaseTacnostiBrojila = pocetna.navigirajNaKlaseTacnostiBrojila();
		klaseTacnostiBrojila.verifikujKlaseTacnostiBrojila();
		NazivneStrujeBrojila nazivneStrujeBrojila = pocetna.navigirajNaNazivneStrujeBrojila();
		nazivneStrujeBrojila.verifikujNazivneStrujeBrojila();
		SistemiZastiteOdPrenapona sistemiZastiteOdPrenapona = pocetna.navigirajNaSistemiZastiteOdPrenapona();
		sistemiZastiteOdPrenapona.verifikujSistemiZastiteOdPrenapona();
		VrsteZastitnihUredjaja vrsteZastitnihUredjaja = pocetna.navigirajNaVrsteZastitnihUredjaja();
		vrsteZastitnihUredjaja.verifikujVrsteZastitnihUredjaja();
		RokoviVazenja rokoviVazenja = pocetna.navigirajNaRokoviVazenja();
		rokoviVazenja.verifikujRokoveVazenja();
		RazloziPribavljanjaEES razloziPribavljanjaEES = pocetna.navigirajNaRazloziPribavljanjaEES();
		razloziPribavljanjaEES.verifikujRazlogePribavljanjaEES();
		VrsteObjekata vrsteObjekata = pocetna.navigirajNaVrsteObjekata();
		vrsteObjekata.verifikujVrsteObjekata();
		TipoviStandardnogPrikljucka tipoviStandardnogPrikljucka = pocetna.navigirajNaTipoviStandardnogPrikljucka();
		tipoviStandardnogPrikljucka.verifikujTipoveStandardnogPrikljucka();
		NaciniPlacanja naciniPlacanja = pocetna.navigirajNaNaciniPlacanja();
		naciniPlacanja.verifikujNacinePlacanja();
		KlaseTacnostiStrujnogTransformatora klaseTacnostiStrujnogTransformatora = pocetna.navigirajNaKlaseTacnostiStrujnogTransformatora();
		klaseTacnostiStrujnogTransformatora.verifikujKlaseTacnostiStrujnogTransformatora();
		NazivneStrujeOsiguraca nazivneStrujeOsiguraca = pocetna.navigirajNaNazivneStrujeOsiguraca();
		nazivneStrujeOsiguraca.verifikujNazivneStrujeOsiguraca();
		KlaseTacnostiNaponskogTransformatora klaseTacnostiNaponskogTransformatora = pocetna.navigirajNaKlaseTacnostiNaponskogTransformatora();
		klaseTacnostiNaponskogTransformatora.verifikujKlaseTacnostiNaponskogTransformatora();
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
	
}