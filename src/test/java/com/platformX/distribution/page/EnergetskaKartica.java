package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class EnergetskaKartica extends PocetnaStranicaPXD {

	public EnergetskaKartica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujEnergetskaKartica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Energetska kartica')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Energetska Kartica", "Energetska kartica", 17, false, false, false, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVrstaZapisaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKonstantaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanjeAVTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtrosakAVTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanjeAMTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtrosakAMTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanjeRVTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtrosakRVTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanjeRMTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtrosakRMTWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStanjeSnageWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUtrosakSnageWE));
	}

}