package com.platformX.distribution.page;

import static org.testng.Assert.assertTrue;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	
	@FindBy(xpath = "//div[1]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterKupacWE;
	
	@FindBy(xpath = "//div[2]/div/div/div/div/div/div[1]/input[1]")
	protected WebElement filterMjernoMjestoWE;

	@FindBy(xpath = "//div[contains(text(), 'Odjavi se')]")
	protected WebElement izlogujSeWE;

	@FindBy(xpath = "//div/div[1]/div[1]/header/div/div[1]")
	protected WebElement naslovStraniceWE;

	@FindBy(xpath = "//main/div/div/header/div/div[1]")
	protected WebElement naslovStranice1WE;
	
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

	@FindBy(xpath = "//i[contains(@class, 'fa-plus')]")
	protected WebElement dodajBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-file-upload')]")
	protected WebElement importujBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-info')]")
	protected WebElement infoBtnWE;
	
	@FindBy(xpath = "//i[contains(@class, 'fa-angle-double-right')]")
	protected WebElement dodajSveBtnWE;

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
	
	@FindBy(xpath = "//button[@type='submit']")
	protected WebElement submitBtnWE;													// submit - DODAJ/UREDI button na formama za dodavanje/uređivanje Šifarnika
	
	@FindBy(xpath = "(//i[contains(@class, 'fa-bars')])[1]")
	protected WebElement burgerBar1stWE;												// burger bar u prvoj liniji liste
	
	@FindBy(xpath = "//*[contains(text(), 'Uredi') and @class='v-list-item__title']")
	protected WebElement urediBurgerBarWE;												// opcija Uredi iz burger bara
	
	@FindBy(xpath = "//*[contains(text(), 'Briši') and @class='v-list-item__title']")
	protected WebElement brisiBurgerBarWE;												// opcija Briši iz burger bara
	
	@FindBy(xpath = "//div/div/div[3]/button[2]")
	protected WebElement potvrdiBrisanjeWE;
	
	
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
	
	public ZahtjeviZaObracunskeUgovore navigirajNaZahtjeviZaObracunskeUgovore() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		obracunskiUgovoriWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaObracunskeUgovoreWE));
		zahtjeviZaObracunskeUgovoreWE.click();
		return new ZahtjeviZaObracunskeUgovore(driver);
	}
	
	public ObracunskiUgovori navigirajNaObracunskiUgovori() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriWE));
		obracunskiUgovoriWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obracunskiUgovoriStrWE));
		obracunskiUgovoriStrWE.click();
		return new ObracunskiUgovori(driver);
	}
	
	public ZahtjeviZaDostavuPodatakaKUPCI navigirajNaZahtjeviZaDostavuPodatakaKUPCI() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaKupciWE));
		zahtjeviZaDostavuPodatakaKupciWE.click();
		return new ZahtjeviZaDostavuPodatakaKUPCI(driver);
	}
	
	public FizickaLica navigirajNaFizickaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizickaLicaWE));
		fizickaLicaWE.click();
		return new FizickaLica(driver);
	}
	
	public PravnaLica navigirajNaPravnaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pravnaLicaWE));
		pravnaLicaWE.click();
		return new PravnaLica(driver);
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
	
	public SektorDjelatnosti navigirajNaSektorDjelatnosti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sektorDjelatnostiWE));
		sektorDjelatnostiWE.click();
		return new SektorDjelatnosti(driver);
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
	
	public Monteri navigirajNaMonteri() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monteriWE));
		monteriWE.click();
		return new Monteri(driver);
	}
	
	public LokacijeMontera navigirajNaLokacijeMontera() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijeMonteraWE));
		lokacijeMonteraWE.click();
		return new LokacijeMontera(driver);
	}
	
	public Trafostanice navigirajNaTrafostanice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(trafostaniceWE));
		trafostaniceWE.click();
		return new Trafostanice(driver);
	}
	
	public Vlasnistva navigirajNaVlasnistva() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vlasnistvaWE));
		vlasnistvaWE.click();
		return new Vlasnistva(driver);
	}
	
	public NaciniPolaganjaInstalacija navigirajNaNaciniPolaganjaInstalacija() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naciniPolaganjaInstalacijaWE));
		naciniPolaganjaInstalacijaWE.click();
		return new NaciniPolaganjaInstalacija(driver);
	}
	
	public NazivnaStruja navigirajNaNazivnaStruja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nazivnaStrujaWE));
		nazivnaStrujaWE.click();
		return new NazivnaStruja(driver);
	}
	
	public MaterijaliOrmaricaBrojila navigirajNaMaterijaliOrmaricaBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(materijaliOrmaricaBrojilaWE));
		materijaliOrmaricaBrojilaWE.click();
		return new MaterijaliOrmaricaBrojila(driver);
	}
	
	public LokacijeMjernihMjesta navigirajNaLokacijeMjernihMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijeMjernihMjestaWE));
		lokacijeMjernihMjestaWE.click();
		return new LokacijeMjernihMjesta(driver);
	}
	
	public TipoviMjernihMostova navigirajNaTipoviMjernihMostova() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviMjernihMostovaWE));
		tipoviMjernihMostovaWE.click();
		return new TipoviMjernihMostova(driver);
	}
	
	public TipoviIzolacija navigirajNaTipoviIzolacija() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviIzolacijaWE));
		tipoviIzolacijaWE.click();
		return new TipoviIzolacija(driver);
	}
	
	public MjestaPrikljucenja navigirajNaMjestaPrikljucenja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjestaPrikljucenjaWE));
		mjestaPrikljucenjaWE.click();
		return new MjestaPrikljucenja(driver);
	}

	public PresjeciVoda navigirajNaPresjeciVoda() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(presjeciVodaWE));
		presjeciVodaWE.click();
		return new PresjeciVoda(driver);
	}
	
	public MaterijaliProvodnika navigirajNaMaterijaliProvodnika() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(materijaliProvodnikaWE));
		materijaliProvodnikaWE.click();
		return new MaterijaliProvodnika(driver);
	}
	
	public TipoviPrikljucnogVoda navigirajNaTipoviPrikljucnogVoda() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviPrikljucnogVodaWE));
		tipoviPrikljucnogVodaWE.click();
		return new TipoviPrikljucnogVoda(driver);
	}
	
	public PrikljucneSnage navigirajNaPrikljucneSnage() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(prikljucneSnageWE));
		prikljucneSnageWE.click();
		return new PrikljucneSnage(driver);
	}
	
	public KategorijePotrosnje navigirajNaKategorijePotrosnje() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorijePotrosnjeWE));
		kategorijePotrosnjeWE.click();
		return new KategorijePotrosnje(driver);
	}

	public TarifneNadgrupe navigirajNaTarifneNadgrupe() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
		tarifneNadgrupeWE.click();
		return new TarifneNadgrupe(driver);
	}

	public TarifneGrupe navigirajNaTarifneGrupe() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
		tarifneGrupeWE.click();
		return new TarifneGrupe(driver);
	}

	public Sezone navigirajNaSezone() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sezoneWE));
		sezoneWE.click();
		return new Sezone(driver);
	}

	public ObracunskaSnaga navigirajNaObracunskaSnaga() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obracunskaSnagaWE));
		obracunskaSnagaWE.click();
		return new ObracunskaSnaga(driver);
	}

	public CjenovnikMrezarine navigirajNaCjenovnikMrezarine() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikMrezarineWE));
		cjenovnikMrezarineWE.click();
		return new CjenovnikMrezarine(driver);
	}
	
	public EnergetskaKartica navigirajNaEnergetskaKartica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(energetskaKarticaWE));
		energetskaKarticaWE.click();
		return new EnergetskaKartica(driver);
	}
	
	public ZahtjeviZaDostavuPodataka navigirajNaZahtjeviZaDostavuPodataka() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaDostavuPodatakaWE));
		zahtjeviZaDostavuPodatakaWE.click();
		return new ZahtjeviZaDostavuPodataka(driver);
	}
	
	public ZahtjeviZaIskljucenja navigirajNaZahtjeviZaIskljucenja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaIskljucenjaWE));
		zahtjeviZaIskljucenjaWE.click();
		return new ZahtjeviZaIskljucenja(driver);
	}
	
	public ZahtjeviZaUkljucenja navigirajNaZahtjeviZaUkljucenja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zahtjeviZaUkljucenjaWE));
		zahtjeviZaUkljucenjaWE.click();
		return new ZahtjeviZaUkljucenja(driver);
	}
	
	public RazlogNeizvrsavanjaZahtjeva navigirajNaRazlogNeizvrsavanjaZahtjeva() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogNeizvrsavanjaZahtjevaWE));
		razlogNeizvrsavanjaZahtjevaWE.click();
		return new RazlogNeizvrsavanjaZahtjeva(driver);
	}
	
	public AktivnaIskljucenjaMjernihMjesta navigirajNaAktivnaIskljucenjaMjernihMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(aktivnaIskljucenjaMjernihMjestaWE));
		aktivnaIskljucenjaMjernihMjestaWE.click();
		return new AktivnaIskljucenjaMjernihMjesta(driver);
	}
	
	public IndirektnaMjernaMjesta navigirajNaIndirektnaMjernaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(indirektnaMjernaMjestaWE));
		indirektnaMjernaMjestaWE.click();
		return new IndirektnaMjernaMjesta(driver);
	}
	
	public KontrolaMjernogMjesta navigirajNaKontrolaMjernogMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kontrolaMjernogMjestaWE));
		kontrolaMjernogMjestaWE.click();
		return new KontrolaMjernogMjesta(driver);
	}

	public ElektroenergetskeSaglasnosti navigirajNaElektroenergetskeSaglasnosti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(elektroenergetskeSaglasnostiWE));
		elektroenergetskeSaglasnostiWE.click();
		return new ElektroenergetskeSaglasnosti(driver);
	}
	
	public UgovorOPrikljucenju navigirajNaUgovorOPrikljucenju() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovorOPrikljucenjuWE));
		ugovorOPrikljucenjuWE.click();
		return new UgovorOPrikljucenju(driver);
	}
	
	public DeklaracijaOPrikljucku navigirajNaDeklaracijaOPrikljucku() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(deklaracijaOPrikljuckuWE));
		deklaracijaOPrikljuckuWE.click();
		return new DeklaracijaOPrikljucku(driver);
	}
	
	public MjernaMjesta navigirajNaMjernaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaStrWE));
		mjernaMjestaStrWE.click();
		return new MjernaMjesta(driver);
	}
	
	public ZbirnaKontrolnaMjernaMjesta navigirajNaZbirnaKontrolnaMjernaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaMjernaMjestaWE));
		zbirnaMjernaMjestaWE.click();
		return new ZbirnaKontrolnaMjernaMjesta(driver);
	}
	
	public void verifikujPoruku(String poruka) throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(porukaWE));
		assertTrue(porukaWE.getText().trim().equals(poruka), "Poruka upozorenja nije dobra!");
	}
	
	public KoristenaBrojila navigirajNaKoristenaBrojila() throws Exception {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
	brojilaWE.click();
	wait.until(ExpectedConditions.elementToBeClickable(koristenaBrojilaWE));
	koristenaBrojilaWE.click();
	return new KoristenaBrojila(driver);
	}
	
	public TipoviBrojila navigirajNaTipoviBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoviBrojilaWE));
		tipoviBrojilaWE.click();
		return new TipoviBrojila(driver);
	}
	
	public RegistarBrojila navigirajNaRegistarBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(registarBrojilaWE));
		registarBrojilaWE.click();
		return new RegistarBrojila(driver);
	}
	
	public IzvorNapajanjaBrojila navigirajNaIzvorNapajanjaBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izvorNapajanjaBrojilaWE));
		izvorNapajanjaBrojilaWE.click();
		return new IzvorNapajanjaBrojila(driver);
	}
	
	public ProizvodjaciBrojila navigirajNaProizvodjaciBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(proizvodjaciBrojilaWE));
		proizvodjaciBrojilaWE.click();
		return new ProizvodjaciBrojila(driver);
	}
	
	public SposobnostPrikljucenjaBrojila navigirajNaSposobnostPrikljucenaBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sposobnostPrikljucenjaBrojilaWE));
		sposobnostPrikljucenjaBrojilaWE.click();
		return new SposobnostPrikljucenjaBrojila(driver);
	}
	
	public MogucnostDaljinskogPristupa navigirajNaMogucnostDaljinskogPristupa() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mogucnostDaljinskogPristupaWE));
		mogucnostDaljinskogPristupaWE.click();
		return new MogucnostDaljinskogPristupa(driver);
	}
	
	public LokacijaBrojila navigirajNaLokacijaBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(lokacijaBrojilaWE));
		lokacijaBrojilaWE.click();
		return new LokacijaBrojila(driver);
	}
	
	public RelokacijeBrojila navigirajNaRelokacijeBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(relokacijeBrojilaWE));
		relokacijeBrojilaWE.click();
		return new RelokacijeBrojila(driver);
	}
	
	public RazlogPromjeneLokacije navigirajNaRazlogPromjeneLokacije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(razlogPromjeneLokacijeWE));
		razlogPromjeneLokacijeWE.click();
		return new RazlogPromjeneLokacije(driver);
	}
	
	public NaponskiNivoi navigirajNaNaponskiNivoi() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naponskiNivoiWE));
		naponskiNivoiWE.click();
		return new NaponskiNivoi(driver);
	}
	
	public StrujniNivoi navigirajNaStrujniNivoi() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(brojilaWE));
		brojilaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(strujniNivoiWE));
		strujniNivoiWE.click();
		return new StrujniNivoi(driver);
	}
	
    public OcitanjaBrojila navigirajNaOcitanjaBrojila() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaBrojilaWE));
		ocitanjaBrojilaWE.click();
		return new OcitanjaBrojila(driver);
    }
	
    public KorekcijeOcitanja navigirajNaKorekcijeOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeOcitanjaWE));
		korekcijeOcitanjaWE.click();
		return new KorekcijeOcitanja(driver);
    }
    
    public ImportiOcitanja navigirajNaImportiOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(importiOcitanjaWE));
	    importiOcitanjaWE.click();
		return new ImportiOcitanja(driver);
    }
    
    public IzmijenjenaOcitanja navigirajNaIzmijenjenaOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izmijenjenaOcitanjaWE));
		izmijenjenaOcitanjaWE.click();
		return new IzmijenjenaOcitanja(driver);
    }
    
    public NevalidnaOcitanja navigirajNaNevalidnaOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nevalidnaOcitanjaWE));
		nevalidnaOcitanjaWE.click();
		return new NevalidnaOcitanja(driver);
    }
    
    public CitackiHodovi navigirajNaCitackiHodovi() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citackiHodoviWE));
		citackiHodoviWE.click();
		return new CitackiHodovi(driver);
    }
    
    public CitackeListe navigirajNaCitackeListe() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citackeListeWE));
		citackeListeWE.click();
		return new CitackeListe(driver);
    }
    
    public CitaciPoCitackimHodovima navigirajNaCitaciPoCitackimHodovima() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		Thread.sleep(3000);
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(citaciPoCitackimHodovimaWE));
	    citaciPoCitackimHodovimaWE.click();
		return new CitaciPoCitackimHodovima(driver);
    }
    
    public ZbirnaKontrolnaOcitanja navigirajNaZbirnaKontrolnaOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaKontrolnaOcitanjaWE));
	    zbirnaKontrolnaOcitanjaWE.click();
		return new ZbirnaKontrolnaOcitanja(driver);
    }
    
    public ZbirnaKontrolnaPotrosnja navigirajNaZbirnaKontrolnaPotrosnja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(zbirnaKontrolnaPotrosnjaWE));
	    zbirnaKontrolnaPotrosnjaWE.click();
		return new ZbirnaKontrolnaPotrosnja(driver);
    }
    
    public MonitoringOcitanja navigirajNaMonitoringOcitanja() throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaWE));
		ocitanjaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringOcitanjaWE));
	    monitoringOcitanjaWE.click();
		return new MonitoringOcitanja(driver);
    }
    
    public NaloziZaObracun navigirajNaNaloziZaObracun () throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
	    naloziZaObracunWE.click();
		return new NaloziZaObracun(driver);
    }
    
    public KorekcijeEnergetskihObracuna navigirajNaKorekcijeEnergetskihObracuna () throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeEnergetskihObracunaWE));
	    korekcijeEnergetskihObracunaWE.click();
		return new KorekcijeEnergetskihObracuna(driver);
    }
    
    public MjesecnaOdobrenjaZaduzenja navigirajNaMjesecnaOdobrenjaZaduzenja () throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjesecnaOdobrenjaZaduzenjaWE));
	    mjesecnaOdobrenjaZaduzenjaWE.click();
		return new MjesecnaOdobrenjaZaduzenja(driver);
    }
    
    public KorekcionaOdobrenjaZaduzenja navigirajNaKorekcionaOdobrenjaZaduzenja () throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcionaOdobrenjaZaduzenjaWE));
	    korekcionaOdobrenjaZaduzenjaWE.click();
		return new KorekcionaOdobrenjaZaduzenja(driver);
    }
    
    public Korisnici navigirajNaKorisnici ()throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korisniciWE));
	    korisniciWE.click();
		return new Korisnici(driver);
    }
    
    public Poruke navigirajNaPoruke ()throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(porukeWE));
	    porukeWE.click();
		return new Poruke(driver);
    }
    
    public DnevnikIzmjena navigirajNaDnevnikIzmjena ()throws Exception {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(administracijaWE));
		administracijaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevnikIzmjenaWE));
	    dnevnikIzmjenaWE.click();
		return new DnevnikIzmjena(driver);
    }
    
    
	}