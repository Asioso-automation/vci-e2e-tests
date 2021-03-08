package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MonitoringObracunaPage extends PocetnaStranica {

	public MonitoringObracunaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMonitoringObracuna() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OBRAČUN"), "MonitoringObracuna: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("MONITORING OBRAČUNA"), "MonitoringObracuna: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MONITORING OBRAČUNA"), "MonitoringObracuna: Naziv stranice nije dobar!");
	}

}