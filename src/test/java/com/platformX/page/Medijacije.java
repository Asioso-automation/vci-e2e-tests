package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Medijacije extends PocetnaStranica {

	public Medijacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujMedijacije() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Medijacije')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrijaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRjesenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaObracunaKamateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugPoRjesenjuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUvazenoPoRjesenjuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUTokuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "Medijacije: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MEDIJACIJE"), "Medijacije: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MEDIJACIJE"), "Medijacije: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Medijacije: Broj kolona nije dobar! ");
	}

}