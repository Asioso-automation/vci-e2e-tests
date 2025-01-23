package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Organizacije extends PocetnaStranicaPXD {

	public Organizacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaPostaWE, kolone.kolonaMjestoWE, kolone.kolonaAdresaWE, 
			kolone.kolonaBrojTelefonaWE, kolone.kolonaFaxWE, kolone.kolonaEmailWE, kolone.kolonaInternetAdresaWE, kolone.kolonaCallCentarWE, kolone.kolonaZiroRacunWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujOrganizacije() throws Exception {
		navigateOnPage(Organizacije.class, "Šifarnici", "Organizacije");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Organizacije ')]")));
		verifikacijaStranice("Šifarnici", "Organizacije", "Organizacije", columns, buttons);
	}

}