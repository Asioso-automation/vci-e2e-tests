package scp.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class KupciSaNeiskoristenimAvansom extends PocetnaStranica{

	public KupciSaNeiskoristenimAvansom(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujKupceSaNeiskoristenimAvansom()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title') and contains(text(), 'Kupci sa neiskorištenim avansom')]")));
		verifikacijaZajednickihElemenata("FINANSIJE", "KUPCI SA NEISKORIŠTENIM AVANSOM", "Kupci sa neiskorištenim avansom", 6, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaId1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupac1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaProstorWE));
		//wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeiskoristeniIznos1WE));
	}

}
