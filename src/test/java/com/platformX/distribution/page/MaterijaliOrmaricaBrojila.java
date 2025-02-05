package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class MaterijaliOrmaricaBrojila extends PocetnaStranicaPXD {

	public MaterijaliOrmaricaBrojila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujMaterijaliOrmaricaBrojila() throws Exception {
		navigateOnPage(MaterijaliOrmaricaBrojila.class, "Šifarnici", "Materijali ormarića brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Materijali ormarića brojila')]")));
		verifikacijaStranice("Šifarnici", "Materijali Ormarića Brojila", "Materijali ormarića brojila", 1, columns, buttons);
	}

}