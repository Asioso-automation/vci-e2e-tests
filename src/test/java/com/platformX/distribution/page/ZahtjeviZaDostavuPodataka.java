package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaDostavuPodataka extends PocetnaStranicaPXD {

	public ZahtjeviZaDostavuPodataka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaDostavuPodataka() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za dostavu')]")));
		verifikacijaZajednickihElemenata2("Mjerna Mjesta", "Zahtjevi Za Dostavu Podataka", "Zahtjevi za dostavu podataka o mjernim mjestima (proces 15)", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumSlanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogOdbijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIniciraoOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanoWE));
	}

}