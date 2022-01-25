package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Racuni extends PocetnaStranica {

	public Racuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRacuni() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Računi')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosBezPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupnoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlacenWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "Racuni: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("RAČUNI"), "Racuni: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("RAČUNI"), "Racuni: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "Racuni: Broj kolona nije dobar! ");
	}

}