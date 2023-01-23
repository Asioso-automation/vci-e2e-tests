package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class MjesecnaOdobrenjaZaduzenja extends PocetnaStranica{

	public MjesecnaOdobrenjaZaduzenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujMjesecnaOdobrenjaZaduzenja()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjesečna odobrenja/zaduženja')]")));
		verifikacijaZajednickihElemenata("OBRAČUN", "MJESEČNA ODOBRENJA/ZADUŽENJA", "MJESEČNA ODOBRENJA/ZADUŽENJA", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaObracunskiUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRvtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRmtWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
	}

}