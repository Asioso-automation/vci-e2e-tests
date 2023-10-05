package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class RokoviPlacanja extends PocetnaStranica{

	public RokoviPlacanja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujRokovePlacanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Rokovi plaćanja')]")));
		verifikacijaZajednickihElemenata("KUPCI", "ROKOVI PLAĆANJA", "Rokovi plaćanja", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDanaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrijemeUnosa1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
	}
	
}
