package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Mjenice extends PocetnaStranica {

	public Mjenice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMjenice() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjenice')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipMjeniceWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumAktiviranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUCentraliWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVracenaKupcuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVazecaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "Mjenice: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MJENICE"), "Mjenice: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MJENICE"), "Mjenice: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "Mjenice: Broj kolona nije dobar! ");
	}

}