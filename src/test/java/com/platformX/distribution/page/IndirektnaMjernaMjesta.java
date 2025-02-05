package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class IndirektnaMjernaMjesta extends PocetnaStranicaPXD {
	
	public IndirektnaMjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaNazivMjernogMjestaWE, kolone.kolonaFizickaLokacijaMjmWE, 
			kolone.kolonaIndirektnoMjernoMjestoEICWE, kolone.kolonaNazivIndirektnogMjmWE, kolone.kolonaFizickaLokacijaIndirektnogMjmWE, kolone.kolonaPeriodOdWE, 
			kolone.kolonaPeriodDoWE, kolone.kolonaAktivnoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujIndirektnaMjernaMjesta() throws Exception {
		navigateOnPage(IndirektnaMjernaMjesta.class, "Mjerna mjesta", "Indirektna mjerna mjesta");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Indirektna mjerna mjesta')]")));
		verifikacijaStranice("Mjerna mjesta", "Indirektna Mjerna Mjesta", "Indirektna mjerna mjesta", 1, columns, buttons);
	}

}