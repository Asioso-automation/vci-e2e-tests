package com.platformX.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class OpomenePredUtuzenje extends PocetnaStranica{

	public OpomenePredUtuzenje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOpomenePredUtuzenje() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Opomene pred utuženje')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPotvrdeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodPotvrdeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaDanaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaPlacanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPredlozenaZaUtuzenjeWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(masovniUnosBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "OpomenePredUtuzenje: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OPOMENE PRED UTUŽENJE"), "OpomenePredUtuzenje: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPOMENE PRED UTUŽENJE"), "OpomenePredUtuzenje: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "OpomenePredUtuzenje: Broj kolona nije dobar!");
	}
}
