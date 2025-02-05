package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviPrikljucka extends PocetnaStranicaPXD {

	public TipoviPrikljucka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaSifraWE, kolone.kolonaCijenaWE, kolone.kolonaTrofazniPrikljucakWE, kolone.kolonaFiksnaCijenaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujTipoviPrikljucka() throws Exception {
		navigateOnPage(TipoviPrikljucka.class, "Šifarnici", "Tipovi priključka");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Tipovi priključka')]")));
		verifikacijaStranice("Šifarnici", "Tipovi Priključka", "Tipovi priključka", 0, columns, buttons);
	}

}