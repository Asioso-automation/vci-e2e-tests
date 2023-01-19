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

public class Ulice extends PocetnaStranica {

	public Ulice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivNaDokumentimaWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajUlicuWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivUliceTabelaWE;
	
	@FindBy(xpath = "//form/div/div[1]/div/div[2]/div/div/div[1]/div/input")
	private WebElement urediNazivWE;

	public void verifikujUlice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Ulice')]")));
		verifyCommonElements("ŠIFARNICI", "ULICE", "ULICE", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaValidnaWE));
	}
	
	public String dodajUlicu() throws InterruptedException {
		String naziv = "Ulica " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(nazivNaDokumentimaWE));
		nazivNaDokumentimaWE.sendKeys("Ulica na dok " + Helper.getRandomString(5));
		Thread.sleep(500);
		submitBtnWE.click();
		return naziv;
	}
	
	public void verifikujUlicu(String naziv) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(nazivUliceTabelaWE));
		assertTrue(nazivUliceTabelaWE.getText().equals(naziv), "Ulice: Ulica nije pronadjena!");
	}
	
	public String urediUlicu() throws InterruptedException {
		String ulica = "Ulica " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(urediNazivWE));
		urediNazivWE.click();
		urediNazivWE.clear();
		urediNazivWE.sendKeys(ulica);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ulica;
	}

}