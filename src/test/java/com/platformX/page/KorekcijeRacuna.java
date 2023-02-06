package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcijeRacuna extends PocetnaStranica {

	public KorekcijeRacuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKorekcijeRacuna() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Korekcije')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "KOREKCIJE RAČUNA", "KOREKCIJE RAČUNA", 18, false, false, false, false, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKorekcijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEnWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMrezWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObnIzvoriWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNaknadaZaSnabdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProknjWE));
	}

}