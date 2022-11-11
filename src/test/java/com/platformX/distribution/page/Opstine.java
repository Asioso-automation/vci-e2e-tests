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

public class Opstine extends PocetnaStranica {

	public Opstine(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	@FindBy(xpath = "//div[1]/div/div/div/div[1]/div/input")
	private WebElement nazivWE;
	
	@FindBy(xpath = "//div[3]/div/div/div[1]/div[1]/input[1]")
	private WebElement drzavaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterPoNazivuWE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	private WebElement nazivOpstineTabelaWE;
	
//	@FindBy(xpath = "//div/div/div[3]/button[2]")
//	private WebElement potvrdiBrisanjeWE;
	
	public void verifikujOpstine() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Opštine')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaNazivWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaEntitetWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDrzavaWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "Opstine: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("OPŠTINE"), "Opstine: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("OPŠTINE"), "Opstine: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 5, "Opstine: Broj kolona nije dobar! ");
	}

	public String dodajOpstinu() throws InterruptedException {
		String naziv = new String();
		naziv = "Opstina " + Helper.getRandomString(5);
		String drzava = new String();
		drzava = "BIH";
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(drzavaWE));
		drzavaWE.sendKeys(drzava);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + drzava + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + drzava + "')]")).click();
		submitBtnWE.click();
		return naziv;
	}
	
	public void verifikujOpstinu(String naziv) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(nazivOpstineTabelaWE));
		assertTrue(nazivOpstineTabelaWE.getText().equals(naziv), "Opstine: Opstina nije pronađena!");
	}
	
	public String urediOpstinu() throws InterruptedException {
		String naziv = "Opstina " + Helper.getRandomString(5);
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(urediBurgerBarWE));
		urediBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivWE));
		nazivWE.click();
		nazivWE.clear();
		nazivWE.sendKeys(naziv);
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnWE));
		submitBtnWE.click();
		return naziv;
	}
	
	public void obrisiOpstinu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brisiBurgerBarWE));
		brisiBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeOpstine(String naziv) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterPoNazivuWE));
		Thread.sleep(1000);
		filterPoNazivuWE.click();
		filterPoNazivuWE.clear();
		filterPoNazivuWE.sendKeys(naziv);
		filterPoNazivuWE.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Opstine: Poruka prazne tabele nije dobra!");
	}
	
}