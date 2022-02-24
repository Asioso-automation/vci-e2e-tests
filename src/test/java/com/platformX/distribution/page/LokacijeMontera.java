package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijeMontera extends PocetnaStranica {

	public LokacijeMontera(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujLokacijeMontera() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Lokacije montera')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonterWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "LokacijeMontera: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("LOKACIJE MONTERA"), "LokacijeMontera: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("LOKACIJE MONTERA"), "LokacijeMontera: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 7, "LokacijeMontera: Broj kolona nije dobar! ");
	}

}