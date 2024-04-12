package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KategorijePotrosnje extends PocetnaStranicaPXD {

	public KategorijePotrosnje(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input") 
	private WebElement nazivKategorijePotrosnjeWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div[1]/input[1]") 
	private WebElement kategorijaNaponskogNivoaWE;

	public void verifikujKategorijePotrosnje() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Kategorije potro')]")));
		verifikacijaZajednickihElemenata("Tarifni Sistem", "Kategorije Potrošnje", "Kategorije potrošnje", 3, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaNaponskogNivoaWE));
	}

}