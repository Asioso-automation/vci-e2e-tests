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

public class NaseljenaMjesta extends PocetnaStranica {

	public NaseljenaMjesta(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement stampaniNazivWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement opstinaWE;
	
	@FindBy(xpath = "//div[2]/button[1]")
	private WebElement dodajNaseljenoMjestoWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterNazivWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivTabelaWE;

	public void verifikujNaseljenaMjesta() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Naseljena mjesta')]")));
		verifyCommonElements("ŠIFARNICI", "NASELJENA MJESTA", "NASELJENA MJESTA", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOpstinaWE));
	}

	public String dodajNaseljenoMjesto() throws Exception {
		String naziv = "NaseljenoMjesto" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivWE));
		stampaniNazivWE.click();
		stampaniNazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(opstinaWE));
		opstinaWE.click();
		opstinaWE.sendKeys(Helper.getRandomNumber(1));
		Thread.sleep(1000);
		opstinaWE.sendKeys(Keys.ARROW_DOWN);
		opstinaWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(dodajNaseljenoMjestoWE));
		dodajNaseljenoMjestoWE.click();
		return naziv;
	}
	
	public void verifikujNaseljenoMjesto(String naziv) throws Exception{
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		Thread.sleep(1000);
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(naziv);
		filterNazivWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(nazivTabelaWE));
		assertTrue(nazivTabelaWE.getText().equals(naziv), "NaseljenaMjesta: Naseljeno mjesto nije pronadjena!");
	}
	
	public String urediNaseljenoMjesto() throws InterruptedException{
		String naseljenoMjesto = "NaseljenoMjesto" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.clear();
		nazivWE.sendKeys(naseljenoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivWE));
		stampaniNazivWE.click();
		stampaniNazivWE.clear();
		stampaniNazivWE.sendKeys(naseljenoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(dodajNaseljenoMjestoWE));
		dodajNaseljenoMjestoWE.click();
		return naseljenoMjesto;
	}
	
	public void obrisiNaseljenoMjesto()throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
	}
	
	public void verifikujBrisanjeNaseljenogMjesta(String naseljenoMjesto)throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(filterNazivWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterNazivWE));
		filterNazivWE.click();
		filterNazivWE.clear();
		filterNazivWE.sendKeys(naseljenoMjesto);
		filterNazivWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "NaseljenaMjesta: Poruka prazne tabele nije dobra!");
	}

}