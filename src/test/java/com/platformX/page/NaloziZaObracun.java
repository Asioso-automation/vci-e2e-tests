package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NaloziZaObracun extends PocetnaStranica {

	public NaloziZaObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujNaloziZaObracun() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Nalozi')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojKupacaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupnoBezPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupnoSaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "NaloziZaObracun: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("NALOZI ZA OBRAČUN"), "NaloziZaObracun: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("NALOZI ZA OBRAČUN"), "NaloziZaObracun: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 17, "NaloziZaObracun: Broj kolona nije dobar! ");
	}

}