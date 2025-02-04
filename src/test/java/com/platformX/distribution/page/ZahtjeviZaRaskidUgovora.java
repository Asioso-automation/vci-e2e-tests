package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaRaskidUgovora extends PocetnaStranicaPXD {
	
	public ZahtjeviZaRaskidUgovora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaObracunskiUgovorWE, kolone.kolonaSnabdjevacWE, kolone.kolonaMjernoMjestoEicWE, 
			kolone.kolonaKupacWE, kolone.kolonaDatumKreiranjaWE, kolone.kolonaOcekivaniDatumZavrsetkaUgovoraWE, kolone.kolonaDatumZavrsetkaUgovoraWE, kolone.kolonaPotvrdjenWE, kolone.kolonaOdbijenWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, filterBtnWE, infoBtnWE};

	public void navigirajVerifikujZahtjeviZaRaskidUgovora() throws Exception {		
		navigateOnPage(ZahtjeviZaRaskidUgovora.class, "Obračunski ugovori", "Zahtjevi za raskid ugovora");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za raskid ugovora')]")));
		verifikacijaStranice("Ugovori", "Zahtjevi Za Raskid Ugovora", "Zahtjevi za raskid ugovora (proces 7)", 1, columns, buttons);
	}
	
}