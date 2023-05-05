package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviMjernihMostova extends PocetnaStranicaPXD {

	public TipoviMjernihMostova(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujTipoviMjernihMostova() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tipovi mjernih mostova')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TIPOVI MJERNIH MOSTOVA", "TIPOVI MJERNIH MOSTOVA", 3, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}

}