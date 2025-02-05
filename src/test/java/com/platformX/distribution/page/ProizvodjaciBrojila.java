package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ProizvodjaciBrojila extends PocetnaStranicaPXD {
	
	public ProizvodjaciBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujProizvodjaciBrojila() throws Exception {
		navigateOnPage(ProizvodjaciBrojila.class, "Šifarnici", "Proizvođači brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Proizvođači brojila')]")));
		verifikacijaStranice("Šifarnici", "Proizvođači Brojila", "Proizvođači brojila", 1, columns, buttons);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}

}