package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinansijskeKarticePage extends HomePage {

	public FinansijskeKarticePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//header/div/button[2]")
	private WebElement stampajBtnWE;

	@FindBy(xpath = "//header/div/button[1]")
	private WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	private WebElement osvjeziBtnWE;
	
	public void verifikujFinansijskeKartice() {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stampajBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "FinansijskeKartice: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("FINANSIJSKE KARTICE"), "FinansijskeKartice: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("FINANSIJSKE KARTICE"), "FinansijskeKartice: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 10, "FinansijskeKartice: Broj kolona nije dobar! ");
	}

}