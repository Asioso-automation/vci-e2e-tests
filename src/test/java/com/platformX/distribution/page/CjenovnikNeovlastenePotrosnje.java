package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CjenovnikNeovlastenePotrosnje extends PocetnaStranicaPXD {

	public CjenovnikNeovlastenePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujCjenovnikNeovlastenePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Cjenovnik neovlaštene potrošnje')]")));
		verifikacijaZajednickihElemenata2("Tarifni Sistem", "Cjenovnik Neovlaštene Potrošnje", "Cjenovnik neovlaštene potrošnje", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaEnergijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaSnageWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStopaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
	}

}