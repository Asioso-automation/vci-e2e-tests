package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class SveUplate extends PocetnaStranicaPXD {

	public SveUplate(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujSveUplate() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Sve uplate')]")));
		verifikacijaZajednickihElemenata("Finansije", "Sve Uplate", "Sve uplate", 13, false, false, false, false, false, false, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUplatilacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZadnjaIzmjenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenaWE));
	}
	
}