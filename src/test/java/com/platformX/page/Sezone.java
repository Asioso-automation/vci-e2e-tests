package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Sezone extends PocetnaStranica {

	public Sezone(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujSezone() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sezone')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "Sezone: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SEZONE"), "Sezone: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SEZONE"), "Sezone: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 5, "TarifneGrupe: Broj kolona nije dobar! ");
	}

}