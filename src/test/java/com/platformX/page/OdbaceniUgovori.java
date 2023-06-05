package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class OdbaceniUgovori extends PocetnaStranica {

	public OdbaceniUgovori(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOdbaceniUgovori() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Odbačeni ugovori')]")));
		verifikacijaZajednickihElemenata("Kupci", "Odbačeni Ugovori", "Odbačeni ugovori", 11, false, false, false, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKupacWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjernoMjestoEicWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaDostaveWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTGWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaKategorijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaVaziDoWE));
		// wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdbacenWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNapomenaWE));
	}
	
	public void verifikujOdbaceniUgovor(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona4WE));
		Thread.sleep(1000);
		filterKolona4WE.click();
		filterKolona4WE.clear();
		filterKolona4WE.sendKeys(mjernoMjesto);
		filterKolona4WE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela4WE));
		assertTrue(podatak2Tabela4WE.getText().contains(mjernoMjesto), "Ugovori: Naziv mjernog mjesta nije dobar!");
	}

}