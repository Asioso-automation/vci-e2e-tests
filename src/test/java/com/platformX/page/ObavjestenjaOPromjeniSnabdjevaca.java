package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class ObavjestenjaOPromjeniSnabdjevaca extends PocetnaStranica {

	public ObavjestenjaOPromjeniSnabdjevaca(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujObavjestenjaOPromjeniSnabdjevaca() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Obavještenja o promjeni snabdjevača')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Obavještenja O Promjeni Snabdjevača", "Obavještenja o promjeni snabdjevača", 13, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSerijskiBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaUgovorWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKreiranjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOcekivaniDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumZavrsetkaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPotvrdjenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbijenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaRealizovanWE));
	}

}