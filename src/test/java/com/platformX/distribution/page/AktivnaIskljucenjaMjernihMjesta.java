package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class AktivnaIskljucenjaMjernihMjesta extends PocetnaStranicaPXD {
	
	public AktivnaIskljucenjaMjernihMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaDatumIskljucenjaWE, kolone.kolonaRazlogIskljucenjaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujAktivnaIskljucenjaMjernihMjesta() throws Exception {
		navigateOnPage(AktivnaIskljucenjaMjernihMjesta.class, "Mjerna mjesta", "Aktivna isključenja MM");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Aktivna isključenja mjernih mjesta')]")));
		verifikacijaStranice("Mjerna mjesta", "Aktivna Isključenja Mjernih Mjesta", "Aktivna isključenja mjernih mjesta", 0, columns, buttons);
	}
	
}