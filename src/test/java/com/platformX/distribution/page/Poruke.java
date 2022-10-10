package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Poruke extends PocetnaStranica{

	public Poruke(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPoruke()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Poruke')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnikWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaslovWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrioritetWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ADMINISTRACIJA"), "Poruke: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("PORUKE"), "Poruke: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("PORUKE"), "Poruke: Naziv stranice nije dobar!");
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		assertTrue(brojKolona().size() == 8, "Poruke: Broj kolona nije dobar! ");
	}
}
