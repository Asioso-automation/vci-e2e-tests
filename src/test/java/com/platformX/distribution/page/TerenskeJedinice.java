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
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class TerenskeJedinice extends PocetnaStranica {

	public TerenskeJedinice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTerenskeJediniceTabelaWE;
	
	public void verifikujTerenskeJedinice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Terenske jedinice')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TERENSKE JEDINICE", "TERENSKE JEDINICE", 11, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCallCentarWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
	}

	public String dodajTerenskuJedinicu() throws InterruptedException {
		String naziv = new String();
		naziv = "TerenskaJedinica " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public void verifikujTerenskuJedinicu(String naziv) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		wait.until(ExpectedConditions.visibilityOf(nazivTerenskeJediniceTabelaWE));
		assertTrue(nazivTerenskeJediniceTabelaWE.getText().equals(naziv), "TerenskeJedinice: Terenska jedinica nije pronađena!");
	}
	
	public String urediTerenskuJedinicu() throws InterruptedException {
		String naziv = "TerenskaJedinica " + Helper.getRandomString(5);
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