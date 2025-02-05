package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StrujniPrenosniOdnos extends PocetnaStranicaPXD{

	public StrujniPrenosniOdnos(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaKonstantaWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujStrujniPrenosniOdnos() throws Exception {
		navigateOnPage(StrujniPrenosniOdnos.class, "Šifarnici", "Strujni prenosni odnos");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Strujni prenosni odnos')]")));
		verifikacijaStranice("Šifarnici", "Strujni Prenosni Odnos", "Strujni prenosni odnos", 1, columns, buttons);
	}
	
}