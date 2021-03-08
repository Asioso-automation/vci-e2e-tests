package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CjenovnikPage extends PocetnaStranica {

	public CjenovnikPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujCjenovnik() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "Cjenovnik: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("CJENOVNIK"), "Cjenovnik: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("CJENOVNIK"), "Cjenovnik: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Cjenovnik: Broj kolona nije dobar! ");
	}

}