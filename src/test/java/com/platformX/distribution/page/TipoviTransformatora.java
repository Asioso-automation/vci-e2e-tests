package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviTransformatora extends PocetnaStranicaPXD {

	public TipoviTransformatora(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaVrsta1WE, kolone.kolonaProizvodjac1WE, kolone.kolonaValidanWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujTipoviTransformatora() throws Exception {
		navigateOnPage(TipoviTransformatora.class, "Šifarnici", "Tipovi transformatora");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Tipovi transformatora')]")));
		verifikacijaStranice("Šifarnici", "Tipovi Transformatora", "Tipovi transformatora", 1, columns, buttons);
	}	
	
}