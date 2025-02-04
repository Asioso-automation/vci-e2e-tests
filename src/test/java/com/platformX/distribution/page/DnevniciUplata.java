package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class DnevniciUplata extends PocetnaStranicaPXD {

	public DnevniciUplata(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBankaWE, kolone.kolonaZiroRacunWE, kolone.kolonaBrojIzvodaWE, kolone.kolonaDatumIzvodaWE, 
			kolone.kolonaDatumKnjizenjaWE, kolone.kolonaBrojUplataWE, kolone.kolonaIznosUplataWE, kolone.kolonaZakljucenWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void verifikujDnevniciUplata() throws Exception {
		navigateOnPage(DnevniciUplata.class, "Finansije", "Dnevnici uplata");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Dnevnici uplata')]")));
		verifikacijaStranice("Finansije", "Dnevnici Uplata", "Dnevnici uplata", 1, columns, buttons);
	}
	
}