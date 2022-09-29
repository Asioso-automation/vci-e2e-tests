package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaObracunskeUgovore extends PocetnaStranica {
	
	public ZahtjeviZaObracunskeUgovore(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaObracunskeUgovore() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za obračunske ugovore')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNoviSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOcekivaniDatumPocetkaUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreregWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDopunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotpWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPromSnabdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethSnabObavWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethSnabPotvrWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrethSnabOdbioWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("UGOVORI"), "ObracunskiUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZAHTJEVI ZA OBRAČUNSKE UGOVORE"), "ZahtjeviZaObracunskeUgovore: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZAHTJEVI ZA OBRAČUNSKE UGOVORE (PROCES 1)"), "ZahtjeviZaObracunskeUgovore: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 20, "ZahtjeviZaObracunskeUgovore: Broj kolona nije dobar! ");
	}
	
}
