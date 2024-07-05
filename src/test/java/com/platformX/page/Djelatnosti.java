package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Djelatnosti extends PocetnaStranica {
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement sifraDjelatnostiWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivDjelatnostiWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div/input")
	private WebElement stampaniNazivDjelatnostiWE;

	public Djelatnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	public void verifikujDjelatnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Djelatnosti')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Djelatnosti", "Djelatnosti", 5, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaSifraDjelatnostiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaGrupaDjelatnostiWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
	}
	
	public String dodajDjelatnost(String djelatnost) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(sifraDjelatnostiWE));
		sifraDjelatnostiWE.sendKeys(Helper.getRandomString(5));
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(stampaniNazivDjelatnostiWE));
		stampaniNazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return djelatnost;
	}
	
	public String urediDjelatnost(String djelatnost) {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(nazivDjelatnostiWE));
		nazivDjelatnostiWE.click();
		nazivDjelatnostiWE.clear();
		nazivDjelatnostiWE.sendKeys(djelatnost);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return djelatnost;
	}

}