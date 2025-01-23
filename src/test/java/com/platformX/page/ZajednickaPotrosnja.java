package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZajednickaPotrosnja extends PocetnaStranica {

	public ZajednickaPotrosnja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZajednickaPotrosnja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Zajednička potrošnja')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Zajednička Potrošnja", "Zajednička potrošnja", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNosilacKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNosilacMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojAktivnihClanovaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
	}

}