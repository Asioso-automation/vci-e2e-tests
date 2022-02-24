package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class SektorDjelatnosti extends PocetnaStranica {

	public SektorDjelatnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujSektorDjelatnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sektor djelatnosti')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "SektorDjelatnosti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SEKTOR DJELATNOSTI"), "SektorDjelatnosti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SEKTOR DJELATNOSTI"), "SektorDjelatnosti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "SektorDjelatnosti: Broj kolona nije dobar! ");
	}

}