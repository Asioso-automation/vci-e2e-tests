package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StavkeZahtjevaZaIskljucenja extends PocetnaStranica {

	public StavkeZahtjevaZaIskljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujStavkeZahtjevaZaIskljucenja() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Stavke')]")));
		verifikacijaZajednickihElemenata("Pravni Odnosi", "Stavke Zahtjeva Za Isključenja", "Stavke zahtjeva za isključenja", 17, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevaniDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaniraniDatumIskljucenjaDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPostojiZahtjevZaUkljucenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlaceniDugoviWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPoslWE));
	}

}