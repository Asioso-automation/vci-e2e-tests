package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class PreknjizavanjaUplata extends PocetnaStranica {

	public PreknjizavanjaUplata(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPreknjizavanjaUplata() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Preknjižavanja uplata')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPovratSredstavaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "PreknjizavanjaUplata: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("PREKNJIŽAVANJA UPLATA"), "PreknjizavanjaUplata: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("PREKNJIŽAVANJA UPLATA"), "PreknjizavanjaUplata: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 13, "PreknjizavanjaUplata: Broj kolona nije dobar! ");
	}

}