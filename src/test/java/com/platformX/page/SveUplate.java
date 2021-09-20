package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SveUplatePage extends PocetnaStranica {

	public SveUplatePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujSveUplate() {
		// wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sve uplate')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "SveUplate: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SVE UPLATE"), "SveUplate: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SVE UPLATE"), "SveUplate: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "SveUplate: Broj kolona nije dobar! ");
	}

}