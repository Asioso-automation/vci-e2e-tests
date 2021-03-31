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

public class UplatePage extends PocetnaStranica {

	public UplatePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//header/div/a") //a[@href='/finances/payment-journals/65/payments/add']  //a/span/i
	private WebElement dodajUplatuBtnWE;
	
	@FindBy(xpath = "//ul/a[2]") 
	private WebElement uplateBtnWE;
	
	@FindBy(xpath = "//td[6]/div/div/div/div/input") 
	private WebElement uplatilacFilterWE;
	
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
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input") 
	private WebElement iznosWE;
	
	@FindBy(xpath = "//div[3]/div/button")
	private WebElement dodajBtnWE;
	
	@FindBy(xpath = "//div[3]/div/button")
	private WebElement dodaj2BtnWE;
	
	@FindBy(xpath = "//main/div/div/div/div[2]/div/div[1]") 
	private WebElement porukaWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/button") 
	private WebElement obrisiBrojWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div/button") 
	private WebElement obrisiKupcaWE;
	
	public String dodajUplatu() throws InterruptedException {
		String uplatilac = "Uplatilac " + getRandomName();
		Thread.sleep(1000);
		try {
		wait.until(ExpectedConditions.elementToBeClickable(dodajUplatuBtnWE));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dodajUplatuBtnWE);
		Thread.sleep(1000);
		dodajUplatuBtnWE.click();
		} catch (Exception e) {
		wait.until(ExpectedConditions.invisibilityOf(porukaWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajUplatuBtnWE));
		dodajUplatuBtnWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987 - Poziv na broj: 1987, Broj računa: 1988");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno"), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	
	public String dodajUplatuPozivNaBroj() throws InterruptedException {
		String uplatilac = "Uplatilac " + getRandomName();
//		wait.until(ExpectedConditions.elementToBeClickable(dodajUplatuBtnWE));
//		dodajUplatuBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987 - Poziv na broj: 1987, Broj računa: 1988");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno"), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public String obrisiPozivNaBroj() throws InterruptedException {
		String uplatilac = "Uplatilac " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(pozivNaBrojWE));
		pozivNaBrojWE.sendKeys("1987 - Poziv na broj: 1987, Broj računa: 1988");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBrojWE));
		odaberiBrojWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(obrisiBrojWE));
		obrisiBrojWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obrisiKupcaWE));
//		obrisiKupcaWE.click();
//		assertTrue(dodajBtnWE.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno"), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public String dodajUplatuKupac() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String uplatilac = "Uplatilac " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.sendKeys("4100010 - Firma 2");
		Thread.sleep(500);
		kupacWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacWE));
		uplatilacWE.sendKeys(uplatilac);
		wait.until(ExpectedConditions.elementToBeClickable(iznosWE));
		iznosWE.sendKeys("100");
		wait.until(ExpectedConditions.elementToBeClickable(dodaj2BtnWE));
		dodaj2BtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().equals("Uspješno završeno"), "UplatePage: Title is not good!");
		return uplatilac;
	}
	
	public void verifikujUplatu(String uplatilac) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(uplateBtnWE));
		uplateBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uplatilacFilterWE));
		uplatilacFilterWE.sendKeys(uplatilac);
		uplatilacFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(uplatilacImeWE));
		assertTrue(uplatilacImeWE.getText().equals(uplatilac), "UplatePage: Ime uplatioca nije dobro!");
	}

}