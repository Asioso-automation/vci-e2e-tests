package com.application.page;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.base.PageBase; //extends PageBase

public class Newsletter extends PageBase{

	public Newsletter(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//main/div[1]")
	private WebElement newsletterTeaserWE;
	
	@FindBy(xpath = "//main/div[3]/div/div/div[2]/div/form/div")
	private WebElement newsletterListWE;
	
	@FindBy(xpath = "//main/div[3]/div/div/div[2]/div/form/div/ul/li[1]")
	private WebElement newsletterItem1WE;
	
	@FindBy(xpath = "//form/div/ul/li[1]/div/div/div[2]/div[2]/label/text()")
	private WebElement newsletterItem1CheckboxWE;
	

	public void verifyNewsletterPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		Thread.sleep(1000);
//		try {
//			wait.until(ExpectedConditions.visibilityOf(cookieBannerButtonWE));
//			wait.until(ExpectedConditions.elementToBeClickable(cookieBannerButtonWE)).click();	
//		} catch(Exception e) {}
		wait.until(ExpectedConditions.visibilityOf(newsletterTeaserWE));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", newsletterListWE);
		wait.until(ExpectedConditions.visibilityOf(newsletterListWE));
		//wait.until(ExpectedConditions.visibilityOf(passwordWE));
	}
	
	public void verifyNewsletterItem() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(newsletterItem1WE));
		wait.until(ExpectedConditions.elementToBeClickable(newsletterItem1CheckboxWE)).click();
		// verifikacija poruke
		// u ovu metodu dodati da prima parametar boolean checked (true/false)
	}
	
	// validacija checkboxa
}

// Prvi test
// Prva metoda je verifikacija da sam na newsletter stranici
// Druga metoda je prijava na newsletter sa verifikacijom poruke
// Treća metoda je validacija checkboxa

// Drugi test
// Koristiti već gotove metode za prvi
// Četvrta metoda je odjavljivanje newslettera sa verifikacijom poruke