package com.platformX.distribution.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;
import com.platformX.util.Helper;

public class LokacijskeSaglasnosti extends PocetnaStranicaPXD {

	public LokacijskeSaglasnosti(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//div[1]/div/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement kupacWE;

	@FindBy(xpath = "//div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement fizickaLokacijaWE;

	@FindBy(xpath = "//div[1]/div/div[2]/div[3]/div/div/div[1]/div/input")  
	private WebElement brojProtokolaWE;

	@FindBy(xpath = "//div[2]/div/div[2]/div[1]/div/div/div[1]/div[1]/input[1]")  
	private WebElement mjestoWE;

	@FindBy(xpath = "//div[2]/div/div[2]/div[2]/div/div/div[1]/div[1]/input[1]")  
	private WebElement postaWE;

	@FindBy(xpath = "//div[4]/div/div/div/div[1]/div/textarea")  
	private WebElement namjenaObjektaWE;
	
	@FindBy(xpath = "//div[3]/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/div/textarea")  
	private WebElement tehnickiUsloviWE;
	
	@FindBy(xpath = "//div[4]/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/div/textarea")  
	private WebElement ostaliUsloviWE;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	Kolone kolone = new Kolone(driver);
	
	public WebElement[] columns = {kolone.kolonaIdWE, kolone.kolonaBrojProtokolaWE, kolone.kolonaKupacWE, kolone.kolonaFizickaLokacijaWE, kolone.kolonaNamjenaObjektaWE, kolone.kolonaDatumWE};
	
	public WebElement[] buttons = {dodajBtnWE, preuzmiExcelBtnWE, ukloniFiltereBtnWE, osvjeziBtnWE};
	
	public void navigirajVerifikujLokacijskeSaglasnosti() throws Exception {
		navigateOnPage(LokacijskeSaglasnosti.class, "Mjerna mjesta", "Lokacijske saglasnosti");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-default') and starts-with(., ' Lokacijske saglasnosti')]")));
		verifikacijaStranice("Mjerna mjesta", "Lokacijske Saglasnosti", "Lokacijske saglasnosti", 1, columns, buttons);
	}
	
	public void dodajLokacijskuSaglasnost(String brojProtokola) {
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE)).click();
		lookupInputValue(kupacWE, Helper.getRandomNumber(3));
		lookupInputValue(fizickaLokacijaWE, "4101 - 01 - BIJELJINA");
		fieldInputValue(brojProtokolaWE, brojProtokola);
		wait.until(ExpectedConditions.elementToBeClickable(datumBtn1WE)).click();
		wait.until(ExpectedConditions.elementToBeClickable(trenutniDatum1WE)).click();
		lookupInputValue(mjestoWE, "25 - Bijeljina");
		lookupInputValue(postaWE, "76300 - Bijeljina");
		js.executeScript("arguments[0].scrollIntoView(true);", postaWE);
		fieldInputValue(namjenaObjektaWE, "Namjena objekta " + Helper.getRandomString(10));
		fieldInputValue(tehnickiUsloviWE, "Tehnički uslovi " + Helper.getRandomString(10));
		fieldInputValue(ostaliUsloviWE, "Ostali uslovi " + Helper.getRandomString(10));
		js.executeScript("arguments[0].scrollIntoView(true);", submitBtnWE);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE)).click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
	}


}