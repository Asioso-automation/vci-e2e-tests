package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Uino extends PocetnaStranica {

	public Uino(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujUino() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "UINO: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("UINO"), "UINO: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("UINO"), "UINO: Naziv stranice nije dobar!");
	}

}