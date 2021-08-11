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

public class PravnaLicaPage extends PocetnaStranica {

	public PravnaLicaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;

	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivPravnogLicaTabelaWE;

	@FindBy(xpath = "//tr[2]/td[1]")
	private WebElement idTabelaWE;

	// Elementi sa forme za dodavanje pravnog lica

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivPravnogLicaWE;

	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement stampaniNazivNaDokumentimaWE;

	@FindBy(xpath = "//div[3]/div[6]/div/div/div[1]/div/input")
	private WebElement jibWE;

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

	public void verifikujPravnaLica() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Pravna lica')]")));
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
		String nazivPravnogLica = "Pravno lice " + getRandomName();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivPravnogLicaWE));
		nazivPravnogLicaWE.sendKeys(nazivPravnogLica);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivNaDokumentimaWE));
		stampaniNazivNaDokumentimaWE.sendKeys(getRandomName());
		wait.until(ExpectedConditions.elementToBeClickable(jibWE));
		jibWE.sendKeys(getRandomNumbers(13));
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
		wait.until(ExpectedConditions.visibilityOf(odaberiUlicuWE));
		ulicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(brojUliceWE));
		brojUliceWE.sendKeys(getRandomNumbers(2));
		wait.until(ExpectedConditions.elementToBeClickable(dodajPravnoLiceBtnWE));
		dodajPravnoLiceBtnWE.click();
		Thread.sleep(1000);
		return nazivPravnogLica;
	}

	public void verifikujPravnoLice(String nazivPravnogLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.sendKeys(nazivPravnogLica);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivPravnogLicaTabelaWE));
		assertTrue(nazivPravnogLicaTabelaWE.getText().contains(nazivPravnogLica),
				"Pravna lica: Naziv pravnog lica nije dobar!");
	}

	public String kreirajKupca() {
		String kupac = idTabelaWE.getText() + " - " + nazivPravnogLicaTabelaWE.getText();
		return kupac;
	}

	public void verifikujDetaljePravnogLica() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Pravno lice')]")));
		wait.until(ExpectedConditions.elementToBeClickable(urediPravnoLiceBtnWE));
	}

}