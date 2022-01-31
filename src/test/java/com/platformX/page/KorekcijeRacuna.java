package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class KorekcijeRacuna extends PocetnaStranica {

	public KorekcijeRacuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKorekcijeRacuna() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korekcije')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKorekcijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMrezarina2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObnovljiviIzvoriWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaknadaZaSnabdijevanjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProknjizenoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "KorekcijeRacuna: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KOREKCIJE RAČUNA"), "KorekcijeRacuna: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KOREKCIJE RAČUNA"), "KorekcijeRacuna: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 18, "KorekcijeRacuna: Broj kolona nije dobar! ");
	}

}