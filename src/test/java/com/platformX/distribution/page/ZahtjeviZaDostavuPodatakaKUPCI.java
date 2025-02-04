package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaDostavuPodatakaKUPCI extends PocetnaStranicaPXD {
	
	public ZahtjeviZaDostavuPodatakaKUPCI(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaSnabdjevacWE, kolone.kolonaEicWE, kolone.kolonaRazlogOdbijanjaWE, kolone.kolonaDatumKreiranjaWE, 
			kolone.kolonaRealizovanWE, kolone.kolonaOdbijenWE, kolone.kolonaIniciraoSnabdjevacWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujZahtjeviZaDostavuPodatakaKUPCI() throws Exception {
//		Kolone kolone = new Kolone(driver);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za dostavu podataka')]")));
//		verifikacijaZajednickihElemenata2("Kupci", "Zahtjevi Za Dostavu Podataka", "Zahtjevi za dostavu podataka (proces 14)", 8, false, false, false, true, true, true, false);
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnabdjevacWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEicWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRazlogOdbijanjaWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenWE));
//		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIniciraoSnabdjevacWE));
		
		navigateOnPage(ZahtjeviZaDostavuPodatakaKUPCI.class, "Kupci", "Zahtjevi za dostavu podataka");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za dostavu podataka (proces 14)')]")));
		verifikacijaStranice("Kupci", "Zahtjevi Za Dostavu Podataka", "Zahtjevi za dostavu podataka (proces 14)", 0, columns, buttons);

	}
	
}