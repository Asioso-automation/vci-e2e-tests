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

	public void verifikujOperatoriDistributivnihSistema() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Operatori distributivnih sistema')]")));
		verifikacijaZajednickihElemenata2("Šifarnici", "Operatori Distributivnih Sistema", "Operatori distributivnih sistema", 8, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmail2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSapMjestoTroskaWE));
	}

}