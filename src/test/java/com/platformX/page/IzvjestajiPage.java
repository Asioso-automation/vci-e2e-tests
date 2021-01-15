package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class IzvjestajiPage extends HomePage {

	public IzvjestajiPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujIzvjestaji() {
		assertTrue(naslovStraniceWE.getText().trim().equals("IZVJEŠTAJI"), "Izvjestaji: Naziv stranice nije dobar!");
	}

}