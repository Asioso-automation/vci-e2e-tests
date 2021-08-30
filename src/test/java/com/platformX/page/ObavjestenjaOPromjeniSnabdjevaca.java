package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ObavjestenjaOPromjeniSnabdjevaca extends PocetnaStranica {

	public ObavjestenjaOPromjeniSnabdjevaca(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujObavjestenjaOPromjeniSnabdjevaca() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Obavještenja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOcekivaniDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogOdbijanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "OdbaceniUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBAVJEŠTENJA O PROMJENI SNABDJEVAČA"),
				"ObavjestenjaOPromjeniSnabdjevaca: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OBAVJEŠTENJA O PROMJENI SNABDJEVAČA"),
				"ObavjestenjaOPromjeniSnabdjevaca: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "ObavjestenjaOPromjeniSnabdjevaca: Broj kolona nije dobar! ");
	}

}