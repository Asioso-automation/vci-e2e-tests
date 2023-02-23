package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class FizickaLica extends PocetnaStranica {

	public FizickaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujFizickaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Fizička lica')]")));
		verifikacijaZajednickihElemenata("KUPCI", "FIZIČKA LICA", "FIZIČKA LICA", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeIPrezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdgovorniODSWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojLicneKarteWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

}