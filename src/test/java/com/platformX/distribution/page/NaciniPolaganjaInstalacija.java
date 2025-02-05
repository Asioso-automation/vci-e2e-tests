package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class NaciniPolaganjaInstalacija extends PocetnaStranicaPXD {

	public NaciniPolaganjaInstalacija(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujNaciniPolaganjaInstalacija() throws Exception {
		navigateOnPage(NaciniPolaganjaInstalacija.class, "Šifarnici", "Načini polaganja instalacija");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Načini polaganja instalacija')]")));
		verifikacijaStranice("Šifarnici", "Načini Polaganja Instalacija", "Načini polaganja instalacija", 1, columns, buttons);
	}

}