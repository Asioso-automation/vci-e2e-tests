package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class DnevnikIzmjena extends PocetnaStranica{

	public DnevnikIzmjena(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDnevnikIzmjena() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Dnevnik izmjena')]")));
		verifikacijaZajednickihElemenata("Administracija", "Dnevnik Izmjena", "Dnevnik izmjena", 6, false, false, false, false, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTabelaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdEntitetaWE));
		//wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIzmijenioWE));
	}
}
