package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NerasporedjeneUplate extends PocetnaStranica {

	public NerasporedjeneUplate(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujNerasporedjeneUplate() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Neraspore')]")));
		verifikacijaZajednickihElemenata("Finansije", "Neraspoređene Uplate", "Neraspoređene uplate", 9, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUplatilacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
	}

}