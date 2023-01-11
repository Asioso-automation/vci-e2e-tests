package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class Opstine extends PocetnaStranica {

	public Opstine(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOpstine() throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Opštine')]")));
		verifyCommonElements("ŠIFARNICI", "OPŠTINE", "OPŠTINE", 4, false, false, true, true, true, true, false);
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEntitetWE));
	}

}