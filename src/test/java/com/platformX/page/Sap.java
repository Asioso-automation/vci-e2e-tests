package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Sap extends PocetnaStranica {

	public Sap(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujSap() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		Thread.sleep(500);
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "SAP: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SAP"), "SAP: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SAP"), "SAP: Naziv stranice nije dobar!");
	}

}