package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NaloziZaObracun extends PocetnaStranicaPXD {
	
	public NaloziZaObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaPeriodWE, kolone.kolonaTipUgovoraWE, kolone.kolonaSnabdjevacWE, kolone.kolonaSezonaWE, 
			kolone.kolonaDatumWE, kolone.kolonaBrojKupacaWE, kolone.kolonaBrojMjernihMjestaWE, kolone.kolonaBrojObracunatihUgovoraWE, kolone.kolonaUkupnaEnergijaWE, 
			kolone.kolonaUkupanIznosWE, kolone.kolonaZakljucenWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujNaloziZaObracun()throws Exception {
		navigateOnPage(NaloziZaObracun.class, "Obračun", "Nalozi za obračun");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Nalozi za obračun')]")));
		verifikacijaStranice("Obračun", "Nalozi Za Obračun", "Nalozi za obračun", 1, columns, buttons);
	}

}