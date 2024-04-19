package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class FinansijskeKartice extends PocetnaStranica{

	public FinansijskeKartice(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujFinansijskeKartice()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Finansijske kartice')]")));
		verifikacijaZajednickihElemenata("Finansije", "Finansijske Kartice", "Finansijske kartice", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatum1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRokPlacanja1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDuguje1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrazuje1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPreostalo1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTuzenoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpis1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDokumentaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaTuzbaWE));
	}
}
