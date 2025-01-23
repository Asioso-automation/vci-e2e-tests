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

	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	private WebElement nazivNaStampanimDokWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input")
	private WebElement sifraWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input")
	private WebElement sifraBrProtokolaWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[1]/div[1]/input[1]")
	private WebElement terenskaJedinicaWE;
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaSifraWE, kolone.kolonaTerenskaJedinicaWE, kolone.kolonaMjestoWE,
			kolone.kolonaAdresaWE, kolone.kolonaBrojTelefonaWE, kolone.kolonaFaxWE, kolone.kolonaEmailWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujFizickeLokacije() throws Exception {
		navigateOnPage(FizickeLokacije.class, "Šifarnici", "Fizičke lokacije");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Fizičke lokacije')]")));
		verifikacijaStranice("Šifarnici", "Fizičke Lokacije", "Fizičke lokacije", columns, buttons);
	}
	
	public String dodajFizickuLokaciju(String naziv, String terenskaJedinica) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(nazivNaStampanimDokWE));
		nazivNaStampanimDokWE.sendKeys(naziv);
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
	
	public String urediFizickuLokaciju(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		changeInput(nazivWE, naziv);
//		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return naziv;
	}
	
}