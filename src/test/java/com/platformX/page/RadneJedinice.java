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

public class RadneJedinice extends PocetnaStranica {

	public RadneJedinice(WebDriver driver) throws FileNotFoundException, IOException {
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
	
	@FindBy(xpath = "//td[12]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public void verifikujRadneJedinice() throws InterruptedException, FileNotFoundException, IOException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Radne jedinice')]")));
		verifyCommonElements("ŠIFARNICI", "RADNE JEDINICE", "RADNE JEDINICE", 12, false, false, true, true, true, true, false);
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdsWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaMjestoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFaxWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEmailWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaInternetAdresaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaCallCentarWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
	}
	
	public String dodajRadnuJedinicu() throws InterruptedException {
		String radnaJedinica = "RJ " + Helper.getRandomString(5);
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
		pretraziRadneJediniceWE.click();
		pretraziRadneJediniceWE.clear();
		pretraziRadneJediniceWE.sendKeys(radnaJedinica);
		pretraziRadneJediniceWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(imeRadneJediniceTableWE));
		assertTrue(imeRadneJediniceTableWE.getText().equals(radnaJedinica), "Radne jedinice: Ime radne jedinice nije dobro!");
	}
	
	public String izmjeniRadnuJedinicu() throws InterruptedException {
		String radnaJedinica = "RJ " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivRadneJediniceWE));
		nazivRadneJediniceWE.click();
		nazivRadneJediniceWE.clear();
		nazivRadneJediniceWE.sendKeys(radnaJedinica);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBtnWE));
		potvrdiBtnWE.click();
		return radnaJedinica;
	}
	
	public void obrisiRadnuJedinicu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeRadneJedinice(String jedinica) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(pretraziRadneJediniceWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziRadneJediniceWE));
		pretraziRadneJediniceWE.click();
		pretraziRadneJediniceWE.clear();
		pretraziRadneJediniceWE.sendKeys(jedinica);
		pretraziRadneJediniceWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Radne jedinice: Poruka prazne tabele nije dobra!");
	}

}