package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZahtjeviZaUgovorePage extends PocetnaStranica {
	
	@FindBy(xpath = "//a/span/i")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement preuzmiExcelBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement osvjeziBtnWE;

	public ZahtjeviZaUgovorePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujZahtjeviZaUgovore() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "ZahtjeviZaUgovore: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ZAHTJEVI ZA UGOVORE"), "ZahtjeviZaUgovore: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ZAHTJEVI ZA UGOVORE"), "ZahtjeviZaUgovore: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 15, "PovezanaPravnaLica: Broj kolona nije dobar! ");
	}

}