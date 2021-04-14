package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MonitoringEnergetskogObracunaPage extends PocetnaStranica {

	public MonitoringEnergetskogObracunaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMonitoringEnergetskogObracuna() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., 'Monitoring')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"),
				"MonitoringEnergetskogObracuna: Naziv sekcije nije dobar!"); // bug, los naziv sekcije
		assertTrue(stranicaBtnWE.getText().trim().equals("MONITORING ENERGETSKOG OBRAČUNA"),
				"MonitoringEnergetskogObracuna: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MONITORING ENERGETSKOG OBRAČUNA"),
				"MonitoringEnergetskogObracuna: Naziv stranice nije dobar!");
	}

}