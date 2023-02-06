package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Anketari extends PocetnaStranica {

	public Anketari(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujAnketari()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Anketari')]")));
		verifikacijaZajednickihElemenata("KUPCI-PROIZVOĐAČI", "ANKETARI", "ANKETARI", 11, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojLicneKarteWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpstinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}
	
}
