package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class OperatoriDistributivnihSistema extends PocetnaStranica {

	public OperatoriDistributivnihSistema(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOperatoriDistributivnihSistema() throws FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Operatori distributivnih sistema')]")));
		verifikacijaZajednickihElemenata("ŠIFARNICI", "OPERATORI DISTRIBUTIVNIH SISTEMA", "OPERATORI DISTRIBUTIVNIH SISTEMA", 8, false, false, false, true, true, true, false);
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSapMjestoTroskaWE));
	}

}