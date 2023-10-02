package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class CitackeKnjige extends PocetnaStranica{

	public CitackeKnjige(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujCitackeKnjige()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Čitačke knjige')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "ČITAČKE KNJIGE", "Čitačke knjige", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojStavki1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOcitanoStavkiWE));
	}
}
