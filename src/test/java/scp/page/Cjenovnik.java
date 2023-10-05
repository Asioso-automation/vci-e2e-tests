package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Cjenovnik extends PocetnaStranica{

	public Cjenovnik(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujCjenovnik()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Cjenovnik')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "CJENOVNIK", "Cjenovnik", 9, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOd2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDo2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUslugaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKolicinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijena1WE));
	}

	public void verifikujCjenovnikSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Cjenovnik')]")));
		verifikacijaZajednickihElemenata("TARIFNI SISTEM", "CJENOVNIK", "Cjenovnik", 9, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOd2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDo2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUslugaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKolicinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijena1WE));
	}
	
}
