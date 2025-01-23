package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Predracuni extends PocetnaStranica {

	public Predracuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPredracuni()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Predračuni')]")));
		verifikacijaZajednickihElemenata2("Nestandardne Usluge", "Predračuni", "Predračuni", 13, false, false, true, true, true, true, false);
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosBezPdvWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamataWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupnoWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
	}
	
}
