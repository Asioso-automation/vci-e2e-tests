package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class StrujniMjerniTransformatori extends PocetnaStranicaPXD {

	public StrujniMjerniTransformatori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujStrujniMjerniTransformatori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Strujni mjerni transformatori')]")));
		verifikacijaZajednickihElemenata2("Brojila", "Strujni Mjerni Transformatori", "Strujni mjerni transformatori", 11, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipWE));
//		kolonaPrespojiviPrenosniOdnos
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPrenosniOdnosWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivMjMjestaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCitackiHodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafostanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZbirnoMjernoMjestoWE));
	}	
	
}