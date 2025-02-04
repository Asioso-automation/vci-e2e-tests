package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CjenovnikNeovlastenePotrosnje extends PocetnaStranicaPXD {

	public CjenovnikNeovlastenePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaTarifnaGrupaWE, kolone.kolonaSezonaWE, kolone.kolonaCijenaEnergijeWE, kolone.kolonaCijenaSnageWE, 
			kolone.kolonaStopaPdvWE, kolone.kolonaDatumOdWE, kolone.kolonaDatumDoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujCjenovnikNeovlastenePotrosnje() throws Exception {
		navigateOnPage(CjenovnikNeovlastenePotrosnje.class, "Tarifni sistem", "Cjenovnik neovlaštene potrošnje");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Cjenovnik neovlaštene potrošnje')]")));
		verifikacijaStranice("Tarifni sistem", "Cjenovnik Neovlaštene Potrošnje", "Cjenovnik neovlaštene potrošnje", 1, columns, buttons);
	}

}