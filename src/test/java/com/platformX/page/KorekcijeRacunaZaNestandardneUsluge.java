package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcijeRacunaZaNestandardneUsluge extends PocetnaStranica{

	public KorekcijeRacunaZaNestandardneUsluge (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKorekcijeRacunaZaNestandardneUsluge()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Korekcije računa')]")));
		verifikacijaZajednickihElemenata("Nestandardne Usluge", "Korekcije Računa Za Nestandardne Usluge", "Korekcije računa za nestandardne usluge", 15, false, false, false, true, true, true, false);
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipKorekcijeWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanjaWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNestandardnaUslugaWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvNaNestandUsluguWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkIznosWE));
        wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProknjWE));
	}
	
}
