package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class DeklaracijaOPrikljucku extends PocetnaStranicaPXD {

	public DeklaracijaOPrikljucku(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujDeklaracijaOPrikljucku() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Deklaracija o priključku')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Deklaracija O Priključku", "Deklaracija o priključku", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
//		TODO kolona EesWE
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDeklaracijaZaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojiloWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTarifnaGrupaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaMjernogMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
	}
	
}