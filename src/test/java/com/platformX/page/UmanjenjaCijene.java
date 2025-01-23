package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	private WebElement filterKolonaWE;

	public void verifikujUmanjenjaCijene() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Umanjenja cijene')]")));
		verifikacijaZajednickihElemenata2("Obračun", "Umanjenja Cijene", "Umanjenja cijene", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojMjeseciWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenatWE));
	}
	
	public String dodajUmanjenjeCijene() {
		String brojMjeseci = Helper.getRandomNumberInRange(1, 9999);
		String procenat = Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojMjeseci;
	}
	
	public String urediUmanjenjeCijene() throws InterruptedException {
		String brojMjeseci = Helper.getRandomNumberInRange(1, 9999);
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
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return brojMjeseci;
	}
	
	public void dodajPredefinisanoUmanjenjeCijene(String brojMjeseci) {
		String procenat = Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brojMjeseciWE));
		brojMjeseciWE.sendKeys(brojMjeseci);
		procenatWE.sendKeys(procenat);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
	}
	
}