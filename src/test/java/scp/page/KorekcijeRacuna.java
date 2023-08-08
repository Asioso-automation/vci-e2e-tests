package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class KorekcijeRacuna extends PocetnaStranica{

	public KorekcijeRacuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKorekcijeRacuna()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Korekcije računa')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "KOREKCIJE RAČUNA", "Korekcije računa", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucen1WE));
	}
}
