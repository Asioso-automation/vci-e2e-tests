package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ZbirnaKontrolnaPotrosnja extends PocetnaStranica{
	
	public ZbirnaKontrolnaPotrosnja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujZbirnaKontrolnaPotrosnja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zbirna/kontrolna potrošnja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoKontrolnoMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaObracunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaAktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaAktivna1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaReaktivnaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlikaReaktivna1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaKorekcijeUPerioduWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaKorekcijeUPerioduWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaKorekcijeZaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaKorekcijeZaPeriodWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "ZbirnaKontrolnaPotrosnja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZBIRNA/KONTROLNA POTROŠNJA"), "ZbirnaKontrolnaPotrosnja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZBIRNA/KONTROLNA POTROŠNJA"), "ZbirnaKontrolnaPotrosnja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 15, "ZbirnaKontrolnaPotrosnja: Broj kolona nije dobar! ");
	}

}
