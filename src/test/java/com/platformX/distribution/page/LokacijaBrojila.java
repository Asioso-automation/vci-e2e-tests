package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class LokacijaBrojila extends PocetnaStranica {
	
	public LokacijaBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujLokacijaBrojila() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Lokacija brojila')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("BROJILA"), "LokacijaBrojila: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("LOKACIJA BROJILA"), "LokacijaBrojila: Naziv stranice nije dobar!");
		assertTrue(naslovStranice1WE.getText().trim().equals("LOKACIJA BROJILA"), "LokacijaBrojila: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "LokacijaBrojila: Broj kolona nije dobar! ");
	}
}
