package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UlicePage extends HomePage {

	public UlicePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujUlice() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Ulice: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ULICE"), "Ulice: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ULICE"), "Ulice: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "Ulice: Broj kolona nije dobar! ");
	}

}