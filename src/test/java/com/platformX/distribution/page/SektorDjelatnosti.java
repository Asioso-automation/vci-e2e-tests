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
	
	@FindBy(xpath = "(//div[contains(@class, 'v-list-item--link')])[1]")
	private WebElement urediBurgerBarWE;

	public void verifikujSektorDjelatnosti() throws InterruptedException, FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title subtitle-2 ml-0 pl-0 text-uppercase') and starts-with(., ' Sektor djelatnosti')]")));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaImeWE));
		wait.until(ExpectedConditions.elementToBeClickable(sekcijaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(stranicaBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		assertTrue(sekcijaBtnWE.getText().trim().equals("ŠIFARNICI"), "SektorDjelatnosti: Naziv sekcije nije dobar!");
		assertTrue(stranicaBtnWE.getText().trim().equals("SEKTOR DJELATNOSTI"), "SektorDjelatnosti: Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals("SEKTOR DJELATNOSTI"), "SektorDjelatnosti: Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == 3, "SektorDjelatnosti: Broj kolona nije dobar! ");
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
	
	public String izmijeniSektorDjelatnosti() throws InterruptedException {
		String naziv = "SektorDjelatnosti " + Helper.getRandomString(5);
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
	
	public void obrisiSektorDjelatnosti() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBar1stWE));
		burgerBar1stWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(brisiBurgerBarWE));
		brisiBurgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeWE));
		potvrdiBrisanjeWE.click();
	}
	
	public void verifikujBrisanjeSektoraDjelatnosti(String ime) throws InterruptedException {
	wait.until(ExpectedConditions.elementToBeClickable(filterPoImenuWE));
	Thread.sleep(1000);
	filterPoImenuWE.click();
	filterPoImenuWE.clear();
	filterPoImenuWE.sendKeys(ime);
	filterPoImenuWE.sendKeys(Keys.ENTER);
	wait.until(ExpectedConditions.elementToBeClickable(praznaTabelaWE));
	wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
	assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "Citaci: Poruka prazne tabele nije dobra!");
	}
	
}