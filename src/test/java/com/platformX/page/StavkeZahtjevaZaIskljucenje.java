package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StavkeZahtjevaZaIskljucenje extends PocetnaStranica {

	public StavkeZahtjevaZaIskljucenje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujStavkeZahtjevaZaIskljucenja() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Stavke')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevaniDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogNeizvrsavanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaceniDugoviWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslanoWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "StavkeZahtjevaZaIskljucenje: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("STAVKE ZAHTJEVA ZA ISKLJUČENJA"), "StavkeZahtjevaZaIskljucenje: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("STAVKE ZAHTJEVA ZA ISKLJUČENJA"), "StavkeZahtjevaZaIskljucenje: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 16, "StavkeZahtjevaZaIskljucenje: Broj kolona nije dobar! ");
	}

}