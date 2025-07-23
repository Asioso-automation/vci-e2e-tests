package com.application.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.app.base.PageBase;

public class LogIn extends PageBase {

	public LogIn(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);

	}
	
	@FindBy(xpath = "//main/div[2]/div[1]/div/ul/li[1]/a")
	private WebElement loginTabWE;

	@FindBy(id = "f-login-user")
	private WebElement usernameWE;

	@FindBy(id = "f-login-pass")
	private WebElement passwordWE;
	
	@FindBy(xpath = "//*[@class='c-login__submit js-submit btn btn--primary']")
	private WebElement loginSubmitBtnWE;
	
	@FindBy(xpath = "//div[@class='c-header__logo']")
	private WebElement navLogoWE;
	
	@FindBy(xpath = "//div[1]/div/div[3]/button[1]")
	private WebElement cookieBannerButtonWE;

	@FindBy(xpath = "/html/body/header/nav/div[1]/div[2]/div/div/ul/li[1]/a")
	private WebElement metaNaviLink;
	
	public void verifikujLogIn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(loginTabWE));
		wait.until(ExpectedConditions.visibilityOf(usernameWE));
		wait.until(ExpectedConditions.visibilityOf(passwordWE));
		try {
			wait.until(ExpectedConditions.visibilityOf(cookieBannerButtonWE));
			wait.until(ExpectedConditions.elementToBeClickable(cookieBannerButtonWE)).click();	
		} catch(Exception e) {}
	}

	public void logIn() throws InterruptedException {
//		metoda unosi username, password i submit-a login
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", usernameWE);
		wait.until(ExpectedConditions.elementToBeClickable(usernameWE));
		wait.until(ExpectedConditions.elementToBeClickable(passwordWE));
		usernameWE.sendKeys(vci_properties.getValue("VCI.USER.NAME"));
		passwordWE.sendKeys(vci_properties.getValue("VCI.PASSWORD"));
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView(true);", usernameWE);
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(loginSubmitBtnWE)).click();
	}

	
}

// napraviti metodu za logout