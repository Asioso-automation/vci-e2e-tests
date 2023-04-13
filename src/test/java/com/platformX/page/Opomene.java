package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Opomene extends PocetnaStranica {

	public Opomene(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujOpomene() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Opomene')]")));
		verifikacijaZajednickihElemenata("Pravni Odnosi", "Opomene", "Opomene", 12, false, true, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodGenerisanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDugaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDugaDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokZaIzmirenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugPlacenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaUzRacunWE));
	}

}