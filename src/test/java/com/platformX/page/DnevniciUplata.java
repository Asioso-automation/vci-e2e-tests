package com.platformX.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.platformX.base.Kolone;

public class DnevniciUplata extends PocetnaStranica {

	public DnevniciUplata(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}

	// Dodaj dnevnik uplata form

	@FindBy(xpath = "//form/div/div[1]/div[1]/div[1]/div/div/div[1]")
	private WebElement bankaWE;

	@FindBy(xpath = "//div/div[1]/div[1]/div[1]/div/div/div[1]/div[1]/div[1]/input")
	private WebElement unesiBankuWE;

	@FindBy(xpath = "//div[7]/div/div[1]/div/div")
	private WebElement odaberiBankuWE;

	@FindBy(xpath = "//*[contains(text(),bankName)]")
	private WebElement kreiranaBankaWE;

	@FindBy(xpath = "//div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/div[1]")
	private WebElement ziroRacunWE;
	
	@FindBy(xpath = "//body/div/div[3]/div/div/div")
	private WebElement odaberiZiroRacunWE;
	
	@FindBy(xpath = "//div[1]/div[3]/div/div/div[1]/div/input")
	private WebElement brojIzvodaWE;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div[1]/div/input")
	private WebElement brojUplataNaIzvoduWE;
	
	@FindBy(xpath = "//div[4]/div/div/div[1]/div/input")
	private WebElement iznosUplataNaIzvoduWE;
	
	@FindBy(xpath = "//div[1]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumKnjizenjaWE;
	
	@FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[2]/input")
	private WebElement datumIzvodaWE;

	public void verifikujDnevniciUplata() throws FileNotFoundException, IOException {
		Kolone kolone = new Kolone(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class, 'v-toolbar__title body-1 ml-0 pl-0 text-default') and starts-with(., ' Dnevnici uplata')]")));
		verifikacijaZajednickihElemenata("Finansije", "Dnevnici Uplata", "Dnevnici uplata", 13, false, false, true, true, true, true, false);
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIdWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBankaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZiroRacunWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumKnjizenjaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaDatumIzvodaWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaBrojNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaIznosNerasporedjenihUplataWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZaZakljucenjeWE));
		wait.until(ExpectedConditions.visibilityOf(kolone.kolonaZakljucenWE));
	}

	public void dodajDnevnikUplata(String banka, String ziroRacun) throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankaWE));
		Thread.sleep(1000);
		bankaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		List<WebElement> list;
		int lastElement;
		//ako je manja od 20, nemoj ici na skrol
		//ako je veca od 20 idi u jedan skrol
		//poslije prvog skrola opet gledamo size
		//ako je manja od 40 nemoj ici u sledeci skrol
		//a ako je veca od 40 idemo u sledeci skrol
		for (int i = 1; i < 3; i++) {
			list = driver.findElements(By.xpath("//div[@role='listbox']/div"));
			lastElement = list.size();
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					list.get(lastElement - 1));
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//div[contains(text(),'" + banka + "')]")).click();
		ziroRacunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + ziroRacun + "')]")));
		driver.findElement(By.xpath("//div[contains(text(),'" + ziroRacun + "')]")).click();
		brojIzvodaWE.sendKeys("34325");
		brojUplataNaIzvoduWE.sendKeys("1");
		iznosUplataNaIzvoduWE.sendKeys("100");
		datumKnjizenjaWE.click();
		datumKnjizenjaWE.clear();
		datumKnjizenjaWE.sendKeys("04.07.2020.");
		datumIzvodaWE.click();
		datumIzvodaWE.clear();
		datumIzvodaWE.sendKeys("04.06.2020.");
		submitBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void verifyDnevnikUplata(String bankaTabela, String ziroRacunTabela) throws Exception {
		navigirajNaDnevniciUplata();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
		filterKolona2WE.sendKeys(bankaTabela);
		wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
		filterKolona3WE.sendKeys(ziroRacunTabela);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		assertTrue(podatak2Tabela2WE.getText().equals(bankaTabela), "Dnevnici uplata: Dnevnik uplata nije pronađena!");
		assertTrue(podatak2Tabela3WE.getText().equals(ziroRacunTabela), "Dnevnici uplata: Dnevnik uplata nije pronađena!");
		// TODO ova dva polja vise nisu vidljiva u DOMu, dodati nove verifikacije // DONE
	}

	public void navigateToUplateSaStranice() {
		wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
		burgerBarWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uplateBurgerBarWE));
		uplateBurgerBarWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void navigateToDodajUplatuSaSDetalja() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)");
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		dodajBtnWE.click();
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}

}