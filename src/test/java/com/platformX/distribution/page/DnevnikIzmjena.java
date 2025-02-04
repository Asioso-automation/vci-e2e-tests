package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class DnevnikIzmjena extends PocetnaStranicaPXD {
	
	public DnevnikIzmjena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaTabelaWE, kolone.kolonaDatumWE, kolone.kolonaIdEntitetaWE, kolone.kolonaIzmijenioWE};
	
	public WebElement[] buttons = {ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujDnevnikIzmjena()throws Exception {
		navigateOnPage(DnevnikIzmjena.class, "Administracija", "Dnevnik izmjena");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Dnevnik izmjena')]")));
		verifikacijaStranice("Administracija", "Dnevnik Izmjena", "Dnevnik izmjena", 1, columns, buttons);
	}

}