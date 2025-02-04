package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class FinansijskeKartice extends PocetnaStranicaPXD {

	public FinansijskeKartice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaMjernoMjestoEicWE, kolone.kolonaPeriodWE, kolone.kolonaDatumWE, kolone.kolonaDatumKnjizenjaWE, kolone.kolonaRokPlacanjaWE, kolone.kolonaDugujeWE, 	
			kolone.kolonaPotrazujeWE, kolone.kolonaPreostaloWE, kolone.kolonaOpisWE, kolone.kolonaPozivNaBrojWE, kolone.kolonaBrojRacunaWE, kolone.kolonaNapomenaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, infoBtnWE};

	public void verifikujFinansijskeKartice() throws Exception {
		navigateOnPage(FinansijskeKartice.class, "Finansije", "Finansijske kartice");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Finansijska kartica')]")));
		verifikacijaStranice("Finansije", "Finansijske Kartice", "Finansijska kartica", 1, columns, buttons);
	}
	
}