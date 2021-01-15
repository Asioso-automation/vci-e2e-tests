package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KupciZaTestneRacunePage extends HomePage {
	
	@FindBy(xpath = "//header/div/button[1]")
	private WebElement dodajBtnWE;

	public KupciZaTestneRacunePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKupciZaTestneRacune() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "KupciZaTestneRacune: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KUPCI ZA TESTNE RAČUNE"), "KupciZaTestneRacune: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KUPCI ZA TESTNE RAČUNE"), "KupciZaTestneRacune: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "KupciZaTestneRacune: Broj kolona nije dobar! ");
	}

}