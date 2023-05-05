package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaUkljucenja extends PocetnaStranicaPXD {
	
	public ZahtjeviZaUkljucenja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaUkljucenja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Zahtjevi za uključenja')]")));
		verifikacijaZajednickihElemenata("MJERNA MJESTA", "ZAHTJEVI ZA UKLJUČENJA", "ZAHTJEVI ZA UKLJUČENJA (PROCES 16)", 16, false, false, true, true, true, true, true);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogIskljucenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogNeizvrsavanjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIniciraoSnabdjevacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOtkazanWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZahtjevZavrsenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkljucenjeRealizovanoWE));
	}
	
}