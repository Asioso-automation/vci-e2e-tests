package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class IndirektnaMjernaMjesta extends PocetnaStranicaPXD {
	
	public IndirektnaMjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIndirektnaMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Indirektna mjerna mjesta')]")));
		verifikacijaZajednickihElemenata("MJERNA MJESTA", "INDIREKTNA MJERNA MJESTA", "INDIREKTNA MJERNA MJESTA", 11, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIndirektnoMjernoMjestoEICWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivIndirektnogMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaIndirektnogMjmWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnoWE));
	}

}