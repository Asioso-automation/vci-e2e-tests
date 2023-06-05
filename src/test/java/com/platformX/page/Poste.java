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

public class Poste extends PocetnaStranica {

	public Poste(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement idWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div/input")
	private WebElement nazivNaDokWE;
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement urediNazivWE;

	public void verifikujPoste() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Pošte')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Pošte", "Pošte", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaniNazivWE));
	}
	
	public String[] dodajPostu() throws InterruptedException {
		String[] podaci = new String[3];
		podaci[0] = "Posta "+ Helper.getRandomString(5);
		podaci[1] = Helper.getRandomNumber(3);
		podaci[2] = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(podaci[1]);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(podaci[0]);
		nazivNaDokWE.sendKeys(podaci[2]);
		Thread.sleep(500);
		submitBtnWE.click();
		return podaci;
	}
	
	public void dodajPostuSaPodacima(String naziv, String id, String nazivNaDok) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(id);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		nazivNaDokWE.sendKeys(nazivNaDok);
		Thread.sleep(500);
		submitBtnWE.click();
	}
	
	public void verifikujPostu(String naziv, String id, String nazivNaDok) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		Thread.sleep(1000);
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(naziv);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2Tabela2WE));
		assertTrue(podatak2Tabela2WE.getText().equals(naziv), "Poste: Posta nije pronadjena!");
		assertTrue(podatak2Tabela3WE.getText().equals(nazivNaDok), "Poste: Posta nije pronadjena!");
		assertTrue(podatak2Tabela1WE.getText().equals(id), "Poste: Posta nije pronadjena!");
	}
	
	public String urediPostu() throws InterruptedException {
		String posta = "Posta " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(urediNazivWE));
		urediNazivWE.click();
		urediNazivWE.clear();
		urediNazivWE.sendKeys(posta);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return posta;
	}
	
	public void verifikujBrisanjePoste(String posta) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterKolona2WE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.click();
		filterKolona2WE.clear();
		filterKolona2WE.sendKeys(posta);
		filterKolona2WE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(podatak2TabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(podatak2TabelaWE.getText().equals("Nema podataka"), "Poste: Poruka prazne tabele nije dobra!");
	}

}