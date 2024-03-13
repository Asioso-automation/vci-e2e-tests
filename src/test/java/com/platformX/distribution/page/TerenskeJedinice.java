package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TerenskeJedinice extends PocetnaStranicaPXD {

	public TerenskeJedinice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	public void verifikujTerenskeJedinice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Terenske jedinice')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Terenske Jedinice", "Terenske jedinice", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCallCentarWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
	}

	public String dodajTerenskuJedinicu(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public String urediTerenskuJedinicu(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.clear();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}

}