package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class Medijacije extends PocetnaStranica {

	public Medijacije(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujMedijacije() throws FileNotFoundException, IOException, InterruptedException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Medijacije')]")));
		verifikacijaZajednickihElemenata2("Pravni Odnosi", "Medijacije", "Medijacije", 12, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrProtokolaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPrijaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumRjesenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumPocetkaObracunaKamateWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDugPoRjesenjuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUvazenoPoRjesenjuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUTokuWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
	}

}