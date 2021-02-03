package com.platformX.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.platformX.base.PageBase;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);

	protected List<WebElement> brojKolona() {
		return driver.findElements(By.xpath("//th"));
	}

	@FindBy(xpath = "//div[2]/div/div[3]/div[2]")
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

	// Sekcije

	@FindBy(xpath = "//button[1]")
	protected WebElement sifarniciWE;

	@FindBy(xpath = "//button[2]")
	protected WebElement tarifniSistemWE;

	@FindBy(xpath = "//button[3]")
	protected WebElement kupciWE;

	@FindBy(xpath = "//button[4]")
	protected WebElement mjernaMjestaWE;

	@FindBy(xpath = "//button[5]")
	protected WebElement obracunWE;

	@FindBy(xpath = "//button[6]")
	protected WebElement finansijeWE;

	@FindBy(xpath = "//div[3]/a")
	protected WebElement izvjestajiWE;

	@FindBy(xpath = "//button[8]")
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

	@FindBy(xpath = "//div[contains(text(), 'Tarifne kategorije')]")
	protected WebElement tarifneKategorijeWE;

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

	@FindBy(xpath = "//div[contains(text(), 'Ugovori')]")
	protected WebElement ugovoriWE;

	@FindBy(xpath = "//div[contains(text(), 'Odbačeni ugovori')]")
	protected WebElement odbaceniUgovoriWE;

	@FindBy(xpath = "//div[contains(text(), 'Reklamacije')]")
	protected WebElement reklamacijeWE;

	@FindBy(xpath = "//div[contains(text(), 'Vrste zahtjeva')]")
	protected WebElement vrsteZahtjevaWE;

	@FindBy(xpath = "//div[contains(text(), 'Grupe obrazaca broja ugovora')]")
	protected WebElement grupeObrazacaBrojaUgovoraWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Mjerna mjesta')]")
	protected WebElement mjernaMjestaStrWE;
	
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
	
	@FindBy(xpath = "//div[contains(text(), 'Kupci za testne račune')]")
	protected WebElement kupciZaTestneRacuneWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Finansijske kartice')]")
	protected WebElement finansijskeKarticeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Dnevnici uplata')]")
	protected WebElement dnevniciUplataWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Sve uplate')]")
	protected WebElement sveUplateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Neraspoređene uplate')]")
	protected WebElement nerasporedjeneUplateWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Avansi')]")
	protected WebElement avansiWE;

	@FindBy(xpath = "//div[contains(text(), 'Banke')]")
	protected WebElement bankeWE;

	@FindBy(xpath = "//div[contains(text(), 'Žiro računi')]")
	protected WebElement ziroRacuniWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste knjiženja')]")
	protected WebElement vrsteKnjizenjaWE;
	
	@FindBy(xpath = "//div[contains(text(), 'Vrste stavki finansijske kartice')]")
	protected WebElement vrsteStavkiFinansijskeKarticeWE;
	
	@FindBy(xpath = "//div[contains(text(), 'SAP')]")
	protected WebElement sapWE;
	

	public void verifyHomePage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		Thread.sleep(1000);
	}

	public void logOut() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(profilWE));
		profilWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(izlogujSeWE));
		izlogujSeWE.click();
	}

	public OrganizacijePage navigateToOrganizacije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(organizacijeWE));
		organizacijeWE.click();
		return new OrganizacijePage(driver);
	}

	public OperatoriSistemaPage navigateToOperatoriSistema() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(operatoriSistemaWE));
		operatoriSistemaWE.click();
		return new OperatoriSistemaPage(driver);
	}

	public RadneJedinicePage navigateToRadneJedinice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(radneJediniceWE));
		radneJediniceWE.click();
		return new RadneJedinicePage(driver);
	}

	public OperativnaPodrucjaPage navigateToOperativnaPodrucja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(operativnaPodrucjaWE));
		operativnaPodrucjaWE.click();
		return new OperativnaPodrucjaPage(driver);
	}

	public DjelatnostiPage navigateToDjelatnosti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(djelatnostiWE));
		djelatnostiWE.click();
		return new DjelatnostiPage(driver);
	}

	public EntitetiPage navigateToEntiteti() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(entitetiWE));
		entitetiWE.click();
		return new EntitetiPage(driver);
	}

	public OpstinePage navigateToOpstine() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(opstineWE));
		opstineWE.click();
		return new OpstinePage(driver);
	}

	public NaseljenaMjestaPage navigateToNaseljenaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naseljenaMjestaWE));
		naseljenaMjestaWE.click();
		return new NaseljenaMjestaPage(driver);
	}

	public PostePage navigateToPoste() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(posteWE));
		posteWE.click();
		return new PostePage(driver);
	}

	public UlicePage navigateToUlice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sifarniciWE));
		sifarniciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(uliceWE));
		uliceWE.click();
		return new UlicePage(driver);
	}

	public TarifneKategorijePage navigateToTarifneKategorije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneKategorijeWE));
		tarifneKategorijeWE.click();
		return new TarifneKategorijePage(driver);
	}

	public TarifneNadgrupePage navigateToTarifneNadgrupe() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneNadgrupeWE));
		tarifneNadgrupeWE.click();
		return new TarifneNadgrupePage(driver);
	}

	public TarifneGrupePage navigateToTarifneGrupe() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(tarifneGrupeWE));
		tarifneGrupeWE.click();
		return new TarifneGrupePage(driver);
	}

	public SezonePage navigateToSezone() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sezoneWE));
		sezoneWE.click();
		return new SezonePage(driver);
	}

	public ObracunskaSnagaPage navigateToObracunskaSnaga() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(obracunskaSnagaWE));
		obracunskaSnagaWE.click();
		return new ObracunskaSnagaPage(driver);
	}

	public KategorijeCijenaPage navigateToKategorijeCijena() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kategorijeCijenaWE));
		kategorijeCijenaWE.click();
		return new KategorijeCijenaPage(driver);
	}

	public CjenovnikPage navigateToCjenovnik() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(tarifniSistemWE));
		tarifniSistemWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(cjenovnikWE));
		cjenovnikWE.click();
		return new CjenovnikPage(driver);
	}

	public PravnaLicaPage navigateToPravnaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(pravnaLicaWE));
		pravnaLicaWE.click();
		return new PravnaLicaPage(driver);
	}

	public FizickaLicaPage navigateToFizickaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(fizikaLicaWE));
		fizikaLicaWE.click();
		return new FizickaLicaPage(driver);
	}

	public PovezanaPravnaLicaPage navigateToPovezanaPravnaLica() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(povezanaPravnaLicaWE));
		povezanaPravnaLicaWE.click();
		return new PovezanaPravnaLicaPage(driver);
	}

	public UgovoriPage navigateToUgovori() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ugovoriWE));
		ugovoriWE.click();
		return new UgovoriPage(driver);
	}

	public OdbaceniUgovoriPage navigateToOdbaceniUgovori() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(odbaceniUgovoriWE));
		odbaceniUgovoriWE.click();
		return new OdbaceniUgovoriPage(driver);
	}

	public ReklamacijePage navigateToReklamacije() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(reklamacijeWE));
		reklamacijeWE.click();
		return new ReklamacijePage(driver);
	}

	public VrsteZahtjevaPage navigateToVrsteZahtjeva() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteZahtjevaWE));
		vrsteZahtjevaWE.click();
		return new VrsteZahtjevaPage(driver);
	}

	public GrupeObrazacaBrojaUgovoraPage navigateToGrupeObrazacaBrojaUgovora() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(kupciWE));
		kupciWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(grupeObrazacaBrojaUgovoraWE));
		grupeObrazacaBrojaUgovoraWE.click();
		return new GrupeObrazacaBrojaUgovoraPage(driver);
	}
	
	public MjernaMjestaPage navigateToMjernaMjesta() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaStrWE));
		mjernaMjestaStrWE.click();
		return new MjernaMjestaPage(driver);
	}
	
	public OcitanjaBrojilaPage navigateToOcitanjaBrojila() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ocitanjaBrojilaWE));
		ocitanjaBrojilaWE.click();
		return new OcitanjaBrojilaPage(driver);
	}
	
	public EnergetskiObracunPage navigateToEnergetskiObracun() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(energetskiObracunWE));
		energetskiObracunWE.click();
		return new EnergetskiObracunPage(driver);
	}
	
	public MonitoringEnergetskogObracunaPage navigateToMonitoringEnergetskogObracuna() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(mjernaMjestaWE));
		mjernaMjestaWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringEnergetskogObracunaWE));
		monitoringEnergetskogObracunaWE.click();
		return new MonitoringEnergetskogObracunaPage(driver);
	}
	
	public NaloziZaObracunPage navigateToNaloziZaObracun() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(naloziZaObracunWE));
		naloziZaObracunWE.click();
		return new NaloziZaObracunPage(driver);
	}
	
	public MonitoringObracunaPage navigateToMonitoringObracuna() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(monitoringObracunaWE));
		monitoringObracunaWE.click();
		return new MonitoringObracunaPage(driver);
	}
	
	public RacuniPage navigateToRacuni() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(racuniWE));
		racuniWE.click();
		return new RacuniPage(driver);
	}
	
	public KorekcijeRacunaPage navigateToKorekcijeRacuna() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeRacunaWE));
		korekcijeRacunaWE.click();
		return new KorekcijeRacunaPage(driver);
	}
	
	public KamatePage navigateToKamate() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kamateWE));
		kamateWE.click();
		return new KamatePage(driver);
	}
	
	public KorekcijeKamatePage navigateToKorekcijeKamate() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(korekcijeKamateWE));
		korekcijeKamateWE.click();
		return new KorekcijeKamatePage(driver);
	}
	
	public AvansneFakturePage navigateToAvansneFakture() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(avansneFaktureWE));
		avansneFaktureWE.click();
		return new AvansneFakturePage(driver);
	}
	
	public UmanjenjaCijenePage navigateToUmanjenjaCijene() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(umanjenjaCijeneWE));
		umanjenjaCijeneWE.click();
		return new UmanjenjaCijenePage(driver);
	}
	
	public KupciZaTestneRacunePage navigateToKupciZaTestneRacune() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obracunWE));
		obracunWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(kupciZaTestneRacuneWE));
		kupciZaTestneRacuneWE.click();
		return new KupciZaTestneRacunePage(driver);
	}
	
	public FinansijskeKarticePage navigateToFinansijskeKartice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(finansijskeKarticeWE));
		finansijskeKarticeWE.click();
		return new FinansijskeKarticePage(driver);
	}
	
	public DnevniciUplataPage navigateToDnevniciUplata() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(dnevniciUplataWE));
		dnevniciUplataWE.click();
		return new DnevniciUplataPage(driver);
	}
	
	public SveUplatePage navigateToSveUplate() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sveUplateWE));
		sveUplateWE.click();
		return new SveUplatePage(driver);
	}
	
	public NerasporedjeneUplatePage navigateToNerasporedjeneUplate() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(nerasporedjeneUplateWE));
		nerasporedjeneUplateWE.click();
		return new NerasporedjeneUplatePage(driver);
	}
	
	public AvansiPage navigateToAvansi() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(avansiWE));
		avansiWE.click();
		return new AvansiPage(driver);
	}

	public BankePage navigateToBanke() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankeWE));
		bankeWE.click();
		return new BankePage(driver);
	}

	public ZiroRacuniPage navigateToZiroRacuni() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(ziroRacuniWE));
		ziroRacuniWE.click();
		return new ZiroRacuniPage(driver);
	}
	
	public VrsteKnjizenjaPage navigateToVrsteKnjizenja() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteKnjizenjaWE));
		vrsteKnjizenjaWE.click();
		return new VrsteKnjizenjaPage(driver);
	}
	
	public VrsteStavkiFinansijskeKarticePage navigateToVrsteStavkiFinansijskeKartice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(vrsteStavkiFinansijskeKarticeWE));
		vrsteStavkiFinansijskeKarticeWE.click();
		return new VrsteStavkiFinansijskeKarticePage(driver);
	}
	
	public SapPage navigateToSap() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(finansijeWE));
		finansijeWE.click();
		wait.until(ExpectedConditions.elementToBeClickable(sapWE));
		sapWE.click();
		return new SapPage(driver);
	}
	
	public IzvjestajiPage navigateToIzvjestaji() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(izvjestajiWE));
		izvjestajiWE.click();
		return new IzvjestajiPage(driver);
	}
	
}