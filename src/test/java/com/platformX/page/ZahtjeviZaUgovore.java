package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ZahtjeviZaUgovore extends PocetnaStranica {

	public ZahtjeviZaUgovore(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaUgovore() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za ugovore')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCjenovnaKatWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreregistracijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDopunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "ZahtjeviZaUgovore: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZAHTJEVI ZA UGOVORE"), "ZahtjeviZaUgovore: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZAHTJEVI ZA UGOVORE"), "ZahtjeviZaUgovore: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 16, "ZahtjeviZaUgovore: Broj kolona nije dobar! ");
	}

}