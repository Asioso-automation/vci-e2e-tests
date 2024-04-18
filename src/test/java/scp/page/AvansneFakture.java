package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class AvansneFakture extends PocetnaStranica{

	public AvansneFakture(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}


	public void verifikujAvansneFakture()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Avansne fakture')]")));
		verifikacijaZajednickihElemenata("Obračun", "Avansne Fakture", "Avansne fakture", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvStopa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosBezPdv1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdvObveznik1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStorno1WE));
	}
	
}
