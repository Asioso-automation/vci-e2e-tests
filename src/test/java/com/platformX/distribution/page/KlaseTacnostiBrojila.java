package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KlaseTacnostiBrojila extends PocetnaStranicaPXD {

	public KlaseTacnostiBrojila(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujKlaseTacnostiBrojila() throws Exception {
		navigateOnPage(KlaseTacnostiBrojila.class, "Šifarnici", "Klase tačnosti brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Klase tačnosti brojila')]")));
		verifikacijaStranice("Šifarnici", "Klase Tačnosti Brojila", "Klase tačnosti brojila", 1, columns, buttons);
	}
	
}