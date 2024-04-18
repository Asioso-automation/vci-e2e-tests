package scp.page;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;


public class SveUplate extends PocetnaStranica{

	public SveUplate(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujSveUplate()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Sve uplate')]")));
		verifikacijaZajednickihElemenata("Finansije", "Sve Uplate", "Sve uplate", 16, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvoda1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvoda1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrijemeUnosa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUplatilac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBanka1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosUplateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosAvansaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucena1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvansWE));
	}
}
