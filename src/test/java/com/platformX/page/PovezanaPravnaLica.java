package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class PovezanaPravnaLica extends PocetnaStranica {
	
	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement preuzmiExcelBtnWE;
	
	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[4]")
	protected WebElement osvjeziBtnWE;

	public PovezanaPravnaLica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujPovezanaPravnaLica() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Povezana pravna lica')]")));
		verifikacijaZajednickihElemenata2("Kupci", "Povezana Pravna Lica", "Povezana pravna lica", 8, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaJIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaPIBWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSAPSifraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

}