package com.app.base;

import java.io.FileNotFoundException;
import java.io.IOException;
//import static org.testng.Assert.assertTrue;
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.app.util.Helper;
import com.app.util.PropertiesUtil;

public abstract class PageBase {

	protected WebDriver driver;
	protected PropertiesUtil properties;
	protected PropertiesUtil vci_properties = null;
	protected final String VCI_PROPERTIES = "vci.properties";

	public PageBase(WebDriver driver) throws FileNotFoundException, IOException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		vci_properties = new PropertiesUtil(VCI_PROPERTIES);
	}

//	@FindBy(xpath = "")
//	protected WebElement porukaWE;
//
//	@FindBy(xpath = "")
//	protected WebElement urediWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement pogledajWE;
//
//	@FindBy(xpath = "")
//	protected WebElement obrisiWE;
//
//	@FindBy(xpath = "")
//	protected WebElement praznaTabelaWE;
//
//	@FindBy(xpath = "")
//	protected WebElement burgerBarWE;
//
//	@FindBy(xpath = "")
//	protected WebElement obradaModalWE;
//
//	@FindBy(xpath = "")
//	protected WebElement sekcijaWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement stranicaWE;
//
//	@FindBy(xpath = "")
//	protected WebElement naslovStraniceWE;
//
//	@FindBy(xpath = "")
//	protected WebElement naslovStranice1WE;
//
//	@FindBy(xpath = "")
//	protected WebElement importujBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement dodajSveBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement dodajBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement preuzmiExcelBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement ukloniFiltereBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement osvjeziBtnWE;
//
//	@FindBy(xpath = "")
//	protected WebElement infoBtnWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement filterBtnWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement brisanjeBtnWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement preuzmiProsireniExcelBtnWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement unistenaMmBtnWE;
//	
//	@FindBy(xpath = "")
//	private WebElement brisanjePopUpWE;
//
//	@FindBy(xpath = "")
//	protected WebElement potvrdiBrisanjeBtnWE;
//	
//	@FindBy(xpath = "")
//	protected WebElement aktivniLookupWE;
//		
//	@FindBy(xpath = "//tr[2]/td[1]")
//	public WebElement idWE;
//
////	API params
//	
//	public static int id;
//	public static int id1;
//	public static int wrongIdLong = Integer.parseInt(Helper.getRandomNumber(6));
//	public static int wrongIdShort = Integer.parseInt(Helper.getRandomNumber(2));
//	
//	public static String ID;
//
//	
//	protected Select select(WebElement webElement, String name) {
//		Select selectedElement = new Select(webElement);
//		selectedElement.selectByVisibleText(name);
//		return selectedElement;
//	}
//
//	public void osvjeziStranicu() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//	}
//
//	public List<WebElement> brojKolona() {
//		return driver.findElements(By.xpath("//th"));
//	}
//	
//	public void verifikujPoruku(String poruka) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(porukaWE));
//		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
//	}
//	
//	public void verifikujPraznuTabelu() {
//		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "PraznaTabela: Poruka prazne tabele nije dobra!");
//	}
//	
//	public int pokupiIdStavke() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(idWE));
//		int id = Integer.parseInt(idWE.getText());
//		return id;
//	}
//	
//	public String pokupiIdStavkeString() {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(idWE));
//		String id = idWE.getText();
//		return id;
//	}
//
//	public void verifikacijaZajednickihElemenata2(String sekcija, String stranica, String naslovStranice, int brKolona,
//			boolean importBtn, boolean dodajSve, boolean dodaj, boolean preuzmiExcel, boolean ukloniFiltere,
//			boolean osvjezi, boolean info) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		} catch (Exception e) {
//			Thread.sleep(500);
//		}
//		assertTrue(sekcija.equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
//		assertTrue(stranica.equals(stranica), stranica + ": Naziv stranice nije dobar!");
//		assertTrue(naslovStraniceWE.getText().trim().equals(naslovStranice),
//					stranica + ": Naziv stranice nije dobar!");
//		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
//		if (importBtn == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(importujBtnWE));
//		}
//		if (dodajSve == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(dodajSveBtnWE));
//		}
//		if (dodaj == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
//		}
//		if (preuzmiExcel == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
//		}
//		if (ukloniFiltere == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		}
//		if (osvjezi == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
//		}
//		if (info == true) {
//			wait.until(ExpectedConditions.elementToBeClickable(infoBtnWE));
//		}
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		} catch (Exception e) {
//		Thread.sleep(1000);
//		}
//	}
//
//	public void pretraziStavku(WebElement element, String value) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
////		element.clear();					// ne radi clear()
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		ukloniFiltereBtnWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.sendKeys(value);
//		element.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//	}
//	
//	public void pretraziStavkuInt(WebElement element, WebElement element1, String value) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.visibilityOf(element));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//		wait.until(ExpectedConditions.visibilityOf(element1));
//		wait.until(ExpectedConditions.elementToBeClickable(element1));
//		element1.click();
//		element1.clear();
//		element1.sendKeys(value);
//		element1.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//	}
//
//	public void verifikujStavku(String value, WebElement tableValue) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		wait.until(ExpectedConditions.visibilityOf(tableValue));
//		wait.until(ExpectedConditions.elementToBeClickable(tableValue));
//		assertTrue(tableValue.getText().equals(value), "Verifikacija nije uspješna!");
//	}
//	
//	public String propertiesNaziv(String naziv) {
//		naziv = naziv.toUpperCase();
//		naziv = naziv.replace(". ", ".");
//		naziv = naziv.replace("Š", "S");
//		naziv = naziv.replace("Đ", "DJ");
//		naziv = naziv.replace("Ž", "Z");
//		naziv = naziv.replace("Č", "C");
//		naziv = naziv.replace("Ć", "C");
//		naziv = naziv.replace(" ", ".");
//		naziv = naziv.replace("/", ".");
//		naziv = naziv.replace("-", "");
//		return naziv;
//	}
//	
//	public String generateXpath(String xText, String xClass) {
//		String genXpath = "//*[@class='" + xClass + "' and text()='" + xText + "']";
//		return genXpath;
//	}
//	
//	String sekcijaXClass = "";	
//	String stranicaXClass = "";
//	
//	public <T extends PageBase> T navigateOnPage(Class<T> pageClass, String sekcija, String stranica) throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		String sekcijaXpath = generateXpath(sekcija, sekcijaXClass);
//		String stranicaXpath = generateXpath(stranica, stranicaXClass);
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sekcijaXpath))).click();
//			wait.until(ExpectedConditions.visibilityOf(aktivniLookupWE));
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stranicaXpath))).click();
//		} catch (Exception e) {
//				driver.get(app_properties.getValue("URL.APP.LOGIN") + app_properties.getValue(propertiesNaziv(stranica)));
//			}
//		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		Thread.sleep(500);
//		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
//	}
//	
//	public void changeInput(WebElement element, String value) {
//		element.click();
//		String ctrla = Keys.chord(Keys.CONTROL, "A");
//		element.sendKeys(ctrla);
//		element.sendKeys(value);
////		element.sendKeys(Keys.BACK_SPACE);
//	}
//	
//  static String toCamelCase(String s){
//	  String[] parts = s.split(" ");
//	  String camelCaseString = "";
//	  for (String part : parts){
//		  if(part!=null && part.trim().length()>0)
//			  camelCaseString = camelCaseString + toProperCase(part);
//		  else
//			  camelCaseString=camelCaseString+part+" ";   
//	  }
//	  return camelCaseString;
//  }
//
//  static String toProperCase(String s) {
//	  String temp=s.trim();
//	  String spaces="";
//	  if(temp.length()!=s.length())
//	  {
//		  int startCharIndex=s.charAt(temp.indexOf(0));
//		  spaces=s.substring(0,startCharIndex);
//	  }
//	  temp=temp.substring(0, 1).toUpperCase() +
//		spaces+temp.substring(1).toLowerCase()+" ";
//	  return temp;
//  }
//
//	public void verifikacijaStranice(String sekcija, String stranica, String naslovStranice, int brKolona, WebElement[] listaKolona, WebElement[] btnElementi) throws InterruptedException {
////		verifikacijaZajednickihElemenata
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		} catch (Exception e) {
//			Thread.sleep(500);
//		}
//		assertTrue(toProperCase(sekcijaWE.getText().trim()).equals(sekcija + " "), stranica + ": Naziv sekcije nije dobar!");
//		assertTrue(toCamelCase(stranicaWE.getText().trim()).equals(stranica + " "), stranica + ": Naziv stranice nije dobar!");
//		assertTrue(toProperCase(naslovStraniceWE.getText().trim()).equals(naslovStranice + " "),
//					stranica + ": Naziv stranice nije dobar!");
//		assertTrue(brojKolona().size() == listaKolona.length+brKolona, stranica + ": Broj kolona nije dobar!");		
////		verifikacijaBtn
//		for (int i=0; i<btnElementi.length; i++) {
////			System.out.println(i);		// provjera koji element liste uzima
//			wait.until(ExpectedConditions.elementToBeClickable(btnElementi[i]));
////			System.out.println(i);		// provjera da li je pronasao taj element na stranici
//		}
////		verifikacijaKolona
//		for (int i=0; i<listaKolona.length; i++) {
//			wait.until(ExpectedConditions.visibilityOf(listaKolona[i]));
////			System.out.println(listaKolona[i].getText().trim());	// provjera koje kolone su provjerene
//		}
//	}
//	
//	public void lookupInput(WebElement element) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
//		element.sendKeys(Keys.ARROW_DOWN);
//		element.sendKeys(Keys.ENTER);
//	}
//	
//	public void lookupInputValue(WebElement element, String value) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//		element.sendKeys(value);
//		wait.until(ExpectedConditions.elementToBeClickable(aktivniLookupWE));
//		element.sendKeys(Keys.ARROW_DOWN);
//		element.sendKeys(Keys.ENTER);
//	}
//	
//	public void fieldInputValue(WebElement element, String value) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//		element.sendKeys(value);
//	}

	
}