package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnergetskiObracunPage extends PocetnaStranica {

	public EnergetskiObracunPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujEnergetskiObracun() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "EnergetskiObracun: Naziv sekcije nije dobar!"); // bug, los naziv sekcije
		assertTrue(stranicaBtnWE.getText().trim().equals("ENERGETSKI OBRAČUN"), "EnergetskiObracun: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ENERGETSKI OBRAČUN"), "EnergetskiObracun: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "EnergetskiObracun: Broj kolona nije dobar! ");
	}

}