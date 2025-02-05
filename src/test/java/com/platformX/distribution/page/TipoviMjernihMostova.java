package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviMjernihMostova extends PocetnaStranicaPXD {

	public TipoviMjernihMostova(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujTipoviMjernihMostova() throws Exception {
		navigateOnPage(TipoviMjernihMostova.class, "Šifarnici", "Tipovi mjernih mostova");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Tipovi mjernih mostova')]")));
		verifikacijaStranice("Šifarnici", "Tipovi Mjernih Mostova", "Tipovi mjernih mostova", 1, columns, buttons);
	}

}