package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RazlogNeizvrsavanjaZahtjeva extends PocetnaStranicaPXD {

	public RazlogNeizvrsavanjaZahtjeva(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujRazlogNeizvrsavanjaZahtjeva() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Razlog neizvršavanja zahtjeva')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Razlog Neizvršavanja Zahtjeva", "RAZLOG NEIZVRŠAVANJA ZAHTJEVA", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEbixKodWE));
	}
	
}