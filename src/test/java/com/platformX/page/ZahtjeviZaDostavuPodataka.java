package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaDostavuPodataka extends PocetnaStranica {

	public ZahtjeviZaDostavuPodataka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeveZaDostavuPodataka() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za')]")));
		verifikacijaZajednickihElemenata("KUPCI", "ZAHTJEVI ZA DOSTAVU PODATAKA", "ZAHTJEVI ZA DOSTAVU PODATAKA O KUPCIMA", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumSlanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogOdbijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIniciraoSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanoWE));
	}

}