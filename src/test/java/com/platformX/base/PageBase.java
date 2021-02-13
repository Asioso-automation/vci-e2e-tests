package com.platformX.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	protected Select select(WebElement webElement, String name) {
		Select selectedElement = new Select(webElement);
		selectedElement.selectByVisibleText(name);
		return selectedElement;
	}

	public void activateHandler() {
		lastBrowserHandler = new HandlerUtil();
		driver.switchTo().window(lastBrowserHandler.getLastBrowserHandle(driver));
	}
	
	public static String getRandomName() {
		return UUID.randomUUID().toString().substring(0, 4);
	}
	
	protected String getRandomNumbers(int randomNumbersCount) {
		String random = "";
		int[] randomNumbers = new int[randomNumbersCount];
		Random number = new Random();
		for (int i = 0; i < randomNumbersCount; i++) {
			randomNumbers[i] = number.nextInt(8) + 1;
		}
		for (int j =0; j < randomNumbers.length; j++){
			random += randomNumbers[j];
		}
		return random;
	}

}