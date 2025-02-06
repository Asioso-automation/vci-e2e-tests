package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CitackeListe  extends PocetnaStranicaPXD {

	public CitackeListe (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaCitacWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaZonaWE, kolone.kolonaSektorWE, 
			kolone.kolonaCitackiHodWE, kolone.kolonaUkupanBrojStavkiWE, kolone.kolonaBrojOcitanihStavkiWE, kolone.kolonaNeocitaniSaPorukomWE, 
			kolone.kolonaNeocitaniWE, kolone.kolonaOdRedgnoBrojaWE, kolone.kolonaDoRednogBrojaWE, kolone.kolonaPrikaziPrethodnoOcitanjeWE};
	
	public WebElement[] buttons = {dodajSveBtnWE, dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujCitackeListe()throws Exception {
		navigateOnPage(CitackeListe.class, "Očitanja", "Čitačke liste");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Čitačke liste')]")));
		verifikacijaStranice("Očitanja", "Čitačke Liste", "Čitačke liste", 1, columns, buttons);
	}

}