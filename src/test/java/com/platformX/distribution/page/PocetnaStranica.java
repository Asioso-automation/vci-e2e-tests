package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.Keys;
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
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	@FindBy(xpath = "//div[1]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterMjernoMjestoWE;

	@FindBy(xpath = "//div[contains(text(), 'Odjavi se')]")
	protected WebElement izlogujSeWE;
	
	@FindBy(xpath = "//*[contains(@class, 'v-btn__content') and contains(text(), 'Briši')]")
	protected WebElement potvrdiBrisanjeBtnWE;
	
	@FindBy(xpath = "//td[2]/div/div/div/div[1]/input")
	private WebElement filterKolona2WE;
	
	@FindBy(xpath = "//td[3]/div/div/div/div[1]/input")
	private WebElement filterKolona3WE;
	
	@FindBy(xpath = "//div[@class='v-card__title title mb-0 word-break']")
	private WebElement deleteCardWE;
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement submitBtnWE;													// submit - DODAJ/UREDI button na formama za dodavanje/uređivanje Šifarnika
	
	@FindBy(xpath = "//div[contains(@class, 'menuable__content__active')]")
	protected WebElement aktivniLookupWE;

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

	@FindBy(xpath = "//*[text()='Obračun' and @class='v-btn__content']")
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
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za raskid ugovora')]")
	protected WebElement zahtjeviZaRaskidUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za obračunske ugovore')]")
	protected WebElement zahtjeviZaObracunskeUgovoreWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Obračunski ugovori')]")
	protected WebElement obracunskiUgovoriStrWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka')]")
	protected WebElement zahtjeviZaDostavuPodatakaKupciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pravna lica')]")
	protected WebElement pravnaLicaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Fizička lica')]")
	protected WebElement fizickaLicaWE;

	@FindBy(xpath = "//div[contains(text(), 'Djelatnosti')]")
	protected WebElement djelatnostiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sektor djelatnosti')]")
	protected WebElement sektorDjelatnostiWE;

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
	
	@FindBy(xpath = "//div[contains(text(), 'Monteri')]")
	protected WebElement monteriWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Lokacije montera')]")
	protected WebElement lokacijeMonteraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Trafostanice')]")
	protected WebElement trafostaniceWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vlasništva')]")
	protected WebElement vlasnistvaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste područja')]")
	protected WebElement vrstePodrucjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Načini polaganja instalacija')]")
	protected WebElement naciniPolaganjaInstalacijaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nazivna struja')]")
	protected WebElement nazivnaStrujaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Materijali ormarića brojila')]")
	protected WebElement materijaliOrmaricaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Lokacije mjernih mjesta')]")
	protected WebElement lokacijeMjernihMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi mjernih mostova')]")
	protected WebElement tipoviMjernihMostovaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi izolacija')]")
	protected WebElement tipoviIzolacijaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjesta priključenja')]")
	protected WebElement mjestaPrikljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Presjeci voda')]")
	protected WebElement presjeciVodaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Materijali provodnika')]")
	protected WebElement materijaliProvodnikaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi priključnog voda')]")
	protected WebElement tipoviPrikljucnogVodaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Priključne snage')]")
	protected WebElement prikljucneSnageWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Načini upravljanja potrošnjom')]")
	protected WebElement naciniUpravljanjaPotrosnjomWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste upravljačkih uređaja')]")
	protected WebElement vrsteUpravljackihUredjajaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste impulsnih uređaja')]")
	protected WebElement vrsteImpulsnihUredjajaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sistemi zaštite od ind. dodira')]")
	protected WebElement sistemiZastiteOdIndDodiraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Klase tačnosti brojila')]")
	protected WebElement klaseTacnostiBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nazivne struje brojila')]")
	protected WebElement nazivneStrujeBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sistemi zaštite od prenapona')]")
	protected WebElement sistemiZastiteOdPrenaponaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste zaštitnih uređaja')]")
	protected WebElement vrsteZastitnihUredjajaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Rokovi važenja')]")
	protected WebElement rokoviVazenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Razlozi pribavljanja EES')]")
	protected WebElement razloziPribavljanjaEESWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste objekata')]")
	protected WebElement vrsteObjekataWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi standardnog priključka')]")
	protected WebElement tipoviStandardnogPrikljuckaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Načini plaćanja')]")
	protected WebElement naciniPlacanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Klase tačnosti strujnog tran.')]")
	protected WebElement klaseTacnostiStrujnogTranWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nazivne struje osigurača')]")
	protected WebElement nazivneStrujeOsiguracaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Klase tačnosti naponskog tran.')]")
	protected WebElement klaseTacnostiNaponskogTranWE;

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

	@FindBy(xpath = "//div[contains(text(), 'Cjenovnik mrežarine')]")
	protected WebElement cjenovnikMrezarineWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjerna mjesta')]")
	protected WebElement mjernaMjestaStrWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna mjerna mjesta')]")
	protected WebElement zbirnaMjernaMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Energetska kartica')]")
	protected WebElement energetskaKarticaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za dostavu podataka')]")
	protected WebElement zahtjeviZaDostavuPodatakaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za isključenja')]")
	protected WebElement zahtjeviZaIskljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zahtjevi za uključenja')]")
	protected WebElement zahtjeviZaUkljucenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Razlog neizvršavanja zahtjeva')]")
	protected WebElement razlogNeizvrsavanjaZahtjevaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Aktivna isključenja mjernih mjesta')]")
	protected WebElement aktivnaIskljucenjaMjernihMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Indirektna mjerna mjesta')]")
	protected WebElement indirektnaMjernaMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Kontrola mjernog mjesta')]")
	protected WebElement kontrolaMjernogMjestaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Elektroenergetske saglasnosti')]")
	protected WebElement elektroenergetskeSaglasnostiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Ugovor o priključenju')]")
	protected WebElement ugovorOPrikljucenjuWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Deklaracija o priključku')]")
	protected WebElement deklaracijaOPrikljuckuWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korištena brojila')]")
	protected WebElement koristenaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Tipovi brojila')]")
	protected WebElement tipoviBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Registar brojila')]")
	protected WebElement registarBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Izvor napajanja brojila')]")
	protected WebElement izvorNapajanjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Proizvođači brojila')]")
	protected WebElement proizvodjaciBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sposobnost priključenja brojila')]")
	protected WebElement sposobnostPrikljucenjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mogućnost daljinskog pristupa')]")
	protected WebElement mogucnostDaljinskogPristupaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Lokacija brojila')]")
	protected WebElement lokacijaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Relokacije brojila')]")
	protected WebElement relokacijeBrojilaWE;

	@FindBy(xpath = "//div[contains(text(), 'Razlog promjene lokacije')]")
	protected WebElement razlogPromjeneLokacijeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Naponski nivoi')]")
	protected WebElement naponskiNivoiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Strujni nivoi')]")
	protected WebElement strujniNivoiWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Očitanja brojila')]")
    protected WebElement ocitanjaBrojilaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije očitanja')]")
    protected WebElement korekcijeOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Importi očitanja')]")
    protected WebElement importiOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Izmijenjena očitanja')]")
    protected WebElement izmijenjenaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nevalidna očitanja')]")
    protected WebElement nevalidnaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitački hodovi')]")
    protected WebElement citackiHodoviWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitačke liste')]")
    protected WebElement citackeListeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Čitači po čitačkim hodovima')]")
    protected WebElement citaciPoCitackimHodovimaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna očitanja')]")
    protected WebElement zbirnaKontrolnaOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Zbirna/kontrolna potrošnja')]")
    protected WebElement zbirnaKontrolnaPotrosnjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Monitoring očitanja')]")
    protected WebElement monitoringOcitanjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Nalozi za obračun')]")
    protected WebElement naloziZaObracunWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekcije energetskih obračuna')]")
    protected WebElement korekcijeEnergetskihObracunaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjesečna odobrenja/zaduženja')]")
    protected WebElement mjesecnaOdobrenjaZaduzenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korekciona odobrenja/zaduženja')]")
    protected WebElement korekcionaOdobrenjaZaduzenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Korisnici')]")
    protected WebElement korisniciWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Poruke')]")
    protected WebElement porukeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnik izmjena')]")
    protected WebElement dnevnikIzmjenaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Pozadinski procesi')]")
    protected WebElement pozadinskiProcesiWE;
	
	
	public void verifikujPocetnuStranicu() throws InterruptedException {
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
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
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}
	
	public void verifikujPoruku(String poruka) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}
	
	public void obrisiStavku(boolean rezultat) throws InterruptedException {
		try {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			burgerBarWE.click();
		}
		catch (Exception e) {
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			Thread.sleep(500);
			wait.until(ExpectedConditions.elementToBeClickable(burgerBarWE));
			burgerBarWE.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(obrisiWE));
		obrisiWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.visibilityOf(deleteCardWE));
		wait.until(ExpectedConditions.elementToBeClickable(potvrdiBrisanjeBtnWE));
		potvrdiBrisanjeBtnWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
		if (rezultat==true) {
			try {
				verifikujPoruku("Brisanje je uspješno završeno");
			}
			catch (Exception e) {
				wait.until(ExpectedConditions.visibilityOf(sekcijaBtnWE));
			}
		}
		else {
			verifikujPoruku("Brisanje ovog zapisa nije moguće.");
		}
	}
	
	public void verifikujBrisanjeStavke(boolean kolona, String item) throws InterruptedException {
		if (kolona==true) {
			wait.until(ExpectedConditions.elementToBeClickable(filterKolona2WE));
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			filterKolona2WE.clear();
			filterKolona2WE.sendKeys(item);
			filterKolona2WE.sendKeys(Keys.ENTER);
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(filterKolona3WE));
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			filterKolona3WE.clear();
			filterKolona3WE.sendKeys(item);
			filterKolona3WE.sendKeys(Keys.ENTER);
		}
			wait.until(ExpectedConditions.elementToBeClickable(osvjeziBtnWE));
			wait.until(ExpectedConditions.visibilityOf(praznaTabelaWE));
			wait.until(ExpectedConditions.invisibilityOf(obradaModalWE));
			Thread.sleep(700);
			assertTrue(praznaTabelaWE.getText().equals("Nema podataka"), "DeletedItem: Poruka prazne tabele nije dobra!");
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ORGANIZACIJE"));
		}
		return new Organizacije(driver);
	}
	
	public TerenskeJedinice navigirajNaTerenskeJedinice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(terenskeJediniceWE));
		terenskeJediniceWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TERENSKE.JEDINICE"));
		}
		return new TerenskeJedinice(driver);
	}
	
	public FizickeLokacije navigirajNaFizickeLokacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizickeLokacijeWE));
		fizickeLokacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("FIZICKE.LOKACIJE"));
		}
		return new FizickeLokacije(driver);
	}
	
	public Snabdjevaci navigirajNaSnabdjevaci() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(snabdjevaciWE));
		snabdjevaciWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("SNABDJEVACI"));
		}
		return new Snabdjevaci(driver);
	}
	
	public Citaci navigirajNaCitaci() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citaciWE));
		citaciWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("CITACI"));
		}
		return new Citaci(driver);
	}
	
	public Entiteti navigirajNaEntiteti() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ENTITETI"));
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("OPSTINE"));
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NASELJENA.MJESTA"));
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("POSTE"));
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ULICE"));
		}
		return new Ulice(driver);
	}
	
	public Monteri navigirajNaMonteri() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monteriWE));
		monteriWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MONTERI"));
		}
		return new Monteri(driver);
	}
	
	public LokacijeMontera navigirajNaLokacijeMontera() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijeMonteraWE));
		lokacijeMonteraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("LOKACIJE.MONTERA"));
		}
		return new LokacijeMontera(driver);
	}
	
	public Trafostanice navigirajNaTrafostanice() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trafostaniceWE));
		trafostaniceWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TRAFOSTANICE"));
		}
		return new Trafostanice(driver);
	}
	
	public Vlasnistva navigirajNaVlasnistva() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vlasnistvaWE));
		vlasnistvaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VLASNISTVA"));
		}
		return new Vlasnistva(driver);
	}
	
	public VrstePodrucja navigirajNaVrstePodrucja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrstePodrucjaWE));
		vrstePodrucjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VRSTE.PODRUCJA"));
		}
		return new VrstePodrucja(driver);
	}
	
	public NaciniPolaganjaInstalacija navigirajNaNaciniPolaganjaInstalacija() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naciniPolaganjaInstalacijaWE));
		naciniPolaganjaInstalacijaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NACINI.POLAGANJA.INSTALACIJA"));
		}
		return new NaciniPolaganjaInstalacija(driver);
	}
	
	public NazivnaStruja navigirajNaNazivnaStruja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaWE));
		nazivnaStrujaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NAZIVNA.STRUJA"));
		}
		return new NazivnaStruja(driver);
	}
	
	public MaterijaliOrmaricaBrojila navigirajNaMaterijaliOrmaricaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(materijaliOrmaricaBrojilaWE));
		materijaliOrmaricaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MATERIJALI.ORMARICA.BROJILA"));
		}
		return new MaterijaliOrmaricaBrojila(driver);
	}
	
	public LokacijeMjernihMjesta navigirajNaLokacijeMjernihMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijeMjernihMjestaWE));
		lokacijeMjernihMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("LOKACIJE.MJERNIH.MJESTA"));
		}
		return new LokacijeMjernihMjesta(driver);
	}
	
	public TipoviMjernihMostova navigirajNaTipoviMjernihMostova() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviMjernihMostovaWE));
		tipoviMjernihMostovaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TIPOVI.MJERNIH.MOSTOVA"));
		}
		return new TipoviMjernihMostova(driver);
	}
	
	public TipoviIzolacija navigirajNaTipoviIzolacija() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviIzolacijaWE));
		tipoviIzolacijaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TIPOVI.IZOLACIJA"));
		}
		return new TipoviIzolacija(driver);
	}
	
	public MjestaPrikljucenja navigirajNaMjestaPrikljucenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjestaPrikljucenjaWE));
		mjestaPrikljucenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MJESTA.PRIKLJUCENJA"));
		}
		return new MjestaPrikljucenja(driver);
	}

	public PresjeciVoda navigirajNaPresjeciVoda() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(presjeciVodaWE));
		presjeciVodaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PRESJECI.VODA"));
		}
		return new PresjeciVoda(driver);
	}
	
	public MaterijaliProvodnika navigirajNaMaterijaliProvodnika() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(materijaliProvodnikaWE));
		materijaliProvodnikaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MATERIJALI.PROVODINIKA"));
		}
		return new MaterijaliProvodnika(driver);
	}
	
	public TipoviPrikljucnogVoda navigirajNaTipoviPrikljucnogVoda() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviPrikljucnogVodaWE));
		tipoviPrikljucnogVodaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TIPOVI.PRIKLJUCNIH.VODOVA"));
		}
		return new TipoviPrikljucnogVoda(driver);
	}
	
	public PrikljucneSnage navigirajNaPrikljucneSnage() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(prikljucneSnageWE));
		prikljucneSnageWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PRIKLJUCNE.SNAGE"));
		}
		return new PrikljucneSnage(driver);
	}
	
	public NaciniUpravljanjaPotrosnjom navigirajNaNaciniUpravljanjaPotrosnjom() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naciniUpravljanjaPotrosnjomWE));
		naciniUpravljanjaPotrosnjomWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NACINI.UPRAVLJANJA.POTROSNJOM"));
		}
		return new NaciniUpravljanjaPotrosnjom(driver);
	}
	
	public VrsteUpravljackihUredjaja navigirajNaVrsteUpravljackihUredjaja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteUpravljackihUredjajaWE));
		vrsteUpravljackihUredjajaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VRSTE.UPRAVLJACKIH.UREDJAJA"));
		}
		return new VrsteUpravljackihUredjaja(driver);
	}
	
	public VrsteImpulsnihUredjaja navigirajNaVrsteImpulsnihUredjaja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteImpulsnihUredjajaWE));
		vrsteImpulsnihUredjajaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VRSTE.IMPULSNIH.UREDJAJA"));
		}
		return new VrsteImpulsnihUredjaja(driver);
	}
	
	public SistemiZastiteOdIndDodira navigirajNaSistemiZastiteOdIndDodira() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sistemiZastiteOdIndDodiraWE));
		sistemiZastiteOdIndDodiraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("SISTEMI.ZASTITE.OD.INDIREKTNOG.DODIRA"));
		}
		return new SistemiZastiteOdIndDodira(driver);
	}
	
	public KlaseTacnostiBrojila navigirajNaKlaseTacnostiBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(klaseTacnostiBrojilaWE));
		klaseTacnostiBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KLASE.TACNOSTI.BROJILA"));
		}
		return new KlaseTacnostiBrojila(driver);
	}
	
	public NazivneStrujeBrojila navigirajNaNazivneStrujeBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivneStrujeBrojilaWE));
		nazivneStrujeBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NAZIVNE.STRUJE.BROJILA"));
		}
		return new NazivneStrujeBrojila(driver);
	}
	
	public SistemiZastiteOdPrenapona navigirajNaSistemiZastiteOdPrenapona() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sistemiZastiteOdPrenaponaWE));
		sistemiZastiteOdPrenaponaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("SISTEMI.ZASTITE.OD.PRENAPONA"));
		}
		return new SistemiZastiteOdPrenapona(driver);
	}
	
	public VrsteZastitnihUredjaja navigirajNaVrsteZastitnihUredjaja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteZastitnihUredjajaWE));
		vrsteZastitnihUredjajaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VRSTE.ZASTITNIH.UREDJAJA"));
		}
		return new VrsteZastitnihUredjaja(driver);
	}
	
	public RokoviVazenja navigirajNaRokoviVazenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(rokoviVazenjaWE));
		rokoviVazenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ROKOVI.VAZENJA"));
		}
		return new RokoviVazenja(driver);
	}
	
	public RazloziPribavljanjaEES navigirajNaRazloziPribavljanjaEES() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razloziPribavljanjaEESWE));
		razloziPribavljanjaEESWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("RAZLOZI.PRIBAVLJANJA.EES"));
		}
		return new RazloziPribavljanjaEES(driver);
	}
	
	public VrsteObjekata navigirajNaVrsteObjekata() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteObjekataWE));
		vrsteObjekataWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("VRSTE.OBJEKATA"));
		}
		return new VrsteObjekata(driver);
	}
	
	public TipoviStandardnogPrikljucka navigirajNaTipoviStandardnogPrikljucka() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviStandardnogPrikljuckaWE));
		tipoviStandardnogPrikljuckaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TIPOVI.STANDARDNOG.PRIKLJUCKA"));
		}
		return new TipoviStandardnogPrikljucka(driver);
	}
	
	public NaciniPlacanja navigirajNaNaciniPlacanja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naciniPlacanjaWE));
		naciniPlacanjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NACINI.PLACANJA"));
		}
		return new NaciniPlacanja(driver);
	}
	
	public KlaseTacnostiStrujnogTransformatora navigirajNaKlaseTacnostiStrujnogTransformatora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(klaseTacnostiStrujnogTranWE));
		klaseTacnostiStrujnogTranWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KLASE.TACNOSTI.STRUJNOG.TRANSFORMATORA"));
		}
		return new KlaseTacnostiStrujnogTransformatora(driver);
	}
	
	public NazivneStrujeOsiguraca navigirajNaNazivneStrujeOsiguraca() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivneStrujeOsiguracaWE));
		nazivneStrujeOsiguracaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NAZIVNE.STRUJE.OSIGURACA"));
		}
		return new NazivneStrujeOsiguraca(driver);
	}
	
	public KlaseTacnostiNaponskogTransformatora navigirajNaKlaseTacnostiNaponskogTransformatora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(klaseTacnostiNaponskogTranWE));
		klaseTacnostiNaponskogTranWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KLASE.TACNOSTI.NAPONSKOG.TRANSFORMATORA"));
		}
		return new KlaseTacnostiNaponskogTransformatora(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KATEGORIJE.POTROSNJE"));
		}
		return new KategorijePotrosnje(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("SEZONE"));
		}
		return new Sezone(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TARIFNE.NADGRUPE"));
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TARIFNE.GRUPE"));
		}
		return new TarifneGrupe(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("OBRACUNSKA.SNAGA"));
		}
		return new ObracunskaSnaga(driver);
	}

	public CjenovnikMrezarine navigirajNaCjenovnikMrezarine() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikMrezarineWE));
		cjenovnikMrezarineWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("CJENOVNIK.MREZARINE"));
		}
		return new CjenovnikMrezarine(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MJERNA.MJESTA"));
		}
		return new MjernaMjesta(driver);
	}
	
	public ZbirnaKontrolnaMjernaMjesta navigirajNaZbirnaKontrolnaMjernaMjesta() throws Exception {
		try{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaMjernaMjestaWE));
		zbirnaMjernaMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZBIRNA.KONTROLNA.MJERNA.MJESTA"));	
		}
		return new ZbirnaKontrolnaMjernaMjesta(driver);
	}
	
	public EnergetskaKartica navigirajNaEnergetskaKartica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(energetskaKarticaWE));
		energetskaKarticaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ENERGETSKA.KARTICA"));
		}
		return new EnergetskaKartica(driver);
	}
	
	public ZahtjeviZaDostavuPodataka navigirajNaZahtjeviZaDostavuPodataka() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaWE));
		zahtjeviZaDostavuPodatakaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.DOSTAVU.PODATAKA"));
		}
		return new ZahtjeviZaDostavuPodataka(driver);
	}
	
	public ZahtjeviZaIskljucenja navigirajNaZahtjeviZaIskljucenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaIskljucenjaWE));
		zahtjeviZaIskljucenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.ISKLJUCENJA"));
		}
		return new ZahtjeviZaIskljucenja(driver);
	}
	
	public ZahtjeviZaUkljucenja navigirajNaZahtjeviZaUkljucenja() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUkljucenjaWE));
		zahtjeviZaUkljucenjaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.UKLJUCENJA"));
		}
		return new ZahtjeviZaUkljucenja(driver);
	}
	
	public RazlogNeizvrsavanjaZahtjeva navigirajNaRazlogNeizvrsavanjaZahtjeva() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogNeizvrsavanjaZahtjevaWE));
		razlogNeizvrsavanjaZahtjevaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("RAZLOG.NEIZVRSAVANJA.ZAHTJEVA"));
		}
		return new RazlogNeizvrsavanjaZahtjeva(driver);
	}
	
	public AktivnaIskljucenjaMjernihMjesta navigirajNaAktivnaIskljucenjaMjernihMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivnaIskljucenjaMjernihMjestaWE));
		aktivnaIskljucenjaMjernihMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("AKTIVNA.ISKLJUCENJA.MJERNIH.MJESTA"));
		}
		return new AktivnaIskljucenjaMjernihMjesta(driver);
	}
	
	public IndirektnaMjernaMjesta navigirajNaIndirektnaMjernaMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(indirektnaMjernaMjestaWE));
		indirektnaMjernaMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("INDIREKTNA.MJERNA.MJESTA"));
		}
		return new IndirektnaMjernaMjesta(driver);
	}
	
	public KontrolaMjernogMjesta navigirajNaKontrolaMjernogMjesta() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kontrolaMjernogMjestaWE));
		kontrolaMjernogMjestaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KONTROLA.MJERNOG.MJESTA"));
		}
		return new KontrolaMjernogMjesta(driver);
	}

	public ElektroenergetskeSaglasnosti navigirajNaElektroenergetskeSaglasnosti() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(elektroenergetskeSaglasnostiWE));
		elektroenergetskeSaglasnostiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ELEKTROENERGETSKE.SAGLASNOSTI"));
		}
		return new ElektroenergetskeSaglasnosti(driver);
	}
	
	public UgovorOPrikljucenju navigirajNaUgovorOPrikljucenju() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovorOPrikljucenjuWE));
		ugovorOPrikljucenjuWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("UGOVOR.O.PRIKLJUCENJU"));
		}
		return new UgovorOPrikljucenju(driver);
	}
	
	public DeklaracijaOPrikljucku navigirajNaDeklaracijaOPrikljucku() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(deklaracijaOPrikljuckuWE));
		deklaracijaOPrikljuckuWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("DEKLARACIJA.O.PRIKLJUCKU"));
		}
		return new DeklaracijaOPrikljucku(driver);
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
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PRAVNA.LICA"));
		}
		return new PravnaLica(driver);
	}
	
	public FizickaLica navigirajNaFizickaLica() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLicaWE));
		fizickaLicaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("FIZICKA.LICA"));
		}
		return new FizickaLica(driver);
	}
	
	public ZahtjeviZaDostavuPodatakaKUPCI navigirajNaZahtjeviZaDostavuPodatakaKUPCI() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaKupciWE));
		zahtjeviZaDostavuPodatakaKupciWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.DOSTAVU.PODATAKA.KUPCI"));
		}
		return new ZahtjeviZaDostavuPodatakaKUPCI(driver);
	}
	
	public KoristenaBrojila navigirajNaKoristenaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(koristenaBrojilaWE));
		koristenaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KORISTENA.BROJILA"));
		}
		return new KoristenaBrojila(driver);
	}
	
	public TipoviBrojila navigirajNaTipoviBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviBrojilaWE));
		tipoviBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("TIPOVI.BROJILA"));
		}
		return new TipoviBrojila(driver);
	}
	
	public RegistarBrojila navigirajNaRegistarBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(registarBrojilaWE));
		registarBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("REGISTAR.BROJILA"));
		}
		return new RegistarBrojila(driver);
	}
	
	public IzvorNapajanjaBrojila navigirajNaIzvorNapajanjaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izvorNapajanjaBrojilaWE));
		izvorNapajanjaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("IZVOR.NAPAJANJA.BROJILA"));
		}
		return new IzvorNapajanjaBrojila(driver);
	}
	
	public ProizvodjaciBrojila navigirajNaProizvodjaciBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciBrojilaWE));
		proizvodjaciBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PROIZVODJACI.BROJILA"));
		}
		return new ProizvodjaciBrojila(driver);
	}
	
	public SposobnostPrikljucenjaBrojila navigirajNaSposobnostPrikljucenaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sposobnostPrikljucenjaBrojilaWE));
		sposobnostPrikljucenjaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("SPOSOBNOST.PRIKLJUCENJA.BROJILA"));
		}
		return new SposobnostPrikljucenjaBrojila(driver);
	}
	
	public MogucnostDaljinskogPristupa navigirajNaMogucnostDaljinskogPristupa() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mogucnostDaljinskogPristupaWE));
		mogucnostDaljinskogPristupaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MOGUCNOST.DALJINSKOG.PRISTUPA"));
		}
		return new MogucnostDaljinskogPristupa(driver);
	}
	
	public LokacijaBrojila navigirajNaLokacijaBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaBrojilaWE));
		lokacijaBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("LOKACIJA.BROJILA"));
		}
		return new LokacijaBrojila(driver);
	}
	
	public RelokacijeBrojila navigirajNaRelokacijeBrojila() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(relokacijeBrojilaWE));
		relokacijeBrojilaWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("RELOKACIJE.BROJILA"));
		}
		return new RelokacijeBrojila(driver);
	}
	
	public RazlogPromjeneLokacije navigirajNaRazlogPromjeneLokacije() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogPromjeneLokacijeWE));
		razlogPromjeneLokacijeWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("RAZLOG.PROMJENE.LOKACIJE"));
		}
		return new RazlogPromjeneLokacije(driver);
	}
	
	public NaponskiNivoi navigirajNaNaponskiNivoi() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naponskiNivoiWE));
		naponskiNivoiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NAPONSKI.NIVOI"));
		}
		return new NaponskiNivoi(driver);
	}
	
	public StrujniNivoi navigirajNaStrujniNivoi() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(strujniNivoiWE));
		strujniNivoiWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("STRUJNI.NIVOI"));
		}
		return new StrujniNivoi(driver);
	}
	
	public ObracunskiUgovori navigirajNaObracunskiUgovori() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		obracunskiUgovoriWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriStrWE));
		obracunskiUgovoriStrWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("OBRACUNSKI.UGOVORI"));
		}
		return new ObracunskiUgovori(driver);
	}
	
	public ZahtjeviZaObracunskeUgovore navigirajNaZahtjeviZaObracunskeUgovore() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		obracunskiUgovoriWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaObracunskeUgovoreWE));
		zahtjeviZaObracunskeUgovoreWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.OBRACUNSKE.UGOVORE"));
		}
		return new ZahtjeviZaObracunskeUgovore(driver);
	}
	
	public ZahtjeviZaRaskidUgovora navigirajNaZahtjeviZaRaskidUgovora() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		obracunskiUgovoriWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaRaskidUgovoraWE));
		zahtjeviZaRaskidUgovoraWE.click();
		}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZAHTJEVI.ZA.RASKID.UGOVORA"));
		}
		return new ZahtjeviZaRaskidUgovora(driver);
	}
	
    public OcitanjaBrojila navigirajNaOcitanjaBrojila() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaBrojilaWE));
		ocitanjaBrojilaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("OCITANJA.BROJILA"));
		}
		return new OcitanjaBrojila(driver);
    }
	
    public KorekcijeOcitanja navigirajNaKorekcijeOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeOcitanjaWE));
		korekcijeOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KOREKCIJE.OCITANJA"));
		}
		return new KorekcijeOcitanja(driver);
    }
    
    public ImportiOcitanja navigirajNaImportiOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(importiOcitanjaWE));
	    importiOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("IMPORTI.OCITANJA"));
		}
		return new ImportiOcitanja(driver);
    }
    
    public IzmijenjenaOcitanja navigirajNaIzmijenjenaOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izmijenjenaOcitanjaWE));
		izmijenjenaOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("IZMIJENJENA.OCITANJA"));
		}
		return new IzmijenjenaOcitanja(driver);
    }
    
    public NevalidnaOcitanja navigirajNaNevalidnaOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nevalidnaOcitanjaWE));
		nevalidnaOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NEVALIDNA.OCITANJA"));
		}
		return new NevalidnaOcitanja(driver);
    }
    
    public CitackiHodovi navigirajNaCitackiHodovi() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citackiHodoviWE));
		citackiHodoviWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("CITACKI.HODOVI"));
		}
		return new CitackiHodovi(driver);
    }
    
    public CitackeListe navigirajNaCitackeListe() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citackeListeWE));
		citackeListeWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("CITACKE.LISTE"));
		}
		return new CitackeListe(driver);
    }
    
    public CitaciPoCitackimHodovima navigirajNaCitaciPoCitackimHodovima() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citaciPoCitackimHodovimaWE));
	    citaciPoCitackimHodovimaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("CITACI.PO.CITACKIM.HODOVIMA"));
		}
		return new CitaciPoCitackimHodovima(driver);
    }
    
    public ZbirnaKontrolnaOcitanja navigirajNaZbirnaKontrolnaOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaKontrolnaOcitanjaWE));
	    zbirnaKontrolnaOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZBIRNA.KONTROLNA.OCITANJA"));
		}
		return new ZbirnaKontrolnaOcitanja(driver);
    }
    
    public ZbirnaKontrolnaPotrosnja navigirajNaZbirnaKontrolnaPotrosnja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaKontrolnaPotrosnjaWE));
	    zbirnaKontrolnaPotrosnjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("ZBIRNA.KONTROLNA.POTROSNJA"));
		}
		return new ZbirnaKontrolnaPotrosnja(driver);
    }
    
    public MonitoringOcitanja navigirajNaMonitoringOcitanja() throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringOcitanjaWE));
	    monitoringOcitanjaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MONITORING.OCITANJA"));
		}
		return new MonitoringOcitanja(driver);
    }
    
    public NaloziZaObracun navigirajNaNaloziZaObracun () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
	    naloziZaObracunWE.click();
    	}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("NALOZI.ZA.OBRACUN"));
		}
		return new NaloziZaObracun(driver);
    }
    
    public KorekcijeEnergetskihObracuna navigirajNaKorekcijeEnergetskihObracuna () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeEnergetskihObracunaWE));
	    korekcijeEnergetskihObracunaWE.click();
    	}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KOREKCIJE.ENERGETSKIH.OBRACUNA"));
		}
		return new KorekcijeEnergetskihObracuna(driver);
    }
    
    public MjesecnaOdobrenjaZaduzenja navigirajNaMjesecnaOdobrenjaZaduzenja () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjesecnaOdobrenjaZaduzenjaWE));
	    mjesecnaOdobrenjaZaduzenjaWE.click();
    	}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("MJESECNA.ODOBRENJA.ZADUZENJA"));
		}
		return new MjesecnaOdobrenjaZaduzenja(driver);
    }
    
    public KorekcionaOdobrenjaZaduzenja navigirajNaKorekcionaOdobrenjaZaduzenja () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcionaOdobrenjaZaduzenjaWE));
	    korekcionaOdobrenjaZaduzenjaWE.click();
    	}
		catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KOREKCIONA.ODOBRENJA.ZADUZENJA"));
		}
		return new KorekcionaOdobrenjaZaduzenja(driver);
    }
    
    public Korisnici navigirajNaKorisnici () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korisniciWE));
	    korisniciWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("KORISNICI"));
		}
		return new Korisnici(driver);
    }
    
    public Poruke navigirajNaPoruke () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(porukeWE));
	    porukeWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("PORUKE"));
		}
		return new Poruke(driver);
    }
    
    public DnevnikIzmjena navigirajNaDnevnikIzmjena () throws Exception {
    	try {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevnikIzmjenaWE));
	    dnevnikIzmjenaWE.click();
    	}
    	catch (Exception e) {
			driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("DNEVNIK.IZMJENA"));
		}
		return new DnevnikIzmjena(driver);
    }
    
    public PozadinskiProcesi navigirajNaPozadinskiProecsi() throws FileNotFoundException, IOException {
    	try {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
    	administracijaWE.click();
    	wait.until(ExpectedConditions.elementToBeClickable(pozadinskiProcesiWE));
    	pozadinskiProcesiWE.click();
        }
        catch (Exception e) {
    		driver.get(platformx_distribution_properties.getValue("URL.DIST.LOGIN") + platformx_distribution_properties.getValue("POZADINSKI.PROCESI"));
    	}
    	return new PozadinskiProcesi(driver);
    }
        
}