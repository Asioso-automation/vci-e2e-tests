package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KorekcijeRacunaPage extends HomePage {

	public KorekcijeRacunaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujKorekcijeRacuna() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "KorekcijeRacuna: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("KOREKCIJE RAČUNA"), "KorekcijeRacuna: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("KOREKCIJE RAČUNA"), "KorekcijeRacuna: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 14, "KorekcijeRacuna: Broj kolona nije dobar! ");
	}

}