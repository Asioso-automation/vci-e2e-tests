package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Korisnici extends PocetnaStranica{
	
	public Korisnici(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKorisnici()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korisnici')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ADMINISTRACIJA"), "Korisnici: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KORISNICI"), "Korisnici: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KORISNICI"), "Korisnici: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "Korisnici: Broj kolona nije dobar! ");
	}
}
