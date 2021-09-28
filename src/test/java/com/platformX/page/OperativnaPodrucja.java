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

public class OperativnaPodrucja extends PocetnaStranica {

	public OperativnaPodrucja(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement nazivOperativnogPodrucjaWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input")
	private WebElement telZaPrijavuKvaraWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div/input")
	private WebElement telZaInfoOUslugamaWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input")
	private WebElement telZaPrigovoreWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement potvrdiBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div/input")
	private WebElement pretraziOperativnoPodrucjeWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivOperativnogPodrucjaTableWE;
	
	@FindBy(xpath = "//td[6]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;

	public void verifikujOperativnaPodrucja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Operativna podru')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaPrijavuKvaraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaInformacijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaPrigovoreWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "OperativnaPodrucja: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OPERATIVNA PODRUČJA"), "OperativnaPodrucja: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPERATIVNA PODRUČJA"), "OperativnaPodrucja: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 6, "OperativnaPodrucja: Broj kolona nije dobar! ");
	}
	
	public String dodajOperativnoPodrucje() {
		String operativnoPodrucje = "OP " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivOperativnogPodrucjaWE));
		nazivOperativnogPodrucjaWE.sendKeys(operativnoPodrucje);
		wait.until(ExpectedConditions.elementToBeClickable(telZaPrijavuKvaraWE));
		telZaPrijavuKvaraWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(telZaInfoOUslugamaWE));
		telZaInfoOUslugamaWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(telZaPrigovoreWE));
		telZaPrigovoreWE.sendKeys("111");
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBtnWE));
		potvrdiBtnWE.click();
		return operativnoPodrucje;
	}
	
	public void verifikujOperativnoPodrucje(String operativnoPodrucje) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(pretraziOperativnoPodrucjeWE));
		Thread.sleep(500);
		pretraziOperativnoPodrucjeWE.click();
		pretraziOperativnoPodrucjeWE.clear();
		pretraziOperativnoPodrucjeWE.sendKeys(operativnoPodrucje);
		pretraziOperativnoPodrucjeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivOperativnogPodrucjaTableWE));
		assertTrue(nazivOperativnogPodrucjaTableWE.getText().equals(operativnoPodrucje), "Operativno podrucje: Ime radne jedinice nije dobro!");
	}
	
	public String izmjeniOperativnoPodrucje() throws InterruptedException {
		String novoPodrucje = "OP " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivOperativnogPodrucjaWE));
		nazivOperativnogPodrucjaWE.click();
		nazivOperativnogPodrucjaWE.clear();
		nazivOperativnogPodrucjaWE.sendKeys(novoPodrucje);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBtnWE));
		potvrdiBtnWE.click();
		return novoPodrucje;
	}
	
	public void obrisiOperativnoPodrucje() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeOperativnogPodrucja(String podrucje) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(pretraziOperativnoPodrucjeWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(pretraziOperativnoPodrucjeWE));
		pretraziOperativnoPodrucjeWE.click();
		pretraziOperativnoPodrucjeWE.clear();
		pretraziOperativnoPodrucjeWE.sendKeys(podrucje);
		pretraziOperativnoPodrucjeWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "OperativnaPodrucja: Poruka prazne tabele nije dobra!");
	}

}