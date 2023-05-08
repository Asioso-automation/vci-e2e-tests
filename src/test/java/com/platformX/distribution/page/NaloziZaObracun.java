package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NaloziZaObracun extends PocetnaStranicaPXD {
	
	public NaloziZaObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujNaloziZaObracun()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Nalozi za obračun')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "NALOZI ZA OBRAČUN", "NALOZI ZA OBRAČUN", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojKupacaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojMjernihMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojObracunatihUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupnaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
	}

}