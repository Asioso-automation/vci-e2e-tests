package com.platformX.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.platformX.util.HandlerUtil;
import com.platformX.util.PropertiesUtil;

public class PageBase {

	protected HandlerUtil lastBrowserHandler;
	protected WebDriver driver;
	protected PropertiesUtil properties;
	protected PropertiesUtil platformx_properties = null;
	protected final String PLATFORMX_PROPERTIES = "platformx.properties";
	
	public PageBase(WebDriver driver) throws FileNotFoundException, IOException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		platformx_properties = new PropertiesUtil(PLATFORMX_PROPERTIES);
	}
	
	@FindBy(xpath = "//main/div/div/div/div[2]/div/div")
	protected WebElement porukaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	protected WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Bri')]")
	protected WebElement obrisiWE;
	
	@FindBy(xpath = "//tr[2]/td")
	protected WebElement praznaTabelaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Obrada u toku...') and @class='title']")
	protected WebElement obradaModalWE;
	

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

}