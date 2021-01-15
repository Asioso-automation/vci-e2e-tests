package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GrupeObrazacaBrojaUgovoraPage extends HomePage {

	public GrupeObrazacaBrojaUgovoraPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujGrupeObrazaca() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		// assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "GrupeObrazaca: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("GRUPE OBRAZACA BROJA UGOVORA"), "GrupeObrazaca: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("GRUPE OBRAZACA BROJA UGOVORA"), "GrupeObrazaca: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "GrupeObrazaca: Broj kolona nije dobar! ");
	}

}