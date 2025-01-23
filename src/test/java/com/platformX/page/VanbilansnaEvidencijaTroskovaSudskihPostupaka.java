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
		verifikacijaZajednickihElemenata2("Pravni Odnosi", "Vanbilansna Evidencija Troškova Sudskih Postupaka", "Vanbilansna evidencija troškova sudskih postupaka", 17, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.tuzbaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojProtokolaWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaReferentWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosSudskihTaksiWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSudskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVanbilansniTipWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.datumUnosaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPozivNaBrojWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));		
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStornoWE));
	}
	
	

}
