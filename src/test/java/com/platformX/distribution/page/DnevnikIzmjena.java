package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class DnevnikIzmjena extends PocetnaStranica {
	
	public DnevnikIzmjena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDnevnikIzmjena()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Dnevnik izmjena')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTabelaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdEntitetaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ADMINISTRACIJA"), "DnevnikIzmjena: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("DNEVNIK IZMJENA"), "DnevnikIzmjena: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("DNEVNIK IZMJENA"), "DnevnikIzmjena: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "DnevnikIzmjena: Broj kolona nije dobar! ");
	}
}
