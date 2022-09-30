package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KontrolaMjernogMjesta extends PocetnaStranica {
	
	public KontrolaMjernogMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKontrolaMjernogMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Kontrola mjernog mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoRadnomNaloguWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKontroleWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogKontroleWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsavanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNedostupnoMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrsenaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "KontrolaMjernogMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KONTROLA MJERNOG MJESTA"), "KontrolaMjernogMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KONTROLA MJERNOG MJESTA"), "KontrolaMjernogMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "KontrolaMjernogMjesta: Broj kolona nije dobar! ");
	}

}
