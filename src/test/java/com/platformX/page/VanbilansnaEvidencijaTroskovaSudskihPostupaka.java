package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class VanbilansnaEvidencijaTroskovaSudskihPostupaka extends PocetnaStranica {

	public VanbilansnaEvidencijaTroskovaSudskihPostupaka(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujVanbilansnaEvidencijaTroskovaSudskihPostupaka() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Vanbilansna')]")));
		verifikacijaZajednickihElemenata("Pravni Odnosi", "Vanbilansna Evidencija Troškova Sudskih Postupaka", "Vanbilansna evidencija troškova sudskih postupaka", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.tuzbaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.datumUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugujeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotrazujeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpisWE));
	}
	
	

}
