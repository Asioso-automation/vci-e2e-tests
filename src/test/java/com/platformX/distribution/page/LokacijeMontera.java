package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijeMontera extends PocetnaStranicaPXD {

	public LokacijeMontera(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujLokacijeMontera() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacije montera')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Lokacije Montera", "Lokacije montera", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonterWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
	}

}