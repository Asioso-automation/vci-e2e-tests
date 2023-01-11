package com.platformX.distribution.page;

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
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	 private WebElement poljeNazivWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	 private WebElement poljeStampaniNazivNaDokumentimaWE;

	@FindBy(xpath = "//div[3]/div[3]/div/div/div[1]/div/input")
	 private WebElement poljeJibWE;

	@FindBy(xpath = "//div[4]/div[1]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeMjestoWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '6 - Banja Luka')]")
	 private WebElement odaberiMjestoWE;

	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeUlicaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '10950 - Svetog Save')]")
	 private WebElement odaberiUlicuWE;

	@FindBy(xpath = "//div[4]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljePostaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '78000 - Banja Luka')]")
	 private WebElement odaberiPostuWE;
	
	@FindBy(xpath = "//div[2]/button[1]/span")
	 private WebElement dodajPravnoLiceBtnWE;
	
	@FindBy(xpath = "//tr[2]/td[1]")
	 private WebElement idTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	 private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	 private WebElement filterPoNazivuTabelaWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]/span")
	 private WebElement potvrdiBrisanjeBtnWE;

	public void verifikujPravnaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Pravna lica')]")));
		verifyCommonElements("KUPCI", "PRAVNA LICA", "PRAVNA LICA", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}
	
	public String dodajPravnoLice() throws InterruptedException, FileNotFoundException, IOException {
		String nazivPravnogLica = "Pravno lice " + Helper.getRandomString(5);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.sendKeys(nazivPravnogLica);
		wait.until(ExpectedConditions.elementToBeClickable(poljeStampaniNazivNaDokumentimaWE));
		poljeStampaniNazivNaDokumentimaWE.sendKeys(Helper.getRandomString(6));
		wait.until(ExpectedConditions.elementToBeClickable(poljeJibWE));
		poljeJibWE.sendKeys(Helper.getRandomNumber(13));
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjestoWE));
		poljeMjestoWE.click();
		poljeMjestoWE.sendKeys("6 - Banja Luka");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("10950 - Svetog Save");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.click();
		poljePostaWE.sendKeys("78000 - Banja Luka");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajPravnoLiceBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(dodajPravnoLiceBtnWE));
		dodajPravnoLiceBtnWE.click();
		return nazivPravnogLica;		
	}
	
	public String kreirajPravnoLice() {
		String kupac = idTabelaWE.getText() + " - " + nazivTabelaWE.getText();
		return kupac;
	}
	
	public void verifikujPravnoLice(String nazivPravnogLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuTabelaWE));
		filterPoNazivuTabelaWE.click();
		filterPoNazivuTabelaWE.clear();
		filterPoNazivuTabelaWE.sendKeys(nazivPravnogLica);
		filterPoNazivuTabelaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().contains(nazivPravnogLica),"Pravna lica: Naziv pravnog lica nije dobar!");
	}
	
	public String urediPravnoLice() throws InterruptedException {
		String nazivPravnogLica = "Pravno lice" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.click();
		poljeNazivWE.clear();
		poljeNazivWE.sendKeys(nazivPravnogLica);
		wait.until(ExpectedConditions.elementToBeClickable(dodajPravnoLiceBtnWE));
		dodajPravnoLiceBtnWE.click();
		return nazivPravnogLica;
	}
	
	public void verifikujUredjenoPravnoLice(String nazivPravnogLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuTabelaWE));
		filterPoNazivuTabelaWE.click();
		filterPoNazivuTabelaWE.clear();
		filterPoNazivuTabelaWE.sendKeys(nazivPravnogLica);
		filterPoNazivuTabelaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().contains(nazivPravnogLica),"Pravna lica: Naziv uredjenog pravnog lica nije dobar!");
	}
	
	public void obrisiPravnoLice() throws InterruptedException {
		 wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		 burgerBarWE.click();
		 wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		 obrisiWE.click();
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		 potvrdiBrisanjeBtnWE.click();
    }
	
	public void verifikujBrisanjePravnogLica(String pravnaLica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuTabelaWE));
		Thread.sleep(1000);
		filterPoNazivuTabelaWE.click();
		filterPoNazivuTabelaWE.clear();
		filterPoNazivuTabelaWE.sendKeys(pravnaLica);
		filterPoNazivuTabelaWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Pravna lica: Poruka prazne tabele nije dobra!");
	}

}