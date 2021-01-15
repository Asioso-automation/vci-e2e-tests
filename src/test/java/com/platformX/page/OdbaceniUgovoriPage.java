package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OdbaceniUgovoriPage extends HomePage {

	public OdbaceniUgovoriPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//td[4]/div/div/div/div/input")
	private WebElement pretraziMjernaMjestaWE;
	
	@FindBy(xpath = "//tr[2]/td[4]/a")
	private WebElement mjernoMjestoTabelaWE;

	public void verifikujOdbaceniUgovori() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "OdbaceniUgovori: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ODBAČENI UGOVORI"), "OdbaceniUgovori: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ODBAČENI UGOVORI"), "OdbaceniUgovori: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 11, "OdbaceniUgovori: Broj kolona nije dobar! ");
	}
	
	public void verifikujOdbaceniUgovor(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziMjernaMjestaWE));
		Thread.sleep(1000);
		pretraziMjernaMjestaWE.click();
		pretraziMjernaMjestaWE.clear();
		pretraziMjernaMjestaWE.sendKeys(mjernoMjesto);
		pretraziMjernaMjestaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(mjernoMjestoTabelaWE));
		assertTrue(mjernoMjestoTabelaWE.getText().contains(mjernoMjesto), "Ugovori: Naziv mjernog mjesta nije dobar!");
	}

}