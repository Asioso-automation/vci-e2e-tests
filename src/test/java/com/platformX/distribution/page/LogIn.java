package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.platformX.base.PageBase;

public class LogIn extends PageBase {

	public LogIn(WebDriver driver, String URL) throws FileNotFoundException, IOException {
		super(driver);
		URL = platformx_distribution_properties.getValue("URL.DIST.LOGIN");
		driver.get(URL);
	}
	
	@FindBy(xpath = "//div[4]/button")
	private WebElement prijaviSeBtnWE;

	@FindBy(xpath = "//div[2]/div/div/div/div[2]/input")
	private WebElement korisnickoImeWE;

	@FindBy(xpath = "//div[3]/div/div/div/div[2]/input")
	private WebElement lozinkaWE;
	
	@FindBy(xpath = "//div[2]/div/div/div")
	private WebElement porukaUpozorenjaWE;
	
	public void verifikujLogIn() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(lozinkaWE));
		wait.until(ExpectedConditions.visibilityOf(prijaviSeBtnWE));
	}

	public void logIn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		korisnickoImeWE.sendKeys(platformx_distribution_properties.getValue("DIST.USER.NAME"));
		lozinkaWE.sendKeys(platformx_distribution_properties.getValue("DIST.PASSWORD"));
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
	}
	
	public void provjeraValidacija(String korisnickoIme, String lozinka) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		korisnickoImeWE.sendKeys(korisnickoIme);
		lozinkaWE.sendKeys(lozinka);
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(porukaUpozorenjaWE));
		assertTrue(porukaUpozorenjaWE.getText().equals("Pogrešno korisničko ime i/ili lozinka!"), "LogIn: Poruka upozorenja nije dobra!");
	}
	
}