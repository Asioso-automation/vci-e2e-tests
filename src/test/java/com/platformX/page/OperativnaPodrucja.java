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

	public void verifikujOperativnaPodrucja() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Operativna podru')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Operativna Područja", "Operativna područja", 6, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaPrijavuKvaraWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaInformacijeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTelefonZaPrigovoreWE));
	}
	
	public String dodajOperativnoPodrucje() {
		String operativnoPodrucje = "OP " + Helper.getRandomString(5);
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
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return operativnoPodrucje;
	}
	
	public void verifikujOperativnoPodrucje(String operativnoPodrucje) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		Thread.sleep(500);
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(operativnoPodrucje);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela2WE));
		assertTrue(podatakTabela2WE.getText().equals(operativnoPodrucje), "Operativno podrucje: Ime radne jedinice nije dobro!");
	}
	
	public String izmjeniOperativnoPodrucje() throws InterruptedException {
		String novoPodrucje = "OP " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivOperativnogPodrucjaWE));
		nazivOperativnogPodrucjaWE.click();
		nazivOperativnogPodrucjaWE.clear();
		nazivOperativnogPodrucjaWE.sendKeys(novoPodrucje);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return novoPodrucje;
	}
	
	public void verifikujBrisanjeOperativnogPodrucja(String podrucje) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterKolona2WE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(podrucje);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatakTabela0WE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatakTabela0WE.getText().equals("Nema podataka"), "OperativnaPodrucja: Poruka prazne tabele nije dobra!");
	}

}