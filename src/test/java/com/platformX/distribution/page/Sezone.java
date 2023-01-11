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

public class Sezone extends PocetnaStranica {

	public Sezone(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div[1]/div[1]/div/div/div[1]/div/input") 
	private WebElement IdWE;
	
	@FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div/input") 
	private WebElement nazivSezoneWE;
	
	@FindBy(xpath = "//form/div/div[1]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]") 
	private WebElement odMjesecWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-list-item__content')]//*[text() = 'Januar']") 
	private WebElement januarWE;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div/input") 
	private WebElement odDanWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/div[1]") 
	private WebElement doMjesecWE;
	
	@FindBy(xpath = "//*[contains(@class, 'menuable__content__active')]//*[text() = 'Maj']") 
	private WebElement MajWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input") 
	private WebElement doDanWE;
	
	@FindBy(xpath = "//div[2]/button[1]") 
	private WebElement dodajBtn1WE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivSezoneTabelaWE;
	
	@FindBy(xpath = "//tr[2]/td[5]/button/span/i")
	private WebElement burgerBarWE;
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	private WebElement potvrdiBrisanjeWE;
	
	public void verifikujSezone() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sezone')]")));
		verifyCommonElements("TARIFNI SISTEM", "SEZONE", "SEZONE", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDoWE));
	}
	
	public String dodajSezonu() throws InterruptedException {
		String naziv = "Sezona" + Helper.getRandomString(4);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(IdWE));
		IdWE.sendKeys("S");
		wait.until(ExpectedConditions.elementToBeClickable(nazivSezoneWE));
		nazivSezoneWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(odMjesecWE));
		odMjesecWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(januarWE));
		januarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odDanWE));
	    odDanWE.sendKeys(Helper.getRandomNumber(1));
	    wait.until(ExpectedConditions.elementToBeClickable(doMjesecWE));
	    doMjesecWE.click();
	    Thread.sleep(1000);
	    wait.until(ExpectedConditions.elementToBeClickable(MajWE));
	    MajWE.click();
	    wait.until(ExpectedConditions.elementToBeClickable(doDanWE));
	    doDanWE.sendKeys("30");
	    wait.until(ExpectedConditions.elementToBeClickable(dodajBtn1WE));
	    dodajBtn1WE.click();
	    return naziv;
	}
	
	public void verifikujSezonu(String naziv) throws Exception {
	    wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
	    filterPoNazivuWE.click();
	    filterPoNazivuWE.clear();
	    filterPoNazivuWE.sendKeys(naziv);
	    filterPoNazivuWE.sendKeys(Keys.ENTER);
	    wait.until(ExpectedConditions.elementToBeClickable(nazivSezoneTabelaWE));
	    assertTrue(nazivSezoneTabelaWE.getText().equals(naziv), "Sezona: Sezona nije pronadjena!");
	}
	
	public String urediSezonu() throws InterruptedException {
		String sezona = "Sezona" + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivSezoneWE));
		nazivSezoneWE.click();
		nazivSezoneWE.clear();
		nazivSezoneWE.sendKeys(sezona);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtn1WE));
		dodajBtn1WE.click();
		return sezona;
	}
	
	public void obrisiSezonu()throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeSezone(String sezona) throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(filterPoNazivuWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(sezona);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Sezona: Poruka prazne tabele nije dobra!");
	}

}