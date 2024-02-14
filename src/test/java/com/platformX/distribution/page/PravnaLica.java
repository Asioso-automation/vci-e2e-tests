package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class PravnaLica extends PocetnaStranicaPXD {
	
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

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '25 - Bijeljina')]")				// 6 - Banja Luka > 25 - Bijeljina
	 private WebElement odaberiMjestoWE;

	@FindBy(xpath = "//div[4]/div[2]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljeUlicaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '1001 - JASENICA III')]")			// 10950 - Svetog Save > 1001 - JASENICA III
	 private WebElement odaberiUlicuWE;

	@FindBy(xpath = "//div[4]/div[4]/div/div/div[1]/div[1]/input[1]")
	 private WebElement poljePostaWE;

	@FindBy(xpath = "//div[contains(@class, 'v-list-item__title') and starts-with(., '76300 - Bijeljina')]")			// 78000 - Banja Luka > 76300 - Bijeljina
	 private WebElement odaberiPostuWE;

	public void verifikujPravnaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Pravna lica')]")));
		verifikacijaZajednickihElemenata("Kupci", "Pravna Lica", "Pravna lica", 10, false, false, true, true, true, true, false);
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
	
	public String dodajPravnoLice(String naziv) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(poljeStampaniNazivNaDokumentimaWE));
		poljeStampaniNazivNaDokumentimaWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(poljeJibWE));
		poljeJibWE.sendKeys(Helper.getRandomNumber(13));
		wait.until(ExpectedConditions.elementToBeClickable(poljeMjestoWE));
		poljeMjestoWE.click();
		poljeMjestoWE.sendKeys("25 - Bijeljina");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiMjestoWE));
		odaberiMjestoWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeUlicaWE));
		poljeUlicaWE.sendKeys("1001 - JASENICA III");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiUlicuWE));
		odaberiUlicuWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePostaWE));
		poljePostaWE.click();
		poljePostaWE.sendKeys("76300 - Bijeljina");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiPostuWE));
		odaberiPostuWE.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;		
	}
	
	public String kreirajPravnoLice() {
		String kupac = podatak2Tabela1WE.getText() + " - " + podatak2Tabela2WE.getText();
		return kupac;
	}
	
	public String urediPravnoLice(String naziv) throws InterruptedException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			burgerBarWE.click();
		}
		catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			Thread.sleep(500);
			burgerBarWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeNazivWE));
		poljeNazivWE.click();
		poljeNazivWE.clear();
		poljeNazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}

}