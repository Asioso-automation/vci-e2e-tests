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

public class Djelatnosti extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement sifraDjelatnostiWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivDjelatnostiWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajDjelatnostBtnWE;
	
	@FindBy(xpath = "//td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[7]/div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeBtnWE;

	public Djelatnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDjelatnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Djelatnosti')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Djelatnosti", "Djelatnosti", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraDjelatnostiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}
	
	public String dodajDjelatnost() throws InterruptedException {
		String djelatnost = "Djelatnost " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sifraDjelatnostiWE));
		sifraDjelatnostiWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(dodajDjelatnostBtnWE));
		dodajDjelatnostBtnWE.click();
		Thread.sleep(1000);
		return djelatnost;
	}
	
	public void verifikujDjelatnost(String djelatnost) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
		filterKolona3WE.click();
		filterKolona3WE.clear();
		filterKolona3WE.sendKeys(djelatnost);
		filterKolona3WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela3WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2Tabela3WE.getText().equals(djelatnost), "Djelatnosti: Ime djelatnosti nije dobro!");
	}
	
	public String izmjeniDjelatnost() {
		String djelatnost = "Djelatnost " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.click();
		nazivDjelatnostiWE.clear();
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(dodajDjelatnostBtnWE));
		dodajDjelatnostBtnWE.click();
		return djelatnost;
	}
	
	public void obrisiDjelatnost() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		Thread.sleep(500);
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeDjelatnosti(String djelatnost) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
		Thread.sleep(1000);
		filterKolona3WE.click();
		filterKolona3WE.clear();
		filterKolona3WE.sendKeys(djelatnost);
		filterKolona3WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela0WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatakTabela0WE.getText().equals("Nema podataka"), "Djelatnosti: Poruka prazne tabele nije dobra!");
	}

}