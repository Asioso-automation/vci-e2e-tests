package com.platformX.distribution.page;

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
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajPostuWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivPosteTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	private WebElement nazivPosteNaDokTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[1]")
	private WebElement idTabelaWE;
	
	@FindBy(xpath = "//td[4]/button")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement potvrdiBtnWE;
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement urediNazivWE;
	
	@FindBy(xpath = "//div/div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;

	public void verifikujPoste() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Pošte')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaniNazivNaDokWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Poste: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("POŠTE"), "Poste: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("POŠTE"), "Poste: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 4, "Poste: Broj kolona nije dobar! ");
	}
	
	public String[] dodajPostu() throws InterruptedException {
		String[] podaci = new String[3];
		podaci[0] = "Posta "+ Helper.getRandomString(5);
		podaci[1] = Helper.getRandomNumber(2);
		podaci[2] = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(podaci[1]);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(podaci[0]);
		nazivNaDokWE.sendKeys(podaci[2]);
		Thread.sleep(500);
		dodajPostuWE.click();
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
		dodajPostuWE.click();
	}
	
	public void verifikujPostu(String naziv, String id, String nazivNaDok) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		Thread.sleep(1000);
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivPosteTabelaWE));
		assertTrue(nazivPosteTabelaWE.getText().equals(naziv), "Poste: Posta nije pronadjena!");
		assertTrue(nazivPosteNaDokTabelaWE.getText().equals(nazivNaDok), "Poste: Posta nije pronadjena!");
		assertTrue(idTabelaWE.getText().equals(id), "Poste: Posta nije pronadjena!");
	}
	
	public String izmjeniPostu() throws InterruptedException {
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
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBtnWE));
		potvrdiBtnWE.click();
		return posta;
	}
	
	public void obrisiPostu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjePoste(String posta) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(posta);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Poste: Poruka prazne tabele nije dobra!");
	}

}