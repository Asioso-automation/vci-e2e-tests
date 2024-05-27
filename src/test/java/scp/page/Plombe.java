package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Plombe extends PocetnaStranica{

	public Plombe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPlombe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Plombe')]")));
		verifikacijaZajednickihElemenata("Mjerila", "Plombe", "Plombe", 7, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifra1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjeriloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPostavljanjaPlombeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumUklanjanjaPlombeWE));
	}
	
}
