package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ZahtjeviZaUkljucenje extends PocetnaStranica {

	public ZahtjeviZaUkljucenje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujZahtjeviZaUkljucenje() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za uklju')]")));
		verifikacijaZajednickihElemenata("PRAVNI ODNOSI", "ZAHTJEVI ZA UKLJUČENJE", "ZAHTJEVI ZA UKLJUČENJE", 8, false, true, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevaniDatumUkljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSveStavkePoslaneWE));
	}
}