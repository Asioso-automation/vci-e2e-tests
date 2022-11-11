package com.platformX.distribution.page;

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

public class Monteri extends PocetnaStranica {

	public Monteri(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement imePrezimeWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajMonteraWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoImePrezimeWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement imePrezimeTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public void verifikujMonteri() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Monteri')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeIprezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Monteri: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MONTERI"), "Monteri: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MONTERI"), "Monteri: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "Monteri: Broj kolona nije dobar! ");
	}
	
	public String dodajMontera()throws InterruptedException{
		String naziv = "Monter" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(dodajMonteraWE));
		dodajMonteraWE.click();
		return naziv;
	}
	
	public void verifikujMontera(String naziv)throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(filterPoImePrezimeWE));
		Thread.sleep(1000);
		filterPoImePrezimeWE.click();
		filterPoImePrezimeWE.clear();
		filterPoImePrezimeWE.sendKeys(naziv);
		filterPoImePrezimeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imePrezimeTabelaWE));
		assertTrue(imePrezimeTabelaWE.getText().equals(naziv), "Ulice: Ulica nije pronadjena!");	
	}
	
	public String urediMontera()throws InterruptedException{
		String monter = "Monter" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.click();
		imePrezimeWE.clear();
		imePrezimeWE.sendKeys(monter);
		wait.until(ExpectedConditions.elementToBeClickable(dodajMonteraWE));
		dodajMonteraWE.click();
		return monter;
	}
	
	public void obrisiMontera()throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeMontera(String monter) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(filterPoImePrezimeWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoImePrezimeWE));
		filterPoImePrezimeWE.click();
		filterPoImePrezimeWE.clear();
		filterPoImePrezimeWE.sendKeys(monter);
		filterPoImePrezimeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Monteri: Poruka prazne tabele nije dobra!");
	}
	
}