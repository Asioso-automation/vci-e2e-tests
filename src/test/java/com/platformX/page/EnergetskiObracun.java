package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class EnergetskiObracun extends PocetnaStranica {

	public EnergetskiObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujEnergetskiObracun() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Energetski obračun')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMrezarinaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "EnergetskiObracun: Naziv sekcije nije dobar!"); // bug, los naziv sekcije
		assertTrue(stranicaBtnWE.getText().trim().equals("ENERGETSKI OBRAČUN"), "EnergetskiObracun: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ENERGETSKI OBRAČUN"), "EnergetskiObracun: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "EnergetskiObracun: Broj kolona nije dobar! ");
	}

}