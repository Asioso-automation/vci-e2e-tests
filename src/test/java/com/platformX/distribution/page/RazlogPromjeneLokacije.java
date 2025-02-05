package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RazlogPromjeneLokacije extends PocetnaStranicaPXD {
	
	public RazlogPromjeneLokacije (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujRazlogPromjeneLokacije() throws Exception {
		navigateOnPage(RazlogPromjeneLokacije.class, "Šifarnici", "Razlozi promjene lokacije");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Razlozi promjene lokacije')]")));
		verifikacijaStranice("Šifarnici", "Razlog Promjene Lokacije", "Razlozi promjene lokacije", 1, columns, buttons);
	}

}