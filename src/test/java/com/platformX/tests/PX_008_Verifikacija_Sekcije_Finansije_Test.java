package com.platformX.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.platformX.page.Avansi;
import com.platformX.page.Banke;
import com.platformX.page.DnevniciUplata;
import com.platformX.page.FinansijskeKartice;
import com.platformX.page.PocetnaStranica;
import com.platformX.page.PreknjizavanjaUplata;
import com.platformX.page.LogIn;
import com.platformX.page.NerasporedjeneUplate;
import com.platformX.page.Reprogrami;
import com.platformX.page.Sap;
import com.platformX.page.SveUplate;
import com.platformX.page.Uino;
import com.platformX.page.VrsteKnjizenja;
import com.platformX.page.VrsteStavkiFinansijskeKartice;
import com.platformX.page.ZiroRacuni;

public class PX_008_Verifikacija_Sekcije_Finansije_Test {

	public PX_008_Verifikacija_Sekcije_Finansije_Test() throws IOException, FileNotFoundException {
		super();
	}

	private WebDriver driver;
	private final String PLATFORMX_PROPERTIES = "platformx.properties";

	@Test(description = "test prolazi kroz sve stranice iz sekcije FINANSIJE i verifikuje ih")
	public void px_008_verifikacija_sekcije_finansije_test() throws Exception {

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
		FinansijskeKartice finansijskeKartice = pocetna.navigirajNaFinansijskeKartice();
		finansijskeKartice.verifikujFinansijskeKartice();
		DnevniciUplata dnevniciUplata = pocetna.navigirajNaDnevniciUplata();
		dnevniciUplata.verifikujDnevniciUplata();
		PreknjizavanjaUplata preknjizavanja = pocetna.navigirajNaPreknjizavanjaUplata();
		preknjizavanja.verifikujPreknjizavanjaUplata();
		SveUplate sveUplate = pocetna.navigirajNaSveUplate();
		sveUplate.verifikujSveUplate();
		NerasporedjeneUplate nerasporedjeneUplate = pocetna.navigirajNaNerasporedjeneUplate();
		nerasporedjeneUplate.verifikujNerasporedjeneUplate();
		Avansi avansi = pocetna.navigirajNaAvansi();
		avansi.verifikujAvansi();
		Reprogrami reprogrami = pocetna.navigirajNaReprogrami();
		reprogrami.verifikujReprogrami();

		// TODO OBRASCI BROJA UGOVORA REPROGRAMA

		Banke banke = pocetna.navigirajNaBanke();
		banke.verifikujBanke();
		ZiroRacuni ziroRacuni = pocetna.navigirajNaZiroRacuni();
		ziroRacuni.verifikujZiroRacuni();
		VrsteKnjizenja vrsteKnjizenja = pocetna.navigirajNaVrsteKnjizenja();
		vrsteKnjizenja.verifikujVrsteKnjizenja();

		// TODO VRSTE FINANSIJSKIH KARTICA

		VrsteStavkiFinansijskeKartice vrsteStavkiFinansijskeKartice = pocetna
				.navigirajNaVrsteStavkiFinansijskeKartice();
		vrsteStavkiFinansijskeKartice.verifikujVrsteStavkiFinansijskeKartice();
		Sap sap = pocetna.navigirajNaSap();
		sap.verifikujSap();
		Uino uino = pocetna.navigirajNaUino();
		uino.verifikujUino();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}

}