package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ClanoviZajednickePotrosnje extends PocetnaStranica {

	public ClanoviZajednickePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujClanoviZajednickePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Članovi zajedničke potrošnje')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacNosilacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoNosilacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "ClanoviZajednickePotrosnje: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ČLANOVI ZAJEDNIČKE POTROŠNJE"), "ClanoviZajednickePotrosnje: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ČLANOVI ZAJEDNIČKE POTROŠNJE"), "ClanoviZajednickePotrosnje: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 9, "ClanoviZajednickePotrosnje: Broj kolona nije dobar! ");
	}

}