package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.base.PageBase;

public class PocetnaStranica extends PageBase {

	public PocetnaStranica(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	@FindBy(xpath = "//a[@href='/']")
	protected WebElement pocetnaStranicaWE;
	
	@FindBy(xpath = "//div[1]/div/div/div/div[2]/input[1]")
	protected WebElement filterKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div[2]/input[1]")
	protected WebElement filterMjernoMjestoWE;
	
	@FindBy(xpath = "//div[contains(text(), '1-1 of 1')]")
	protected WebElement jedinstvenElementWE;
	
	@FindBy(xpath = "//*[@id='application']/div[1]/main/div/div/div/div[2]/div/div[1]/table/thead/tr")
	protected WebElement tableHeaderWE;

	@FindBy(xpath = "//div[contains(@class, 'v-snack__content') and contains(text(), 'Učitavanje, molim sačekajte')]")
	protected WebElement molimoSacekajteLoaderWE;

	@FindBy(xpath = "//div[contains(text(), 'Izloguj se')]")
	protected WebElement izlogujSeWE;

	@FindBy(xpath = "//div/div[1]/div[1]/header/div/div[1]")
	protected WebElement naslovStraniceWE;

	@FindBy(xpath = "//ul/button[1]")
	protected WebElement sekcijaBtnWE;

	@FindBy(xpath = "//ul/button[2]")
	protected WebElement stranicaBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-file-download')]")
	protected WebElement preuzmiExcelBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-broom')]")
	protected WebElement ukloniFiltereBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-sync')]")
	protected WebElement osvjeziBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-plus') and not(contains(@class, 'fa-plus-circle'))]")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-angle-double-right')]")
	protected WebElement masovniUnosBtnWE;

	@FindBy(xpath = "//div[@class='v-card__title title mb-0 word-break']")
	private WebElement brisanjePopUpWE;
  
	@FindBy(xpath = "//td[1]/div/div/div/div[1]/input")
	protected WebElement filterKolona1WE;
	
	@FindBy(xpath = "//td[6]/div/div/div/div[1]/input") 
	protected WebElement filterKolona6WE;
	
	@FindBy(xpath = "//tr[2]/td")
	protected WebElement podatak2TabelaWE;
	
	@FindBy(xpath = "//tr[1]/td[3]")
	protected WebElement podatak1Tabela3WE;
	
	@FindBy(xpath = "//tr/td[4]")
	protected WebElement podatakTabela4WE;
	
	@FindBy(xpath = "//tr[2]/td[5]")
	protected WebElement podatak2Tabela5WE;
	
	@FindBy(xpath = "//tr[2]/td[7]")
	protected WebElement podatak2Tabela7WE;
	
	@FindBy(xpath = "//tr[2]/td[9]")
	protected WebElement podatak2Tabela9WE;
	
	@FindBy(xpath = "//div[contains(@class, 'menuable__content__active')]")
	protected WebElement aktivniLookupWE;
	
	@FindBy(xpath = "//div[@class='v-list-item__title' and text()='Uplate']")
	protected WebElement uplateBurgerBarWE;
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement submitBtnWE;
	
	@FindBy(xpath = "//div[@class='backText' and text()='Odustani']")
	protected WebElement odustaniBtnWE;
	

	// Sekcije

	@FindBy(xpath = "//*[contains(text(),'Šifarnici') and @class='v-btn__content']")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//*[contains(text(),'Tarifni sistem') and @class='v-btn__content']")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "(//*[contains(text(),'Kupci') and @class='v-btn__content'])[1]")
	protected WebElement kupciWE;
	
	@FindBy(xpath = "//*[contains(text(),'Kupci-proizvođači') and @class='v-btn__content']")
	protected WebElement kupciProizvodjaciWE;

	@FindBy(xpath = "//*[contains(text(),'Mjerna mjesta') and @class='v-btn__content']")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračun') and @class='v-btn__content']")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Nestandardne usluge') and @class='v-btn__content']")
	protected WebElement nestandardneUslugeWE;

	@FindBy(xpath = "//*[contains(text(),'Finansije') and @class='v-btn__content']")
	protected WebElement finansijeWE;
	
	@FindBy(xpath = "//*[contains(text(),'Pravni odnosi') and @class='v-btn__content']")
	protected WebElement pravniOdnosiWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;

	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;
	
	@FindBy(xpath = "//i[contains(@class,'fa-search')]")
	protected WebElement pretragaWE;

	@FindBy(xpath = "//span[contains(@class,'v-badge--overlap')]")
	protected WebElement profilWE;

	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciProizvodjaciWE));
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(nestandardneUslugeWE));
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
//		wait.until(ExpectedConditions.elementToBeClickable(pretragaWE));
//		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
//		wait.until(ExpectedConditions.elementToBeClickable(profilWE));			probati pustiti testove sa ovim elementom	
		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
		Thread.sleep(1000);
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}
	
	public PocetnaStranica navigateToPocetnaStranica() throws FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(pocetnaStranicaWE));
		pocetnaStranicaWE.click();
		return new PocetnaStranica(driver);
	}
	
	public void pretraziKupce(String kupac) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
		driver.findElement(By.xpath("//div[@class='v-card__title d-block text-left font-weight-bold text-body-1 grey--text text--darken-3' and contains(text(), 'AKTIVNI UGOVORI PO ODS-U')]")).click();
		filterKupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
	}
	
	public void pretraziMjernaMjesta(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
		filterMjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		Thread.sleep(1000);
	}
	
}