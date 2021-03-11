package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Bankroti extends PocetnaStranica {

	public Bankroti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujBankroti() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("PRAVNI ODNOSI"), "Bankroti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("BANKROTI"), "Bankroti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("BANKROTI"), "Bankroti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 7, "Bankroti: Broj kolona nije dobar! ");
	}

}