package com.platformX.distribution.page;

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

public class NeovlastenaPotrosnja extends PocetnaStranicaPXD {

	public NeovlastenaPotrosnja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	 @FindBy(xpath = "//form/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement poljeKupacWE;
	 
	 @FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement poljeTrafostanicaWE;
	 
	 @FindBy(xpath = "//div/div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/input[1]")  
	 private WebElement poljePeriodWE;
	 
	 @FindBy(xpath = "//div/div/div[1]/div[1]/div[2]/div/div/div[1]/div/input")  
	 private WebElement poljeBrojDanaWE;
	 
	 @FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")  
	 private WebElement poljeAvtWE;

	public void verifikujNeovlastenaPotrosnja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Neovlaštena potrošnja')]")));
		verifikacijaZajednickihElemenata2("Neovlaštena Potrošnja", "Neovlaštena Potrošnja", "Neovlaštena potrošnja", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObracunIzvrsioWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraTipaNeovlastenePotrosnjeWE));
	}
	
	public void dodajNeovlastenuPotrosnju(String kupac, String trafostanica) throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeKupacWE));
		poljeKupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljeKupacWE.sendKeys(Keys.ARROW_DOWN);
		poljeKupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(poljeTrafostanicaWE));
		poljeTrafostanicaWE.sendKeys(trafostanica);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljeTrafostanicaWE.sendKeys(Keys.ARROW_DOWN);
		poljeTrafostanicaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE));
		datumBtn1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datumKalendar1WE));
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE));
		trenutniDatum1WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljePeriodWE));
		poljePeriodWE.sendKeys("23");
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljePeriodWE.sendKeys(Keys.ARROW_DOWN);
		poljePeriodWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(poljeBrojDanaWE));
		poljeBrojDanaWE.sendKeys(Helper.getRandomNumberInRange(1, 31));
		wait.until(ExpectedConditions.elementToBeClickable(poljeAvtWE));
		poljeAvtWE.sendKeys(Helper.getRandomNumberInRange(1, 1000));
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	 public void urediNeovlastenuPotrosnju(String noviKupac) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(poljeKupacWE));
		changeInput(poljeKupacWE, noviKupac);
//		poljeKupacWE.sendKeys(noviKupac);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		poljeKupacWE.sendKeys(Keys.ARROW_DOWN);
		poljeKupacWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	 }
	
}