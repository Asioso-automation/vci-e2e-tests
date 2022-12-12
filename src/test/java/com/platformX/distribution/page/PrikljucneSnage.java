package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class PrikljucneSnage extends PocetnaStranica {
	
	public PrikljucneSnage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	public void verifikujPrikljucneSnage() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Priključne snage')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSnaga1WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNestandardnaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "PrikljucneSnage: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("PRIKLJUČNE SNAGE"), "PrikljucneSnage: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("PRIKLJUČNE SNAGE"), "PrikljucneSnage: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 5, "PrikljucneSnage: Broj kolona nije dobar! ");
	}

}