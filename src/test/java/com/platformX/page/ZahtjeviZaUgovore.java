package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaUgovore extends PocetnaStranica {

	public ZahtjeviZaUgovore(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaUgovore() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za ugovore')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Zahtjevi Za Ugovore", "Zahtjevi za ugovore", 17, false, false, true,	true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCjenovnaKatWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreregWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDopunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslanWE));
		// TODO Doraditi sve kolone
	}

}