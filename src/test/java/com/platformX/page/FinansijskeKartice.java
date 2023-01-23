package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class FinansijskeKartice extends PocetnaStranica {

	public FinansijskeKartice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//header/div/button[2]")
	private WebElement stampajBtnWE;

	@FindBy(xpath = "//header/div/button[1]")
	private WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	private WebElement osvjeziBtnWE;
	
	@FindBy (xpath = "/html/body/div/div[1]/main/div/div/div[2]/div[1]/div/div/div/div[1]/input[1]")
	private WebElement kupacWE;
	
	
	
	public void verifikujFinansijskeKartice() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Finansijske kartice')]")));
		wait.until(ExpectedConditions.elementToBeClickable(kupacWE));
		kupacWE.click();
		kupacWE.sendKeys("1100001 - Zanatska radionica 6, Dr Mladena Stojanovica 1, 78000 Banja Luka");
		Thread.sleep(1000);
		kupacWE.sendKeys(Keys.ARROW_DOWN);
		kupacWE.sendKeys(Keys.ENTER);
		verifyCommonElements("FINANSIJE", "FINANSIJSKE KARTICE", "FINANSIJSKE KARTICE", 12, false, false, false, false, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugujeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrazujeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreostaloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
	}

}