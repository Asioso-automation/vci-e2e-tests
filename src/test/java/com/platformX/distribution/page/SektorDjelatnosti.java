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
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class SektorDjelatnosti extends PocetnaStranica {

	public SektorDjelatnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//input[contains(@id, 'input')]")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoImenuWE;
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]")
	private WebElement imeSektoraDjelatnostiTabelaWE;

	public void verifikujSektorDjelatnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sektor djelatnosti')]")));
		verifyCommonElements("ŠIFARNICI", "SEKTOR DJELATNOSTI", "SEKTOR DJELATNOSTI", 3, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
	}
	
	public String dodajSektorDjelatnosti() throws InterruptedException {
		String naziv = new String();
		naziv = "SektorDjelatnosti " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}

	public void verifikujDodavanjeSektoraDjelatnosti(String ime) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoImenuWE));
		filterPoImenuWE.click();
		filterPoImenuWE.clear();
		filterPoImenuWE.sendKeys(ime);
		filterPoImenuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(imeSektoraDjelatnostiTabelaWE));
		assertTrue(imeSektoraDjelatnostiTabelaWE.getText().equals(ime), "SektorDjelatnosti: Sektor djelatnosti nije pronađen!");
	}
	
	public String urediSektorDjelatnosti() throws InterruptedException {
		String naziv = "SektorDjelatnosti " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.clear();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}

	
}