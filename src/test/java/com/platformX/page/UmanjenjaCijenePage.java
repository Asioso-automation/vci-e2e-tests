package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UmanjenjaCijenePage extends PocetnaStranica {

	public UmanjenjaCijenePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement brojMjeseciWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement procenatWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajUmanjenjeCijeneWE;
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	private WebElement filterBrojMjeseciWE;
	
	@FindBy(xpath = "//div[4]/div/div[2]/div/div/input")
	private WebElement drugiFilterBrojMjeseciWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement brojMjeseciTabelaWE;
	
	@FindBy(xpath = "//td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;

	public void verifikujUmanjenjaCijene() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Umanjenja cijene')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "UmanjenjaCijene: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("UMANJENJA CIJENE"), "UmanjenjaCijene: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("UMANJENJA CIJENE"), "UmanjenjaCijene: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "UmanjenjaCijene: Broj kolona nije dobar! ");
	}
	
	public String dodajUmanjenjeCijene() {
		String brojMjeseci = getRandomNumbers(2);
		String procenat = getRandomNumbers(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(dodajUmanjenjeCijeneWE));
		dodajUmanjenjeCijeneWE.click();
		return brojMjeseci;
	}
	
	public void verifikujUmanjenjeCijene(String brojMjeseci) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterBrojMjeseciWE));
		Thread.sleep(500);
		filterBrojMjeseciWE.click();
		Thread.sleep(1000);
		filterBrojMjeseciWE.click();
		filterBrojMjeseciWE.clear();
		filterBrojMjeseciWE.sendKeys(brojMjeseci);
		filterBrojMjeseciWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(brojMjeseciTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(brojMjeseciTabelaWE.getText().equals(brojMjeseci), "UmanjenjaCijena: Broj mjeseci nije dobar!");
	}
	
	public String izmjeniUmanjenjeCijene() throws InterruptedException {
		String brojMjeseci = getRandomNumbers(2);
		String procenat = getRandomNumbers(2);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		Thread.sleep(1000);
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.click();
		brojMjeseciWE.clear();
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.click();
		procenatWE.clear();
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(dodajUmanjenjeCijeneWE));
		dodajUmanjenjeCijeneWE.click();
		return brojMjeseci;
	}
	
	public void obrisiUmanjenjeCijene() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeUmanjenjaCijene(String brojMjeseci) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterBrojMjeseciWE));
		filterBrojMjeseciWE.click();
		Thread.sleep(1000);
		filterBrojMjeseciWE.click();
		filterBrojMjeseciWE.clear();
		filterBrojMjeseciWE.sendKeys(brojMjeseci);
		filterBrojMjeseciWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}
	
	public void dodajPredefinisanoUmanjenjeCijene(String brojMjeseci) {
		String procenat = getRandomNumbers(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(dodajUmanjenjeCijeneWE));
		dodajUmanjenjeCijeneWE.click();
	}
	
}