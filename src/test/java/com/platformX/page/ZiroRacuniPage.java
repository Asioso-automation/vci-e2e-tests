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
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZiroRacuniPage extends HomePage {

	public ZiroRacuniPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//a/span/i")
	private WebElement dodajZiroRacunBtnWE;

	@FindBy(xpath = "//td[3]/div/div/div/div/input")
	private WebElement pretraziZiroRacuneWE;

	@FindBy(xpath = "//tr[2]/td[3]")
	private WebElement ziroRacunTableWE;

	// Kreiraj ziro racun elementi

	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement odaberiBankuWE;

	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement ziroRacunWE;

	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajBtnWE;

	public void verifikujZiroRacuni() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("FINANSIJE"), "ZiroRacuni: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ŽIRO RAČUNI"), "ZiroRacuni: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ŽIRO RAČUNI"), "ZiroRacuni: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "ZiroRacuni: Broj kolona nije dobar! ");
	}

	public String dodajZiroRacun(String banka) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String ziroRacun = "Ziro racun " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajZiroRacunBtnWE));
		Thread.sleep(1000);
		dodajZiroRacunBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBankuWE));
		Thread.sleep(1000);
		odaberiBankuWE.click();
		odaberiBankuWE.sendKeys(banka);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")).click();
		//div[contains(@class, 'measure-tab') and contains(., 'someText')]
		// odaberiBankuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.sendKeys(ziroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return ziroRacun;
	}

	public void verifikujZiroRacun(String ziroRacun) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(pretraziZiroRacuneWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziZiroRacuneWE));
		pretraziZiroRacuneWE.click();
		pretraziZiroRacuneWE.sendKeys(ziroRacun);
		pretraziZiroRacuneWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajZiroRacunBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ziroRacunTableWE));
		assertTrue(ziroRacunTableWE.getText().equals(ziroRacun), "ZiroRacuniPage: Ime ziro racuna nije dobro!");
	}

}