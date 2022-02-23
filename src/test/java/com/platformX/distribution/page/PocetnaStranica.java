package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
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
	
//	@FindBy(xpath = "//a[@href='/']")
//	protected WebElement pocetnaStranicaWE;
	
	@FindBy(xpath = "//div[1]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterMjernoMjestoWE;
	
//	@FindBy(xpath = "//div[contains(text(), '1-1 of 1')]")
//	protected WebElement jedinstvenElementWE;
//	
//	@FindBy(xpath = "//*[@id='application']/div[1]/main/div/div/div/div[2]/div/div[1]/table/thead/tr")
//	protected WebElement tableHeaderWE;
//
//	@FindBy(xpath = "//div[contains(@class, 'v-snack__content') and contains(text(), 'Učitavanje, molim sačekajte')]")
//	protected WebElement molimoSacekajteLoaderWE;

	@FindBy(xpath = "//div[contains(text(), 'Odjavi se')]")
	protected WebElement izlogujSeWE;

	@FindBy(xpath = "//div/div[1]/div[1]/header/div/div[1]")
	protected WebElement naslovStraniceWE;

	@FindBy(xpath = "//ul/button[1]")
	protected WebElement sekcijaBtnWE;

	@FindBy(xpath = "//ul/button[2]")
	protected WebElement stranicaBtnWE;

	@FindBy(xpath = "//header/div/button[1]")
	protected WebElement preuzmiExcelBtnWE;

	@FindBy(xpath = "//header/div/button[2]")
	protected WebElement ukloniFiltereBtnWE;

	@FindBy(xpath = "//header/div/button[3]")
	protected WebElement osvjeziBtnWE;

	@FindBy(xpath = "//header/div/a")
	protected WebElement dodajBtnWE;

//	 Sekcije

	@FindBy(xpath = "//*[contains(text(),'Šifarnici') and @class='v-btn__content']")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//*[contains(text(),'Tarifni sistem') and @class='v-btn__content']")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//*[contains(text(),'Mjerna mjesta') and @class='v-btn__content']")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//*[contains(text(),'Kupci') and @class='v-btn__content']")
	protected WebElement kupciWE;

	@FindBy(xpath = "//*[contains(text(),'Brojila') and @class='v-btn__content']")
	protected WebElement brojilaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračunski ugovori') and @class='v-btn__content']")
	protected WebElement obracunskiUgovoriWE;
	
	@FindBy(xpath = "//*[contains(text(),'Očitanja') and @class='v-btn__content']")
	protected WebElement ocitanjaWE;

	@FindBy(xpath = "//*[contains(text(),'Obračun') and @class='v-btn__content']")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;
	
	@FindBy(xpath = "//*[contains(text(),'Izvještaji') and @class='v-btn__content']")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "//button[8]")
	protected WebElement profilWE;

//	 Stranice

	@FindBy(xpath = "//div[contains(text(), 'Organizacije')]")
	protected WebElement organizacijeWE;

	@FindBy(xpath = "//div[contains(text(), 'Djelatnosti')]")
	protected WebElement djelatnostiWE;

	@FindBy(xpath = "//div[contains(text(), 'Entiteti')]")
	protected WebElement entitetiWE;

	@FindBy(xpath = "//div[contains(text(), 'Opštine')]")
	protected WebElement opstineWE;

	@FindBy(xpath = "//div[contains(text(), 'Naseljena mjesta')]")
	protected WebElement naseljenaMjestaWE;

	@FindBy(xpath = "//div[contains(text(), 'Pošte')]")
	protected WebElement posteWE;

	@FindBy(xpath = "//div[contains(text(), 'Ulice')]")
	protected WebElement uliceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Terenske jedinice')]")
	protected WebElement terenskeJediniceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Fizičke lokacije')]")
	protected WebElement fizickeLokacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Snabdjevači')]")
	protected WebElement snabdjevaciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitači')]")
	protected WebElement citaciWE;

//	@FindBy(xpath = "//div[contains(text(), 'Kategorije potrošnje')]")
//	protected WebElement kategorijePotrosnjeWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Tarifne nadgrupe')]")
//	protected WebElement tarifneNadgrupeWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Tarifne grupe')]")
//	protected WebElement tarifneGrupeWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Sezone')]")
//	protected WebElement sezoneWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Obračunska snaga')]")
//	protected WebElement obracunskaSnagaWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Kategorije cijena')]")
//	protected WebElement kategorijeCijenaWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Cjenovnik')]")
//	protected WebElement cjenovnikWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Pravna lica')]")
//	protected WebElement pravnaLicaWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Fizička lica')]")
//	protected WebElement fizikaLicaWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Povezana pravna lica')]")
//	protected WebElement povezanaPravnaLicaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka')]")
//	protected WebElement zahtjeviZaDostavuPodatakaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za ugovore')]")
//	protected WebElement zahtjeviZaUgovoreWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Ugovori')]")
//	protected WebElement ugovoriWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Obavještenja o promjeni snabdjevača')]")
//	protected WebElement obavjestenjaOPromjeniSnabdjevacaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Ugovoreni popusti')]")
//	protected WebElement ugovoreniPopustiWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Odbačeni ugovori')]")
//	protected WebElement odbaceniUgovoriWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Reklamacije')]")
//	protected WebElement reklamacijeWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Vrste zahtjeva')]")
//	protected WebElement vrsteZahtjevaWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Grupe obrazaca broja ugovora')]")
//	protected WebElement grupeObrazacaBrojaUgovoraWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Mjenice')]")
//	protected WebElement mjeniceWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Tipovi mjenica')]")
//	protected WebElement tipoviMjenicaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Mjerna mjesta')]")
//	protected WebElement mjernaMjestaStrWE;
//	
//	@FindBy(xpath = "//a[@href='/metering/metering-points-data-requests']")
//	protected WebElement zahtjeviZaDostavuPodataka1WE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Očitanja brojila')]")
//	protected WebElement ocitanjaBrojilaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Energetski obračun')]")
//	protected WebElement energetskiObracunWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Monitoring energetskog obračuna')]")
//	protected WebElement monitoringEnergetskogObracunaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Nalozi za obračun')]")
//	protected WebElement naloziZaObracunWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Monitoring obračuna')]")
//	protected WebElement monitoringObracunaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Računi')]")
//	protected WebElement racuniWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Računi za nestandardne usluge')]")
//	protected WebElement racuniZaUslugeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Korekcije računa')]")
//	protected WebElement korekcijeRacunaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Kamate')]")
//	protected WebElement kamateWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Korekcije kamate')]")
//	protected WebElement korekcijeKamateWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Avansne fakture')]")
//	protected WebElement avansneFaktureWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Umanjenja cijene')]")
//	protected WebElement umanjenjaCijeneWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'TEF obrazac')]")
//	protected WebElement tefObrazacWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Kupci za testne račune')]")
//	protected WebElement kupciZaTestneRacuneWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Finansijske kartice')]")
//	protected WebElement finansijskeKarticeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Dnevnici uplata')]")
//	protected WebElement dnevniciUplataWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Sve uplate')]")
//	protected WebElement sveUplateWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Preknjižavanja uplata')]")
//	protected WebElement preknjizavanjaUplataWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Neraspoređene uplate')]")
//	protected WebElement nerasporedjeneUplateWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Avansi')]")
//	protected WebElement avansiWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Reprogrami')]")
//	protected WebElement reprogramiWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Banke')]")
//	protected WebElement bankeWE;
//
//	@FindBy(xpath = "//div[contains(text(), 'Žiro računi')]")
//	protected WebElement ziroRacuniWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Vrste knjiženja')]")
//	protected WebElement vrsteKnjizenjaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Vrste stavki finansijske kartice')]")
//	protected WebElement vrsteStavkiFinansijskeKarticeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Opomene')]")
//	protected WebElement opomeneWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za isključenje')]")
//	protected WebElement zahtjeviZaIskljucenjeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Stavke zahtjeva za isključenje')]")
//	protected WebElement stavkeZahtjevaZaIskljucenjeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za uključenje')]")
//	protected WebElement zahtjeviZaUkljucenjeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Stavke zahtjeva za uključenje')]")
//	protected WebElement stavkeZahtjevaZaUkljucenjeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Aktivna isključenja')]")
//	protected WebElement aktivnaIskljucenjaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Isključenja od strane ODS-a')]")
//	protected WebElement iskljucenjaOdStraneODSaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Tužbe')]")
//	protected WebElement tuzbeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Bankroti')]")
//	protected WebElement bankrotiWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Medijacije')]")
//	protected WebElement medijacijeWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'Otpisi potraživanja')]")
//	protected WebElement otpisiPotrazivanjaWE;
//	
//	@FindBy(xpath = "//div[contains(text(), 'SAP')]")
//	protected WebElement sapWE;
	

	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
		Thread.sleep(1000);
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}

	public Organizacije navigirajNaOrganizacije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(organizacijeWE));
		organizacijeWE.click();
		return new Organizacije(driver);
	}
	
	public TerenskeJedinice navigirajNaTerenskeJedinice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(terenskeJediniceWE));
		terenskeJediniceWE.click();
		return new TerenskeJedinice(driver);
	}
	
	public FizickeLokacije navigirajNaFizickeLokacije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizickeLokacijeWE));
		fizickeLokacijeWE.click();
		return new FizickeLokacije(driver);
	}
	
	public Snabdjevaci navigirajNaSnabdjevaci() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(snabdjevaciWE));
		snabdjevaciWE.click();
		return new Snabdjevaci(driver);
	}
	
	public Citaci navigirajNaCitaci() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citaciWE));
		citaciWE.click();
		return new Citaci(driver);
	}

	public Djelatnosti navigirajNaDjelatnosti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(djelatnostiWE));
		djelatnostiWE.click();
		return new Djelatnosti(driver);
	}

	public Entiteti navigirajNaEntitete() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		return new Entiteti(driver);
	}

	public Opstine navigirajNaOpstine() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opstineWE));
		opstineWE.click();
		return new Opstine(driver);
	}

	public NaseljenaMjesta navigirajNaNaseljenaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naseljenaMjestaWE));
		naseljenaMjestaWE.click();
		return new NaseljenaMjesta(driver);
	}

	public Poste navigirajNaPoste() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(posteWE));
		posteWE.click();
		return new Poste(driver);
	}

	public Ulice navigirajNaUlice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		return new Ulice(driver);
	}

//	public KategorijePotrosnje navigirajNaKategorijePotrosnje() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(kategorijePotrosnjeWE));
//		kategorijePotrosnjeWE.click();
//		return new KategorijePotrosnje(driver);
//	}
//
//	public TarifneNadgrupe navigirajNaTarifneNadgrupe() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
//		tarifneNadgrupeWE.click();
//		return new TarifneNadgrupe(driver);
//	}
//
//	public TarifneGrupe navigirajNaTarifneGrupe() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
//		tarifneGrupeWE.click();
//		return new TarifneGrupe(driver);
//	}
//
//	public Sezone navigirajNaSezone() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(sezoneWE));
//		sezoneWE.click();
//		return new Sezone(driver);
//	}
//
//	public ObracunskaSnaga navigirajNaObracunskaSnaga() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obracunskaSnagaWE));
//		obracunskaSnagaWE.click();
//		return new ObracunskaSnaga(driver);
//	}
//
//	public KategorijeCijena navigirajNaKategorijeCijena() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(kategorijeCijenaWE));
//		kategorijeCijenaWE.click();
//		return new KategorijeCijena(driver);
//	}
//
//	public Cjenovnik navigirajNaCjenovnik() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
//		tarifniSistemWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikWE));
//		cjenovnikWE.click();
//		return new Cjenovnik(driver);
//	}
//
//	public PravnaLica navigirajNaPravnaLica() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(pravnaLicaWE));
//		pravnaLicaWE.click();
//		return new PravnaLica(driver);
//	}
//
//	public FizickaLica navigirajNaFizickaLica() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(fizikaLicaWE));
//		fizikaLicaWE.click();
//		return new FizickaLica(driver);
//	}
//
//	public PovezanaPravnaLica navigirajNaPovezanaPravnaLica() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(povezanaPravnaLicaWE));
//		povezanaPravnaLicaWE.click();
//		return new PovezanaPravnaLica(driver);
//	}
//	
//	public ZahtjeviZaDostavuPodataka navigirajNaZahtjeviZaDostavuPodataka() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaWE));
//		zahtjeviZaDostavuPodatakaWE.click();
//		return new ZahtjeviZaDostavuPodataka(driver);
//	}
//	
//	public ZahtjeviZaUgovorePage navigateToZahtjeviZaUgovore() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUgovoreWE));
//		zahtjeviZaUgovoreWE.click();
//		return new ZahtjeviZaUgovorePage(driver);
//	}
//
//	public Ugovori navigirajNaUgovori() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ugovoriWE));
//		ugovoriWE.click();
//		return new Ugovori(driver);
//	}
//	
//	public ObavjestenjaOPromjeniSnabdjevaca navigirajNaObavjestenjaOPromjeniSnabdjevaca() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(obavjestenjaOPromjeniSnabdjevacaWE));
//		obavjestenjaOPromjeniSnabdjevacaWE.click();
//		return new ObavjestenjaOPromjeniSnabdjevaca(driver);
//	}
//	
//	public UgovoreniPopusti navigirajNaUgovoreniPopusti() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ugovoreniPopustiWE));
//		ugovoreniPopustiWE.click();
//		return new UgovoreniPopusti(driver);
//	}
//
//	public OdbaceniUgovori navigirajNaOdbaceniUgovori() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(odbaceniUgovoriWE));
//		odbaceniUgovoriWE.click();
//		return new OdbaceniUgovori(driver);
//	}
//
//	public Reklamacije navigirajNaReklamacije() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(reklamacijeWE));
//		reklamacijeWE.click();
//		return new Reklamacije(driver);
//	}
//
//	public VrsteZahtjeva navigirajNaVrsteZahtjeva() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(vrsteZahtjevaWE));
//		vrsteZahtjevaWE.click();
//		return new VrsteZahtjeva(driver);
//	}
//
//	public GrupeObrazacaBrojaUgovora navigirajNaGrupeObrazacaBrojaUgovora() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(grupeObrazacaBrojaUgovoraWE));
//		grupeObrazacaBrojaUgovoraWE.click();
//		return new GrupeObrazacaBrojaUgovora(driver);
//	}
//	
//	public Mjenice navigirajNaMjenice() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(mjeniceWE));
//		mjeniceWE.click();
//		return new Mjenice(driver);
//	}
//	
//	public TipoviMjenica navigirajNaTipoveMjenica() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
//		kupciWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(tipoviMjenicaWE));
//		tipoviMjenicaWE.click();
//		return new TipoviMjenica(driver);
//	}
//	
//	public MjernaMjesta navigirajNaMjernaMjesta() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
//		mjernaMjestaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaStrWE));
//		mjernaMjestaStrWE.click();
//		return new MjernaMjesta(driver);
//	}
//	
//	public ZahtjeviZaDostavuPodatakaOMjernimMjestima navigirajNaZahtjeviZaDostavuPodataka1() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
//		mjernaMjestaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodataka1WE));
//		zahtjeviZaDostavuPodataka1WE.click();
//		return new ZahtjeviZaDostavuPodatakaOMjernimMjestima(driver);
//	}
//	
//	public OcitanjaBrojila navigirajNaOcitanjaBrojila() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
//		mjernaMjestaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaBrojilaWE));
//		ocitanjaBrojilaWE.click();
//		return new OcitanjaBrojila(driver);
//	}
//	
//	public EnergetskiObracun navigirajNaEnergetskiObracun() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
//		mjernaMjestaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(energetskiObracunWE));
//		energetskiObracunWE.click();
//		return new EnergetskiObracun(driver);
//	}
//	
//	public MonitoringEnergetskogObracunaPage navigateToMonitoringEnergetskogObracuna() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
//		mjernaMjestaWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(monitoringEnergetskogObracunaWE));
//		monitoringEnergetskogObracunaWE.click();
//		return new MonitoringEnergetskogObracunaPage(driver);
//	}
//	
//	public NaloziZaObracun navigirajNaNaloziZaObracun() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
//		naloziZaObracunWE.click();
//		return new NaloziZaObracun(driver);
//	}
//	
//	public MonitoringObracunaPage navigateToMonitoringObracuna() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(monitoringObracunaWE));
//		monitoringObracunaWE.click();
//		return new MonitoringObracunaPage(driver);
//	}
//	
//	public Racuni navigirajNaRacuni() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(racuniWE));
//		racuniWE.click();
//		return new Racuni(driver);
//	}
//	
//	public RacuniZaNestandardneUsluge navigirajNaRacuniZaNestandardneUsluge() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(racuniZaUslugeWE));
//		racuniZaUslugeWE.click();
//		return new RacuniZaNestandardneUsluge(driver);
//	}
//	
//	public KorekcijeRacuna navigirajNaKorekcijeRacuna() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(korekcijeRacunaWE));
//		korekcijeRacunaWE.click();
//		return new KorekcijeRacuna(driver);
//	}
//	
//	public KamatePage navigirajNaKamate() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(kamateWE));
//		kamateWE.click();
//		return new KamatePage(driver);
//	}
//	
//	public KorekcijeKamatePage navigateToKorekcijeKamate() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(korekcijeKamateWE));
//		korekcijeKamateWE.click();
//		return new KorekcijeKamatePage(driver);
//	}
//	
//	public AvansneFakture navigirajNaAvansneFakture() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(avansneFaktureWE));
//		avansneFaktureWE.click();
//		return new AvansneFakture(driver);
//	}
//	
//	public UmanjenjaCijene navigirajNaUmanjenjaCijene() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(umanjenjaCijeneWE));
//		umanjenjaCijeneWE.click();
//		return new UmanjenjaCijene(driver);
//	}
//	
//	public TefObrazac navigirajNaTefObrazac() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(tefObrazacWE));
//		tefObrazacWE.click();
//		return new TefObrazac(driver);
//	}
//	
//	public KupciZaTestneRacune navigirajNaKupciZaTestneRacune() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
//		obracunWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(kupciZaTestneRacuneWE));
//		kupciZaTestneRacuneWE.click();
//		return new KupciZaTestneRacune(driver);
//	}
//	
//	public FinansijskeKartice navigirajNaFinansijskeKartice() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(finansijskeKarticeWE));
//		finansijskeKarticeWE.click();
//		return new FinansijskeKartice(driver);
//	}
//	
//	public DnevniciUplata navigirajNaDnevniciUplata() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(dnevniciUplataWE));
//		dnevniciUplataWE.click();
//		return new DnevniciUplata(driver);
//	}
//	
//	public SveUplate navigirajNaSveUplate() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(sveUplateWE));
//		sveUplateWE.click();
//		return new SveUplate(driver);
//	}
//	
//	public PreknjizavanjaUplata navigirajNaPreknjizavanjaUplata() throws FileNotFoundException, IOException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(preknjizavanjaUplataWE));
//		preknjizavanjaUplataWE.click();
//		return new PreknjizavanjaUplata(driver);	
//	}
//	
//	public NerasporedjeneUplate navigirajNaNerasporedjeneUplate() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(nerasporedjeneUplateWE));
//		nerasporedjeneUplateWE.click();
//		return new NerasporedjeneUplate(driver);
//	}
//	
//	public Avansi navigirajNaAvansi() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(avansiWE));
//		avansiWE.click();
//		return new Avansi(driver);
//	}
//	
//	public Reprogrami navigirajNaReprogrami() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(reprogramiWE));
//		reprogramiWE.click();
//		return new Reprogrami(driver);
//	}
//
//	public Banke navigirajNaBanke() throws Exception {
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(bankeWE));
//		bankeWE.click();
//		return new Banke(driver);
//	}
//
//	public ZiroRacuni navigirajNaZiroRacuni() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ziroRacuniWE));
//		ziroRacuniWE.click();
//		return new ZiroRacuni(driver);
//	}
//	
//	public VrsteKnjizenja navigirajNaVrsteKnjizenja() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(vrsteKnjizenjaWE));
//		vrsteKnjizenjaWE.click();
//		return new VrsteKnjizenja(driver);
//	}
//	
//	public VrsteStavkiFinansijskeKartice navigirajNaVrsteStavkiFinansijskeKartice() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(vrsteStavkiFinansijskeKarticeWE));
//		vrsteStavkiFinansijskeKarticeWE.click();
//		return new VrsteStavkiFinansijskeKartice(driver);
//	}
//	
//	public Opomene navigirajNaOpomene() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(opomeneWE));
//		opomeneWE.click();
//		return new Opomene(driver);
//	}
//	
//	public ZahtjeviZaIskljucenje navigirajNaZahtjeviZaIskljucenje() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaIskljucenjeWE));
//		zahtjeviZaIskljucenjeWE.click();
//		return new ZahtjeviZaIskljucenje(driver);
//	}
//	
//	public StavkeZahtjevaZaIskljucenje navigirajNaStavkeZahtjevaZaIskljucenje() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(stavkeZahtjevaZaIskljucenjeWE));
//		stavkeZahtjevaZaIskljucenjeWE.click();
//		return new StavkeZahtjevaZaIskljucenje(driver);
//	}
//	
//	public IskljucenjaOdStraneODSa navigirajNaIskljucenjaOdStraneODSa() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaOdStraneODSaWE));
//		iskljucenjaOdStraneODSaWE.click();
//		return new IskljucenjaOdStraneODSa(driver);
//	}
//	
//	public ZahtjeviZaUkljucenje navigirajNaZahtjeviZaUkljucenje() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUkljucenjeWE));
//		zahtjeviZaUkljucenjeWE.click();
//		return new ZahtjeviZaUkljucenje(driver);
//	}
//	
//	public StavkeZahtjevaZaUkljucenje navigirajNaStavkeZahtjevaZaUkljucenje() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(stavkeZahtjevaZaUkljucenjeWE));
//		stavkeZahtjevaZaUkljucenjeWE.click();
//		return new StavkeZahtjevaZaUkljucenje(driver);
//	}
//	
//	public AktivnaIskljucenja navigirajNaAktivnaIskljucenja() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(aktivnaIskljucenjaWE));
//		aktivnaIskljucenjaWE.click();
//		return new AktivnaIskljucenja(driver);
//	}
//	
//	public Tuzbe navigirajNaTuzbe() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(tuzbeWE));
//		tuzbeWE.click();
//		return new Tuzbe(driver);
//	}
//	
//	public Bankroti navigirajNaBankroti() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(bankrotiWE));
//		bankrotiWE.click();
//		return new Bankroti(driver);
//	}
//	
//	public Medijacije navigirajNaMedijacije() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(medijacijeWE));
//		medijacijeWE.click();
//		return new Medijacije(driver);
//	}
//	
//	public OtpisiPotrazivanja navigirajNaOtpisiPotrazivanja() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
//		pravniOdnosiWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(otpisiPotrazivanjaWE));
//		otpisiPotrazivanjaWE.click();
//		return new OtpisiPotrazivanja(driver);
//	}
//	
//	public SapPage navigateToSap() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
//		finansijeWE.click();
//		wait.until(ExpectedConditions.elementToBeClickable(sapWE));
//		sapWE.click();
//		return new SapPage(driver);
//	}
//	
//	public IzvjestajiPage navigirajNaIzvjestaji() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
//		izvjestajiWE.click();
//		return new IzvjestajiPage(driver);
//	}
	
//	public PocetnaStranica navigateToPocetnaStranica() throws FileNotFoundException, IOException {
//		wait.until(ExpectedConditions.elementToBeClickable(pocetnaStranicaWE));
//		pocetnaStranicaWE.click();
//		return new PocetnaStranica(driver);
//	}
//	
//	public void pretraziKupce(String kupac) throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
//		filterKupacWE.sendKeys(kupac);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
//		Thread.sleep(2000);
//	}
//	
//	public void pretraziMjernaMjesta(String mjernoMjesto) throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
//		filterMjernoMjestoWE.sendKeys(mjernoMjesto);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
//		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
//		Thread.sleep(1000);
//	}
	
	public void verifikujPoruku(String poruka) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}
	
}