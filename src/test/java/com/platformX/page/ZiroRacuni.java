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

import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class ZiroRacuni extends PocetnaStranica {

	public ZiroRacuni(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//a/span/i")
	private WebElement dodajZiroRacunBtnWE;

	@FindBy(xpath = "//td[3]/div/div/div/div/input")
	private WebElement pretraziZiroRacuneWE;

	@FindBy(xpath = "//tr[2]/td[3]")
	private WebElement ziroRacunTableWE;
	
	@FindBy(xpath = "//td[6]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	// Kreiraj ziro racun elementi

	@FindBy(xpath = "//div[1]/div/div/div[1]/div[1]/input[1]")
	private WebElement odaberiBankuWE;

	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement ziroRacunWE;

	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajBtnWE;

	public void verifikujZiroRacuni() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Žiro računi')]")));
		verifyCommonElements("FINANSIJE", "ŽIRO RAČUNI", "ŽIRO RAČUNI", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivBankeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojZiroRacunaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAktivanWE));
	}

	public String dodajZiroRacun(String banka) throws InterruptedException {
		String ziroRacun = "111-" + Helper.getRandomNumber(3) + "-" + Helper.getRandomNumber(8) + "-" + Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(dodajZiroRacunBtnWE));
		Thread.sleep(1000);
		dodajZiroRacunBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBankuWE));
		Thread.sleep(1000);
		odaberiBankuWE.click();
		odaberiBankuWE.sendKeys(banka);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.sendKeys(ziroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return ziroRacun;
	}
	
	public String dodajZiroRacunSaBrojem(String banka, String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajZiroRacunBtnWE));
		Thread.sleep(1000);
		dodajZiroRacunBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odaberiBankuWE));
		Thread.sleep(1000);
		odaberiBankuWE.click();
		odaberiBankuWE.sendKeys(banka);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + banka + "')]")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.sendKeys(ziroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return ziroRacun;
	}

	public void verifikujZiroRacun(String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(pretraziZiroRacuneWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziZiroRacuneWE));
		pretraziZiroRacuneWE.click();
		pretraziZiroRacuneWE.clear();
		pretraziZiroRacuneWE.sendKeys(ziroRacun);
		pretraziZiroRacuneWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(dodajZiroRacunBtnWE));
		wait.until(ExpectedConditions.visibilityOf(ziroRacunTableWE));
		assertTrue(ziroRacunTableWE.getText().equals(ziroRacun), "ZiroRacuniPage: Ime ziro racuna nije dobro!");
	}
	
	public String izmjeniZiroRacun() throws InterruptedException {
		String noviZiroRacun = "111-" + Helper.getRandomNumber(3) + "-" + Helper.getRandomNumber(8) + "-" + Helper.getRandomNumber(2);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacunWE));
		ziroRacunWE.click();
		ziroRacunWE.clear();
		ziroRacunWE.sendKeys(noviZiroRacun);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		return noviZiroRacun;
	}
	
	public void obrisiZiroRacun() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeZiroRacuna(String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(pretraziZiroRacuneWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziZiroRacuneWE));
		pretraziZiroRacuneWE.click();
		pretraziZiroRacuneWE.clear();
		pretraziZiroRacuneWE.sendKeys(ziroRacun);
		pretraziZiroRacuneWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "ZiroRacuni: Poruka prazne tabele nije dobra!");
	}

}