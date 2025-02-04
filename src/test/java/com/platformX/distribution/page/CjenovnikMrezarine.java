package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CjenovnikMrezarine extends PocetnaStranicaPXD {

	public CjenovnikMrezarine(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaPeriodOdWE, kolone.kolonaPeriodDoWE, kolone.kolonaSezonaWE, kolone.kolonaTarifnaGrupaWE, kolone.kolonaVrstaTarifeWE, kolone.kolonaCijenaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujCjenovnikMrezarine() throws Exception {
		navigateOnPage(CjenovnikMrezarine.class, "Tarifni sistem", "Cjenovnik mrežarine");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Cjenovnik mrežarine')]")));
		verifikacijaStranice("Tarifni sistem", "Cjenovnik Mrežarine", "Cjenovnik mrežarine", 1, columns, buttons);
	}

}