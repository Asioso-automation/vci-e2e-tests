package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ZahtjeviZaDostavuPodataka extends PocetnaStranicaPXD {

	public ZahtjeviZaDostavuPodataka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaSnabdjevacWE, kolone.kolonaEicWE, kolone.kolonaDatumSlanjaWE, kolone.kolonaRazlogOdbijanjaWE, 
			kolone.kolonaIniciraoOdsWE, kolone.kolonaOdbijenoWE, kolone.kolonaRealizovanoWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujZahtjeviZaDostavuPodataka() throws Exception {
		navigateOnPage(ZahtjeviZaDostavuPodataka.class, "Mjerna mjesta", "Zahtjevi za dostavu podataka");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Zahtjevi za dostavu')]")));
		verifikacijaStranice("Mjerna mjesta", "Zahtjevi Za Dostavu Podataka", "Zahtjevi za dostavu podataka o mjernim mjestima (proces 15)", 0, columns, buttons);
	}

}