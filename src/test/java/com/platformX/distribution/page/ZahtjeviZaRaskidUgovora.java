package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaRaskidUgovora extends PocetnaStranicaPXD {
	
	public ZahtjeviZaRaskidUgovora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaRaskidUgovora() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za raskid ugovora')]")));
		verifikacijaZajednickihElemenata("UGOVORI", "ZAHTJEVI ZA RASKID UGOVORA", "ZAHTJEVI ZA RASKID UGOVORA (PROCES 7)", 12, false, false, false, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOcekivaniDatumZavrsetkaUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsetkaUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenWE));
	}
	
}