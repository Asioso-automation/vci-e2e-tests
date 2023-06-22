package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Ugovori extends PocetnaStranica{

	public Ugovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujUgovore()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), ' Ugovori')]")));
		verifikacijaZajednickihElemenata("KUPCI", "UGOVORI", "Ugovori", 16, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBroj1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTip1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJibJmbgWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZonaOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrUZoniOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivan1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIskljucen1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPausalWE));
	}
}
