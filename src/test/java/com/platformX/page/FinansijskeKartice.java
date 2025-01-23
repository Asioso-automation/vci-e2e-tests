package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class FinansijskeKartice extends PocetnaStranica {

	public FinansijskeKartice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujFinansijskeKartice() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Finansijske kartice')]")));
		verifikacijaZajednickihElemenata2("Finansije", "Finansijske Kartice", "Finansijske kartice", 12, false, false, false, false, true, true, true);
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