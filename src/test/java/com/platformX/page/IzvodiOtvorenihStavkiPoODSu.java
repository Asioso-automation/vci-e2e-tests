package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class IzvodiOtvorenihStavkiPoODSu extends PocetnaStranica {

	public IzvodiOtvorenihStavkiPoODSu(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujIzvodiOtvorenihStavki() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Izvodi otvorenih stavki')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Izvodi Otvorenih Stavki Po ODS-u", "Izvodi otvorenih stavki po ODS-u", 9, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIOSaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojPrihvacenihStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojOsporenihStavkiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojDjelimicnoOsporenihStavkiWE));
	}

}