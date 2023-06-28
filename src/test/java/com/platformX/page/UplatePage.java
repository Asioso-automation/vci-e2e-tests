package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.util.Helper;

public class UplatePage extends PocetnaStranica {

	public UplatePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//tr[2]/td[6]") 
	private WebElement uplatilacImeWE;
	
	// Kreiraj uplatu elementi
	
	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div[1]/input[1]") 
	private WebElement pozivNaBrojWE;
	
	@FindBy(xpath = "//div/span") 
	private WebElement odaberiBrojWE;
	
	@FindBy(xpath = "//body/div/div[2]/div/div/div") 
	private WebElement odaberiKupcaWE;
	
	@FindBy(xpath = "//div[3]/div[1]/div/div/div[1]/div/input") 
	private WebElement uplatilacWE;
	
	@FindBy(xpath = "//form/div[1]/div/div[2]/div[1]/div/div/div[1]/div[1]/input[1]") 
	private WebElement kupacWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-list-item__content') and starts-with(., '4100010 - Firma 2')]") 
	private WebElement odaberiKupca1WE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input") 
	private WebElement iznosWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/button") 
	private WebElement obrisiBrojWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div/button") 
	private WebElement obrisiKupcaWE;
	
	public String dodajUplatu() throws InterruptedException {
		String uplatilac = "Uplatilac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		 assertTrue(porukaWE.getText().equals("Uspješno završeno."), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public String dodajUplatuPozivNaBroj() throws InterruptedException {
		String uplatilac = "Uplatilac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		 assertTrue(porukaWE.getText().equals("Uspješno završeno."), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public String obrisiPozivNaBroj() throws InterruptedException {
		String uplatilac = "Uplatilac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(obrisiBrojWE));
		obrisiBrojWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno."), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public String dodajUplatuKupac() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String uplatilac = "Uplatilac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys("4100010 - Firma 2");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(odaberiKupca1WE));
		odaberiKupca1WE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(iznosWE));
		iznosWE.sendKeys("100");
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno."), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public void verifikujUplatu(String uplatilac) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(odustaniBtnWE));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", odustaniBtnWE);
		odustaniBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona6WE));
		filterKolona6WE.click();
		filterKolona6WE.sendKeys(uplatilac);
		filterKolona6WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(uplatilacImeWE));
		assertTrue(uplatilacImeWE.getText().equals(uplatilac), "UplatePage: Ime uplatioca nije dobro!");
	}

}