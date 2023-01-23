package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StavkeZahtjevaZaUkljucenja extends PocetnaStranica {

	public StavkeZahtjevaZaUkljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujStavkeZahtjevaZaUkljucenja() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Stavke')]")));
		verifyCommonElements("PRAVNI ODNOSI", "STAVKE ZAHTJEVA ZA UKLJUČENJA", "STAVKE ZAHTJEVA ZA UKLJUČENJA", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevaniDatumUkljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumUkljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogNeizvrsavanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslanoWE));
	}

}