package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class CitackiHodovi extends PocetnaStranica {
	
	public CitackiHodovi (WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	
	public void verifikujCitackiHodovi()throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Čitački hodovi')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTrafoStanicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPeriodOcitanjaWE));
		wait.until(ExpectedConditions.visibilityOf(dodajBtnWE));
		wait.until(ExpectedConditions.visibilityOf(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.visibilityOf(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "CitackiHodovi: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ČITAČKI HODOVI"), "CitackiHodovi: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ČITAČKI HODOVI"), "CitackiHodovi: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "CitackiHodovi: Broj kolona nije dobar! ");
	}
}
