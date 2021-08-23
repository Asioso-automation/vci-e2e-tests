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
	
	@FindBy(xpath = "//*[contains(text(), 'Broj mjeseci')]")
	public WebElement kolonaBrojMjeseciWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Procenat')]")
	public WebElement kolonaProcenatWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Grupa obrasca broja ugovora')]")
	public WebElement kolonaGrupaObrascaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Nadgrupa')]")
	public WebElement kolonaNadgrupaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija')]")
	public WebElement kolonaKategorijaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vrsta brojila')]")
	public WebElement kolonaVrstaBrojilaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Maxigraf')]") //typo x-ks
	public WebElement kolonaMaxigrafWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Reaktivna')]")
	public WebElement kolonaReaktivnaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Od')]")
	public WebElement kolonaOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Do')]")
	public WebElement kolonaDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tarifna grupa')]")
	public WebElement kolonaTarifnaGrupaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum od')]")
	public WebElement kolonaDatumOdWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Datum do')]")
	public WebElement kolonaDatumDoWE;
	
	@FindBy(xpath = "//*[contains(text(), 'kW')]")
	public WebElement kolonakWWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Mjerenje')]")
	public WebElement kolonaMjerenjeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Validna')]")
	public WebElement kolonaValidnaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija mrežarine')]")
	public WebElement kolonaKategorijaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Tenderska cijena')]")
	public WebElement kolonaTenderskaCijenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vremenski ograničena')]")
	public WebElement kolonaVremenskiOgranicenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Kategorija cijene')]")
	public WebElement kolonaKategorijaCijeneWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Vrsta tarife')]")
	public WebElement kolonaVrstaTarifeWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Sezona')]")
	public WebElement kolonaSezonaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Cijena')]")
	public WebElement kolonaCijenaWE;
	
	@FindBy(xpath = "//*[contains(text(), 'PDV')]")
	public WebElement kolonaPdvWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Cijena mrežarine')]")
	public WebElement kolonaCijenaMrezarineWE;
	
	@FindBy(xpath = "//*[contains(text(), 'Aktivan')]")
	public WebElement kolonaAktivanWE;

}