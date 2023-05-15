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
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Cjenovnik')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Cjenovnik", "Cjenovnik", 15, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaCijeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaTarifeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipObracunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpsegPotrosnjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

}