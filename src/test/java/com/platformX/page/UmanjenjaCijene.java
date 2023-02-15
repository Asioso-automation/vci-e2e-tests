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
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class UmanjenjaCijene extends PocetnaStranica {

	public UmanjenjaCijene(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")    
	private WebElement brojMjeseciWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement procenatWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajUmanjenjeCijeneWE;
	
	@FindBy(xpath = "//td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public void verifikujUmanjenjaCijene() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Umanjenja cijene')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "UMANJENJA CIJENE", "UMANJENJA CIJENE", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojMjeseciWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenatWE));
	}
	
	public String dodajUmanjenjeCijene() {
		String brojMjeseci = Helper.getRandomNumber(2);
		String procenat = Helper.getRandomNumber(2);
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
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		Thread.sleep(500);
		filterKolona2WE.click();
		Thread.sleep(1000);
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(brojMjeseci);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(jedinstvenElementWE));
		wait.until(ExpectedConditions.visibilityOf(podatakTabela2WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatakTabela2WE.getText().equals(brojMjeseci), "UmanjenjaCijena: Broj mjeseci nije dobar!");
	}
	
	public String izmjeniUmanjenjeCijene() throws InterruptedException {
		String brojMjeseci = Helper.getRandomNumber(2);
		String procenat = Helper.getRandomNumber(2);
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
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		Thread.sleep(1000);
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(brojMjeseci);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela0WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatakTabela0WE.getText().equals("Nema podataka"), "TarifneGrupe: Poruka prazne tabele nije dobra!");
	}
	
	public void dodajPredefinisanoUmanjenjeCijene(String brojMjeseci) {
		String procenat = Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(dodajUmanjenjeCijeneWE));
		dodajUmanjenjeCijeneWE.click();
	}
	
}