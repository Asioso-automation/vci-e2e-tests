package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class PravnaLica extends PocetnaStranica {

	public PravnaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	// Elementi sa forme za dodavanje pravnog lica

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivPravnogLicaWE;

	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement stampaniNazivNaDokumentimaWE;

	@FindBy(xpath = "//div[3]/div[6]/div/div/div[1]/div/input")
	private WebElement jibWE;
	
	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement nadlezniODSWE;
	
	@FindBy(xpath = "//*[contains(text(), '1 - New York')]")
	private WebElement odaberiODSWE;

	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement postaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	private WebElement odaberiPostuWE;

	@FindBy(xpath = "//div[5]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement mjestoWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1 - Banja')]")
	private WebElement odaberiMjestoWE;

	@FindBy(xpath = "//div[5]/div[2]/div/div/div[1]/div[1]/input[1]")
	private WebElement ulicaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '6 - Nikole Tesle')]")
	private WebElement odaberiUlicuWE;

	@FindBy(xpath = "//div[5]/div[3]/div/div/div[1]/div/input")
	private WebElement brojUliceWE;

	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajPravnoLiceBtnWE;
	
	@FindBy(xpath = "//main/div/div/div/div[1]/header/div/button[1]")
	private WebElement urediPravnoLiceBtnWE;
	
	@FindBy(xpath = "//td[12]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public void verifikujPravnaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Pravna lica')]")));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdgovorniODSWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdgovornoLiceWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJIBWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIBWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznikWE));
	    wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "PravnaLica: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("PRAVNA LICA"), "PravnaLica: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("PRAVNA LICA"), "PravnaLica: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "PravnaLica: Broj kolona nije dobar! ");
	}

	public String dodajPravnoLice() throws InterruptedException {
		String nazivPravnogLica = "Pravno lice " + Helper.getRandomString(5);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivPravnogLicaWE));
		nazivPravnogLicaWE.sendKeys(nazivPravnogLica);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivNaDokumentimaWE));
		stampaniNazivNaDokumentimaWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(jibWE));
		jibWE.sendKeys(Helper.getRandomNumber(13));
		wait.until(ExpectedConditions.elementToBeClickable(nadlezniODSWE));
		nadlezniODSWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiODSWE));
		odaberiODSWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(postaWE));
		postaWE.sendKeys("78000 - Banja Luka");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, -250)");
		wait.until(ExpectedConditions.elementToBeClickable(mjestoWE));
		mjestoWE.sendKeys("1 - Banja Luka");
		wait.until(ExpectedConditions.visibilityOf(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ulicaWE));
		ulicaWE.sendKeys("6 - Nikole Tesle");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		// wait.until(ExpectedConditions.visibilityOf(odaberiUlicuWE));
		// ulicaWE.sendKeys(Keys.ENTER);
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojUliceWE));
		brojUliceWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(dodajPravnoLiceBtnWE));
		dodajPravnoLiceBtnWE.click();
		Thread.sleep(1000);
		return nazivPravnogLica;
	}

	public void verifikujPravnoLice(String nazivPravnogLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		Thread.sleep(500);
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(nazivPravnogLica);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela2WE));
		assertTrue(podatakTabela2WE.getText().contains(nazivPravnogLica),
				"Pravna lica: Naziv pravnog lica nije dobar!");
	}

	public String kreirajKupca() {
		String kupac = podatakTabela1WE.getText() + " - " + podatakTabela2WE.getText();
		return kupac;
	}

	public void verifikujDetaljePravnogLica() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Pravno lice')]")));
		wait.until(ExpectedConditions.elementToBeClickable(urediPravnoLiceBtnWE));
	}
	
	public String izmjeniPravnoLice() throws InterruptedException {
		String nazivPravnogLica = "Pravno lice " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivPravnogLicaWE));
		nazivPravnogLicaWE.click();
		nazivPravnogLicaWE.clear();
		nazivPravnogLicaWE.sendKeys(nazivPravnogLica);
		wait.until(ExpectedConditions.elementToBeClickable(dodajPravnoLiceBtnWE));
		dodajPravnoLiceBtnWE.click();
		return nazivPravnogLica;
	}
	
	public void obrisiPravnoLice() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjePravnogLica(String pravnoLice) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterKolona2WE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(pravnoLice);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela0WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatakTabela0WE.getText().equals("Nema podataka"), "PravnaLica: Poruka prazne tabele nije dobra!");
	}

}