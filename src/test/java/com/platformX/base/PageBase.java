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
import com.platformX.util.HandlerUtil;
import com.platformX.util.PropertiesUtil;

public class PageBase {

	protected HandlerUtil lastBrowserHandler;
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
	
	@FindBy(xpath = "//main/div/div/div/div[2]/div/div")
	protected WebElement porukaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	protected WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Bri')]")
	protected WebElement obrisiWE;
	
	@FindBy(xpath = "//tr[2]/td")
	protected WebElement praznaTabelaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Obrada u toku...') and contains(@class, 'title')]")
	protected WebElement obradaModalWE;
	
	@FindBy(xpath = "//ul/button[1]")
	protected WebElement sekcijaBtnWE;
	
	@FindBy(xpath = "//ul/button[2]")
	protected WebElement stranicaBtnWE;
	
	@FindBy(xpath = "//div/div[1]/div[1]/header/div/div[1]")
	protected WebElement naslovStraniceWE;
	
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
	

	protected Select select(WebElement webElement, String name) {
		Select selectedElement = new Select(webElement);
		selectedElement.selectByVisibleText(name);
		return selectedElement;
	}

	public void activateHandler() {
		lastBrowserHandler = new HandlerUtil();
		driver.switchTo().window(lastBrowserHandler.getLastBrowserHandle(driver));
	}
	
	public void osvjeziStranicu() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		}
	
	public List<WebElement> brojKolona() {
		return driver.findElements(By.xpath("//th"));
	}
	
	public void verifyCommonElements(String sekcija, String stranica, String naslovStranice, int brKolona, boolean importBtn, boolean addAll, boolean add, boolean downloadExcel, boolean removeFilters, boolean refresh, boolean info) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals(stranica), stranica + ": Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals(naslovStranice), stranica + ": Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
		if (importBtn==true) {
			wait.until(ExpectedConditions.elementToBeClickable(importujBtnWE));
		}
		if (addAll==true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajSveBtnWE));
		}
		if (add==true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		}
		if (downloadExcel==true) {
			wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		}
		if (removeFilters==true) {
			wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		}
		if (refresh==true) {
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		}
		if (info==true) {
			wait.until(ExpectedConditions.elementToBeClickable(infoBtnWE));
		}
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}

}