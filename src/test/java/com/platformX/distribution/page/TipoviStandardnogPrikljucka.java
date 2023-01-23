package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class TipoviStandardnogPrikljucka extends PocetnaStranica{

	public TipoviStandardnogPrikljucka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujTipoveStandardnogPrikljucka() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Tipovi standardnog priključka')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "TIPOVI STANDARDNOG PRIKLJUČKA", "TIPOVI STANDARDNOG PRIKLJUČKA", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCijenaWE));
	}

}