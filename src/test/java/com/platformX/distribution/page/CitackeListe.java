package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class CitackeListe  extends PocetnaStranica{

	public CitackeListe (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujCitackeListe()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Čitačke liste')]")));
		verifikacijaZajednickihElemenata("OČITANJA", "ČITAČKE LISTE", "ČITAČKE LISTE", 12, false, true, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUkupanBrojStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojOcitanihStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeocitaniSaPorukomWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNeocitaniWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdRedgnoBrojaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDoRednogBrojaWE));
	}

}