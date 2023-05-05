package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZbirnaKontrolnaOcitanja extends PocetnaStranicaPXD{

	public ZbirnaKontrolnaOcitanja (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujZbirnaKontrolnaOcitanja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zbirna/kontrolna očitanja')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "ZBIRNA/KONTROLNA OČITANJA", "ZBIRNA/KONTROLNA OČITANJA", 13, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzvorOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoKontrolnoMjernoMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
	}

}