package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class OcitanjaBrojila extends PocetnaStranica {

	public OcitanjaBrojila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOcitanjaBrojila() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Očitanja brojila')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "OČITANJA BROJILA", "OČITANJA BROJILA", 12, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAKonstantaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRKonstantaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKonstSnageWE));
	}

}