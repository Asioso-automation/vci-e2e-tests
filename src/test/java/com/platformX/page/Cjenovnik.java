package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Cjenovnik extends PocetnaStranica {

	public Cjenovnik(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujCjenovnik() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Cjenovnik')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaCijeneWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaTarifeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSezonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaMrezarineWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "Cjenovnik: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("CJENOVNIK"), "Cjenovnik: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("CJENOVNIK"), "Cjenovnik: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "Cjenovnik: Broj kolona nije dobar! ");
	}

}