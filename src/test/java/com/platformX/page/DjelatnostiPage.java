package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DjelatnostiPage extends PocetnaStranica {

	public DjelatnostiPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDjelatnosti() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Djelatnosti')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Djelatnosti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("DJELATNOSTI"), "Djelatnosti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("DJELATNOSTI"), "Djelatnosti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "Djelatnosti: Broj kolona nije dobar! ");
	}

}