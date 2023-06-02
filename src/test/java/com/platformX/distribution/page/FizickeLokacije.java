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

public class FizickeLokacije extends PocetnaStranicaPXD {

	public FizickeLokacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	private WebElement sifraWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input")
	private WebElement sifraBrProtokolaWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement terenskaJedinicaWE;
	
	@FindBy(xpath = "//div[11]/div/div/div/div")
	private WebElement terenskaJedinicaLookupWE;
	
	public void verifikujFizickeLokacije() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Fizičke lokacije')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Fizičke Lokacije", "FIZIČKE LOKACIJE", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
	}
	
	public String dodajFizickuLokaciju(String terenskaJedinica) throws InterruptedException {
		String naziv = new String();
		naziv = "FizickaLokacija " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(sifraWE));
		sifraWE.sendKeys(Helper.getRandomNumber(2));
		wait.until(ExpectedConditions.elementToBeClickable(sifraBrProtokolaWE));
		sifraBrProtokolaWE.sendKeys(Helper.getRandomNumber(3));
		wait.until(ExpectedConditions.elementToBeClickable(terenskaJedinicaWE));
		terenskaJedinicaWE.sendKeys(terenskaJedinica);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + terenskaJedinica + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + terenskaJedinica + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
	public String urediFizickuLokaciju() throws InterruptedException {
		String naziv = "FizickaLokacija " + Helper.getRandomString(5);
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