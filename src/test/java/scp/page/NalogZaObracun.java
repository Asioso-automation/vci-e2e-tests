package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NalogZaObracun extends PocetnaStranica{

	public NalogZaObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujNalogZaObracun()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalog za obračun')]")));
		verifikacijaZajednickihElemenata("Obračun", "Nalog Za Obračun", "Nalog za obračun", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProcenatPopustaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProgresWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
	}
}
