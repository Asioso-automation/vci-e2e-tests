package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SapPage extends HomePage {

	public SapPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujSap() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "SAP: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SAP INTERFEJS"), "SAP: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SAP INTERFEJS"), "SAP: Naziv stranice nije dobar!");
	}

}