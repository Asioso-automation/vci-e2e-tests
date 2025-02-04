package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijeMontera extends PocetnaStranicaPXD {

	public LokacijeMontera(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaMonterWE, kolone.kolonaTerenskaJedinicaWE, kolone.kolonaFizickaLokacijaWE, 
			kolone.kolonaDatumOdWE, kolone.kolonaDatumDoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujLokacijeMontera() throws Exception {
		navigateOnPage(LokacijeMontera.class, "Šifarnici", "Lokacije montera");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacije montera')]")));
		verifikacijaStranice("Šifarnici", "Lokacije Montera", "Lokacije montera", 1, columns, buttons);
	}

}