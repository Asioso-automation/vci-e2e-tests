package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Korisnici extends PocetnaStranica {

	public Korisnici(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKorisnici() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korisnici')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrezimeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKorisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsOgranicenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ADMINISTRACIJA"), "Korisnici: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ADMINISTRACIJA KORISNIKA"), "Korisnici: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KORISNICI"), "Korisnici: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 7, "Korisnici: Broj kolona nije dobar!");
	}

}