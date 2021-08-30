package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReklamacijePage extends PocetnaStranica {

	public ReklamacijePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujReklamacije() throws InterruptedException {
		// wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Reklamacije')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "Reklamacije: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("REKLAMACIJE"), "Reklamacije: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("REKLAMACIJE"), "Reklamacije: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "Reklamacije: Broj kolona nije dobar! ");
	}

}