package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class AktivnaIskljucenjaMjernihMjesta extends PocetnaStranicaPXD {
	
	public AktivnaIskljucenjaMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujAktivnaIskljucenjaMjernihMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Aktivna isključenja mjernih mjesta')]")));
		verifikacijaZajednickihElemenata("MJERNA MJESTA", "AKTIVNA ISKLJUČENJA MJERNIH MJESTA", "AKTIVNA ISKLJUČENJA MJERNIH MJESTA", 4, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogIskljucenjaWE));
	}
	
}