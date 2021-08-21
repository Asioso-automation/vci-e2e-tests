package com.platformX.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kolone extends PageBase {
	

	public Kolone(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	@FindBy(xpath = "//*[contains(text(), 'ID')]")
	public WebElement kolonaIdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Naziv')]")
	public WebElement kolonaNazivWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Pošta')]")
	public WebElement kolonaPostaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjesto')]")
	public WebElement kolonaMjestoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Adresa')]")
	public WebElement kolonaAdresaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon')]")
	public WebElement kolonaTelefonWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Fax')]")
	public WebElement kolonaFaxWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Email')]")
	public WebElement kolonaEmailWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Internet adresa')]")
	public WebElement kolonaInternetAdresaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Call centar')]")
	public WebElement kolonaCallCentarWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Call center')]") // typo: center
	public WebElement kolonaCallCenterWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Žiro račun')]")
	public WebElement kolonaZiroRacunWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kod')]")
	public WebElement kolonaKodWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Eic')]")
	public WebElement kolonaEicWE;
	
	@FindBy(xpath = "//*[contains(text(), 'E-mail')]")
	public WebElement kolonaEmail2WE;
	
	@FindBy(xpath = "//*[contains(text(), 'Sap mjesto troska')]") //typo: troska
	public WebElement kolonaSapMjestoTroskaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'ODS')]")
	public WebElement kolonaOdsWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za prijavu kvara')]")
	public WebElement kolonaTelefonZaPrijavuKvaraWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za informacije o uslugama')]")
	public WebElement kolonaTelefonZaInformacijeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Telefon za prigovore na račun')]")
	public WebElement kolonaTelefonZaPrigovoreWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Šifra djelatnosti')]")
	public WebElement kolonaSifraDjelatnostiWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Entitet')]")
	public WebElement kolonaEntitetWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Opština')]")
	public WebElement kolonaOpstinaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Štampani naziv')]")
	public WebElement kolonaStampaniNazivWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Validna šifra ulice')]")
	public WebElement kolonaValidnaSifraUliceWE;

}