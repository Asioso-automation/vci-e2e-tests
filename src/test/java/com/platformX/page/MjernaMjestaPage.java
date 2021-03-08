package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MjernaMjestaPage extends HomePage {

	public MjernaMjestaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMjernaMjesta() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "MjernaMjesta: Naziv sekcije nije dobar!"); // bug, los naziv sekcije
		assertTrue(stranicaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		Thread.sleep(1000);
		assertTrue(brojKolona().size() == 6, "MjernaMjesta: Broj kolona nije dobar! ");
	}

}