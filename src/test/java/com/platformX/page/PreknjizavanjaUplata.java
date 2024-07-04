package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class PreknjizavanjaUplata extends PocetnaStranica {

	public PreknjizavanjaUplata(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPreknjizavanjaUplata() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Preknjižavanja uplata')]")));
		verifikacijaZajednickihElemenata("Finansije", "Preknjižavanja Uplata", "Preknjižavanja uplata", 14, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPovratSredstavaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaArhiviranoWE));
	}

}