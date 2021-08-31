package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.platformX.base.Kolone;

public class MjernaMjesta extends PocetnaStranica {
	
	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement osvjeziDetaljeBtnWE;

	public MjernaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujMjernaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Mjerna mjesta')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEic2WE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("OČITANJA"), "MjernaMjesta: Naziv sekcije nije dobar!"); // bug, los naziv sekcije
		assertTrue(stranicaBtnWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("MJERNA MJESTA"), "MjernaMjesta: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "MjernaMjesta: Broj kolona nije dobar! ");
	}
	
	public void verifikujDetaljeMjernogMjesta() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Mjerno mjesto')]")));
	wait.until(ExpectedConditions.elementToBeClickable(osvjeziDetaljeBtnWE));
	}
	
}