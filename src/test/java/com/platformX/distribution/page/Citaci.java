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

public class Citaci extends PocetnaStranica {

	public Citaci(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/div[1]/div/input")
	private WebElement imeWE;
	
	@FindBy(xpath = "(//button[@aria-label = 'prepend icon'])[1]")
	private WebElement dateIconWE;
	
	@FindBy(xpath = "//div[(@class = 'v-btn__content') and contains(text(), '13')]")
	private WebElement datum13WE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoImenuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement imeCitacaTabelaWE;

	public void verifikujCitaci() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Čitači')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojMobilnogTelefonaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumOdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumDoWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaTerenskaJedinicaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaFizickaLokacijaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Citaci: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("ČITAČI"), "Citaci: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("ČITAČI"), "Citaci: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 8, "Citaci: Broj kolona nije dobar! ");
	}

	public String dodajCitaca() throws InterruptedException {
		String ime = new String();
		ime = "Citac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imeWE));
		imeWE.sendKeys(ime);
		wait.until(ExpectedConditions.elementToBeClickable(dateIconWE));
		dateIconWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(datum13WE));
		datum13WE.click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ime;
	}
	
	public void verifikujCitaca(String ime) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoImenuWE));
		filterPoImenuWE.click();
		filterPoImenuWE.clear();
		filterPoImenuWE.sendKeys(ime);
		filterPoImenuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(imeCitacaTabelaWE));
		assertTrue(imeCitacaTabelaWE.getText().equals(ime), "Citaci: Citac nije pronađen!");
	}
	
	public String izmijeniCitaca() throws InterruptedException {
		String ime = "Citac " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBurgerBarWE));
		urediBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(imeWE));
		imeWE.click();
		imeWE.clear();
		imeWE.sendKeys(ime);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return ime;
	}
}