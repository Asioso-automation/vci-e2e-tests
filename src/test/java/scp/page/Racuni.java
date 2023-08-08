package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Racuni extends PocetnaStranica{

	public Racuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRacune()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Računi')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "RAČUNI", "Računi", 15, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNalogWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOrganizacija1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTG1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamata1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSaKamatomWE));
	}
}
