package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class VrsteFinansijskihKartica extends PocetnaStranica {

	public VrsteFinansijskihKartica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujVrsteFinansijskihKartica() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Vrste finansijskih kartica')]")));
		verifikacijaZajednickihElemenata2("Finansije", "Vrste Finansijskih Kartica", "Vrste finansijskih kartica", 2, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}
	
}
