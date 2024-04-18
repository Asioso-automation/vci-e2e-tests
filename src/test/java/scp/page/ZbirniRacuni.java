package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class ZbirniRacuni extends PocetnaStranica{

	public ZbirniRacuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZbirneRacune()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Zbirni računi')]")));
		verifikacijaZajednickihElemenata("Obračun", "Zbirni Računi", "Zbirni računi", 14, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriod1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznos1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPdv2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosPdvWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKamata1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSaKamatomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPlacen1WE));
	}
}
