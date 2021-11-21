package com.platformX.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogIn extends PocetnaStranica {

	public LogIn(WebDriver driver, String URL) throws FileNotFoundException, IOException {
		super(driver);
		URL = platformx_properties.getValue("URL.LOGIN");
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
		wait.until(ExpectedConditions.elementToBeClickable(korisnickoImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(lozinkaWE));
		wait.until(ExpectedConditions.visibilityOf(prijaviSeBtnWE));
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
	
	public void provjeraValidacija(String korisnickoIme, String lozinka) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(korisnickoImeWE));
		wait.until(ExpectedConditions.visibilityOf(lozinkaWE));
		korisnickoImeWE.sendKeys(korisnickoIme);
		lozinkaWE.sendKeys(lozinka);
		wait.until(ExpectedConditions.elementToBeClickable(prijaviSeBtnWE));
		prijaviSeBtnWE.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaUpozorenjaWE));
		assertTrue(porukaUpozorenjaWE.getText().equals("Pogrešno korisničko ime i/ili lozinka!"), "LogIn: Poruka upozorenja nije dobra!");
	}
	
}