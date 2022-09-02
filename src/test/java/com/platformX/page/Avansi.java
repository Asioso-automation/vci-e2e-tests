package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Avansi extends PocetnaStranica {

	public Avansi(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujAvansi() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Avansi')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeiskoristeniIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZadnjaIzmjenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacNeZeliWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUDuguNaDrugaMjmWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "Avansi: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("AVANSI"), "Avansi: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("AVANSI"), "Avansi: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "Avansi: Broj kolona nije dobar!");
	}

}