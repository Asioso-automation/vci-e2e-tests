package com.platformX.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BankePage extends PocetnaStranica {

	public BankePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//a/span/i") 
	private WebElement dodajBankuBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div/input") 
	private WebElement pretraziBankeWE;
	
	@FindBy(xpath = "//tr[2]/td[2]") 
	private WebElement imeBankeTableWE;
	
	// Kreiraj banku elementi
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input") 
	private WebElement nazivBankeWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input") 
	private WebElement cifreZiroRacunaWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtnWE;
	
	public void verifikujBankeStranicu() {
		wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Banke')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "Banke: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("BANKE"), "Banke: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("BANKE"), "Banke: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "Banke: Broj kolona nije dobar! ");
	}
	
	public String dodajBanku() throws InterruptedException {
		String banka = "Banka " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajBankuBtnWE));
		Thread.sleep(1000);
		// TODO Dodati wait, naredni korak cesto pada
		dodajBankuBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivBankeWE));
		nazivBankeWE.sendKeys(banka);
		wait.until(ExpectedConditions.elementToBeClickable(cifreZiroRacunaWE));
		cifreZiroRacunaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return banka;
	}
	
	public void verifikujBanku(String banka) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziBankeWE));
		Thread.sleep(1000);
		pretraziBankeWE.click();
		pretraziBankeWE.sendKeys(banka);
		pretraziBankeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imeBankeTableWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(imeBankeTableWE.getText().equals(banka), "Banke: Ime banke nije dobro!");
	}

}