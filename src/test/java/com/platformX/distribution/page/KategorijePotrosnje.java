package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class KategorijePotrosnje extends PocetnaStranicaPXD {

	public KategorijePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//input") 
	private WebElement nazivKategorijePotrosnjeWE;

	public void verifikujKategorijePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Kategorije potro')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Kategorije Potrošnje", "KATEGORIJE POTROŠNJE", 3, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}

	public String dodajKategorijuPotrosnje() throws InterruptedException {
		String naziv = "KategorijaPotrosnje" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.visibilityOf(nazivKategorijePotrosnjeWE));
		nazivKategorijePotrosnjeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.visibilityOf(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;	
	}
	
	public String urediKategorijuPotrosnje() throws InterruptedException {
		String kategorijaPotrosnje = "KategorijaPotrosnje" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(nazivKategorijePotrosnjeWE));
		nazivKategorijePotrosnjeWE.click();
		nazivKategorijePotrosnjeWE.clear();
		nazivKategorijePotrosnjeWE.sendKeys(kategorijaPotrosnje);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return kategorijaPotrosnje;
	}

}