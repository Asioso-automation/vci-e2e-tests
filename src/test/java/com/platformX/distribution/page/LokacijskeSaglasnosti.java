package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class LokacijskeSaglasnosti extends PocetnaStranicaPXD {

	public LokacijskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujLokacijskeSaglasnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacijske saglasnosti')]")));
		verifikacijaZajednickihElemenata2("Mjerna Mjesta", "Lokacijske Saglasnosti", "Lokacijske saglasnosti", 7, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNamjenaObjektaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
	}	

}