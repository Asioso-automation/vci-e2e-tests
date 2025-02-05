package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijskeSaglasnosti extends PocetnaStranicaPXD {

	public LokacijskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaKupacWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaNamjenaObjektaWE, kolone.kolonaDatumWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujLokacijskeSaglasnosti() throws Exception {
		navigateOnPage(LokacijskeSaglasnosti.class, "Mjerna mjesta", "Lokacijske saglasnosti");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacijske saglasnosti')]")));
		verifikacijaStranice("Mjerna mjesta", "Lokacijske Saglasnosti", "Lokacijske saglasnosti", 1, columns, buttons);
	}	

}