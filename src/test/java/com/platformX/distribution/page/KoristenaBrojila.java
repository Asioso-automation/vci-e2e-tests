package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KoristenaBrojila extends PocetnaStranicaPXD {
	
	public KoristenaBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
		public void verifikujKoristenaBrojila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korištena brojila')]")));
		verifikacijaZajednickihElemenata("Brojila", "Korištena Brojila", "KORIŠTENA BROJILA", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDrzavnePlombeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipBrojilaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaIstekaZigaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaProizvodnjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVlasnistvoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojFazaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojTarifaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojURegistruWE));	
	}
	
}