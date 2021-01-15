package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInPage extends HomePage {

	public LogInPage(WebDriver driver, String URL) throws FileNotFoundException, IOException {
		super(driver);
		URL = platformx_properties.getValue("URL.LOGIN");
		driver.get(URL);
	}

	@FindBy(xpath = "//button[1]")
	private WebElement ponistiBtnWE;
	
	@FindBy(xpath = "//button[2]")
	private WebElement prijaviSeBtnWE;

	@FindBy(xpath = "//div[1]/div/div[1]/div[2]/input")
	private WebElement korisnickoImeWE;

	@FindBy(xpath = "//div[2]/div/div[1]/div[2]/input")
	private WebElement lozinkaWE;
	
	public void verifyLogInPage() {
		wait.until(ExpectedConditions.elementToBeClickable(ponistiBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(lozinkaWE));
	}

	public void logIn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		korisnickoImeWE.sendKeys(platformx_properties.getValue("USER.NAME"));
		lozinkaWE.sendKeys(platformx_properties.getValue("PASSWORD"));
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
		Thread.sleep(1000);
	}
	
}