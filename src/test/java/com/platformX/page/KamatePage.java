package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KamatePage extends PocetnaStranica {

	public KamatePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKamate() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Kamate')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "KAMATE", "KAMATE", 7, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOsnovicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDanaKasnjenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
	}

}