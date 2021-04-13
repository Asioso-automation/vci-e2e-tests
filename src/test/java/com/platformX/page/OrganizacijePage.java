package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrganizacijePage extends PocetnaStranica {

	public OrganizacijePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujOrganizacijeStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Organizacije ')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Organizacije: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ORGANIZACIJE"), "Organizacije: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ORGANIZACIJE"),
				"Organizacije: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "Organizacije: Broj kolona nije dobar!");
	}

}