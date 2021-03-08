package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AvansiPage extends PocetnaStranica {

	public AvansiPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujAvansi() {
		
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "Avansi: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("AVANSI"), "Avansi: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("AVANSI"), "Avansi: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "Avansi: Broj kolona nije dobar!");
	}

}