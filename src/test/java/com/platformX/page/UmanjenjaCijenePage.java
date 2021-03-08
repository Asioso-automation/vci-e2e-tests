package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UmanjenjaCijenePage extends PocetnaStranica {

	public UmanjenjaCijenePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujUmanjenjaCijene() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "UmanjenjaCijene: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("UMANJENJA CIJENE"), "UmanjenjaCijene: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("UMANJENJA CIJENE"), "UmanjenjaCijene: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "UmanjenjaCijene: Broj kolona nije dobar! ");
	}

}