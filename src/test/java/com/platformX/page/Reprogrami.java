package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Reprogrami extends PocetnaStranica {

	public Reprogrami(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujReprogrami() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Reprogrami')]")));
		verifikacijaZajednickihElemenata("Finansije", "Reprogrami", "Reprogrami", 14, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPotpisaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokZaPlacanjePrveRateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGlavnicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojRataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProknjizenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlacenWE));
	}

}