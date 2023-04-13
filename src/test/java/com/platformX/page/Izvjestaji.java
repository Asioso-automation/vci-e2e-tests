package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Izvjestaji extends PocetnaStranica {

	public Izvjestaji(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIzvjestaji() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(naslovStraniceWE));
		assertTrue(naslovStraniceWE.getText().trim().equals("Izvještaji"), "Izvjestaji: Naziv stranice nije dobar!");
	}

}