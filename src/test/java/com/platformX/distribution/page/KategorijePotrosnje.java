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
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaNazivWE, kolone.kolonaKategorijaNaponskogNivoaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujKategorijePotrosnje() throws Exception {
		navigateOnPage(KategorijePotrosnje.class, "Tarifni sistem", "Kategorije potrošnje");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Kategorije potro')]")));
		verifikacijaStranice("Tarifni sistem", "Kategorije Potrošnje", "Kategorije potrošnje", 0, columns, buttons);
	}

}