package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Reprogrami extends PocetnaStranica {

	public Reprogrami(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujReprogrami() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Reprogrami')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPotpisaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokZaPlacanjePrveRateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGlavnicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojRataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosRateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPrveRateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProknjizenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "Reprogrami: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("REPROGRAMI"), "Reprogrami: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("REPROGRAMI"), "Reprogrami: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "Reprogrami: Broj kolona nije dobar! ");
	}

}