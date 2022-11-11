package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaIskljucenja extends PocetnaStranica {

	public ZahtjeviZaIskljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaIskljucenja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za isključenja')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		// TODO Verify all columns from this page
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIniciraoSnabdjWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObavjKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZavrWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljRealizWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("MJERNA MJESTA"), "ZahtjeviZaIskljucenja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZAHTJEVI ZA ISKLJUČENJA"), "ZahtjeviZaIskljucenja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZAHTJEVI ZA ISKLJUČENJA (PROCES 16)"), "ZahtjeviZaIskljucenja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 17, "ZahtjeviZaIskljucenja: Broj kolona nije dobar! ");
	}

}