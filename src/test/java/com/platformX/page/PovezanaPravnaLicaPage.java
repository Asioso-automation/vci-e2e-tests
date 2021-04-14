package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PovezanaPravnaLicaPage extends PocetnaStranica {
	
	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement preuzmiExcelBtnWE;
	
	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[4]")
	protected WebElement osvjeziBtnWE;

	public PovezanaPravnaLicaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPovezanaPravnaLica() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Povezana pravna lica')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("KUPCI"), "PovezanaPravnaLica: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("POVEZANA PRAVNA LICA"), "PovezanaPravnaLica: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("POVEZANA PRAVNA LICA"), "PovezanaPravnaLica: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "PovezanaPravnaLica: Broj kolona nije dobar! ");
	}

}