package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class RelokacijeBrojila extends PocetnaStranicaPXD {
	
	public RelokacijeBrojila (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojiloWE, kolone.kolonaMjernoMjestoEicWE, kolone.kolonaLokacijaWE, kolone.kolonaRazlogPromjeneLokacijeWE, 
			kolone.kolonaValidnostWE, kolone.kolonaDatumOdWE, kolone.kolonaDatumDoWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};

	public void navigirajVerifikujRelokacijeBrojila() throws Exception {
		navigateOnPage(RegistarBrojila.class, "Brojila", "Relokacije brojila");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Relokacije brojila')]")));
		verifikacijaStranice("Brojila", "Relokacije Brojila", "Relokacije brojila", 1, columns, buttons);
	}

}