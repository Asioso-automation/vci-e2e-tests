package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class AvansneFakture extends PocetnaStranica {

	public AvansneFakture(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujAvansneFakture() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Avansne fakture')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosBezPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStornoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "AvansneFakture: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("AVANSNE FAKTURE"), "AvansneFakture: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("AVANSNE FAKTURE"), "AvansneFakture: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 15, "AvansneFakture: Broj kolona nije dobar! ");
	}

}