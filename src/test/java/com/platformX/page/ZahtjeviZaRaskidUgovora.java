package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaRaskidUgovora extends PocetnaStranica {

	public ZahtjeviZaRaskidUgovora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaRaskidUgovora() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za raskid ugovora')]")));
		verifikacijaZajednickihElemenata("KUPCI", "ZAHTJEVI ZA RASKID UGOVORA", "ZAHTJEVI ZA RASKID UGOVORA", 10, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevaniDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogZahtjevaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogOdbijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenWE));
	}

}