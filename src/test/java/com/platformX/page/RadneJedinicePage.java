package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RadneJedinicePage extends PocetnaStranica {

	public RadneJedinicePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivRadneJediniceWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement odsWE;
	
	@FindBy(xpath = "//div[contains(text(), 'New York')]")
	private WebElement odaberiOdsWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement jibWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement potvrdiBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div/input")
	private WebElement pretraziRadneJediniceWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement imeRadneJediniceTableWE;

	public void verifikujRadneJedinice() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "RadneJedinice: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("RADNE JEDINICE"), "RadneJedinice: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("RADNE JEDINICE"), "RadneJedinice: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 12, "RadneJedinice: Broj kolona nije dobar! ");
	}
	
	public String dodajRadnuJedinicu() throws InterruptedException {
		String radnaJedinica = "RJ " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivRadneJediniceWE));
		nazivRadneJediniceWE.click();
		nazivRadneJediniceWE.sendKeys(radnaJedinica);
		wait.until(ExpectedConditions.elementToBeClickable(odsWE));
		odsWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiOdsWE));
		odaberiOdsWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(jibWE));
		jibWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBtnWE));
		potvrdiBtnWE.click();
		Thread.sleep(500);
		return radnaJedinica;
	}
	
	public void verifikujRadnuJedinicu(String radnaJedinica) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziRadneJediniceWE));
		pretraziRadneJediniceWE.sendKeys(radnaJedinica);
		pretraziRadneJediniceWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imeRadneJediniceTableWE));
		assertTrue(imeRadneJediniceTableWE.getText().equals(radnaJedinica), "Radne jedinice: Ime radne jedinice nije dobro!");
	}

}