package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class KorekcijeEnergetskihObracuna extends PocetnaStranicaPXD {

	public KorekcijeEnergetskihObracuna(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaDatumWE, kolone.kolonaKorigovaniPeriodWE, kolone.kolonaTipUgovoraWE, kolone.kolonaTipKorekcije1WE, 
			kolone.kolonaSnabdjevacWE, kolone.kolonaTarifnaGrupaWE, kolone.kolonaKupacWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaUkupnaEnergijaWE, 
			kolone.kolonaUkupanIznosWE, kolone.kolonaKorisnikWE, kolone.kolonaPoslanaWE, kolone.kolonaOdbijenaWE};
	
	public WebElement[] buttons = {preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE, filterBtnWE, infoBtnWE};

	public void navigirajVerifikujKorekcijeEnergetskihObracuna()throws Exception {
		navigateOnPage(KorekcijeEnergetskihObracuna.class, "Obračun", "Korekcije energetskih obračuna");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Korekcije energetskih obračuna')]")));
		verifikacijaStranice("Obračun", "Korekcije Energetskih Obračuna", "Korekcije energetskih obračuna", 3, columns, buttons);
//		TODO kolonaBezNaplateMrezarine
	}

}