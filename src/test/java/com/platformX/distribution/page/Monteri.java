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
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement imePrezimeTabelaWE;

	public void verifikujMonteri() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Monteri')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "MONTERI", "MONTERI", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeIprezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
	}
	
	public String dodajMontera()throws InterruptedException{
		String naziv = "Monter" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public void verifikujMontera(String naziv)throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(naziv);
		filterKolona2WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		wait.until(ExpectedConditions.visibilityOf(imePrezimeTabelaWE));
		assertTrue(imePrezimeTabelaWE.getText().equals(naziv), "Ulice: Ulica nije pronadjena!");	
	}
	
	public String urediMontera()throws InterruptedException{
		String monter = "Monter" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imePrezimeWE));
		imePrezimeWE.click();
		imePrezimeWE.clear();
		imePrezimeWE.sendKeys(monter);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return monter;
	}

}