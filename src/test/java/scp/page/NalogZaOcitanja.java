package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class NalogZaOcitanja extends PocetnaStranica{

	public NalogZaOcitanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujNalogZaOcitanjaMjerila()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalog za očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "NALOG ZA OČITANJA", "Nalog za očitanja mjerila", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
	}
	
	public void verifikujNalogZaOcitanjaVodomjera()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalog za očitanja vodomjera')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "NALOG ZA OČITANJA", "Nalog za očitanja vodomjera", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
	}
	
	public void verifikujNalogZaOcitanjaKalorimetra()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Nalog za očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "NALOG ZA OČITANJA", "Nalog za očitanja kalorimetra", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGodinaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjesecWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatus1WE));
	}
}
