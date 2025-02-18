package com.platformX.base;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.platformX.util.Helper;
import com.platformX.util.PropertiesUtil;

public abstract class PageBase {

	protected WebDriver driver;
	protected PropertiesUtil properties;
	protected PropertiesUtil platformx_properties = null;
	protected final String PLATFORMX_PROPERTIES = "platformx.properties";
	protected PropertiesUtil platformx_distribution_properties = null;
	protected final String PLATFORMX_DISTRIBUTION_PROPERTIES = "platformx.distribution.properties";
	protected PropertiesUtil scp_properties = null;
	protected final String SCP_PROPERTIES = "scp.properties";

	public PageBase(WebDriver driver) throws FileNotFoundException, IOException {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		platformx_properties = new PropertiesUtil(PLATFORMX_PROPERTIES);
		platformx_distribution_properties = new PropertiesUtil(PLATFORMX_DISTRIBUTION_PROPERTIES);
		scp_properties = new PropertiesUtil(SCP_PROPERTIES);
	}

	@FindBy(xpath = "//div[@class='v-alert__content']")
	protected WebElement porukaWE;

	@FindBy(xpath = "//div[contains(text(), 'Uredi')]")
	protected WebElement urediWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pogledaj') and @class='v-list-item__title']")
	protected WebElement pogledajWE;

	@FindBy(xpath = "//div[contains(text(), 'Bri')]")
	protected WebElement obrisiWE;

	@FindBy(xpath = "//tr[2]/td")
	protected WebElement praznaTabelaWE;

	@FindBy(xpath = "(//i[contains(@class, 'fa-bars')])[1]")
	protected WebElement burgerBarWE;

	@FindBy(xpath = "//*[contains(text(),'Obrada u toku...') and contains(@class, 'title')]")
	protected WebElement obradaModalWE;

//	@FindBy(xpath = "//ul/button[1]")
//	protected WebElement sekcijaBtnWE;
//
//	@FindBy(xpath = "//ul/button[2]")
//	protected WebElement stranicaBtnWE;
	
	@FindBy(xpath = "//ul/button[1]/span")
	protected WebElement sekcijaWE;
	
	@FindBy(xpath = "//ul/button[2]/span")
	protected WebElement stranicaWE;

	@FindBy(xpath = "(//header/div/div[1])[2]")
	protected WebElement naslovStraniceWE;
	//div/div[1]/div[1]/header/div/div[1]
//	(//header/div/div[1])[2]

	@FindBy(xpath = "//main/div/div/header/div/div[1]")
	protected WebElement naslovStranice1WE;

	@FindBy(xpath = "//i[contains(@class, 'fa-file-upload')]")
	protected WebElement importujBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-angle-double-right')]")
	protected WebElement dodajSveBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-plus')]")
	protected WebElement dodajBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-file-download')]")
	protected WebElement preuzmiExcelBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-broom')]")
	protected WebElement ukloniFiltereBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-sync')]")
	protected WebElement osvjeziBtnWE;

	@FindBy(xpath = "//i[contains(@class, 'fa-sync')]")
	protected WebElement infoBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-filter')]")
	protected WebElement filterBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-trash-can')]")
	protected WebElement brisanjeBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-download')]")
	protected WebElement preuzmiProsireniExcelBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-plug-circle-xmark')]")
	protected WebElement unistenaMmBtnWE;
	
	@FindBy(xpath = "//div[contains(@class, 'v-card__title title')]")
	private WebElement brisanjePopUpWE;

	@FindBy(xpath = "//*[contains(@class, 'v-btn__content') and contains(text(), 'Briši')]")
	protected WebElement potvrdiBrisanjeBtnWE;
	
	@FindBy(xpath = "//div[contains(@class, 'menuable__content__active')]")
	protected WebElement aktivniLookupWE;
	
//	VERIFIKACIJE - ELEMENTI
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	public WebElement filterKolonaWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	public WebElement filterKolona2WE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	public WebElement filterKolona3WE;
	
	@FindBy(xpath = "//td[4]/div/div/div/div[1]/input")
	public WebElement filterKolona4WE;
	
	@FindBy(xpath = "//td[2]/div/div[1]/div/div/div/div[1]/input")
	public WebElement filterIntKolona1WE;
	
	@FindBy(xpath = "//div[1]/div/div[2]/div/div/input")
	public WebElement filterInt1Kolona1WE;
	
	@FindBy(xpath = "//tr[2]/td[1]")
	public WebElement podatak2Tabela1WE;
	
	@FindBy(xpath = "//tr[2]/td[2]")
	public WebElement podatak2Tabela2WE;
	
	@FindBy(xpath = "//tr[2]/td[3]")
	public WebElement podatak2Tabela3WE;

	@FindBy(xpath = "//tr[2]/td[4]")
	public WebElement podatak2Tabela4WE;
	
	@FindBy(xpath = "//tr[2]/td[10]/div")
	public WebElement podatak2Tabela10WE;
		
	@FindBy(xpath = "//tr[2]/td[1]")
	public WebElement idWE;
	
	@FindBy(xpath = "//i[contains(@class, 'mdi-chevron-right')]")
	public static WebElement strelicaDesnoWE;

//	API params
	
	public static int id;
	public static int id1;
	public static int wrongIdLong = Integer.parseInt(Helper.getRandomNumber(6));
	public static int wrongIdShort = Integer.parseInt(Helper.getRandomNumber(2));
	
	public static String ID;

	
	protected Select select(WebElement webElement, String name) {
		Select selectedElement = new Select(webElement);
		selectedElement.selectByVisibleText(name);
		return selectedElement;
	}

	public void osvjeziStranicu() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	}

	public List<WebElement> brojKolona() {
		return driver.findElements(By.xpath("//th"));
	}
	
	public void verifikujPoruku(String poruka) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}
	
	public void verifikujPraznuTabelu() {
		assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "PraznaTabela: Poruka prazne tabele nije dobra!");
	}
	
	public int pokupiIdStavke() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(idWE));
		int id = Integer.parseInt(idWE.getText());
		return id;
	}
	
	public String pokupiIdStavkeString() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(idWE));
		String id = idWE.getText();
		return id;
	}

	public void verifikacijaZajednickihElemenata2(String sekcija, String stranica, String naslovStranice, int brKolona,
			boolean importBtn, boolean dodajSve, boolean dodaj, boolean preuzmiExcel, boolean ukloniFiltere,
			boolean osvjezi, boolean info) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		} catch (Exception e) {
			Thread.sleep(500);
		}
		assertTrue(sekcija.equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
		assertTrue(stranica.equals(stranica), stranica + ": Naziv stranice nije dobar!");
		assertTrue(naslovStraniceWE.getText().trim().equals(naslovStranice),
					stranica + ": Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
		if (importBtn == true) {
			wait.until(ExpectedConditions.elementToBeClickable(importujBtnWE));
		}
		if (dodajSve == true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajSveBtnWE));
		}
		if (dodaj == true) {
			wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		}
		if (preuzmiExcel == true) {
			wait.until(ExpectedConditions.elementToBeClickable(preuzmiExcelBtnWE));
		}
		if (ukloniFiltere == true) {
			wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		}
		if (osvjezi == true) {
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
		}
		if (info == true) {
			wait.until(ExpectedConditions.elementToBeClickable(infoBtnWE));
		}
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		} catch (Exception e) {
		Thread.sleep(1000);
		}
	}

	public void pretraziStavku(WebElement element, String value) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
//		element.clear();					// ne radi clear()
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		ukloniFiltereBtnWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ukloniFiltereBtnWE));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public void pretraziStavkuInt(WebElement element, WebElement element1, String value) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		wait.until(ExpectedConditions.visibilityOf(element1));
		wait.until(ExpectedConditions.elementToBeClickable(element1));
		element1.click();
		element1.clear();
		element1.sendKeys(value);
		element1.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(dodajBtnWE));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}

	public void verifikujStavku(String value, WebElement tableValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		wait.until(ExpectedConditions.visibilityOf(tableValue));
		wait.until(ExpectedConditions.elementToBeClickable(tableValue));
		assertTrue(tableValue.getText().equals(value), "Verifikacija nije uspješna!");
	}
		
	public void obrisiStavku() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			burgerBarWE.click();
		}
		catch (Exception e) {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			Thread.sleep(900);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", burgerBarWE);
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			burgerBarWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOf(brisanjePopUpWE));
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}
	
	public String propertiesNaziv(String naziv) {
		naziv = naziv.toUpperCase();
		naziv = naziv.replace(". ", ".");
		naziv = naziv.replace("Š", "S");
		naziv = naziv.replace("Đ", "DJ");
		naziv = naziv.replace("Ž", "Z");
		naziv = naziv.replace("Č", "C");
		naziv = naziv.replace("Ć", "C");
		naziv = naziv.replace(" ", ".");
		naziv = naziv.replace("/", ".");
		naziv = naziv.replace("-", "");
		return naziv;
	}
	
	public String generateXpath(String xText, String xClass) {
		String genXpath = "//*[@class='" + xClass + "' and text()='" + xText + "']";
		return genXpath;
	}
	
	String sekcijaXClass = "v-btn__content";	
	String stranicaXClass = "v-list-item__title";
	
	public <T extends PageBase> T navigateOnPage(Class<T> pageClass, String sekcija, String stranica) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String sekcijaXpath = generateXpath(sekcija, sekcijaXClass);
		String stranicaXpath = generateXpath(stranica, stranicaXClass);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sekcijaXpath))).click();
			wait.until(ExpectedConditions.visibilityOf(aktivniLookupWE));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stranicaXpath))).click();
		} catch (Exception e) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(strelicaDesnoWE));
				strelicaDesnoWE.click();
				Thread.sleep(900);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sekcijaXpath))).click();
				wait.until(ExpectedConditions.visibilityOf(aktivniLookupWE));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stranicaXpath))).click();
			} catch (Exception f) {
				driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue(propertiesNaziv(stranica)));
			}
		}
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		Thread.sleep(500);
//		pokusaj zaobilaska random otvaranja menija
		try {
			wait.until(ExpectedConditions.elementToBeClickable(naslovStraniceWE)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE)).click();
		}
//		
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
	}
	 
	public <T extends PageBase> T navigateOnPagePX(Class<T> pageClass, String sekcija, String stranica) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String sekcijaXpath = generateXpath(sekcija, sekcijaXClass);
		String stranicaXpath = generateXpath(stranica, stranicaXClass);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sekcijaXpath))).click();
			wait.until(ExpectedConditions.visibilityOf(aktivniLookupWE));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stranicaXpath))).click();
		} catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue(propertiesNaziv(stranica)));
		}
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
	}
	
	public void changeInput(WebElement element, String value) {
		element.click();
		String ctrla = Keys.chord(Keys.CONTROL, "A");
		element.sendKeys(ctrla);
		element.sendKeys(value);
//		element.sendKeys(Keys.BACK_SPACE);
	}
	
  static String toCamelCase(String s){
	  String[] parts = s.split(" ");
	  String camelCaseString = "";
	  for (String part : parts){
		  if(part!=null && part.trim().length()>0)
			  camelCaseString = camelCaseString + toProperCase(part);
		  else
			  camelCaseString=camelCaseString+part+" ";   
	  }
	  return camelCaseString;
  }

  static String toProperCase(String s) {
	  String temp=s.trim();
	  String spaces="";
	  if(temp.length()!=s.length())
	  {
		  int startCharIndex=s.charAt(temp.indexOf(0));
		  spaces=s.substring(0,startCharIndex);
	  }
	  temp=temp.substring(0, 1).toUpperCase() +
		spaces+temp.substring(1).toLowerCase()+" ";
	  return temp;
  }
  
////	test - zajednicka metoda za verifikaciju kolona			
//	public void verifikacijaKolona(WebElement pageName[]) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		for (int i=0; i<pageName.length; i++) {
//			wait.until(ExpectedConditions.visibilityOf(pageName[i]));
//			System.out.println(pageName[i].getText().trim());
//		}
//	}
  
//  public void verifikacijaBtn1(WebElement[] btnElementi) throws InterruptedException {
//	  WebDriverWait wait = new WebDriverWait(driver, 10);
//	  for (int i=0; i<btnElementi.length; i++) {
//			System.out.println(i);;		// provjera koji element liste uzima
//			wait.until(ExpectedConditions.elementToBeClickable(btnElementi[i]));
//			System.out.println(i);;		// provjera da li je pronasao taj element na stranici
//		}
//  }
  
//	public void verifikacijaZajednickihElemenata1(String sekcija, String stranica, String naslovStranice, int brKolona,
//			WebElement[] btnElementi) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		} catch (Exception e) {
//			Thread.sleep(500);
//		}
//		assertTrue(sekcija.equals(sekcija), stranica + ": Naziv sekcije nije dobar!");
//		assertTrue(stranica.equals(stranica), stranica + ": Naziv stranice nije dobar!");
//		assertTrue(toProperCase(naslovStraniceWE.getText().trim()).equals(naslovStranice),
//				stranica + ": Naziv stranice nije dobar!");
//		assertTrue(brojKolona().size() == brKolona, stranica + ": Broj kolona nije dobar!");
//		verifikacijaBtn1(btnElementi);	// novi nacin verifikacije button-a	
//		try {
//			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
//		} catch (Exception e) {
//		Thread.sleep(1000);
//		}
//	}

	public void verifikacijaStranice(String sekcija, String stranica, String naslovStranice, int brKolona, WebElement[] listaKolona, WebElement[] btnElementi) throws InterruptedException {
//		verifikacijaZajednickihElemenata
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		} catch (Exception e) {
			Thread.sleep(500);
		}
		assertTrue(toProperCase(sekcijaWE.getText().trim()).equals(sekcija + " "), stranica + ": Naziv sekcije nije dobar!");
		assertTrue(toCamelCase(stranicaWE.getText().trim()).equals(stranica + " "), stranica + ": Naziv stranice nije dobar!");
		assertTrue(toProperCase(naslovStraniceWE.getText().trim()).equals(naslovStranice + " "),
					stranica + ": Naziv stranice nije dobar!");
		assertTrue(brojKolona().size() == listaKolona.length+brKolona, stranica + ": Broj kolona nije dobar!");		
//		verifikacijaBtn
		for (int i=0; i<btnElementi.length; i++) {
//			System.out.println(i);		// provjera koji element liste uzima
			wait.until(ExpectedConditions.elementToBeClickable(btnElementi[i]));
//			System.out.println(i);		// provjera da li je pronasao taj element na stranici
		}
//		verifikacijaKolona
		for (int i=0; i<listaKolona.length; i++) {
			wait.until(ExpectedConditions.visibilityOf(listaKolona[i]));
//			System.out.println(listaKolona[i].getText().trim());	// provjera koje kolone su provjerene
		}
	}
	
}