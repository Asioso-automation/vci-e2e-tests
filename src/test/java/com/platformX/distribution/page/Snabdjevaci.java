package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Snabdjevaci extends PocetnaStranicaPXD {

	public Snabdjevaci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaZiroRacunWE, kolone.kolonaPostaWE, kolone.kolonaMjestoWE, 
			kolone.kolonaAdresaWE, kolone.kolonaBrojTelefonaWE, kolone.kolonaCallCentarWE, kolone.kolonaFaxWE, kolone.kolonaEmailWE, kolone.kolonaInternetAdresaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujSnabdjevaci() throws Exception {
		navigateOnPage(Snabdjevaci.class, "Šifarnici", "Snabdjevači");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Snabdjevači')]")));
		verifikacijaStranice("Šifarnici", "Snabdjevači", "Snabdjevači", columns, buttons);
	}

}