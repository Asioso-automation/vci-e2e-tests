package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ParametriObracuna extends PocetnaStranica{

	public ParametriObracuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}


	public void verifikujParametreObracuna()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Parametri obračuna')]")));
		verifikacijaZajednickihElemenata("Obračun", "Parametri Obračun", "Parametri obračuna", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKoeficijentHdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPritisakGasaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStandardnaTemperaturaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRadnaTemperaturaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
	}
	
	public void verifikujParametreObracunaSon()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Parametri obračuna')]")));
		verifikacijaZajednickihElemenata("Obračun", "Parametri Obračun", "Parametri obračuna", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKoeficijentHdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPritisakGasaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStandardnaTemperaturaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRadnaTemperaturaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivOrganizacijeWE));
	}
	
}
