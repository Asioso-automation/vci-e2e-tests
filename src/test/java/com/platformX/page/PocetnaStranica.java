package com.platformX.page;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(xpath = "//div[1]/div/div/div/div/div/div[2]/input[1]")
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
	

	// Sekcije

	@FindBy(xpath = "//div[3]/button[1]")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//button[2]")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//button[3]")
	protected WebElement kupciWE;

	@FindBy(xpath = "//button[4]")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//button[5]")
	protected WebElement obracunWE;
	
	@FindBy(xpath = "//*[contains(text(),'Nestandardne usluge') and @class='v-btn__content']")
	protected WebElement nestandardneUslugeWE;

	@FindBy(xpath = "//button[6]")
	protected WebElement finansijeWE;
	
	@FindBy(xpath = "//*[contains(text(),'Pravni odnosi') and @class='v-btn__content']")
	protected WebElement pravniOdnosiWE;
	
	@FindBy(xpath = "//*[contains(text(),'Administracija') and @class='v-btn__content']")
	protected WebElement administracijaWE;

	@FindBy(xpath = "//div[3]/a")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "//button[9]")
	protected WebElement profilWE;

	// Stranice

	@FindBy(xpath = "//div[contains(text(), 'Organizacije')]")
	protected WebElement organizacijeWE;

	@FindBy(xpath = "//div[contains(text(), 'Operatori distributivnih sistema')]")
	protected WebElement operatoriSistemaWE;

	@FindBy(xpath = "//div[contains(text(), 'Radne jedinice')]")
	protected WebElement radneJediniceWE;

	@FindBy(xpath = "//div[contains(text(), 'Operativna područja')]")
	protected WebElement operativnaPodrucjaWE;

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

	@FindBy(xpath = "//div[contains(text(), 'Kategorije potrošnje')]")
	protected WebElement kategorijePotrosnjeWE;

	@FindBy(xpath = "//div[contains(text(), 'Tarifne nadgrupe')]")
	protected WebElement tarifneNadgrupeWE;

	@FindBy(xpath = "//div[contains(text(), 'Tarifne grupe')]")
	protected WebElement tarifneGrupeWE;

	@FindBy(xpath = "//div[contains(text(), 'Sezone')]")
	protected WebElement sezoneWE;

	@FindBy(xpath = "//div[contains(text(), 'Obračunska snaga')]")
	protected WebElement obracunskaSnagaWE;

	@FindBy(xpath = "//div[contains(text(), 'Kategorije cijena')]")
	protected WebElement kategorijeCijenaWE;

	@FindBy(xpath = "//div[contains(text(), 'Cjenovnik')]")
	protected WebElement cjenovnikWE;

	@FindBy(xpath = "//div[contains(text(), 'Pravna lica')]")
	protected WebElement pravnaLicaWE;

	@FindBy(xpath = "//div[contains(text(), 'Fizička lica')]")
	protected WebElement fizikaLicaWE;

	@FindBy(xpath = "//div[contains(text(), 'Povezana pravna lica')]")
	protected WebElement povezanaPravnaLicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka')]")
	protected WebElement zahtjeviZaDostavuPodatakaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za ugovore')]")
	protected WebElement zahtjeviZaUgovoreWE;

	@FindBy(xpath = "//div[contains(text(), 'Ugovori')]")
	protected WebElement ugovoriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za raskid ugovora')]")
	protected WebElement zahtjeviZaRaskidUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obavještenja o promjeni snabdjevača')]")
	protected WebElement obavjestenjaOPromjeniSnabdjevacaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zajednička potrošnja')]")
	protected WebElement zajednickaPotrosnjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Članovi zajedničke potrošnje')]")
	protected WebElement clanoviZajednickePotrosnjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Ugovoreni popusti')]")
	protected WebElement ugovoreniPopustiWE;

	@FindBy(xpath = "//div[contains(text(), 'Odbačeni ugovori')]")
	protected WebElement odbaceniUgovoriWE;

	@FindBy(xpath = "//div[contains(text(), 'Reklamacije')]")
	protected WebElement reklamacijeWE;

	@FindBy(xpath = "//div[contains(text(), 'Vrste zahtjeva')]")
	protected WebElement vrsteZahtjevaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste isporuke reklamacija')]")
	protected WebElement vrsteIsporukeReklamacijaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obrasci broja ugovora')]")
	protected WebElement obrasciBrojaUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Grupe obrazaca broja ugovora')]")
	protected WebElement grupeObrazacaBrojaUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Izvodi otvorenih stavki')]")
	protected WebElement izvodiOtvorenihStavkiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjenice')]")
	protected WebElement mjeniceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi mjenica')]")
	protected WebElement tipoviMjenicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjerna mjesta')]")
	protected WebElement mjernaMjestaStrWE;
	
	@FindBy(xpath = "//a[@href='/metering/metering-points-data-requests']")
	protected WebElement zahtjeviZaDostavuPodataka1WE;
	
	@FindBy(xpath = "//div[contains(text(), 'Očitanja brojila')]")
	protected WebElement ocitanjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Energetski obračun')]")
	protected WebElement energetskiObracunWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring energetskog obračuna')]")
	protected WebElement monitoringEnergetskogObracunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalozi za obračun')]")
	protected WebElement naloziZaObracunWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring obračuna')]")
	protected WebElement monitoringObracunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Računi')]")
	protected WebElement racuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Računi za nestandardne usluge')]")
	protected WebElement racuniZaUslugeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije računa')]")
	protected WebElement korekcijeRacunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kamate')]")
	protected WebElement kamateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije kamate')]")
	protected WebElement korekcijeKamateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Avansne fakture')]")
	protected WebElement avansneFaktureWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Umanjenja cijene')]")
	protected WebElement umanjenjaCijeneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'TEF obrazac')]")
	protected WebElement tefObrazacWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kupci za testne račune')]")
	protected WebElement kupciZaTestneRacuneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Finansijske kartice')]")
	protected WebElement finansijskeKarticeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnici uplata')]")
	protected WebElement dnevniciUplataWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sve uplate')]")
	protected WebElement sveUplateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Preknjižavanja uplata')]")
	protected WebElement preknjizavanjaUplataWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Neraspoređene uplate')]")
	protected WebElement nerasporedjeneUplateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Avansi')]")
	protected WebElement avansiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Reprogrami')]")
	protected WebElement reprogramiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obrasci broja ugovora reprograma')]")
	protected WebElement obrasciBrojaUgovoraReprogramaWE;

	@FindBy(xpath = "//div[contains(text(), 'Banke')]")
	protected WebElement bankeWE;

	@FindBy(xpath = "//div[contains(text(), 'Žiro računi')]")
	protected WebElement ziroRacuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste knjiženja')]")
	protected WebElement vrsteKnjizenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste finansijskih kartica')]")
	protected WebElement vrsteFinansijskihKarticaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste stavki finansijske kartice')]")
	protected WebElement vrsteStavkiFinansijskeKarticeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Opomene')]")
	protected WebElement opomeneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za isključenje')]")
	protected WebElement zahtjeviZaIskljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Stavke zahtjeva za isključenja')]")
	protected WebElement stavkeZahtjevaZaIskljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za uključenje')]")
	protected WebElement zahtjeviZaUkljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Stavke zahtjeva za uključenja')]")
	protected WebElement stavkeZahtjevaZaUkljucenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Aktivna isključenja')]")
	protected WebElement aktivnaIskljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Isključenja od strane ODS-a')]")
	protected WebElement iskljucenjaOdStraneODSaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tužbe')]")
	protected WebElement tuzbeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Bankroti')]")
	protected WebElement bankrotiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Medijacije')]")
	protected WebElement medijacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Stečajevi/Likvidacije')]")
	protected WebElement stecajeviLikvidacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Otpisi potraživanja')]")
	protected WebElement otpisiPotrazivanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'SAP')]")
	protected WebElement sapWE;
	
	@FindBy(xpath = "//div[contains(text(), 'UINO')]")
	protected WebElement uinoWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korisnici')]")
	protected WebElement korisniciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Email obavještenja')]")
	protected WebElement emailObavjestenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Predračuni')]")
	protected WebElement predracuniWE;
	

	@FindBy(xpath = "//html/body/div/div[3]/div/div/div/a[5]/div[2]/div")
	protected WebElement iskljucenjaPoZahtjevuKupcaWE;
	
	//*[contains(@class,'v-window-item--active')]//*[contains(@class, 'v-list-item__title')]//*[text() = 'Mjerno mjesto (EIC)']")
	
	@FindBy(xpath = "//div[contains(text(), 'Uključenja od strane ODS-a')]")
	protected WebElement ukljucenjaOdStraneODSaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Uključenja po zahtjevu kupca')]")
	protected WebElement ukljucenjaPoZahtjevuKupcaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Opomene pred utuženje')]")
	protected WebElement opomenePredUtuzenjeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obrasci broja protokola opomena pred utuženje')]")
	protected WebElement obrasciBrojaProtokolaOpomenaPredUtuzenjeWE;
	

	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
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

	public Organizacije navigirajNaOrganizacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(organizacijeWE));
		organizacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ORGANIZACIJE"));
		}
		return new Organizacije(driver);
	}

	public OperatoriDistributivnihSistema navigirajNaOperatoriDistributivnihSistema() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(operatoriSistemaWE));
		operatoriSistemaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OPERATORI.DISTRIBUTIVNIH.SISTEMA"));
		}
		return new OperatoriDistributivnihSistema(driver);
	}

	public RadneJedinice navigirajNaRadneJedinice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(radneJediniceWE));
		radneJediniceWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("RADNE.JEDINICE"));
		}
		return new RadneJedinice(driver);
	}

	public OperativnaPodrucja navigirajNaOperativnaPodrucja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(operativnaPodrucjaWE));
		operativnaPodrucjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OPERATIVNA.PODRUCJA"));
		}
		return new OperativnaPodrucja(driver);
	}

	public Djelatnosti navigirajNaDjelatnosti() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(djelatnostiWE));
		djelatnostiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("DJELATNOSTI"));
		}
		return new Djelatnosti(driver);
	}

	public Entiteti navigirajNaEntitete() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ENTITETI"));
		}
		return new Entiteti(driver);
	}

	public Opstine navigirajNaOpstine() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opstineWE));
		opstineWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OPSTINE"));
		}
		return new Opstine(driver);
	}

	public NaseljenaMjesta navigirajNaNaseljenaMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naseljenaMjestaWE));
		naseljenaMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("NASELJENA.MJESTA"));
		}
		return new NaseljenaMjesta(driver);
	}

	public Poste navigirajNaPoste() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(posteWE));
		posteWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("POSTE"));
		}
		return new Poste(driver);
	}

	public Ulice navigirajNaUlice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ULICE"));
		}
		return new Ulice(driver);
	}

	public KategorijePotrosnje navigirajNaKategorijePotrosnje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorijePotrosnjeWE));
		kategorijePotrosnjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KATEGORIJE.POTROSNJE"));
		}
		return new KategorijePotrosnje(driver);
	}

	public TarifneNadgrupe navigirajNaTarifneNadgrupe() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
		tarifneNadgrupeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("TARIFNE.NADGRUPE"));
		}
		return new TarifneNadgrupe(driver);
	}

	public TarifneGrupe navigirajNaTarifneGrupe() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
		tarifneGrupeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("TARIFNE.GRUPE"));
		}
		return new TarifneGrupe(driver);
	}

	public Sezone navigirajNaSezone() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sezoneWE));
		sezoneWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("SEZONE"));
		}
		return new Sezone(driver);
	}

	public ObracunskaSnaga navigirajNaObracunskaSnaga() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obracunskaSnagaWE));
		obracunskaSnagaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OBRACUNSKA.SNAGA"));
		}
		return new ObracunskaSnaga(driver);
	}

	public KategorijeCijena navigirajNaKategorijeCijena() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorijeCijenaWE));
		kategorijeCijenaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KATEGORIJE.CIJENA"));
		}
		return new KategorijeCijena(driver);
	}

	public Cjenovnik navigirajNaCjenovnik() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikWE));
		cjenovnikWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("CJENOVNIK"));
		}
		return new Cjenovnik(driver);
	}

	public PravnaLica navigirajNaPravnaLica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pravnaLicaWE));
		pravnaLicaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("PRAVNA.LICA"));
		}
		return new PravnaLica(driver);
	}

	public FizickaLica navigirajNaFizickaLica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizikaLicaWE));
		fizikaLicaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("FIZICKA.LICA"));
		}
		return new FizickaLica(driver);
	}

	public PovezanaPravnaLica navigirajNaPovezanaPravnaLica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(povezanaPravnaLicaWE));
		povezanaPravnaLicaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("POVEZANA.PRAVNA.LICA"));
		}
		return new PovezanaPravnaLica(driver);
	}
	
	public ZahtjeviZaDostavuPodataka navigirajNaZahtjeviZaDostavuPodataka() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaWE));
		zahtjeviZaDostavuPodatakaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.DOSTAVU.PODATAKA"));
		}
		return new ZahtjeviZaDostavuPodataka(driver);
	}
	
	public ZahtjeviZaUgovore navigirajNaZahtjeviZaUgovore() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUgovoreWE));
		zahtjeviZaUgovoreWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.UGOVORE"));
		}
		return new ZahtjeviZaUgovore(driver);
	}

	public Ugovori navigirajNaUgovori() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovoriWE));
		ugovoriWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("UGOVORI"));
		}
		return new Ugovori(driver);
	}
	
	public ZahtjeviZaRaskidUgovora navigirajNaZahtjeviZaRaskidUgovora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaRaskidUgovoraWE));
		zahtjeviZaRaskidUgovoraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.RASKID.UGOVORA"));
		}
		return new ZahtjeviZaRaskidUgovora(driver);
	}
	
	public ObavjestenjaOPromjeniSnabdjevaca navigirajNaObavjestenjaOPromjeniSnabdjevaca() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obavjestenjaOPromjeniSnabdjevacaWE));
		obavjestenjaOPromjeniSnabdjevacaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OBAVJESTENJA.O.PROMJENI.SNABDJEVACA"));
		}
		return new ObavjestenjaOPromjeniSnabdjevaca(driver);
	}
	
	public ZajednickaPotrosnja navigirajNaZajednickaPotrosnja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zajednickaPotrosnjaWE));
		zajednickaPotrosnjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAJEDNICKA.POTROSNJA"));
		}
		return new ZajednickaPotrosnja(driver);
	}
	
	public ClanoviZajednickePotrosnje navigirajNaClanoviZajednickePotrosnje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(clanoviZajednickePotrosnjeWE));
		clanoviZajednickePotrosnjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("CLANOVI.ZAJEDNICKE.POTROSNJE"));
		}
		return new ClanoviZajednickePotrosnje(driver);
	}
	
	public UgovoreniPopusti navigirajNaUgovoreniPopusti() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovoreniPopustiWE));
		ugovoreniPopustiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("UGOVORENI.POPUSTI"));
		}
		return new UgovoreniPopusti(driver);
	}

	public OdbaceniUgovori navigirajNaOdbaceniUgovori() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odbaceniUgovoriWE));
		odbaceniUgovoriWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ODBACENI.UGOVORI"));
		}
		return new OdbaceniUgovori(driver);
	}

	public Reklamacije navigirajNaReklamacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reklamacijeWE));
		reklamacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("REKLAMACIJE"));
		}
		return new Reklamacije(driver);
	}

	public VrsteZahtjeva navigirajNaVrsteZahtjeva() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteZahtjevaWE));
		vrsteZahtjevaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("VRSTE.ZAHTJEVA"));
		}
		return new VrsteZahtjeva(driver);
	}
	
	public VrsteIsporukeReklamacija navigirajNaVrsteIsporukeReklamacija() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteIsporukeReklamacijaWE));
		vrsteIsporukeReklamacijaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("VRSTE.ISPORUKE.REKLAMACIJA"));
		}
		return new VrsteIsporukeReklamacija(driver);
	}
	
	public ObrasciBrojaUgovora navigirajNaObrasciBrojaUgovora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrasciBrojaUgovoraWE));
		obrasciBrojaUgovoraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OBRASCI.BROJA.UGOVORA"));
		}
		return new ObrasciBrojaUgovora(driver);
	}

	public GrupeObrazacaBrojaUgovora navigirajNaGrupeObrazacaBrojaUgovora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grupeObrazacaBrojaUgovoraWE));
		grupeObrazacaBrojaUgovoraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("GRUPE.OBRAZACA.BROJA.UGOVORA"));
		}
		return new GrupeObrazacaBrojaUgovora(driver);
	}
	
	public IzvodiOtvorenihStavkiPoODSu navigirajNaIzvodiOtvorenihStavki() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izvodiOtvorenihStavkiWE));
		izvodiOtvorenihStavkiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("IZVODI.OTVORENIH.STAVKI"));
		}
		return new IzvodiOtvorenihStavkiPoODSu(driver);
	}
	
	public Mjenice navigirajNaMjenice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjeniceWE));
		mjeniceWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("MJENICE"));
		}
		return new Mjenice(driver);
	}
	
	public TipoviMjenica navigirajNaTipoveMjenica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviMjenicaWE));
		tipoviMjenicaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("TIPOVI.MJENICA"));
		}
		return new TipoviMjenica(driver);
	}
	
	public MjernaMjesta navigirajNaMjernaMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaStrWE));
		mjernaMjestaStrWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("MJERNA.MJESTA"));
		}
		return new MjernaMjesta(driver);
	}
	
	public ZahtjeviZaDostavuPodatakaOMjernimMjestima navigirajNaZahtjeviZaDostavuPodataka1() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodataka1WE));
		zahtjeviZaDostavuPodataka1WE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.DOSTAVU.PODATAKA.O.MJM"));
		}
		return new ZahtjeviZaDostavuPodatakaOMjernimMjestima(driver);
	}
	
	public OcitanjaBrojila navigirajNaOcitanjaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaBrojilaWE));
		ocitanjaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OCITANJA.BROJILA"));
		}
		return new OcitanjaBrojila(driver);
	}
	
	public EnergetskiObracun navigirajNaEnergetskiObracun() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(energetskiObracunWE));
		energetskiObracunWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ENERGETSKI.OBRACUN"));
		}
		return new EnergetskiObracun(driver);
	}
	
	public MonitoringEnergetskogObracunaPage navigateToMonitoringEnergetskogObracuna() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringEnergetskogObracunaWE));
		monitoringEnergetskogObracunaWE.click();
		return new MonitoringEnergetskogObracunaPage(driver);
	}
	
	public NaloziZaObracun navigirajNaNaloziZaObracun() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
		naloziZaObracunWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("NALOZI.ZA.OBRACUN"));
		}
		return new NaloziZaObracun(driver);
	}
	
	public MonitoringObracunaPage navigateToMonitoringObracuna() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringObracunaWE));
		monitoringObracunaWE.click();
		return new MonitoringObracunaPage(driver);
	}
	
	public Racuni navigirajNaRacuni() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(racuniWE));
		racuniWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("RACUNI"));
		}
		return new Racuni(driver);
	}
	
	public RacuniZaNestandardneUsluge navigirajNaRacuniZaNestandardneUsluge() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(racuniZaUslugeWE));
		racuniZaUslugeWE.click();
		return new RacuniZaNestandardneUsluge(driver);
	}
	
	public KorekcijeRacuna navigirajNaKorekcijeRacuna() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeRacunaWE));
		korekcijeRacunaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KOREKCIJE.RACUNA"));
		}
		return new KorekcijeRacuna(driver);
	}
	
	public KamatePage navigirajNaKamate() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kamateWE));
		kamateWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KAMATE"));
		}
		return new KamatePage(driver);
	}
	
	public KorekcijeKamate navigateToKorekcijeKamate() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeKamateWE));
		korekcijeKamateWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KOREKCIJE.KAMATE"));
		}
		return new KorekcijeKamate(driver);
	}
	
	public AvansneFakture navigirajNaAvansneFakture() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(avansneFaktureWE));
		avansneFaktureWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("AVANSNE.FAKTURE"));
		}
		return new AvansneFakture(driver);
	}
	
	public UmanjenjaCijene navigirajNaUmanjenjaCijene() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(umanjenjaCijeneWE));
		umanjenjaCijeneWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("UMANJENJA.CIJENA"));
		}
		return new UmanjenjaCijene(driver);
	}
	
	public TefObrazac navigirajNaTefObrazac() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tefObrazacWE));
		tefObrazacWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("TEF.OBRAZAC"));
		}
		return new TefObrazac(driver);
	}
	
	public KupciZaTestneRacune navigirajNaKupciZaTestneRacune() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupciZaTestneRacuneWE));
		kupciZaTestneRacuneWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KUPCI.ZA.TESTNE.RACUNE"));
		}
		return new KupciZaTestneRacune(driver);
	}
	
	public FinansijskeKartice navigirajNaFinansijskeKartice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(finansijskeKarticeWE));
		finansijskeKarticeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("FINANSIJSKE.KARTICE"));
		}
		return new FinansijskeKartice(driver);
	}
	
	public DnevniciUplata navigirajNaDnevniciUplata() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevniciUplataWE));
		dnevniciUplataWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("DNEVNICI.UPLATA"));
		}
		return new DnevniciUplata(driver);
	}
	
	public SveUplate navigirajNaSveUplate() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sveUplateWE));
		sveUplateWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("SVE.UPLATE"));
		}
		return new SveUplate(driver);
	}
	
	public PreknjizavanjaUplata navigirajNaPreknjizavanjaUplata() throws FileNotFoundException, IOException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(preknjizavanjaUplataWE));
		preknjizavanjaUplataWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("PREKNJIZAVANJA.UPLATA"));
		}
		return new PreknjizavanjaUplata(driver);	
	}
	
	public NerasporedjeneUplate navigirajNaNerasporedjeneUplate() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nerasporedjeneUplateWE));
		nerasporedjeneUplateWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("NERASPOREDJENE.UPLATE"));
		}
		return new NerasporedjeneUplate(driver);
	}
	
	public Avansi navigirajNaAvansi() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(avansiWE));
		avansiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("AVANSI"));
		}
		return new Avansi(driver);
	}
	
	public Reprogrami navigirajNaReprogrami() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reprogramiWE));
		reprogramiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("REPROGRAMI"));
		}
		return new Reprogrami(driver);
	}
	
	public ObrasciBrojaUgovoraReprograma navigirajNaObrasciBrojaUgovoraReprograma() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrasciBrojaUgovoraReprogramaWE));
		obrasciBrojaUgovoraReprogramaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OBRASCI.BROJA.UGOVORA.REPROGRAMA"));
		}
		return new ObrasciBrojaUgovoraReprograma(driver);
	}

	public Banke navigirajNaBanke() throws Exception {
		try {
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankeWE));
		bankeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("BANKE"));
		}
		return new Banke(driver);
	}

	public ZiroRacuni navigirajNaZiroRacuni() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacuniWE));
		ziroRacuniWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZIRO.RACUNI"));
		}
		return new ZiroRacuni(driver);
	}
	
	public VrsteKnjizenja navigirajNaVrsteKnjizenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteKnjizenjaWE));
		vrsteKnjizenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("VRSTE.KNJIZENJA"));
		}
		return new VrsteKnjizenja(driver);
	}
	
	public VrsteFinansijskihKartica navigirajNaVrsteFinansijskihKartica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteFinansijskihKarticaWE));
		vrsteFinansijskihKarticaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("VRSTE.FINANSIJSKIH.KARTICA"));
		}
		return new VrsteFinansijskihKartica(driver);
	}
	
	public VrsteStavkiFinansijskeKartice navigirajNaVrsteStavkiFinansijskeKartice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteStavkiFinansijskeKarticeWE));
		vrsteStavkiFinansijskeKarticeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("VRSTE.STAVKI.FINANSIJSKE.KARTICE"));
		}
		return new VrsteStavkiFinansijskeKartice(driver);
	}
	
	public Opomene navigirajNaOpomene() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opomeneWE));
		opomeneWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OPOMENE"));
		}
		return new Opomene(driver);
	}
	
	public ZahtjeviZaIskljucenje navigirajNaZahtjeviZaIskljucenje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaIskljucenjeWE));
		zahtjeviZaIskljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.ISKLJUCENJE"));
		}
		return new ZahtjeviZaIskljucenje(driver);
	}
	
	public StavkeZahtjevaZaIskljucenje navigirajNaStavkeZahtjevaZaIskljucenje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(stavkeZahtjevaZaIskljucenjeWE));
		stavkeZahtjevaZaIskljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("STAVKE.ZAHTJEVA.ZA.ISKLJUCENJE"));
		}
		return new StavkeZahtjevaZaIskljucenje(driver);
	}
	
	public IskljucenjaOdStraneODSa navigirajNaIskljucenjaOdStraneODSa() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaOdStraneODSaWE));
		iskljucenjaOdStraneODSaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ISKLJUCENJA.OD.STRANE.ODS"));
		}
		return new IskljucenjaOdStraneODSa(driver);
	}
	
	public ZahtjeviZaUkljucenje navigirajNaZahtjeviZaUkljucenje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUkljucenjeWE));
		zahtjeviZaUkljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("ZAHTJEVI.ZA.UKLJUCENJE"));
		}
		return new ZahtjeviZaUkljucenje(driver);
	}
	
	public StavkeZahtjevaZaUkljucenje navigirajNaStavkeZahtjevaZaUkljucenje() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(stavkeZahtjevaZaUkljucenjeWE));
		stavkeZahtjevaZaUkljucenjeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("STAVKE.ZAHTJEVA.ZA.USKLJUCENJE"));
		}
		return new StavkeZahtjevaZaUkljucenje(driver);
	}
	
	public AktivnaIskljucenja navigirajNaAktivnaIskljucenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivnaIskljucenjaWE));
		aktivnaIskljucenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("AKTIVNA.ISKLJUCENJA"));
		}
		return new AktivnaIskljucenja(driver);
	}
	
	public Tuzbe navigirajNaTuzbe() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tuzbeWE));
		tuzbeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("TUZBE"));
		}
		return new Tuzbe(driver);
	}
	
	public Bankroti navigirajNaBankroti() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankrotiWE));
		bankrotiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("BANKROTI"));
		}
		return new Bankroti(driver);
	}
	
	public Medijacije navigirajNaMedijacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(medijacijeWE));
		medijacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("MEDIJACIJE"));
		}
		return new Medijacije(driver);
	}
	
	public StecajeviLikvidacije navigirajNaStecajeviLikvidacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(stecajeviLikvidacijeWE));
		stecajeviLikvidacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("STECAJEVI.LIKVIDACIJE"));
		}
		return new StecajeviLikvidacije(driver);
	}
	
	public OtpisiPotrazivanja navigirajNaOtpisiPotrazivanja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(otpisiPotrazivanjaWE));
		otpisiPotrazivanjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("OTPISI.POTRAZIVANJA"));
		}
		return new OtpisiPotrazivanja(driver);
	}
	
	public Sap navigirajNaSap() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sapWE));
		sapWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("SAP"));
		}
		return new Sap(driver);
	}
	
	public Uino navigirajNaUino() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uinoWE));
		uinoWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("UINO"));
		}
		return new Uino(driver);
	}
	
	public Korisnici navigirajNaKorisnici() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korisniciWE));
		korisniciWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KORISNICI"));
		}
		return new Korisnici(driver);
	}
	
	public EmailObavjestenja navigirajNaEmailObavjestenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(emailObavjestenjaWE));
		emailObavjestenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("EMAIL.OBAVJESTENJA"));
		}
		return new EmailObavjestenja(driver);
	}
	
	public NaloziZaObracunNestandardnihUsluga navigirajNaNaloziZaObracunNestandardnihUsluga() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(nestandardneUslugeWE));
		nestandardneUslugeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
		naloziZaObracunWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("NALOZI.ZA.OBRACUN.NSU"));
		}
		return new NaloziZaObracunNestandardnihUsluga(driver);
	}
	
	public KorekcijeRacunaZaNestandardneUsluge navigirajNaKorekcijeRacunaZaNestandardneUsluge() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(nestandardneUslugeWE));
		nestandardneUslugeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeRacunaWE));
		korekcijeRacunaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("KOREKCIJE.RACUNA.NSU"));
		}
		return new KorekcijeRacunaZaNestandardneUsluge(driver);
	}
	
	public Predracuni navigirajNaPredracuni() throws Exception{
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(nestandardneUslugeWE));
		nestandardneUslugeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(predracuniWE));
		predracuniWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("PREDRACUNI"));
		}
		return new Predracuni(driver);
	}
	
	public Izvjestaji navigirajNaIzvjestaji() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		izvjestajiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_properties.getValue("URL.LOGIN") + platformx_properties.getValue("IZVJESTAJI"));
		}
		return new Izvjestaji(driver);
	}
	
	public PocetnaStranica navigateToPocetnaStranica() throws FileNotFoundException, IOException {
		wait.until(ExpectedConditions.elementToBeClickable(pocetnaStranicaWE));
		pocetnaStranicaWE.click();
		return new PocetnaStranica(driver);
	}
	
	public void pretraziKupce(String kupac) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterKupacWE));
		filterKupacWE.sendKeys(kupac);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + kupac + "')]")).click();
		Thread.sleep(2000);
	}
	
	public void pretraziMjernaMjesta(String mjernoMjesto) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(filterMjernoMjestoWE));
		filterMjernoMjestoWE.sendKeys(mjernoMjesto);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")));
		driver.findElement(By.xpath("//div[contains(@class, 'v-list-item__title') and contains(., '" + mjernoMjesto + "')]")).click();
		Thread.sleep(1000);
	}
	
	public void verifikujPoruku(String poruka) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}
	
	public IskljucenjaPoZahtjevuKupca navigirajNaIskljucenjaPoZahtjevuKupca() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(iskljucenjaPoZahtjevuKupcaWE));
		iskljucenjaPoZahtjevuKupcaWE.click();
		return new IskljucenjaPoZahtjevuKupca(driver);
	}
	
	public UkljucenjaOdStraneODSa navigirajNaUkljucenjaOdStraneODSa() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ukljucenjaOdStraneODSaWE));
		ukljucenjaOdStraneODSaWE.click();
		return new UkljucenjaOdStraneODSa(driver);
	}
	
	public UkljucenjaPoZahtjevuKupca navigirajNaUkljucenjaPoZahtjevuKupca() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ukljucenjaPoZahtjevuKupcaWE));
		ukljucenjaPoZahtjevuKupcaWE.click();
		return new UkljucenjaPoZahtjevuKupca(driver);
	}
	
	public OpomenePredUtuzenje navigirajNaOpomenePredUtuzenje() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opomenePredUtuzenjeWE));
		opomenePredUtuzenjeWE.click();
		return new OpomenePredUtuzenje(driver);
	}
	
	public ObrasciBrojaProtokolaOpomenaPredUtuzenje navigirajNaObrasciBrojaProtokolaOpomenaPredUtuzenje() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(pravniOdnosiWE));
		pravniOdnosiWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obrasciBrojaProtokolaOpomenaPredUtuzenjeWE));
		obrasciBrojaProtokolaOpomenaPredUtuzenjeWE.click();
		return new ObrasciBrojaProtokolaOpomenaPredUtuzenje(driver);
	}
	
}