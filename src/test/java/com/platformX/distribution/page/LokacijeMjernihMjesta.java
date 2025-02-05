package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijeMjernihMjesta extends PocetnaStranicaPXD {

	public LokacijeMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujLokacijeMjernihMjesta() throws Exception {
		navigateOnPage(LokacijeMjernihMjesta.class, "Šifarnici", "Lokacije mjernih mjesta");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacije mjernih mjesta')]")));
		verifikacijaStranice("Šifarnici", "Lokacije Mjernih Mjesta", "Lokacije mjernih mjesta", 1, columns, buttons);
	}

}