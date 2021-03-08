package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ObracunskaSnagaPage extends PocetnaStranica {

	public ObracunskaSnagaPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement osvjeziBtnWE;
	
	@FindBy(xpath = "//header/div/a")
	protected WebElement dodajBtnWE;

	public void verifikujObracunskaSnaga() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("TARIFNI SISTEM"), "ObracunskaSnaga: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OBRAČUNSKA SNAGA"), "ObracunskaSnaga: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OBRAČUNSKA SNAGA"), "ObracunskaSnaga: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "ObracunskaSnaga: Broj kolona nije dobar! ");
	}

}