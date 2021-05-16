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

public class DjelatnostiPage extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement sifraDjelatnostiWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivDjelatnostiWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajDjelatnostBtnWE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	private WebElement nazivFilterWE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	private WebElement nazivTabelaWE;
	
	@FindBy(xpath = "//td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	private WebElement urediBtnWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Briši')]")
	private WebElement obrisiBtnWE;
	
	@FindBy(xpath = "//div[5]/div/div/div[4]/button[2]")
	private WebElement potvrdiBrisanjeBtnWE;
	
	@FindBy(xpath = "//tr[2]/td")
	private WebElement praznaTabelaWE;

	public DjelatnostiPage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDjelatnosti() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(tableHeaderWE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Djelatnosti')]")));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Djelatnosti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("DJELATNOSTI"), "Djelatnosti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("DJELATNOSTI"), "Djelatnosti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "Djelatnosti: Broj kolona nije dobar! ");
	}
	
	public String dodajDjelatnost() throws InterruptedException {
		String djelatnost = "Djelatnost " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraDjelatnostiWE));
		sifraDjelatnostiWE.sendKeys(getRandomName());
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(dodajDjelatnostBtnWE));
		dodajDjelatnostBtnWE.click();
		Thread.sleep(1000);
		return djelatnost;
	}
	
	public void verifikujDjelatnost(String djelatnost) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(nazivFilterWE));
		nazivFilterWE.click();
		nazivFilterWE.clear();
		nazivFilterWE.sendKeys(djelatnost);
		nazivFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(nazivTabelaWE.getText().equals(djelatnost), "Djelatnosti: Ime djelatnosti nije dobro!");
	}
	
	public String izmjeniDjelatnost() {
		String djelatnost = "Djelatnost " + getRandomName();
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBtnWE));
		urediBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.click();
		nazivDjelatnostiWE.clear();
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(dodajDjelatnostBtnWE));
		dodajDjelatnostBtnWE.click();
		return djelatnost;
	}
	
	public void obrisiDjelatnost() {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiBtnWE));
		obrisiBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeDjelatnosti(String djelatnost) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(nazivFilterWE));
		nazivFilterWE.click();
		nazivFilterWE.clear();
		nazivFilterWE.sendKeys(djelatnost);
		nazivFilterWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Djelatnosti: Poruka prazne tabele nije dobra!");
	}

}