package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Cjenovnik extends PocetnaStranica {

	public Cjenovnik(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujCjenovnik() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Cjenovnik')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "CJENOVNIK", "CJENOVNIK", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaCijeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaTarifeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

}