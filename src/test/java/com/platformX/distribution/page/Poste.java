package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class Poste extends PocetnaStranicaPXD {

	public Poste(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement idWE;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div/input")
	private WebElement nazivNaDokWE;
	
	@FindBy(xpath = "//div[1]/div/div/div[1]/div/input")
	private WebElement urediNazivWE;

	public void verifikujPoste() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Pošte')]")));
		verifikacijaZajednickihElemenata("Šifarnici", "Pošte", "Pošte", 4, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaStampaniNazivNaDokWE));
	}
	
	public String[] dodajPostu(String[] podaci) throws InterruptedException {
		podaci[0] = "Posta "+ Helper.getRandomString(5);
		podaci[1] = Helper.getRandomNumber(4);
		podaci[2] = Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(podaci[1]);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(podaci[0]);
		nazivNaDokWE.sendKeys(podaci[2]);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return podaci;
	}
	
	public void dodajPostuSaPodacima(String naziv, String id, String nazivNaDok) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(idWE));
		idWE.sendKeys(id);
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		nazivNaDokWE.sendKeys(nazivNaDok);
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public String urediPostu(String posta) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediWE));
		urediWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediNazivWE));
		urediNazivWE.click();
		urediNazivWE.clear();
		urediNazivWE.sendKeys(posta);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		return posta;
	}

}