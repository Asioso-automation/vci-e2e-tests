package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RegistarPlombi extends PocetnaStranicaPXD {

	public RegistarPlombi(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujRegistarPlombi() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Registar plombi')]")));
		verifikacijaZajednickihElemenata("Mjerna Mjesta", "Registar Plombi", "Registar plombi", 10, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOznaka1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojPlombeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStatusWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMonterWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZaduzenjeNapravioWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZaduzenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRazduzenjaWE));
	}

}