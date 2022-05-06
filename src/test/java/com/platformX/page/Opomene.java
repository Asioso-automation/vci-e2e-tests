package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Opomene extends PocetnaStranica {

	public Opomene(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujOpomene() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Opomene')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodGenerisanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDugaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDugaDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokZaIzmirenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugPlacenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaUzRacunWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "Opomene: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OPOMENE"), "Opomene: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPOMENE"), "Opomene: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Opomene: Broj kolona nije dobar! ");
	}

}