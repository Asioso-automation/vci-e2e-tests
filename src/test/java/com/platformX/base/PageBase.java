package com.platformX.base;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.util.PropertiesUtil;

public abstract class PageBase {

	protected WebDriver driver;
	protected PropertiesUtil properties;
	protected PropertiesUtil platformx_properties = null;
	protected final String PLATFORMX_PROPERTIES = "platformx.properties";
	protected PropertiesUtil platformx_distribution_properties = null;
	protected final String PLATFORMX_DISTRIBUTION_PROPERTIES = "platformx.distribution.properties";
	
	public PageBase(WebDriver driver) throws FileNotFoundException, IOException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		platformx_properties = new PropertiesUtil(PLATFORMX_PROPERTIES);
		platformx_distribution_properties = new PropertiesUtil(PLATFORMX_DISTRIBUTION_PROPERTIES);
	}
	
	@FindBy(xpath = "//div[@class='v-alert__content']")								//main/div/div/div/div[2]/div/div/div
	protected WebElement porukaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	protected WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Bri')]")
	protected WebElement obrisiWE;
	
	@FindBy(xpath = "//tr[2]/td")
	protected WebElement praznaTabelaWE;
	
	@FindBy(xpath = "(//i[contains(@class, 'fa-bars')])[1]")
	protected WebElement burgerBarWE;												// burger bar u prvoj liniji liste
	
	@FindBy(xpath = "//*[contains(text(),'Obrada u toku...') and contains(@class, 'title')]")
	protected WebElement obradaModalWE;
	
	@FindBy(xpath = "//ul/button[1]")
	protected WebElement sekcijaBtnWE;
	
	@FindBy(xpath = "//ul/button[2]")
	protected WebElement stranicaBtnWE;
	
	@FindBy(xpath = "//div/div[1]/div[1]/header/div/div[1]")
	protected WebElement naslovStraniceWE;
	
	@FindBy(xpath = "//main/div/div/header/div/div[1]")
	protected WebElement naslovStranice1WE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-file-upload')]")
	protected WebElement importujBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-angle-double-right')]")
	protected WebElement dodajSveBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-plus')]")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-file-download')]")
	protected WebElement preuzmiExcelBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-broom')]")
	protected WebElement ukloniFiltereBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-sync')]")
	protected WebElement osvjeziBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-info')]")
	protected WebElement infoBtnWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-btn__content') and contains(text(), 'Briši')]")
	protected WebElement potvrdiBrisanjeBtnWE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	protected WebElement podatak2Tabela3WE;
	
	@FindBy(xpath = "//tr[2]/td[4]")
	protected WebElement podatak2Tabela4WE;
	

	protected Select select(WebElement webElement, String name) {
		Select selectedElement = new Select(webElement);
		selectedElement.selectByVisibleText(name);
		return selectedElement;
	}
	
	public void osvjeziStranicu() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		}
	
	public List<WebElement> brojKolona() {
		return driver.findElements(By.xpath("//th"));
	}

	
	public void verifikacijaZajednickihElemenata(String sekcija, String stranica, String naslovStranice, int brKolona, boolean importBtn, boolean dodajSve, boolean dodaj, boolean preuzmiExcel, boolean ukloniFiltere, boolean osvjezi, boolean info) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		}
		catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals(stranica), stranica + ": Naziv stranice nije dobar!");
		try {
			assertTrue(naslovStraniceWE.getText().trim().equals(naslovStranice), stranica + ": Naziv stranice nije dobar!");
		}
		catch (Exception e) {
			assertTrue(naslovStranice1WE.getText().trim().equals(naslovStranice), stranica + ": Naziv stranice nije dobar!");
		}
		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
		if (importBtn==true) {
			wait.until(ExpectedConditions.elementToBeClickable(importujBtnWE));
		}
		if (dodajSve==true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajSveBtnWE));
		}
		if (dodaj==true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		}
		if (preuzmiExcel==true) {
			wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		}
		if (ukloniFiltere==true) {
			wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		}
		if (osvjezi==true) {
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		}
		if (info==true) {
			wait.until(ExpectedConditions.elementToBeClickable(infoBtnWE));
		}
		try {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		}
		catch (Exception e) {
		}
	}
	

}