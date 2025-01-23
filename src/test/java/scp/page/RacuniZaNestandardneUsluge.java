package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class RacuniZaNestandardneUsluge extends PocetnaStranica{

	public RacuniZaNestandardneUsluge(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRacuneZaNestandardneUsluge()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Računi za nestandardne usluge')]")));
		verifikacijaZajednickihElemenata2("Obračun", "Računi Za Nestandardne Usluge", "Računi za nestandardne usluge", 17, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNestandardnaUsluga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRedniBrojUGodiniWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKolicinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljuceno1WE));
	}
	
}
