package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KoristenaBrojila extends PocetnaStranicaPXD {
	
	public KoristenaBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojBrojilaWE, kolone.kolonaBrojDrzavnePlombeWE, kolone.kolonaTipBrojilaWE, kolone.kolonaGodinaIstekaZigaWE, kolone.kolonaGodinaProizvodnjeWE, 
			kolone.kolonaVlasnistvoWE, kolone.kolonaBrojFazaWE, kolone.kolonaBrojTarifaWE, kolone.kolonaRedniBrojURegistruWE, kolone.kolonaPodrzavaAmmIntegracijuWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

		public void navigirajVerifikujKoristenaBrojila()throws Exception {
		navigateOnPage(KoristenaBrojila.class, "Brojila", "Korištena brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Korištena brojila')]")));
		verifikacijaStranice("Brojila", "Korištena Brojila", "Korištena brojila", 1, columns, buttons);
	}
	
}