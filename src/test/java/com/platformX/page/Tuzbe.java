package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Tuzbe extends PocetnaStranica {

	public Tuzbe(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujTuzbe() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "Tuzbe: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("TUŽBE"), "Tuzbe: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("TUŽBE"), "Tuzbe: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Tuzbe: Broj kolona nije dobar! ");
	}

}