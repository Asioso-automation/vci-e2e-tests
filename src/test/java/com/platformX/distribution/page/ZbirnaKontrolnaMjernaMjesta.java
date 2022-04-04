package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZbirnaKontrolnaMjernaMjesta extends PocetnaStranica {

	public ZbirnaKontrolnaMjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZbirnaMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zbirna/kontrolna mjerna mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojIzlazaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKontrolnoMjernoMjestoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZBIRNA/KONTROLNA MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZBIRNA/KONTROLNA MJERNA MJESTA"), "ZbirnaKontrolnaMjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "ZbirnaKontrolnaMjernaMjesta: Broj kolona nije dobar! ");
	}
	
}