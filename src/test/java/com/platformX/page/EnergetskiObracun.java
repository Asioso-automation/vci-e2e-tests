package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class EnergetskiObracun extends PocetnaStranica {

	public EnergetskiObracun(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujEnergetskiObracun() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Energetski obračun')]")));
		verifikacijaZajednickihElemenata2("Očitanja", "Energetski Obračun", "Energetski obračun", 10, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTipUgovoraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivnaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReaktivnaEnergijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnagaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMrezarinaWE));
	}

}